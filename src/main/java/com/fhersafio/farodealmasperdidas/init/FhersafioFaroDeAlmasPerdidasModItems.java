/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.fhersafio.farodealmasperdidas.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

import com.fhersafio.farodealmasperdidas.item.*;
import com.fhersafio.farodealmasperdidas.FhersafioFaroDeAlmasPerdidasMod;

public class FhersafioFaroDeAlmasPerdidasModItems {
	public static Item FARO_DE_ALMAS;
	public static Item CUCHARA_RESURECCION;
	public static Item TENEDOR_DE_LA_VIDA;
	public static Item VARA_DE_ALMAS;
	public static Item NACATAMAL;
	public static Item CARNE_ASADA;
	public static Item PAN_SEMITA;
	public static Item BIG_COLITA;

	public static void load() {
		FARO_DE_ALMAS = block(FhersafioFaroDeAlmasPerdidasModBlocks.FARO_DE_ALMAS, "faro_de_almas", new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
		CUCHARA_RESURECCION = register("cuchara_resureccion", CucharaResureccionItem::new);
		TENEDOR_DE_LA_VIDA = register("tenedor_de_la_vida", TenedorDeLaVidaItem::new);
		VARA_DE_ALMAS = register("vara_de_almas", VaraDeAlmasItem::new);
		NACATAMAL = register("nacatamal", NacatamalItem::new);
		CARNE_ASADA = register("carne_asada", CarneAsadaItem::new);
		PAN_SEMITA = register("pan_semita", PanSemitaItem::new);
		BIG_COLITA = register("big_colita", BigColitaItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FhersafioFaroDeAlmasPerdidasMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FhersafioFaroDeAlmasPerdidasMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}