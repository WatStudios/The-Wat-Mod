
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.watmodreborn.client.renderer.WuneyaKittyMeowsRenderer;
import net.mcreator.watmodreborn.client.renderer.WhiteKittyRenderer;
import net.mcreator.watmodreborn.client.renderer.StormyRenderer;
import net.mcreator.watmodreborn.client.renderer.SirMeowsRenderer;
import net.mcreator.watmodreborn.client.renderer.SirKittyRenderer;
import net.mcreator.watmodreborn.client.renderer.SculkCatRenderer;
import net.mcreator.watmodreborn.client.renderer.RedRenderer;
import net.mcreator.watmodreborn.client.renderer.OrangeRenderer;
import net.mcreator.watmodreborn.client.renderer.LunaRenderer;
import net.mcreator.watmodreborn.client.renderer.FlyingWuneyaKittyMeowsRenderer;
import net.mcreator.watmodreborn.client.renderer.FlyingWhiteKittyRenderer;
import net.mcreator.watmodreborn.client.renderer.FlyingStormyRenderer;
import net.mcreator.watmodreborn.client.renderer.FlyingSirMeowsRenderer;
import net.mcreator.watmodreborn.client.renderer.FlyingRedRenderer;
import net.mcreator.watmodreborn.client.renderer.FlyingLunaRenderer;
import net.mcreator.watmodreborn.client.renderer.FlyingCatGodRenderer;
import net.mcreator.watmodreborn.client.renderer.FlyingAlexRenderer;
import net.mcreator.watmodreborn.client.renderer.CorruptedWuneyaMeowsRenderer;
import net.mcreator.watmodreborn.client.renderer.CorruptedWhiteKittyRenderer;
import net.mcreator.watmodreborn.client.renderer.CorruptedStormyRenderer;
import net.mcreator.watmodreborn.client.renderer.CorruptedSirMeowsRenderer;
import net.mcreator.watmodreborn.client.renderer.CorruptedLunaRenderer;
import net.mcreator.watmodreborn.client.renderer.CorruptedBlankCatRenderer;
import net.mcreator.watmodreborn.client.renderer.CorruptedAlexRenderer;
import net.mcreator.watmodreborn.client.renderer.CorruptSirKittyRenderer;
import net.mcreator.watmodreborn.client.renderer.CatGodRenderer;
import net.mcreator.watmodreborn.client.renderer.BlankCatRenderer;
import net.mcreator.watmodreborn.client.renderer.AttackWuneyaMeowsRenderer;
import net.mcreator.watmodreborn.client.renderer.AlexRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WatModRebornModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WatModRebornModEntities.STORMY.get(), StormyRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.LUNA.get(), LunaRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.SIR_MEOWS.get(), SirMeowsRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.WUNEYA_KITTY_MEOWS.get(), WuneyaKittyMeowsRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.RED.get(), RedRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CAT_GOD.get(), CatGodRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.WHITE_KITTY.get(), WhiteKittyRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CORRUPTED_SIR_MEOWS.get(), CorruptedSirMeowsRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CORRUPTED_LUNA.get(), CorruptedLunaRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CORRUPTED_STORMY.get(), CorruptedStormyRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CORRUPTED_WHITE_KITTY.get(), CorruptedWhiteKittyRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.SIR_KITTY.get(), SirKittyRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CORRUPTED_WUNEYA_MEOWS.get(), CorruptedWuneyaMeowsRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.ALEX.get(), AlexRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.ORANGE.get(), OrangeRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.ATTACK_WUNEYA_MEOWS.get(), AttackWuneyaMeowsRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.BLANK_CAT.get(), BlankCatRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.SCULK_CAT.get(), SculkCatRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_STORMY.get(), FlyingStormyRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CORRUPTED_BLANK_CAT.get(), CorruptedBlankCatRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_LUNA.get(), FlyingLunaRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_SIR_MEOWS.get(), FlyingSirMeowsRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_WUNEYA_KITTY_MEOWS.get(), FlyingWuneyaKittyMeowsRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_RED.get(), FlyingRedRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_RED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_CAT_GOD.get(), FlyingCatGodRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_WHITE_KITTY.get(), FlyingWhiteKittyRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CORRUPTED_ALEX.get(), CorruptedAlexRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.FLYING_ALEX.get(), FlyingAlexRenderer::new);
		event.registerEntityRenderer(WatModRebornModEntities.CORRUPT_SIR_KITTY.get(), CorruptSirKittyRenderer::new);
	}
}
