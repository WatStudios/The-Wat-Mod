
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.CorruptedWuneyaMeowsEntity;

public class CorruptedWuneyaMeowsRenderer extends MobRenderer<CorruptedWuneyaMeowsEntity, OcelotModel<CorruptedWuneyaMeowsEntity>> {
	public CorruptedWuneyaMeowsRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<CorruptedWuneyaMeowsEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedWuneyaMeowsEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/newwuneyacorrupt.png");
	}
}
