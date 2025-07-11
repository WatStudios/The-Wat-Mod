
package net.mcreator.watmodreborn.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.watmodreborn.entity.CorruptedBlankCatEntity;

public class CorruptedBlankCatRenderer extends MobRenderer<CorruptedBlankCatEntity, OcelotModel<CorruptedBlankCatEntity>> {
	public CorruptedBlankCatRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<CorruptedBlankCatEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedBlankCatEntity entity) {
		return new ResourceLocation("wat_mod_reborn:textures/entities/corruptblankcat.png");
	}
}
