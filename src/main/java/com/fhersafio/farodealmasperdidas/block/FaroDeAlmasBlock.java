package com.fhersafio.farodealmasperdidas.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.fhersafio.farodealmasperdidas.init.FhersafioFaroDeAlmasPerdidasModBlocks;

public class FaroDeAlmasBlock extends Block {
	public FaroDeAlmasBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new SoundType(1.0f, 1.0f, null, null, null, null, null) {
			@Override
			public SoundEvent getBreakSound() {
				return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("fhersafio_faro_de_almas_perdidas:break_faro"));
			}

			@Override
			public SoundEvent getStepSound() {
				return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.amethyst_block.step"));
			}

			@Override
			public SoundEvent getPlaceSound() {
				return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("fhersafio_faro_de_almas_perdidas:place_faro"));
			}

			@Override
			public SoundEvent getHitSound() {
				return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.amethyst_block.hit"));
			}

			@Override
			public SoundEvent getFallSound() {
				return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("fhersafio_faro_de_almas_perdidas:drop_faro"));
			}
		}).strength(-1, 3600000).lightLevel(s -> 15).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayer() {
		BlockRenderLayerMap.putBlock(FhersafioFaroDeAlmasPerdidasModBlocks.FARO_DE_ALMAS, ChunkSectionLayer.TRANSLUCENT);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}