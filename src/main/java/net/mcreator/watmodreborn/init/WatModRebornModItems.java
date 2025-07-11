
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.watmodreborn.item.WhiteKittyToolsSwordItem;
import net.mcreator.watmodreborn.item.WhiteKittyToolsShovelItem;
import net.mcreator.watmodreborn.item.WhiteKittyToolsPickaxeItem;
import net.mcreator.watmodreborn.item.WhiteKittyToolsHoeItem;
import net.mcreator.watmodreborn.item.WhiteKittyToolsAxeItem;
import net.mcreator.watmodreborn.item.WhiteKittyCatItem;
import net.mcreator.watmodreborn.item.WhiteKittyArmorArmorItem;
import net.mcreator.watmodreborn.item.WarningItem;
import net.mcreator.watmodreborn.item.StormyToolSwordItem;
import net.mcreator.watmodreborn.item.StormyToolShovelItem;
import net.mcreator.watmodreborn.item.StormyToolPickaxeItem;
import net.mcreator.watmodreborn.item.StormyToolHoeItem;
import net.mcreator.watmodreborn.item.StormyToolAxeItem;
import net.mcreator.watmodreborn.item.StormyCatItem;
import net.mcreator.watmodreborn.item.StormyArmorArmorItem;
import net.mcreator.watmodreborn.item.SirMeowsToolsSwordItem;
import net.mcreator.watmodreborn.item.SirMeowsToolsShovelItem;
import net.mcreator.watmodreborn.item.SirMeowsToolsPickaxeItem;
import net.mcreator.watmodreborn.item.SirMeowsToolsHoeItem;
import net.mcreator.watmodreborn.item.SirMeowsToolsAxeItem;
import net.mcreator.watmodreborn.item.SirMeowsCatItem;
import net.mcreator.watmodreborn.item.LunaToolsSwordItem;
import net.mcreator.watmodreborn.item.LunaToolsShovelItem;
import net.mcreator.watmodreborn.item.LunaToolsPickaxeItem;
import net.mcreator.watmodreborn.item.LunaToolsHoeItem;
import net.mcreator.watmodreborn.item.LunaToolsAxeItem;
import net.mcreator.watmodreborn.item.LunaItemItem;
import net.mcreator.watmodreborn.item.LunaArmorArmorItem;
import net.mcreator.watmodreborn.item.FlyingEssenceItem;
import net.mcreator.watmodreborn.item.CorruptedCatEssenceItem;
import net.mcreator.watmodreborn.item.CatEssenceItem;
import net.mcreator.watmodreborn.WatModRebornMod;

