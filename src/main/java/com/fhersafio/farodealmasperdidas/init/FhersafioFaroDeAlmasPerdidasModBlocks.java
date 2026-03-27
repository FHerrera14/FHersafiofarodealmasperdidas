/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.fhersafio.farodealmasperdidas.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

import com.fhersafio.farodealmasperdidas.block.FaroDeAlmasBlock;
import com.fhersafio.farodealmasperdidas.FhersafioFaroDeAlmasPerdidasMod;

public class FhersafioFaroDeAlmasPerdidasModBlocks {
	public static Block FARO_DE_ALMAS;

	public static void load() {
		FARO_DE_ALMAS = register("faro_de_almas", FaroDeAlmasBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(FhersafioFaroDeAlmasPerdidasMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}