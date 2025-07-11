
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.watmodreborn.WatModRebornMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WatModRebornModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WatModRebornMod.MODID);
	public static final RegistryObject<CreativeModeTab> WAT_REBORN = REGISTRY.register("wat_reborn",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.wat_mod_reborn.wat_reborn")).icon(() -> new ItemStack(Blocks.BEACON)).displayItems((parameters, tabData) -> {
				tabData.accept(WatModRebornModItems.STORMY_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.LUNA_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.SIR_MEOWS_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.WUNEYA_KITTY_MEOWS_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.RED_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.CAT_GOD_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.CORRUPTED_SIR_MEOWS_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.CORRUPTED_LUNA_SPAWN_EGG.get());
				tabData.accept(WatModRebornModBlocks.SIR_KITTY_MAKER.get().asItem());
				tabData.accept(WatModRebornModItems.CORRUPTED_STORMY_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.CORRUPTED_WHITE_KITTY_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.SIR_KITTY_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.CORRUPTED_WUNEYA_MEOWS_SPAWN_EGG.get());
				tabData.accept(WatModRebornModBlocks.STORMY_ORE.get().asItem());
				tabData.accept(WatModRebornModItems.STORMY_CAT.get());
				tabData.accept(WatModRebornModItems.STORMY_TOOL_PICKAXE.get());
				tabData.accept(WatModRebornModItems.STORMY_TOOL_AXE.get());
				tabData.accept(WatModRebornModItems.STORMY_TOOL_SWORD.get());
				tabData.accept(WatModRebornModItems.STORMY_TOOL_SHOVEL.get());
				tabData.accept(WatModRebornModItems.STORMY_TOOL_HOE.get());
				tabData.accept(WatModRebornModBlocks.DEEPSLATE_STORMY_ORE.get().asItem());
				tabData.accept(WatModRebornModBlocks.WHITE_KITTY_ORE.get().asItem());
				tabData.accept(WatModRebornModBlocks.DEEPSLATE_WHITE_KITTY_ORE.get().asItem());
				tabData.accept(WatModRebornModItems.ALEX_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_CAT.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_PICKAXE.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_AXE.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_SWORD.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_SHOVEL.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_HOE.get());
				tabData.accept(WatModRebornModBlocks.LUNA_ORE.get().asItem());
				tabData.accept(WatModRebornModBlocks.DEEPSLATE_LUNA_ORE.get().asItem());
				tabData.accept(WatModRebornModItems.ORANGE_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.LUNA_ITEM.get());
				tabData.accept(WatModRebornModItems.LUNA_TOOLS_PICKAXE.get());
				tabData.accept(WatModRebornModItems.LUNA_TOOLS_AXE.get());
				tabData.accept(WatModRebornModItems.LUNA_TOOLS_SWORD.get());
				tabData.accept(WatModRebornModItems.LUNA_TOOLS_SHOVEL.get());
				tabData.accept(WatModRebornModItems.LUNA_TOOLS_HOE.get());
				tabData.accept(WatModRebornModItems.STORMY_ARMOR_ARMOR_HELMET.get());
				tabData.accept(WatModRebornModItems.STORMY_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(WatModRebornModItems.STORMY_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(WatModRebornModItems.STORMY_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_ARMOR_ARMOR_HELMET.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(WatModRebornModItems.WHITE_KITTY_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(WatModRebornModItems.LUNA_ARMOR_ARMOR_HELMET.get());
				tabData.accept(WatModRebornModItems.LUNA_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(WatModRebornModItems.LUNA_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(WatModRebornModItems.LUNA_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(WatModRebornModBlocks.SIR_MEOWS_ORE.get().asItem());
				tabData.accept(WatModRebornModBlocks.DEEPSLATE_SIR_MEOWS_ORE.get().asItem());
				tabData.accept(WatModRebornModItems.SIR_MEOWS_CAT.get());
				tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_PICKAXE.get());
				tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_AXE.get());
				tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_SWORD.get());
				tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_SHOVEL.get());
				tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_HOE.get());
				tabData.accept(WatModRebornModItems.CAT_ESSENCE.get());
				tabData.accept(WatModRebornModItems.ATTACK_WUNEYA_MEOWS_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.BLANK_CAT_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_STORMY_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_ESSENCE.get());
				tabData.accept(WatModRebornModItems.CORRUPTED_CAT_ESSENCE.get());
				tabData.accept(WatModRebornModItems.CORRUPTED_BLANK_CAT_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_LUNA_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_SIR_MEOWS_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_WUNEYA_KITTY_MEOWS_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_RED_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_CAT_GOD_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_WHITE_KITTY_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.CORRUPTED_ALEX_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.FLYING_ALEX_SPAWN_EGG.get());
				tabData.accept(WatModRebornModItems.CORRUPT_SIR_KITTY_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(WatModRebornModItems.STORMY_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.LUNA_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.SIR_MEOWS_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.WUNEYA_KITTY_MEOWS_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.RED_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CAT_GOD_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CORRUPTED_SIR_MEOWS_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CORRUPTED_LUNA_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CORRUPTED_STORMY_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CORRUPTED_WHITE_KITTY_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.SIR_KITTY_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CORRUPTED_WUNEYA_MEOWS_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.ALEX_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.ORANGE_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.ATTACK_WUNEYA_MEOWS_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.BLANK_CAT_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.SCULK_CAT_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.FLYING_STORMY_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CORRUPTED_BLANK_CAT_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.FLYING_LUNA_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.FLYING_SIR_MEOWS_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.FLYING_WUNEYA_KITTY_MEOWS_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.FLYING_RED_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.FLYING_CAT_GOD_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.FLYING_WHITE_KITTY_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CORRUPTED_ALEX_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.FLYING_ALEX_SPAWN_EGG.get());
			tabData.accept(WatModRebornModItems.CORRUPT_SIR_KITTY_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(WatModRebornModBlocks.STORMY_ORE.get().asItem());
			tabData.accept(WatModRebornModBlocks.DEEPSLATE_STORMY_ORE.get().asItem());
			tabData.accept(WatModRebornModBlocks.WHITE_KITTY_ORE.get().asItem());
			tabData.accept(WatModRebornModBlocks.DEEPSLATE_WHITE_KITTY_ORE.get().asItem());
			tabData.accept(WatModRebornModBlocks.LUNA_ORE.get().asItem());
			tabData.accept(WatModRebornModBlocks.DEEPSLATE_LUNA_ORE.get().asItem());
			tabData.accept(WatModRebornModBlocks.SIR_MEOWS_ORE.get().asItem());
			tabData.accept(WatModRebornModBlocks.DEEPSLATE_SIR_MEOWS_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(WatModRebornModItems.STORMY_CAT.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_CAT.get());
			tabData.accept(WatModRebornModItems.LUNA_ITEM.get());
			tabData.accept(WatModRebornModItems.SIR_MEOWS_CAT.get());
			tabData.accept(WatModRebornModItems.CAT_ESSENCE.get());
			tabData.accept(WatModRebornModItems.FLYING_ESSENCE.get());
			tabData.accept(WatModRebornModItems.CORRUPTED_CAT_ESSENCE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(WatModRebornModItems.STORMY_TOOL_PICKAXE.get());
			tabData.accept(WatModRebornModItems.STORMY_TOOL_AXE.get());
			tabData.accept(WatModRebornModItems.STORMY_TOOL_SHOVEL.get());
			tabData.accept(WatModRebornModItems.STORMY_TOOL_HOE.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_PICKAXE.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_AXE.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_SHOVEL.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_HOE.get());
			tabData.accept(WatModRebornModItems.LUNA_TOOLS_PICKAXE.get());
			tabData.accept(WatModRebornModItems.LUNA_TOOLS_AXE.get());
			tabData.accept(WatModRebornModItems.LUNA_TOOLS_SHOVEL.get());
			tabData.accept(WatModRebornModItems.LUNA_TOOLS_HOE.get());
			tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_PICKAXE.get());
			tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_AXE.get());
			tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_SHOVEL.get());
			tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(WatModRebornModItems.STORMY_TOOL_SWORD.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_TOOLS_SWORD.get());
			tabData.accept(WatModRebornModItems.LUNA_TOOLS_SWORD.get());
			tabData.accept(WatModRebornModItems.STORMY_ARMOR_ARMOR_HELMET.get());
			tabData.accept(WatModRebornModItems.STORMY_ARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(WatModRebornModItems.STORMY_ARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(WatModRebornModItems.STORMY_ARMOR_ARMOR_BOOTS.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_ARMOR_ARMOR_HELMET.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_ARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_ARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(WatModRebornModItems.WHITE_KITTY_ARMOR_ARMOR_BOOTS.get());
			tabData.accept(WatModRebornModItems.LUNA_ARMOR_ARMOR_HELMET.get());
			tabData.accept(WatModRebornModItems.LUNA_ARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(WatModRebornModItems.LUNA_ARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(WatModRebornModItems.LUNA_ARMOR_ARMOR_BOOTS.get());
			tabData.accept(WatModRebornModItems.SIR_MEOWS_TOOLS_SWORD.get());
		}
	}
}