public class WatModRebornModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WatModRebornMod.MODID);
	public static final RegistryObject<Item> STORMY_SPAWN_EGG = REGISTRY.register("stormy_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.STORMY, -5006471, -12766164, new Item.Properties()));
	public static final RegistryObject<Item> LUNA_SPAWN_EGG = REGISTRY.register("luna_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.LUNA, -16185079, -3421237, new Item.Properties()));
	public static final RegistryObject<Item> SIR_MEOWS_SPAWN_EGG = REGISTRY.register("sir_meows_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.SIR_MEOWS, -20480, -3367, new Item.Properties()));
	public static final RegistryObject<Item> WUNEYA_KITTY_MEOWS_SPAWN_EGG = REGISTRY.register("wuneya_kitty_meows_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.WUNEYA_KITTY_MEOWS, -1, -15278, new Item.Properties()));
	public static final RegistryObject<Item> RED_SPAWN_EGG = REGISTRY.register("red_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.RED, -65536, -5701632, new Item.Properties()));
	public static final RegistryObject<Item> CAT_GOD_SPAWN_EGG = REGISTRY.register("cat_god_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.CAT_GOD, -1, -8787457, new Item.Properties()));
	public static final RegistryObject<Item> WHITE_KITTY_SPAWN_EGG = REGISTRY.register("white_kitty_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.WHITE_KITTY, -1, -6990, new Item.Properties()));
	public static final RegistryObject<Item> CORRUPTED_SIR_MEOWS_SPAWN_EGG = REGISTRY.register("corrupted_sir_meows_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.CORRUPTED_SIR_MEOWS, -2550057, -24832, new Item.Properties()));
	public static final RegistryObject<Item> CORRUPTED_LUNA_SPAWN_EGG = REGISTRY.register("corrupted_luna_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.CORRUPTED_LUNA, -16534528, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> SIR_KITTY_MAKER = block(WatModRebornModBlocks.SIR_KITTY_MAKER);
	public static final RegistryObject<Item> CORRUPTED_STORMY_SPAWN_EGG = REGISTRY.register("corrupted_stormy_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.CORRUPTED_STORMY, -10861714, -10912907, new Item.Properties()));
	public static final RegistryObject<Item> CORRUPTED_WHITE_KITTY_SPAWN_EGG = REGISTRY.register("corrupted_white_kitty_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.CORRUPTED_WHITE_KITTY, -405452, -3105, new Item.Properties()));
	public static final RegistryObject<Item> SIR_KITTY_SPAWN_EGG = REGISTRY.register("sir_kitty_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.SIR_KITTY, -11515, -556, new Item.Properties()));
	public static final RegistryObject<Item> CORRUPTED_WUNEYA_MEOWS_SPAWN_EGG = REGISTRY.register("corrupted_wuneya_meows_spawn_egg",
			() -> new ForgeSpawnEggItem(WatModRebornModEntities.CORRUPTED_WUNEYA_MEOWS, -5439233, -15648006, new Item.Properties()));
	public static final RegistryObject<Item> WARNING = REGISTRY.register("warning", () -> new WarningItem());
	public static final RegistryObject<Item> STORMY_ORE = block(WatModRebornModBlocks.STORMY_ORE);
	public static final RegistryObject<Item> STORMY_CAT = REGISTRY.register("stormy_cat", () -> new StormyCatItem());
	public static final RegistryObject<Item> STORMY_TOOL_PICKAXE = REGISTRY.register("stormy_tool_pickaxe", () -> new StormyToolPickaxeItem());
	public static final RegistryObject<Item> STORMY_TOOL_AXE = REGISTRY.register("stormy_tool_axe", () -> new StormyToolAxeItem());
	public static final RegistryObject<Item> STORMY_TOOL_SWORD = REGISTRY.register("stormy_tool_sword", () -> new StormyToolSwordItem());
	public static final RegistryObject<Item> STORMY_TOOL_SHOVEL = REGISTRY.register("stormy_tool_shovel", () -> new StormyToolShovelItem());
	public static final RegistryObject<Item> STORMY_TOOL_HOE = REGISTRY.register("stormy_tool_hoe", () -> new StormyToolHoeItem());
	public static final RegistryObject<Item> DEEPSLATE_STORMY_ORE = block(WatModRebornModBlocks.DEEPSLATE_STORMY_ORE);
	public static final RegistryObject<Item> WHITE_KITTY_ORE = block(WatModRebornModBlocks.WHITE_KITTY_ORE);
	public static final RegistryObject<Item> DEEPSLATE_WHITE_KITTY_ORE = block(WatModRebornModBlocks.DEEPSLATE_WHITE_KITTY_ORE);
	public static final RegistryObject<Item> ALEX_SPAWN_EGG = REGISTRY.register("alex_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.ALEX, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> WHITE_KITTY_CAT = REGISTRY.register("white_kitty_cat", () -> new WhiteKittyCatItem());
	public static final RegistryObject<Item> WHITE_KITTY_TOOLS_PICKAXE = REGISTRY.register("white_kitty_tools_pickaxe", () -> new WhiteKittyToolsPickaxeItem());
	public static final RegistryObject<Item> WHITE_KITTY_TOOLS_AXE = REGISTRY.register("white_kitty_tools_axe", () -> new WhiteKittyToolsAxeItem());
	public static final RegistryObject<Item> WHITE_KITTY_TOOLS_SWORD = REGISTRY.register("white_kitty_tools_sword", () -> new WhiteKittyToolsSwordItem());
	public static final RegistryObject<Item> WHITE_KITTY_TOOLS_SHOVEL = REGISTRY.register("white_kitty_tools_shovel", () -> new WhiteKittyToolsShovelItem());
	public static final RegistryObject<Item> WHITE_KITTY_TOOLS_HOE = REGISTRY.register("white_kitty_tools_hoe", () -> new WhiteKittyToolsHoeItem());
	public static final RegistryObject<Item> LUNA_ORE = block(WatModRebornModBlocks.LUNA_ORE);
	public static final RegistryObject<Item> DEEPSLATE_LUNA_ORE = block(WatModRebornModBlocks.DEEPSLATE_LUNA_ORE);
	public static final RegistryObject<Item> ORANGE_SPAWN_EGG = REGISTRY.register("orange_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.ORANGE, -32000, -2921216, new Item.Properties()));
	public static final RegistryObject<Item> LUNA_ITEM = REGISTRY.register("luna_item", () -> new LunaItemItem());
	public static final RegistryObject<Item> LUNA_TOOLS_PICKAXE = REGISTRY.register("luna_tools_pickaxe", () -> new LunaToolsPickaxeItem());
	public static final RegistryObject<Item> LUNA_TOOLS_AXE = REGISTRY.register("luna_tools_axe", () -> new LunaToolsAxeItem());
	public static final RegistryObject<Item> LUNA_TOOLS_SWORD = REGISTRY.register("luna_tools_sword", () -> new LunaToolsSwordItem());
	public static final RegistryObject<Item> LUNA_TOOLS_SHOVEL = REGISTRY.register("luna_tools_shovel", () -> new LunaToolsShovelItem());
	public static final RegistryObject<Item> LUNA_TOOLS_HOE = REGISTRY.register("luna_tools_hoe", () -> new LunaToolsHoeItem());
	public static final RegistryObject<Item> STORMY_ARMOR_ARMOR_HELMET = REGISTRY.register("stormy_armor_armor_helmet", () -> new StormyArmorArmorItem.Helmet());
	public static final RegistryObject<Item> STORMY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("stormy_armor_armor_chestplate", () -> new StormyArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> STORMY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("stormy_armor_armor_leggings", () -> new StormyArmorArmorItem.Leggings());
	public static final RegistryObject<Item> STORMY_ARMOR_ARMOR_BOOTS = REGISTRY.register("stormy_armor_armor_boots", () -> new StormyArmorArmorItem.Boots());
	public static final RegistryObject<Item> WHITE_KITTY_ARMOR_ARMOR_HELMET = REGISTRY.register("white_kitty_armor_armor_helmet", () -> new WhiteKittyArmorArmorItem.Helmet());
	public static final RegistryObject<Item> WHITE_KITTY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("white_kitty_armor_armor_chestplate", () -> new WhiteKittyArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> WHITE_KITTY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("white_kitty_armor_armor_leggings", () -> new WhiteKittyArmorArmorItem.Leggings());
	public static final RegistryObject<Item> WHITE_KITTY_ARMOR_ARMOR_BOOTS = REGISTRY.register("white_kitty_armor_armor_boots", () -> new WhiteKittyArmorArmorItem.Boots());
	public static final RegistryObject<Item> LUNA_ARMOR_ARMOR_HELMET = REGISTRY.register("luna_armor_armor_helmet", () -> new LunaArmorArmorItem.Helmet());
	public static final RegistryObject<Item> LUNA_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("luna_armor_armor_chestplate", () -> new LunaArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> LUNA_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("luna_armor_armor_leggings", () -> new LunaArmorArmorItem.Leggings());
	public static final RegistryObject<Item> LUNA_ARMOR_ARMOR_BOOTS = REGISTRY.register("luna_armor_armor_boots", () -> new LunaArmorArmorItem.Boots());
	public static final RegistryObject<Item> SIR_MEOWS_ORE = block(WatModRebornModBlocks.SIR_MEOWS_ORE);
	public static final RegistryObject<Item> DEEPSLATE_SIR_MEOWS_ORE = block(WatModRebornModBlocks.DEEPSLATE_SIR_MEOWS_ORE);
	public static final RegistryObject<Item> SIR_MEOWS_CAT = REGISTRY.register("sir_meows_cat", () -> new SirMeowsCatItem());
	public static final RegistryObject<Item> SIR_MEOWS_TOOLS_PICKAXE = REGISTRY.register("sir_meows_tools_pickaxe", () -> new SirMeowsToolsPickaxeItem());
	public static final RegistryObject<Item> SIR_MEOWS_TOOLS_AXE = REGISTRY.register("sir_meows_tools_axe", () -> new SirMeowsToolsAxeItem());
	public static final RegistryObject<Item> SIR_MEOWS_TOOLS_SWORD = REGISTRY.register("sir_meows_tools_sword", () -> new SirMeowsToolsSwordItem());
	public static final RegistryObject<Item> SIR_MEOWS_TOOLS_SHOVEL = REGISTRY.register("sir_meows_tools_shovel", () -> new SirMeowsToolsShovelItem());
	public static final RegistryObject<Item> SIR_MEOWS_TOOLS_HOE = REGISTRY.register("sir_meows_tools_hoe", () -> new SirMeowsToolsHoeItem());
	public static final RegistryObject<Item> CAT_ESSENCE = REGISTRY.register("cat_essence", () -> new CatEssenceItem());
	public static final RegistryObject<Item> ATTACK_WUNEYA_MEOWS_SPAWN_EGG = REGISTRY.register("attack_wuneya_meows_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.ATTACK_WUNEYA_MEOWS, -1, -15278, new Item.Properties()));
	public static final RegistryObject<Item> BLANK_CAT_SPAWN_EGG = REGISTRY.register("blank_cat_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.BLANK_CAT, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SCULK_CAT_SPAWN_EGG = REGISTRY.register("sculk_cat_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.SCULK_CAT, -16729089, -16767413, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_STORMY_SPAWN_EGG = REGISTRY.register("flying_stormy_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.FLYING_STORMY, -1911616, -9608357, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_ESSENCE = REGISTRY.register("flying_essence", () -> new FlyingEssenceItem());
	public static final RegistryObject<Item> CORRUPTED_CAT_ESSENCE = REGISTRY.register("corrupted_cat_essence", () -> new CorruptedCatEssenceItem());
	public static final RegistryObject<Item> CORRUPTED_BLANK_CAT_SPAWN_EGG = REGISTRY.register("corrupted_blank_cat_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.CORRUPTED_BLANK_CAT, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_LUNA_SPAWN_EGG = REGISTRY.register("flying_luna_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.FLYING_LUNA, -16185079, -3421237, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_SIR_MEOWS_SPAWN_EGG = REGISTRY.register("flying_sir_meows_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.FLYING_SIR_MEOWS, -20480, -3367, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_WUNEYA_KITTY_MEOWS_SPAWN_EGG = REGISTRY.register("flying_wuneya_kitty_meows_spawn_egg",
			() -> new ForgeSpawnEggItem(WatModRebornModEntities.FLYING_WUNEYA_KITTY_MEOWS, -1, -15278, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_RED_SPAWN_EGG = REGISTRY.register("flying_red_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.FLYING_RED, -65536, -5701632, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_CAT_GOD_SPAWN_EGG = REGISTRY.register("flying_cat_god_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.FLYING_CAT_GOD, -1, -8787457, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_WHITE_KITTY_SPAWN_EGG = REGISTRY.register("flying_white_kitty_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.FLYING_WHITE_KITTY, -1, -6990, new Item.Properties()));
	public static final RegistryObject<Item> CORRUPTED_ALEX_SPAWN_EGG = REGISTRY.register("corrupted_alex_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.CORRUPTED_ALEX, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> FLYING_ALEX_SPAWN_EGG = REGISTRY.register("flying_alex_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.FLYING_ALEX, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> CORRUPT_SIR_KITTY_SPAWN_EGG = REGISTRY.register("corrupt_sir_kitty_spawn_egg", () -> new ForgeSpawnEggItem(WatModRebornModEntities.CORRUPT_SIR_KITTY, -3578969, -556, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
