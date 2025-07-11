
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.WhiteKittyEntity;

public class WhiteKittyRenderer extends MobRenderer<WhiteKittyEntity, OcelotModel<WhiteKittyEntity>> {
	public WhiteKittyRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<WhiteKittyEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteKittyEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/kit.png");
	}

	@Override
	protected boolean isShaking(WhiteKittyEntity entity) {
		return true;
	}
}
