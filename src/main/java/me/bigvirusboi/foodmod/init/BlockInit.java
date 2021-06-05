package me.bigvirusboi.foodmod.init;

import me.bigvirusboi.experios.Experios;
import me.bigvirusboi.experios.block.*;
import me.bigvirusboi.experios.block.ExperiosOreBlock;
import me.bigvirusboi.experios.tier.MachineTier;
import me.bigvirusboi.experios.world.feature.tree.ExperiosTrees;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.ToIntFunction;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Experios.MOD_ID);

    // Natural Ores
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(2.0F)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> OSMIUM_ORE = BLOCKS.register("osmium_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> ZINC_ORE = BLOCKS.register("zinc_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    // Natural Gem Ores
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> PERIDOT_ORE = BLOCKS.register("peridot_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    // UNNATURAL ORES
    public static final RegistryObject<Block> PEZDOLITE_ORE = BLOCKS.register("pezdolite_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(30.0F, 1200.0F)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> OSMARITE_ORE = BLOCKS.register("osmarite_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(30.0F, 1200.0F)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> ENDERITE_ORE = BLOCKS.register("enderite_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(30.0F, 1200.0F)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> NEOCRIUM_ORE = BLOCKS.register("neocrium_ore", () ->
            new ExperiosOreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.SAND)
                    .hardnessAndResistance(20.0F, 1000.0F)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool().sound(SoundType.ANCIENT_DEBRIS)));



    // Natural Ore Blocks
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    // Alloy Blocks
    public static final RegistryObject<Block> ELECTRUM_BLOCK = BLOCKS.register("electrum_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    // Gem Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> PERIDOT_BLOCK = BLOCKS.register("peridot_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()));

    // Wood stuff
    public static final RegistryObject<Block> RUBBER_PLANKS = BLOCKS.register("rubber_planks", () ->
            new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0F, 3.0F)));
    public static final RegistryObject<Block> RUBBER_SAPLING = BLOCKS.register("rubber_sapling", () ->
            new SaplingBlock(ExperiosTrees.RUBBER, AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement()
                    .tickRandomly().zeroHardnessAndResistance().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> POTTED_RUBBER_SAPLING = BLOCKS.register("potted_rubber_sapling", () ->
            new FlowerPotBlock(RUBBER_SAPLING.get(), AbstractBlock.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance()
                    .notSolid()));
    public static final RegistryObject<RotatedPillarBlock> RUBBER_LOG = BLOCKS.register("rubber_log", () ->
            new RubberLogBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_RUBBER_LOG = BLOCKS.register("stripped_rubber_log", () ->
            createLogBlock(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_RUBBER_WOOD = BLOCKS.register("stripped_rubber_wood", () ->
            new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<RotatedPillarBlock> RUBBER_WOOD = BLOCKS.register("rubber_wood", () ->
            new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RUBBER_LEAVES = BLOCKS.register("rubber_leaves", BlockInit::createLeavesBlock);
    public static final RegistryObject<SlabBlock> RUBBER_SLAB = BLOCKS.register("rubber_slab", () ->
            new SlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RUBBER_STAIRS = BLOCKS.register("rubber_stairs", () ->
            new StairsBlock(() -> RUBBER_PLANKS.get().getDefaultState(), AbstractBlock.Properties.from(RUBBER_PLANKS.get())));
    public static final RegistryObject<Block> RUBBER_PRESSURE_PLATE = BLOCKS.register("rubber_pressure_plate", () ->
            new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, RUBBER_PLANKS.get().getMaterialColor())
                    .doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RUBBER_FENCE = BLOCKS.register("rubber_fence", () ->
            new FenceBlock(AbstractBlock.Properties.create(Material.WOOD, RUBBER_PLANKS.get().getMaterialColor())
                    .hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<TrapDoorBlock> RUBBER_TRAPDOOR = BLOCKS.register("rubber_trapdoor", () ->
            new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F)
                    .sound(SoundType.WOOD).notSolid().setAllowsSpawn(BlockInit::neverAllowSpawn)));
    public static final RegistryObject<Block> RUBBER_FENCE_GATE = BLOCKS.register("rubber_fence_gate", () ->
            new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD, RUBBER_PLANKS.get().getMaterialColor())
                    .hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RUBBER_BUTTON = BLOCKS.register("rubber_button", () ->
            new WoodButtonBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F)
                    .sound(SoundType.WOOD)));
    public static final RegistryObject<DoorBlock> RUBBER_DOOR = BLOCKS.register("rubber_door", () ->
            new DoorBlock(AbstractBlock.Properties.create(Material.WOOD, RUBBER_PLANKS.get().getMaterialColor()).hardnessAndResistance(3.0F)
                    .sound(SoundType.WOOD).notSolid()));

    public static final RegistryObject<Block> RUBBER_WOOD_CRATE = BLOCKS.register("rubber_wood_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD).notSolid()));



    // Stuff
    public static final RegistryObject<CrateBlock> OAK_WOOD_CRATE = BLOCKS.register("oak_wood_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD).notSolid()));
    public static final RegistryObject<Block> SPRUCE_WOOD_CRATE = BLOCKS.register("spruce_wood_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD).notSolid()));
    public static final RegistryObject<Block> BIRCH_WOOD_CRATE = BLOCKS.register("birch_wood_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD).notSolid()));
    public static final RegistryObject<Block> JUNGLE_WOOD_CRATE = BLOCKS.register("jungle_wood_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD).notSolid()));
    public static final RegistryObject<Block> ACACIA_WOOD_CRATE = BLOCKS.register("acacia_wood_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD).notSolid()));
    public static final RegistryObject<Block> DARK_OAK_WOOD_CRATE = BLOCKS.register("dark_oak_wood_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.WOOD).notSolid()));

    public static final RegistryObject<Block> CRIMSON_HYPHAE_CRATE = BLOCKS.register("crimson_hyphae_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.NETHER_WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.HYPHAE).notSolid()));
    public static final RegistryObject<Block> WARPED_HYPHAE_CRATE = BLOCKS.register("warped_hyphae_crate", () ->
            new CrateBlock(AbstractBlock.Properties.create(Material.NETHER_WOOD).hardnessAndResistance(2.0F)
                    .sound(SoundType.HYPHAE).notSolid()));



    // Crops
    public static final RegistryObject<Block> STRAWBERRIES = BLOCKS.register("strawberries", () ->
            new StrawberriesBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.FOLIAGE).doesNotBlockMovement()
                    .tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP).notSolid()));
    public static final RegistryObject<Block> ONIONS = BLOCKS.register("onions", () ->
            new OnionsBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.FOLIAGE).doesNotBlockMovement()
                    .tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP).notSolid()));

    public static final RegistryObject<Block> COFFEE_PLANT = BLOCKS.register("coffee_plant", () ->
            new CoffeePlantBlock(AbstractBlock.Properties.create(Material.PLANTS, MaterialColor.FOLIAGE).doesNotBlockMovement()
                    .tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP).notSolid()));



    public static final RegistryObject<Block> PEBBLE = BLOCKS.register("pebble", () ->
            new PebbleBlock(AbstractBlock.Properties.create(Material.ROCK).zeroHardnessAndResistance().notSolid()
                    .doesNotBlockMovement().setAllowsSpawn(BlockInit::neverAllowSpawn)));

    // Spikes
    public static final RegistryObject<Block> STONE_SPIKE = BLOCKS.register("stone_spike", () ->
            new SpikeBlock(5.0f, AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE)
                    .hardnessAndResistance(1.5F, 6.0F).setRequiresTool()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0).setAllowsSpawn(BlockInit::neverAllowSpawn)));
    public static final RegistryObject<Block> IRON_SPIKE = BLOCKS.register("iron_spike", () ->
            new SpikeBlock(6.0f, AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON)
                    .sound(SoundType.METAL).hardnessAndResistance(5.0F, 6.0F)
                    .setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(1).setAllowsSpawn(BlockInit::neverAllowSpawn)));
    public static final RegistryObject<Block> GOLD_SPIKE = BLOCKS.register("gold_spike", () ->
            new SpikeBlock(5.0f, AbstractBlock.Properties.create(Material.IRON, MaterialColor.GOLD)
                    .sound(SoundType.METAL).hardnessAndResistance(3.0F, 6.0F)
                    .setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(2).setAllowsSpawn(BlockInit::neverAllowSpawn)));
    public static final RegistryObject<Block> DIAMOND_SPIKE = BLOCKS.register("diamond_spike", () ->
            new SpikeBlock(8.0f, AbstractBlock.Properties.create(Material.IRON, MaterialColor.DIAMOND)
                    .sound(SoundType.METAL).hardnessAndResistance(5.0F, 6.0F)
                    .setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(2).setAllowsSpawn(BlockInit::neverAllowSpawn)));
    public static final RegistryObject<Block> NETHERITE_SPIKE = BLOCKS.register("netherite_spike", () ->
            new SpikeBlock(10.0f, AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)
                    .sound(SoundType.NETHERITE).hardnessAndResistance(50.0F, 1200.0F)
                    .setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(3).setAllowsSpawn(BlockInit::neverAllowSpawn)));



    public static final RegistryObject<Block> IRON_GRATE = BLOCKS.register("iron_grate", () ->
            new GrateBlock(false, AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).setRequiresTool().hardnessAndResistance(5.0F, 6.0F)
                    .sound(SoundType.METAL).notSolid().harvestTool(ToolType.PICKAXE).harvestLevel(1)
                    .setAllowsSpawn(BlockInit::neverAllowSpawn)));
    public static final RegistryObject<Block> GOLD_GRATE = BLOCKS.register("gold_grate", () ->
            new GrateBlock(true, AbstractBlock.Properties.create(Material.IRON, MaterialColor.GOLD).setRequiresTool().hardnessAndResistance(3.0F, 6.0F)
                    .sound(SoundType.METAL).notSolid().harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .setAllowsSpawn(BlockInit::neverAllowSpawn)));
    public static final RegistryObject<Block> GOLD_BARS = BLOCKS.register("gold_bars", () ->
            new PaneBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GOLD).setRequiresTool()
                    .hardnessAndResistance(5.0F, 6.0F).harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL).notSolid().setRequiresTool().harvestLevel(2)));

    public static final RegistryObject<Block> FAN = BLOCKS.register("fan", () ->
            new FanBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool()
                    .harvestTool(ToolType.PICKAXE).hardnessAndResistance(3.5F)));


    // TODO
    public static final RegistryObject<Block> COAL_GENERATOR = BLOCKS.register("coal_generator", () ->
            new CoalGeneratorBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).setRequiresTool()
                    .hardnessAndResistance(3.0F).sound(SoundType.METAL)));

    // TODO
    public static final RegistryObject<Block> SOLAR_GENERATOR = BLOCKS.register("solar_generator", () ->
            new SolarGeneratorBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.DIAMOND).setRequiresTool()
                    .hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .setAllowsSpawn(BlockInit::neverAllowSpawn)));

    // TODO fix
    public static final RegistryObject<Block> CRUSHER = BLOCKS.register("crusher", () ->
            new CrusherBlock(MachineTier.BASIC, AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).setRequiresTool()
                    .hardnessAndResistance(3.0F).sound(SoundType.METAL)));

    // TODO
    public static final RegistryObject<Block> METAL_PRESS = BLOCKS.register("metal_press", () ->
            new MetalPressBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).setRequiresTool()
                    .hardnessAndResistance(3.0F).sound(SoundType.METAL)));





    private static RotatedPillarBlock createLogBlock(MaterialColor topColor, MaterialColor barkColor) {
        return new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, (state) ->
                state.get(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? topColor : barkColor).hardnessAndResistance(2.0F)
                .sound(SoundType.WOOD));
    }

    private static LeavesBlock createLeavesBlock() {
        return new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
                .sound(SoundType.PLANT).notSolid().setAllowsSpawn(BlockInit::allowsSpawnOnLeaves).setSuffocates(BlockInit::isntSolid)
                .setBlocksVision(BlockInit::isntSolid));
    }



    private static Boolean allowsSpawnOnLeaves(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
        return entity == EntityType.OCELOT || entity == EntityType.PARROT;
    }

    private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }

    private static Boolean neverAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
        return false;
    }

    private static ToIntFunction<BlockState> getLightValuePowered(int lightValue) {
        return (state) -> state.get(BlockStateProperties.POWERED) ? lightValue : 0;
    }
}