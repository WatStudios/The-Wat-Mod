package net.mcreator.watmodreborn.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.watmodreborn.world.inventory.FlyingStormyGUIMenu;
import net.mcreator.watmodreborn.procedures.FlyingStormyGUIModelShowProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FlyingStormyGUIScreen extends AbstractContainerScreen<FlyingStormyGUIMenu> {
	private final static HashMap<String, Object> guistate = FlyingStormyGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FlyingStormyGUIScreen(FlyingStormyGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 229;
		this.imageHeight = 172;
	}

	private static final ResourceLocation texture = new ResourceLocation("wat_mod_reborn:textures/screens/flying_stormy_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (FlyingStormyGUIModelShowProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 34, this.topPos + 68, 60, 0f, 0, livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.wat_mod_reborn.flying_stormy_gui.label_stomy"), 87, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
