package me.bigvirusboi.foodmod.init;

import me.bigvirusboi.foodmod.FoodMod;
import me.bigvirusboi.foodmod.block.StrawberriesBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodMod.MOD_ID);

    public static final RegistryObject<Block> STRAWBERRIES = register("strawberries", () ->
            new StrawberriesBlock(AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.PLANT)
                    .doesNotBlockMovement().tickRandomly()));

    private static RegistryObject<Block> register(String name, Supplier<? extends Block> block) {
        return BLOCKS.register(name, block);
    }
}