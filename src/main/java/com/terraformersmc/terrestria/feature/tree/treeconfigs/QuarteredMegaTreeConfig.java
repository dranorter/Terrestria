package com.terraformersmc.terrestria.feature.tree.treeconfigs;

import com.terraformersmc.terrestria.feature.tree.treeconfigs.helpers.TerrestriaTreeFeatureConfig;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class QuarteredMegaTreeConfig extends TerrestriaTreeFeatureConfig {

	public final BlockState quarterLogBlock;
	public final BlockState logBlock;
	public final BlockState woodBlock;

	public QuarteredMegaTreeConfig(TreeFeatureConfig config, BlockState quarterLogBlock, BlockState logBlock, BlockState woodBlock) {
		super(config);
		this.quarterLogBlock = quarterLogBlock;
		this.logBlock = logBlock;
		this.woodBlock = woodBlock;
	}
}
