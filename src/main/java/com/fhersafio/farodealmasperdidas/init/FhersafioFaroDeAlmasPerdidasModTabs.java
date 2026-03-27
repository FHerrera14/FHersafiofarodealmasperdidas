/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.fhersafio.farodealmasperdidas.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import com.fhersafio.farodealmasperdidas.FhersafioFaroDeAlmasPerdidasMod;

public class FhersafioFaroDeAlmasPerdidasModTabs {
	public static ResourceKey<CreativeModeTab> TAB_TAB_F_HERSAFIO = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(FhersafioFaroDeAlmasPerdidasMod.MODID, "tab_f_hersafio"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_TAB_F_HERSAFIO, FabricItemGroup.builder().title(Component.translatable("item_group.fhersafio_faro_de_almas_perdidas.tab_f_hersafio"))
				.icon(() -> new ItemStack(FhersafioFaroDeAlmasPerdidasModBlocks.FARO_DE_ALMAS)).displayItems((parameters, tabData) -> {
					tabData.accept(FhersafioFaroDeAlmasPerdidasModBlocks.FARO_DE_ALMAS.asItem());
					tabData.accept(FhersafioFaroDeAlmasPerdidasModItems.CUCHARA_RESURECCION);
					tabData.accept(FhersafioFaroDeAlmasPerdidasModItems.TENEDOR_DE_LA_VIDA);
					tabData.accept(FhersafioFaroDeAlmasPerdidasModItems.VARA_DE_ALMAS);
					tabData.accept(FhersafioFaroDeAlmasPerdidasModItems.NACATAMAL);
					tabData.accept(FhersafioFaroDeAlmasPerdidasModItems.CARNE_ASADA);
					tabData.accept(FhersafioFaroDeAlmasPerdidasModItems.PAN_SEMITA);
					tabData.accept(FhersafioFaroDeAlmasPerdidasModItems.BIG_COLITA);
				}).build());
	}
}