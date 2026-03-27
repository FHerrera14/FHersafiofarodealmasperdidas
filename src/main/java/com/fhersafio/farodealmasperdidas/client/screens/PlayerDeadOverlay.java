package com.fhersafio.farodealmasperdidas.client.screens;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;
import net.minecraft.client.DeltaTracker;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PlayerDeadOverlay {
	public static void render(GuiGraphics guiGraphics, DeltaTracker deltaTracker) {
		int w = guiGraphics.guiWidth();
		int h = guiGraphics.guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {

			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("fhersafio_faro_de_almas_perdidas:textures/screens/pipo.png"), w / 2 + -125, h / 2 + -129, 0, 0, 256, 256, 256, 17408);

		}
	}
}