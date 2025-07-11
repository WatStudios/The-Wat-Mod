package net.mcreator.watmodreborn.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelwinged_cat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("wat_mod_reborn", "modelwinged_cat"), "main");
	public final ModelPart bone;
	public final ModelPart body;
	public final ModelPart wingL;
	public final ModelPart wingR;
	public final ModelPart head;
	public final ModelPart tail1;
	public final ModelPart tail2;
	public final ModelPart backLegL;
	public final ModelPart backLegR;
	public final ModelPart frontLegL;
	public final ModelPart frontLegR;

	public Modelwinged_cat(ModelPart root) {
		this.bone = root.getChild("bone");
		this.body = this.bone.getChild("body");
		this.wingL = this.bone.getChild("wingL");
		this.wingR = this.bone.getChild("wingR");
		this.head = this.bone.getChild("head");
		this.tail1 = this.bone.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.backLegL = this.bone.getChild("backLegL");
		this.backLegR = this.bone.getChild("backLegR");
		this.frontLegL = this.bone.getChild("frontLegL");
		this.frontLegR = this.bone.getChild("frontLegR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 1.0F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition wingL = bone.addOrReplaceChild("wingL", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = wingL.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 19).addBox(-1.0F, 0.0F, -5.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -8.0F, 3.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition wingR = bone.addOrReplaceChild("wingR", CubeListBuilder.create().texOffs(33, 12).addBox(-1.0F, 0.0F, -5.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -8.0F, 3.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-1.5F, -0.0156F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 10).addBox(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -9.0F, -9.0F));
		PartDefinition tail1 = bone.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 8.0F));
		PartDefinition tail1_r1 = tail1.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));
		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(4, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4F, 5.9F, 1.6581F, 0.0F, 0.0F));
		PartDefinition backLegL = bone.addOrReplaceChild("backLegL", CubeListBuilder.create().texOffs(8, 13).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, -6.0F, 7.0F));
		PartDefinition backLegR = bone.addOrReplaceChild("backLegR", CubeListBuilder.create().texOffs(8, 13).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1F, -6.0F, 7.0F));
		PartDefinition frontLegL = bone.addOrReplaceChild("frontLegL", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2F, -10.0F, -4.0F));
		PartDefinition frontLegR = bone.addOrReplaceChild("frontLegR", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2F, -10.0F, -4.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
