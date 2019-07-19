package net.coderbot.terrestria.init;

import net.coderbot.terrestria.Terrestria;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// This class exports public item constants, these fields have to be public
@SuppressWarnings("WeakerAccess")
public class TerrestriaItems {
	public static WoodItems REDWOOD;
	public static WoodItems HEMLOCK;
	public static WoodItems RUBBER;
	public static WoodItems CYPRESS;
	public static WoodItems WILLOW;
	public static WoodItems JAPANESE_MAPLE;
	public static WoodItems RAINBOW_EUCALYPTUS;
	public static WoodItems SAKURA;

	public static BlockItem JAPANESE_MAPLE_SHRUB_LEAVES;
	public static BlockItem DARK_JAPANESE_MAPLE_LEAVES;
	public static BlockItem SAKURA_LEAF_PILE;

	public static BlockItem CATTAIL;

	public static BlockItem REDWOOD_QUARTER_LOG;
	public static BlockItem HEMLOCK_QUARTER_LOG;
	public static BlockItem CYPRESS_QUARTER_LOG;
	public static BlockItem RAINBOW_EUCALYPTUS_QUARTER_LOG;
	public static BlockItem STRIPPED_REDWOOD_QUARTER_LOG;
	public static BlockItem STRIPPED_HEMLOCK_QUARTER_LOG;
	public static BlockItem STRIPPED_CYPRESS_QUARTER_LOG;
	public static BlockItem STRIPPED_RAINBOW_EUCALYPTUS_QUARTER_LOG;

	public static BlockItem REDWOOD_SAPLING;
	public static BlockItem HEMLOCK_SAPLING;
	public static BlockItem RUBBER_SAPLING;
	public static BlockItem CYPRESS_SAPLING;
	public static BlockItem WILLOW_SAPLING;
	public static BlockItem JAPANESE_MAPLE_SAPLING;
	public static BlockItem JAPANESE_MAPLE_SHRUB_SAPLING;
	public static BlockItem DARK_JAPANESE_MAPLE_SAPLING;
	public static BlockItem RAINBOW_EUCALYPTUS_SAPLING;
	public static BlockItem SAKURA_SAPLING;
	public static BlockItem PALM_SAPLING;

	public static BlockItem BASALT;
	public static BlockItem BASALT_SAND;
	public static BlockItem BASALT_DIRT;
	public static BlockItem BASALT_GRASS_BLOCK;
	public static BlockItem INDIAN_PAINTBRUSH;
	public static BlockItem MONSTERAS;

	public static void init() {
		REDWOOD = WoodItems.register("redwood", TerrestriaBlocks.REDWOOD);
		HEMLOCK = WoodItems.register("hemlock", TerrestriaBlocks.HEMLOCK);
		RUBBER = WoodItems.register("rubber", TerrestriaBlocks.RUBBER);
		CYPRESS = WoodItems.register("cypress", TerrestriaBlocks.CYPRESS);
		WILLOW = WoodItems.register("willow", TerrestriaBlocks.WILLOW);
		JAPANESE_MAPLE = WoodItems.register("japanese_maple", TerrestriaBlocks.JAPANESE_MAPLE);
		RAINBOW_EUCALYPTUS = WoodItems.register("rainbow_eucalyptus", TerrestriaBlocks.RAINBOW_EUCALYPTUS);
		SAKURA = WoodItems.registerWithoutBark("sakura", TerrestriaBlocks.SAKURA);
		SAKURA.wood = SAKURA.log;

		JAPANESE_MAPLE_SHRUB_LEAVES = register("japanese_maple_shrub_leaves", TerrestriaBlocks.JAPANESE_MAPLE_SHRUB_LEAVES);
		DARK_JAPANESE_MAPLE_LEAVES = register("dark_japanese_maple_leaves", TerrestriaBlocks.DARK_JAPANESE_MAPLE_LEAVES);
		SAKURA_LEAF_PILE = register("sakura_leaf_pile", TerrestriaBlocks.SAKURA_LEAF_PILE);

		CATTAIL = register("cattail", TerrestriaBlocks.CATTAIL);

		REDWOOD_QUARTER_LOG = register("redwood_quarter_log", TerrestriaBlocks.REDWOOD_QUARTER_LOG);
		HEMLOCK_QUARTER_LOG = register("hemlock_quarter_log", TerrestriaBlocks.HEMLOCK_QUARTER_LOG);
		CYPRESS_QUARTER_LOG = register("cypress_quarter_log", TerrestriaBlocks.CYPRESS_QUARTER_LOG);
		RAINBOW_EUCALYPTUS_QUARTER_LOG = register("rainbow_eucalyptus_quarter_log", TerrestriaBlocks.RAINBOW_EUCALYPTUS_QUARTER_LOG);

		STRIPPED_REDWOOD_QUARTER_LOG = register("stripped_redwood_quarter_log", TerrestriaBlocks.STRIPPED_REDWOOD_QUARTER_LOG);
		STRIPPED_HEMLOCK_QUARTER_LOG = register("stripped_hemlock_quarter_log", TerrestriaBlocks.STRIPPED_HEMLOCK_QUARTER_LOG);
		STRIPPED_CYPRESS_QUARTER_LOG = register("stripped_cypress_quarter_log", TerrestriaBlocks.STRIPPED_CYPRESS_QUARTER_LOG);
		STRIPPED_RAINBOW_EUCALYPTUS_QUARTER_LOG = register("stripped_rainbow_eucalyptus_quarter_log", TerrestriaBlocks.STRIPPED_RAINBOW_EUCALYPTUS_QUARTER_LOG);

		REDWOOD_SAPLING = register("redwood_sapling", TerrestriaBlocks.REDWOOD_SAPLING);
		HEMLOCK_SAPLING = register("hemlock_sapling", TerrestriaBlocks.HEMLOCK_SAPLING);
		RUBBER_SAPLING = register("rubber_sapling", TerrestriaBlocks.RUBBER_SAPLING);
		CYPRESS_SAPLING = register("cypress_sapling", TerrestriaBlocks.CYPRESS_SAPLING);
		WILLOW_SAPLING = register("willow_sapling", TerrestriaBlocks.WILLOW_SAPLING);
		JAPANESE_MAPLE_SAPLING = register("japanese_maple_sapling", TerrestriaBlocks.JAPANESE_MAPLE_SAPLING);
		JAPANESE_MAPLE_SHRUB_SAPLING = register("japanese_maple_shrub_sapling", TerrestriaBlocks.JAPANESE_MAPLE_SHRUB_SAPLING);
		DARK_JAPANESE_MAPLE_SAPLING = register("dark_japanese_maple_sapling", TerrestriaBlocks.DARK_JAPANESE_MAPLE_SAPLING);
		RAINBOW_EUCALYPTUS_SAPLING = register("rainbow_eucalyptus_sapling", TerrestriaBlocks.RAINBOW_EUCALYPTUS_SAPLING);
		SAKURA_SAPLING = register("sakura_sapling", TerrestriaBlocks.SAKURA_SAPLING);
		PALM_SAPLING = register("palm_sapling", TerrestriaBlocks.PALM_SAPLING);

		BASALT = register("basalt", TerrestriaBlocks.BASALT);
		BASALT_SAND = register("basalt_sand", TerrestriaBlocks.BASALT_SAND);
		BASALT_DIRT = register("basalt_dirt", TerrestriaBlocks.BASALT_DIRT);
		BASALT_GRASS_BLOCK = register("basalt_grass_block", TerrestriaBlocks.BASALT_GRASS_BLOCK);
		INDIAN_PAINTBRUSH = register("indian_paintbrush", TerrestriaBlocks.INDIAN_PAINTBRUSH);
		MONSTERAS = register("monsteras", TerrestriaBlocks.MONSTERAS);
	}

