
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.watmodreborn.WatModRebornMod;

public class WatModRebornModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WatModRebornMod.MODID);
	public static final RegistryObject<SoundEvent> CORRUPTIONCAT = REGISTRY.register("corruptioncat", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("wat_mod_reborn", "corruptioncat")));
}
