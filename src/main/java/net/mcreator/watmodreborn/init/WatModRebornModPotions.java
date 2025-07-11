
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.watmodreborn.WatModRebornMod;

public class WatModRebornModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, WatModRebornMod.MODID);
	public static final RegistryObject<Potion> WHITE_KITTY_POTION = REGISTRY.register("white_kitty_potion",
			() -> new Potion(new MobEffectInstance(WatModRebornModMobEffects.WHITE_KITTY_EFFECT.get(), 3600, 0, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 4, false, true)));
}
