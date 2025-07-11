
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.watmodreborn.potion.WhiteKittyEffectMobEffect;
import net.mcreator.watmodreborn.WatModRebornMod;

public class WatModRebornModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, WatModRebornMod.MODID);
	public static final RegistryObject<MobEffect> WHITE_KITTY_EFFECT = REGISTRY.register("white_kitty_effect", () -> new WhiteKittyEffectMobEffect());
}
