package com.terraformersmc.terrestria.biome;

import com.terraformersmc.terraform.biome.builder.TerraformBiome;
import com.terraformersmc.terrestria.init.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import static com.terraformersmc.terraform.biome.builder.DefaultFeature.*;

public class OutbackBiomes {
	public static void register() {
		TerraformBiome.Template template = new TerraformBiome.Template(TerraformBiome.builder()
				.precipitation(Biome.Precipitation.NONE).category(Biome.Category.SAVANNA)
				.temperature(1.8F)
				.downfall(0.3F)
				.waterColor(0x3f76e4)
				.waterFogColor(0x50533)
				.addDefaultSpawnEntries()
				.setSpawnChance(0.03F)
				.addStructureFeature(DefaultBiomeFeatures.STRONGHOLD)
				.addStructureFeature(DefaultBiomeFeatures.NORMAL_MINESHAFT)
				.addStructureFeature(DefaultBiomeFeatures.DESERT_RUINED_PORTAL)
				.addStructureFeature(DefaultBiomeFeatures.DESERT_VILLAGE)
				.addDefaultFeatures(LAND_CARVERS, STRUCTURES, DESERT_LAKES, DUNGEONS, MINEABLES, ORES, CLAY, SAVANNA_GRASS,
					DEFAULT_MUSHROOMS, DESERT_DEAD_BUSHES, SPRINGS, FOSSILS, FROZEN_TOP_LAYER)
		);

		TerrestriaBiomes.OUTBACK = TerrestriaBiomes.register("outback", template.builder()
			.configureSurfaceBuilder(TerrestriaSurfaces.PATCHY_GRASS, TerrestriaSurfaces.OUTBACK_CONFIG)
			.depth(0.125F)
			.scale(0.05F)
			.addRareTreeFeature(Feature.TREE.configure(TerrestriaFeatureConfigs.YUCCA_PALM_TREE), 12)
			.addTreeFeature(Feature.TREE.configure(TerrestriaFeatureConfigs.ACACIA_DOT_SHRUB), 3)
			.addGrassFeature(TerrestriaBlocks.DEAD_GRASS.getDefaultState(), 3)
			.build());

		TerrestriaBiomes.OUTBACK_ULURU = TerrestriaBiomes.register("outback_uluru", template.builder()
			.configureSurfaceBuilder(SurfaceBuilder.DEFAULT, TerrestriaSurfaces.OUTBACK_ULURU_CONFIG)
			.depth(2.2F)
			.scale(0.18F)
			.build());

		TerrestriaBiomes.OUTBACK_BUSHLAND = TerrestriaBiomes.register("outback_bushland", template.builder()
			.configureSurfaceBuilder(TerrestriaSurfaces.PATCHY_GRASS, TerrestriaSurfaces.OUTBACK_CONFIG)
			.depth(0.125F)
			.scale(0.05F)
			.addTreeFeature(Feature.TREE.configure(TerrestriaFeatureConfigs.YUCCA_PALM_TREE), 1)
			.addTreeFeature(Feature.TREE.configure(TerrestriaFeatureConfigs.OAK_DOT_SHRUB), 2)
			.addTreeFeature(Feature.TREE.configure(TerrestriaFeatureConfigs.ACACIA_DOT_SHRUB), 3)
			.addRareTreeFeature(Feature.TREE.configure(DefaultBiomeFeatures.FANCY_TREE_CONFIG), 24)
			.addTreeFeature(Feature.TREE.configure(DefaultBiomeFeatures.ACACIA_TREE_CONFIG), 2)
			.addGrassFeature(TerrestriaBlocks.DEAD_GRASS.getDefaultState(), 3)
			.addGrassFeature(TerrestriaBlocks.AGAVE.getDefaultState(), 1)
			.build());
	}
}
