package com.terraformersmc.terrestria.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BasaltFlowerBlock extends FlowerBlock {

	public BasaltFlowerBlock(StatusEffect stewEffect, int effectSeconds, Settings settings) {
		super(stewEffect, effectSeconds, settings);
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
		return Blocks.GRASS.getDefaultState().getOutlineShape(view, pos, context);
	}
}
