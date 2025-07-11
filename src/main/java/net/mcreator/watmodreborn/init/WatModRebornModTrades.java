
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.watmodreborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WatModRebornModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == WatModRebornModVillagerProfessions.CATTER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.OAK_LOG, 3),

					new ItemStack(WatModRebornModItems.RED_SPAWN_EGG.get(), 4), 10, 5, 0.05f));
		}
		if (event.getType() == WatModRebornModVillagerProfessions.CATTER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(WatModRebornModBlocks.SIR_KITTY_MAKER.get(), 3), new ItemStack(Blocks.OAK_PLANKS), new ItemStack(WatModRebornModItems.CAT_GOD_SPAWN_EGG.get(), 5), 10, 5, 0.05f));
		}
	}
}
