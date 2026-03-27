/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.fhersafio.farodealmasperdidas.init;

import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.fhersafio.farodealmasperdidas.client.screens.PlayerDeadOverlay;
import com.fhersafio.farodealmasperdidas.FhersafioFaroDeAlmasPerdidasMod;

@Environment(EnvType.CLIENT)
public class FhersafioFaroDeAlmasPerdidasModOverlays {
	public static void clientLoad() {
		register("player_dead", PlayerDeadOverlay::render);
	}

	private static void register(String registryname, HudElement element) {
		HudElementRegistry.attachElementAfter(VanillaHudElements.MISC_OVERLAYS, ResourceLocation.fromNamespaceAndPath(FhersafioFaroDeAlmasPerdidasMod.MODID, registryname), element);
	}
}