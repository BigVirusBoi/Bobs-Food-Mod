package me.bigvirusboi.foodmod.world.gen;

import me.bigvirusboi.foodmod.init.BlockInit;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.NoiseDependant;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BiomeFeatures {
    @SubscribeEvent
    public static void generateFeatures(final BiomeLoadingEvent e) {
        Category category = e.getCategory();
        BiomeGenerationSettingsBuilder gen = e.getGeneration();

        if (category == Category.PLAINS ||
                category == Category.TAIGA ||
                category == Category.SAVANNA ||
                category == Category.FOREST ||
                category == Category.RIVER ||
                category == Category.JUNGLE) {
            addGrass(gen);
        }
    }

    private static void addGrass(BiomeGenerationSettingsBuilder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_PATCH_CONFIG)
                .withPlacement(Features.Placements.PATCH_PLACEMENT).withPlacement(Placement.COUNT_NOISE.configure(
                        new NoiseDependant(-0.7D, 4, 7))));
    }

    public static final BlockClusterFeatureConfig GRASS_PATCH_CONFIG = new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(
            BlockInit.GRASS.get().getDefaultState()), SimpleBlockPlacer.PLACER).tries(24).build();
}
