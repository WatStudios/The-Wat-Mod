
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.watmodreborn.client.gui.StormyGUIScreen;
import net.mcreator.watmodreborn.client.gui.FlyingStormyGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WatModRebornModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WatModRebornModMenus.STORMY_GUI.get(), StormyGUIScreen::new);
			MenuScreens.register(WatModRebornModMenus.FLYING_STORMY_GUI.get(), FlyingStormyGUIScreen::new);
		});
	}
}
