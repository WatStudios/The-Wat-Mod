
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.watmodreborn.world.inventory.StormyGUIMenu;
import net.mcreator.watmodreborn.world.inventory.FlyingStormyGUIMenu;
import net.mcreator.watmodreborn.WatModRebornMod;

public class WatModRebornModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WatModRebornMod.MODID);
	public static final RegistryObject<MenuType<StormyGUIMenu>> STORMY_GUI = REGISTRY.register("stormy_gui", () -> IForgeMenuType.create(StormyGUIMenu::new));
	public static final RegistryObject<MenuType<FlyingStormyGUIMenu>> FLYING_STORMY_GUI = REGISTRY.register("flying_stormy_gui", () -> IForgeMenuType.create(FlyingStormyGUIMenu::new));
}
