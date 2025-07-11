package net.mcreator.watmodreborn;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.watmodreborn.init.WatModRebornModVillagerProfessions;
import net.mcreator.watmodreborn.init.WatModRebornModTabs;
import net.mcreator.watmodreborn.init.WatModRebornModSounds;
import net.mcreator.watmodreborn.init.WatModRebornModPotions;
import net.mcreator.watmodreborn.init.WatModRebornModMobEffects;
import net.mcreator.watmodreborn.init.WatModRebornModMenus;
import net.mcreator.watmodreborn.init.WatModRebornModItems;
import net.mcreator.watmodreborn.init.WatModRebornModEntities;
import net.mcreator.watmodreborn.init.WatModRebornModBlocks;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("wat_mod_reborn")
public class WatModRebornMod {
	public static final Logger LOGGER = LogManager.getLogger(WatModRebornMod.class);
	public static final String MODID = "wat_mod_reborn";

	public WatModRebornMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		WatModRebornModSounds.REGISTRY.register(bus);
		WatModRebornModBlocks.REGISTRY.register(bus);

		WatModRebornModItems.REGISTRY.register(bus);
		WatModRebornModEntities.REGISTRY.register(bus);

		WatModRebornModTabs.REGISTRY.register(bus);

		WatModRebornModMobEffects.REGISTRY.register(bus);
		WatModRebornModPotions.REGISTRY.register(bus);

		WatModRebornModVillagerProfessions.PROFESSIONS.register(bus);
		WatModRebornModMenus.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
