
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.OrangeEntity;

public class OrangeRenderer extends MobRenderer<OrangeEntity, OcelotModel<OrangeEntity>> {
	public OrangeRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<OrangeEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrangeEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/orange.png");
	}
}
