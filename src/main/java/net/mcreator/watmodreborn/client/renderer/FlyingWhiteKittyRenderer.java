
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.FlyingWhiteKittyEntity;

public class FlyingWhiteKittyRenderer extends MobRenderer<FlyingWhiteKittyEntity, OcelotModel<FlyingWhiteKittyEntity>> {
	public FlyingWhiteKittyRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<FlyingWhiteKittyEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyingWhiteKittyEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/kit.png");
	}

	@Override
	protected boolean isShaking(FlyingWhiteKittyEntity entity) {
		return true;
	}
}
