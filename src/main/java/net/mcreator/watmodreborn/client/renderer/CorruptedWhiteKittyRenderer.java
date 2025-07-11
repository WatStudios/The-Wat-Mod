
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.CorruptedWhiteKittyEntity;

public class CorruptedWhiteKittyRenderer extends MobRenderer<CorruptedWhiteKittyEntity, OcelotModel<CorruptedWhiteKittyEntity>> {
	public CorruptedWhiteKittyRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<CorruptedWhiteKittyEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedWhiteKittyEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/corruptkitnew.png");
	}

	@Override
	protected boolean isShaking(CorruptedWhiteKittyEntity entity) {
		return true;
	}
}
