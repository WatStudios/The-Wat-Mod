
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.AlexEntity;

public class AlexRenderer extends MobRenderer<AlexEntity, OcelotModel<AlexEntity>> {
	public AlexRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<AlexEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlexEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/alex.png");
	}
}
