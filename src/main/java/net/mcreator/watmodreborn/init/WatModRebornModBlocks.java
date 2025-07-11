
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.watmodreborn.block.WhiteKittyOreBlock;
import net.mcreator.watmodreborn.block.StormyOreBlock;
import net.mcreator.watmodreborn.block.SirMeowsOreBlock;
import net.mcreator.watmodreborn.block.SirKittyMakerBlock;
import net.mcreator.watmodreborn.block.LunaOreBlock;
import net.mcreator.watmodreborn.block.DeepslateWhiteKittyOreBlock;
import net.mcreator.watmodreborn.block.DeepslateStormyOreBlock;
import net.mcreator.watmodreborn.block.DeepslateSirMeowsOreBlock;
import net.mcreator.watmodreborn.block.DeepslateLunaOreBlock;
import net.mcreator.watmodreborn.WatModRebornMod;

public class WatModRebornModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WatModRebornMod.MODID);
	public static final RegistryObject<Block> SIR_KITTY_MAKER = REGISTRY.register("sir_kitty_maker", () -> new SirKittyMakerBlock());
	public static final RegistryObject<Block> STORMY_ORE = REGISTRY.register("stormy_ore", () -> new StormyOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_STORMY_ORE = REGISTRY.register("deepslate_stormy_ore", () -> new DeepslateStormyOreBlock());
	public static final RegistryObject<Block> WHITE_KITTY_ORE = REGISTRY.register("white_kitty_ore", () -> new WhiteKittyOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_WHITE_KITTY_ORE = REGISTRY.register("deepslate_white_kitty_ore", () -> new DeepslateWhiteKittyOreBlock());
	public static final RegistryObject<Block> LUNA_ORE = REGISTRY.register("luna_ore", () -> new LunaOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_LUNA_ORE = REGISTRY.register("deepslate_luna_ore", () -> new DeepslateLunaOreBlock());
	public static final RegistryObject<Block> SIR_MEOWS_ORE = REGISTRY.register("sir_meows_ore", () -> new SirMeowsOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_SIR_MEOWS_ORE = REGISTRY.register("deepslate_sir_meows_ore", () -> new DeepslateSirMeowsOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
