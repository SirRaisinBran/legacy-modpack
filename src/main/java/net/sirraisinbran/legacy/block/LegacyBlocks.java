package net.sirraisinbran.legacy.block;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.sirraisinbran.legacy.LegacyMod;
import net.sirraisinbran.legacy.block.custom.*;
import net.sirraisinbran.legacy.item.LegacyItemGroups;
import net.sirraisinbran.legacy.world.tree.AraucariaSaplingGenerator;
import net.sirraisinbran.legacy.world.tree.CladoxySaplingGenerator;
import net.sirraisinbran.legacy.world.tree.KokiaSaplingGenerator;

import static net.minecraft.block.Blocks.BIRCH_SAPLING;
import static software.bernie.example.registry.RegistryUtils.registerBlockWithoutItem;

public class LegacyBlocks {

    public static final Block SOIL = registerBlock("soil",
            new SoilBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f).sounds(BlockSoundGroup.GRASS).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block LUSH_SOIL = registerBlock("lush_soil",
            new LushSoilBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.5f).sounds(BlockSoundGroup.GRASS).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block GABBRO = registerBlock("gabbro",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block LUSH_GABBRO = registerBlock("lush_gabbro",
            new LushGabbroBlock(FabricBlockSettings.of(Material.STONE).strength(0.5f).sounds(BlockSoundGroup.STONE).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block DEAD_LUSH = registerBlock("dead_lush",
            new DeadLushBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(2f).sounds(BlockSoundGroup.FUNGUS).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block DEAD_LUSH_GABBRO = registerBlock("dead_lush_gabbro",
            new DeadLushGabbroBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(2f).sounds(BlockSoundGroup.FUNGUS).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block ROCKY_SOIL = registerBlock("rocky_soil",
            new Block(FabricBlockSettings.of(Material.SOIL).strength(1.5f).sounds(BlockSoundGroup.WET_GRASS).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block TILLED_SOIL = registerDecBlock("tilled_soil",
            new TilledSoilBlock(FabricBlockSettings.copy(Blocks.FARMLAND).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block WET_SOIL = registerBlock("wet_soil",
            new WetSoilBlock(FabricBlockSettings.of(Material.SOIL).strength(1.5f).sounds(BlockSoundGroup.WET_GRASS).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block LUSH_PATH = registerDecBlock("lush_path",
            new LushPathBlock(FabricBlockSettings.copy(Blocks.DIRT_PATH).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block DRY_SAND = registerBlock("dry_sand",
            new SandBlock(0x873b00, FabricBlockSettings.of(Material.AGGREGATE).strength(2f).sounds(BlockSoundGroup.SAND)), LegacyMod.OTHERWORLD_GROUP);


    public static final Block QUICKSAND = registerBlockWithoutBlockItem("quicksand",
            new QuicksandBlock(FabricBlockSettings.of(Material.AGGREGATE).sounds(BlockSoundGroup.SAND).dropsNothing().nonOpaque().dynamicBounds().ticksRandomly()), null);
    public static final Block DENSE_CLAY = registerBlock("dense_clay",
            new GravelBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(1.5f).sounds(BlockSoundGroup.GRAVEL).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CACTI = registerDecBlock("cacti",
            new CactiBlock(FabricBlockSettings.of(Material.CACTUS).strength(1f).sounds(BlockSoundGroup.AZALEA).nonOpaque().ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SAGUARO = registerBlock("saguaro",
            new SaguaroBlock(FabricBlockSettings.of(Material.CACTUS).strength(1f).sounds(BlockSoundGroup.AZALEA).nonOpaque()), null);

    public static final Block GABBRO_BRICKS = registerBlock("gabbro_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SMOOTH_GABBRO = registerBlock("smooth_gabbro",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);


    public static final Block GRIMSTONE = registerBlock("grimstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block GRIMSTONE_BRICKS = registerBlock("grimstone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block POLISHED_GRIMSTONE = registerBlock("polished_grimstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block BEDROCK_TILES = registerBlock("bedrock_tiles",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(-1f).sounds(BlockSoundGroup.STONE).dropsNothing()), null);
    public static final Block POLISHED_BEDROCK = registerBlock("polished_bedrock",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(-1f).sounds(BlockSoundGroup.STONE).dropsNothing()), null);

    public static final Block RUBY_QUARTZ = registerBlock("ruby_quartz",
            new TransparentBlock(FabricBlockSettings.of(Material.AMETHYST).strength(3f).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque().luminance((state) -> {
                return 6;
            })), LegacyMod.OTHERWORLD_GROUP);

    public static final Block REDSPOT_SANDSTONE = registerBlock("redspot_sandstone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SMOOTH_REDSPOT = registerBlock("smooth_redspot",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CUT_REDSPOT = registerBlock("cut_redspot",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CHISELED_REDSPOT = registerBlock("chiseled_redspot",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);


    public static final Block ARAUCARIA_LOG = registerBlock("araucaria_log",
            new AraucariaLogBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block ARAUCARIA_LEAVES = registerDecBlock("araucaria_leaves",
            new LegacyLeavesBlock(FabricBlockSettings.of(Material.LEAVES).strength(2f).sounds(BlockSoundGroup.GRASS).nonOpaque().ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block ARAUCARIA_PLANKS = registerBlock("araucaria_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block STRIPPED_ARAUCARIA_LOG = registerBlock("stripped_araucaria_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block ARAUCARIA_STAIRS = registerBlock("araucaria_stairs",
            new LegacyStairsBlock(LegacyBlocks.ARAUCARIA_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block ARAUCARIA_SLAB = registerBlock("araucaria_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block ARAUCARIA_DOOR = registerDecBlock("araucaria_door",
            new LegacyDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block ARAUCARIA_TRAPDOOR = registerDecBlock("araucaria_trapdoor",
            new LegacyTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block KOKIA_LOG = registerBlock("kokia_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block KOKIA_LEAVES = registerDecBlock("kokia_leaves",
            new LegacyLeavesBlock(FabricBlockSettings.of(Material.LEAVES).strength(2f).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque().ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block KOKIA_PLANKS = registerBlock("kokia_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block STRIPPED_KOKIA_LOG = registerBlock("stripped_kokia_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block KOKIA_STAIRS = registerBlock("kokia_stairs",
            new LegacyStairsBlock(LegacyBlocks.ARAUCARIA_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block KOKIA_SLAB = registerBlock("kokia_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block KOKIA_DOOR = registerDecBlock("kokia_door",
            new LegacyDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block KOKIA_TRAPDOOR = registerDecBlock("kokia_trapdoor",
            new LegacyTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block CLADOXY_LOG = registerBlock("cladoxy_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CLADOXY_LEAVES = registerDecBlock("cladoxy_leaves",
            new LegacyLeavesBlock(FabricBlockSettings.of(Material.LEAVES).strength(2f).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque().ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CLADOXY_PLANKS = registerBlock("cladoxy_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block STRIPPED_CLADOXY_LOG = registerBlock("stripped_cladoxy_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CLADOXY_STAIRS = registerBlock("cladoxy_stairs",
            new LegacyStairsBlock(LegacyBlocks.ARAUCARIA_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CLADOXY_SLAB = registerBlock("cladoxy_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CLADOXY_DOOR = registerDecBlock("cladoxy_door",
            new LegacyDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CLADOXY_TRAPDOOR = registerDecBlock("cladoxy_trapdoor",
            new LegacyTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block BLOCK_OF_CHARCOAL = registerBlock("block_of_charcoal",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().sounds(BlockSoundGroup.METAL)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block BLOCK_OF_RAW_NICKEL = registerBlock("block_of_raw_nickel",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().sounds(BlockSoundGroup.METAL)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block BLOCK_OF_RAW_TIN = registerBlock("block_of_raw_tin",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().sounds(BlockSoundGroup.METAL)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block BLOCK_OF_RAW_ZINC = registerBlock("block_of_raw_zinc",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().sounds(BlockSoundGroup.METAL)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block GOLD_DEPOSITS = registerBlock("gold_deposits",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block NICKEL_DEPOSITS = registerBlock("nickel_deposits",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block TIN_DEPOSITS = registerBlock("tin_deposits",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block ZINC_DEPOSITS = registerBlock("zinc_deposits",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block PORTOBELLO_BLOCK = registerDecBlock("portobello_block",
            new MushroomBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block PORTOBELLO_STEM = registerDecBlock("portobello_stem",
            new PortobelloStemBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CYANESCEN_BLOCK = registerDecBlock("cyanescen_block",
            new CyanescenBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool().nonOpaque().luminance((state) -> {
                return 10;
            })), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CYANESCEN_STEM = registerDecBlock("cyanescen_stem",
            new CyanescenStemBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block SOIL_SLAB = registerBlock("soil_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f).sounds(BlockSoundGroup.GRASS)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block GABBRO_BRICK_STAIRS = registerBlock("gabbro_brick_stairs",
            new LegacyStairsBlock(LegacyBlocks.GABBRO_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block GABBRO_BRICK_SLAB = registerBlock("gabbro_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SMOOTH_GABBRO_STAIRS = registerBlock("smooth_gabbro_stairs",
            new LegacyStairsBlock(LegacyBlocks.SMOOTH_GABBRO.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SMOOTH_GABBRO_SLAB = registerBlock("smooth_gabbro_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block GRIMSTONE_BRICK_STAIRS = registerBlock("grimstone_brick_stairs",
            new LegacyStairsBlock(LegacyBlocks.GRIMSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block GRIMSTONE_BRICK_SLAB = registerBlock("grimstone_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block POLISHED_GRIMSTONE_STAIRS = registerBlock("polished_grimstone_stairs",
            new LegacyStairsBlock(LegacyBlocks.POLISHED_GRIMSTONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block POLISHED_GRIMSTONE_SLAB = registerBlock("polished_grimstone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block REDSPOT_SANDSTONE_STAIRS = registerBlock("redspot_sandstone_stairs",
            new LegacyStairsBlock(LegacyBlocks.REDSPOT_SANDSTONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block REDSPOT_SANDSTONE_SLAB = registerBlock("redspot_sandstone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SMOOTH_REDSPOT_STAIRS = registerBlock("smooth_redspot_stairs",
            new LegacyStairsBlock(LegacyBlocks.SMOOTH_REDSPOT.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SMOOTH_REDSPOT_SLAB = registerBlock("smooth_redspot_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CUT_REDSPOT_SLAB = registerBlock("cut_redspot_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block GABBRO_BRICK_WALL = registerDecBlock("gabbro_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block GABBRO_WALL = registerDecBlock("gabbro_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block GRIMSTONE_BRICK_WALL = registerDecBlock("grimstone_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block GRIMSTONE_WALL = registerDecBlock("grimstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block REDSPOT_SANDSTONE_WALL = registerDecBlock("redspot_sandstone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SMOOTH_REDSPOT_WALL = registerDecBlock("smooth_redspot_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().sounds(BlockSoundGroup.STONE).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block GROWING_PEAR = registerBlockWithoutBlockItem("growing_pear",
            new PearBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.CROP).ticksRandomly().nonOpaque()), null);

    public static final Block SOURBREAD_STARTER = registerDecBlock("sourbread_starter",
            new SourbreadStarterBlock(FabricBlockSettings.of(Material.GLASS).strength(1f).sounds(BlockSoundGroup.GLASS).ticksRandomly().nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SOURBREAD_LOAF = registerMiscBlock("sourbread_loaf",
            new SourbreadLoafBlock(FabricBlockSettings.of(Material.CAKE).strength(1f).sounds(BlockSoundGroup.WOOL).ticksRandomly().nonOpaque()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block WORKBENCH = registerDecBlock("workbench",
            new WorkbenchBlock(FabricBlockSettings.of(Material.WOOD).strength(5f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block BLOOMERY = registerDecBlock("bloomery",
            new BloomeryBlock(FabricBlockSettings.of(Material.STONE).strength(5f).sounds(BlockSoundGroup.STONE).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block INCANTATION_BENCH = registerIncBlock("incantation_bench",
            new IncantationBlock(FabricBlockSettings.of(Material.WOOD).strength(7f).sounds(BlockSoundGroup.WOOD).nonOpaque()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block SCARLET_MUSHROOM = registerBlockWithoutBlockItem("scarlet_mushroom",
            new ScarletShroomBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().ticksRandomly().sounds(BlockSoundGroup.GRASS), () -> {
                return TreeConfiguredFeatures.HUGE_BROWN_MUSHROOM;
            }), null);
    public static final Block SCARLET_MUSHROOM_WALL = registerBlockWithoutBlockItem("scarlet_mushroom_wall",
            new ScarletShroomWallBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS), () -> {
                return null;
            }), null);
    public static final Block SCARLET_MUSHROOM_CEILING = registerBlockWithoutBlockItem("scarlet_mushroom_ceiling",
            new ScarletShroomCeilingBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS), () -> {
                return null;
            }), null);
    public static final Block SCARLET_PUFFBALL = registerBlockWithoutBlockItem("scarlet_puffball",
            new ScarletPuffballBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().strength(5f).ticksRandomly().sounds(BlockSoundGroup.HANGING_ROOTS)), null);

    public static final Block CYAN_MUSHROOM = registerBlockWithoutBlockItem("cyan_mushroom",
            new CyanShroomBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).luminance((state) -> {
                return 8;
            }), () -> {
                return TreeConfiguredFeatures.HUGE_BROWN_MUSHROOM;
            }), null);
    public static final Block CYAN_MUSHROOM_WALL = registerBlockWithoutBlockItem("cyan_mushroom_wall",
            new CyanShroomWallBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).luminance((state) -> {
                return 6;
            }), () -> {
                return null;
            }), null);
    public static final Block CYAN_MUSHROOM_CEILING = registerBlockWithoutBlockItem("cyan_mushroom_ceiling",
            new CyanShroomCeilingBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).luminance((state) -> {
                return 6;
            }), () -> {
                return null;
            }), null);

    public static final Block WHITE_MUSHROOM = registerBlockWithoutBlockItem("white_mushroom",
            new WhiteShroomBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS), () -> {
                return TreeConfiguredFeatures.HUGE_BROWN_MUSHROOM;
            }), null);
    public static final Block WHITE_MUSHROOM_WALL = registerBlockWithoutBlockItem("white_mushroom_wall",
            new WhiteShroomWallBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS), () -> {
                return null;
            }), null);
    public static final Block WHITE_MUSHROOM_CEILING = registerBlockWithoutBlockItem("white_mushroom_ceiling",
            new WhiteShroomCeilingBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS), () -> {
                return null;
            }), null);

    public static final Block EINKORN = registerBlockWithoutBlockItem("einkorn",
            new EinkornCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block ZOYSIA = registerDecBlock("zoysia",
            new OtherworldPlantBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
            ), LegacyMod.OTHERWORLD_GROUP);
    public static final Block TALL_ZOYSIA = registerBlockWithoutBlockItem("tall_zoysia",
            new TallPlantBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)
            ), null);

    public static final Block ARAUCARIA_SAPLING = registerDecBlock("araucaria_sapling",
            new OtherworldSaplingBlock(new AraucariaSaplingGenerator(),
                    FabricBlockSettings.copy(BIRCH_SAPLING)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CLADOXY_SAPLING = registerDecBlock("cladoxy_sapling",
            new OtherworldSaplingBlock(new CladoxySaplingGenerator(),
                    FabricBlockSettings.copy(BIRCH_SAPLING)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block KOKIA_SAPLING = registerDecBlock("kokia_sapling",
            new OtherworldSaplingBlock(new KokiaSaplingGenerator(),
                    FabricBlockSettings.copy(BIRCH_SAPLING)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block COOKSONIA_PLANT = registerDecBlock("cooksonia_plant",
            new TallPlantBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.VINE)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block CRY_VIOLET_FLOWER = registerBlock("cry_violet_flower",
            new FlowerBlock(StatusEffects.INVISIBILITY, 8, FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SILPHIUM_FLOWER = registerBlock("silphium_flower",
            new FlowerBlock(StatusEffects.LUCK, 16, FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.CROP)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block THISMIA_PLANT = registerDecBlock("thismia_plant",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 10, FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.AZALEA).luminance((state) -> {
                return 8;
            })), LegacyMod.OTHERWORLD_GROUP);

    public static final Block LARGE_EGG = registerMiscBlock("large_egg",
            new LargeEggBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().breakInstantly().strength(0.5F).sounds(BlockSoundGroup.CANDLE).ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block OUROBOROS = registerBlockWithoutBlockItem("ouroboros",
            new OuroborosBlock(FabricBlockSettings.of(Material.STONE).strength(5f).sounds(BlockSoundGroup.STONE).nonOpaque()), null);

    public static final Block SCARLET_BLOCK = registerDecBlock("scarlet_block",
            new ScarletBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().sounds(BlockSoundGroup.CORAL).breakInstantly().ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SCARLET_BRAIN = registerDecBlock("scarlet_brain",
            new ScarletBrain(FabricBlockSettings.of(Material.PLANT).nonOpaque().sounds(BlockSoundGroup.CORAL).breakInstantly().ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);
    /*
    public static final Block SCARLET_WALL_BLOCK = registerBlock("scarlet_wall_block",
            new ScarletBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().sounds(BlockSoundGroup.CORAL).breakInstantly()), LegacyMod.OTHERWORLD_GROUP);
    public static final Block SCARLET_CORNER_BLOCK = registerBlock("scarlet_wall_block",
            new ScarletBlock(FabricBlockSettings.of(Material.PLANT).nonOpaque().sounds(BlockSoundGroup.CORAL).breakInstantly()), LegacyMod.OTHERWORLD_GROUP);
     */

    public static final Block CYAN_LAMP = registerDecBlock("cyan_lamp",
            new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance((state) -> {
                return 14;
            }).strength(0.3F).sounds(BlockSoundGroup.GLASS)), LegacyMod.OTHERWORLD_GROUP);
    public static final Block RUBY_LANTERN = registerDecBlock("ruby_lantern",
            new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance((state) -> {
                return 14;
            }).strength(0.3F).sounds(BlockSoundGroup.GLASS)), LegacyMod.OTHERWORLD_GROUP);

    public static final Block TIGHTROPE = registerDecBlock("tightrope",
            new TightropeBlock(FabricBlockSettings.of(Material.CARPET).nonOpaque().sounds(BlockSoundGroup.WOOL).breakInstantly().ticksRandomly()), LegacyMod.OTHERWORLD_GROUP);

    public static final Block FLOAT_GLASS = registerDecBlock("float_glass",
            new FloatGlassBlock(FabricBlockSettings.copy(Blocks.GLASS)), LegacyMod.OTHERWORLD_GROUP);

    // Custom Portal Block
    public static final CyanGatewayBlock CYAN_GATEWAY = createCyanGateway("cyan_gateway");
    static CyanGatewayBlock createCyanGateway(String id) {
        CyanGatewayBlock createBlock = new CyanGatewayBlock(FabricBlockSettings.of(Material.PORTAL).strength(-1.0F, 3600000.0F).noCollision().ticksRandomly().sounds(BlockSoundGroup.GLASS).luminance((state) -> {
            return 11;
        }));
        registerBlock(id, createBlock, null);
        return createBlock;
    }

    // Registering Block Methods
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(LegacyMod.MOD_ID, name), block);
    }
    private static Block registerDecBlock(String name, Block block, ItemGroup group) {
        registerDecBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(LegacyMod.MOD_ID, name), block);
    }
    private static Block registerIncBlock(String name, Block block, ItemGroup group) {
        registerIncBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(LegacyMod.MOD_ID, name), block);
    }
    private static Block registerMiscBlock(String name, Block block, ItemGroup group) {
        registerMiscBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(LegacyMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(LegacyMod.MOD_ID, name),
                new BlockItem(block, new OwoItemSettings().group(group).tab(0)));
    }
    private static Item registerDecBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(LegacyMod.MOD_ID, name),
                new BlockItem(block, new OwoItemSettings().group(group).tab(1)));
    }
    private static Item registerIncBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(LegacyMod.MOD_ID, name),
                new BlockItem(block, new OwoItemSettings().group(group).tab(2)));
    }private static Item registerMiscBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(LegacyMod.MOD_ID, name),
                new BlockItem(block, new OwoItemSettings().group(group).tab(3)));
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(LegacyMod.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for" + LegacyMod.MOD_ID);
    }

}