	private static BlockItem register(String name, Block block) {
		return Registry.register(Registry.ITEM, new Identifier(Terrestria.MOD_ID, name), new BlockItem(block, new Item.Settings().group(Terrestria.ITEM_GROUP)));
	}

	private static SignItem registerSign(String name, Block standing, Block wall) {
		return Registry.register(Registry.ITEM, new Identifier(Terrestria.MOD_ID, name), new SignItem(new Item.Settings().group(Terrestria.ITEM_GROUP), standing, wall));
	}

	public static class WoodItems {
		public BlockItem log;
		public BlockItem wood;
		public BlockItem leaves;
		public BlockItem planks;
		public BlockItem slab;
		public BlockItem stairs;
		public BlockItem fence;
		public BlockItem fenceGate;
		public BlockItem door;
		public BlockItem button;
		public BlockItem pressurePlate;
		public SignItem sign;
		public BlockItem trapdoor;
		public BlockItem strippedLog;
		public BlockItem strippedWood;

		private WoodItems() {
		}

		public static WoodItems register(String name, TerrestriaBlocks.WoodBlocks blocks) {
			WoodItems items = registerWithoutBark(name, blocks);

			items.wood = TerrestriaItems.register(name + "_wood", blocks.wood);
			items.strippedWood = TerrestriaItems.register("stripped_" + name + "_wood", blocks.strippedWood);

			return items;
		}

		public static WoodItems registerWithoutBark(String name, TerrestriaBlocks.WoodBlocks blocks) {
			WoodItems items = new WoodItems();

			items.log = TerrestriaItems.register(name + "_log", blocks.log);
			items.leaves = TerrestriaItems.register(name + "_leaves", blocks.leaves);
			items.planks = TerrestriaItems.register(name + "_planks", blocks.planks);
			items.slab = TerrestriaItems.register(name + "_slab", blocks.slab);
			items.stairs = TerrestriaItems.register(name + "_stairs", blocks.stairs);
			items.fence = TerrestriaItems.register(name + "_fence", blocks.fence);
			items.fenceGate = TerrestriaItems.register(name + "_fence_gate", blocks.fenceGate);
			items.door = TerrestriaItems.register(name + "_door", blocks.door);
			items.button = TerrestriaItems.register(name + "_button", blocks.button);
			items.pressurePlate = TerrestriaItems.register(name + "_pressure_plate", blocks.pressurePlate);
			items.trapdoor = TerrestriaItems.register(name + "_trapdoor", blocks.trapdoor);
			items.sign = TerrestriaItems.registerSign(name + "_sign", blocks.sign, blocks.wallSign);
			items.strippedLog = TerrestriaItems.register("stripped_" + name + "_log", blocks.strippedLog);

			return items;
		}
	}
}
