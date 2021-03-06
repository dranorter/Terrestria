package com.terraformersmc.terrestria.biome;

import com.terraformersmc.terraform.biome.builder.TerraformBiome;
import com.terraformersmc.terrestria.init.TerrestriaBiomes;
import com.terraformersmc.terrestria.init.TerrestriaFeatureConfigs;
import com.terraformersmc.terrestria.init.TerrestriaFeatures;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.DecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import static com.terraformersmc.terraform.biome.builder.DefaultFeature.*;

public class CypressSwampBiomes {
	public static void register() {
		TerrestriaBiomes.CYPRESS_SWAMP = TerrestriaBiomes.register("cypress_swamp", TerraformBiome.builder()
				.configureSurfaceBuilder(SurfaceBuilder.SWAMP, SurfaceBuilder.GRASS_CONFIG)
				.precipitation(Biome.Precipitation.RAIN).category(Biome.Category.SWAMP)
				.depth(-0.25F)
				.scale(0.05F)
				.temperature(0.7F)
				.downfall(0.7F)
				.waterColor(0x2c7f32)
				.waterFogColor(0x053305)
				.grassColor(0x699e3c)
				.foliageColor(0x619137)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, LAKES, DUNGEONS, MINEABLES, ORES, CLAY, DEFAULT_GRASS,
						DEFAULT_MUSHROOMS, SPRINGS, SEAGRASS, MORE_SEAGRASS, FOSSILS, FROZEN_TOP_LAYER, SWAMP_VEGETATION,
						DESERT_VEGETATION)
				.addTreeFeature(Feature.TREE.configure(TerrestriaFeatureConfigs.MEGA_CYPRESS_TREE), 2)
				.addTreeFeature(Feature.TREE.configure(TerrestriaFeatureConfigs.RUBBER_TREE), 3)
				.addTreeFeature(Feature.TREE.configure(TerrestriaFeatureConfigs.WILLOW_TREE), 1)
				.addCustomFeature(GenerationStep.Feature.VEGETAL_DECORATION,
						TerrestriaFeatures.CATTAIL
							.configure(new SeagrassFeatureConfig(80, 0.3D))
							.createDecoratedFeature(Decorator.TOP_SOLID_HEIGHTMAP.configure(DecoratorConfig.DEFAULT)))
				.addCustomFeature(GenerationStep.Feature.VEGETAL_DECORATION,
						Feature.RANDOM_PATCH
							.configure(DefaultBiomeFeatures.LILY_PAD_CONFIG)
							.createDecoratedFeature(Decorator.COUNT_HEIGHTMAP_DOUBLE.configure(new CountDecoratorConfig(4))))
				.addGrassFeature(Blocks.GRASS.getDefaultState(), 2)
				.addGrassFeature(Blocks.BROWN_MUSHROOM.getDefaultState(), 1)
				.addDoubleGrassFeature(Blocks.TALL_GRASS.getDefaultState(), 1)
				.addStructureFeature(DefaultBiomeFeatures.STRONGHOLD)
				.addStructureFeature(DefaultBiomeFeatures.NORMAL_MINESHAFT)
				.addDefaultSpawnEntries()
				.addSpawnEntry(new Biome.SpawnEntry(EntityType.COD, 8, 2, 4))
				.build());
	}
}
