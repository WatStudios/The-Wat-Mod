
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.WuneyaKittyMeowsEntity;

public class WuneyaKittyMeowsRenderer extends MobRenderer<WuneyaKittyMeowsEntity, OcelotModel<WuneyaKittyMeowsEntity>> {
	public WuneyaKittyMeowsRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<WuneyaKittyMeowsEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WuneyaKittyMeowsEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/noww.png");
	}
}
