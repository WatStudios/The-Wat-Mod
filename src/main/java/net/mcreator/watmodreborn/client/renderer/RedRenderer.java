
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.RedEntity;

public class RedRenderer extends MobRenderer<RedEntity, OcelotModel<RedEntity>> {
	public RedRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<RedEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/red.png");
	}
}
