package me.bigvirusboi.foodmod.init;

import me.bigvirusboi.foodmod.FoodMod;
import me.bigvirusboi.foodmod.block.StrawberriesBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodMod.MOD_ID);


    public static final RegistryObject<Block> GRASS = register("grass", () ->
            new TallGrassBlock(AbstractBlock.Properties.create(Material.PLANTS)
                    //.setNeedsPostProcessing(BlockInit::needsPostProcessing)
                    //.setEmmisiveRendering(BlockInit::needsPostProcessing)
                    .doesNotBlockMovement().notSolid().sound(SoundType.PLANT)));

    public static final RegistryObject<Block> STRAWBERRIES = register("strawberries", () ->
            new StrawberriesBlock(AbstractBlock.Properties.create(Material.PLANTS)
                    .doesNotBlockMovement().tickRandomly().notSolid().sound(SoundType.CROP)));


    private static RegistryObject<Block> register(String name, Supplier<? extends Block> block) {
        return BLOCKS.register(name, block);
    }

    private static boolean needsPostProcessing(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }
}