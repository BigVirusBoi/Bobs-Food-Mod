package me.bigvirusboi.foodmod.init;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class Compostables {
    private static void register(RegistryObject<? extends Item> item, float chance) {
        ComposterBlock.CHANCES.put(item.get(), chance);
    }

    public static void registerCompostables() {
        register(ItemInit.HONEYED_APPLE, 0.75f);
        register(ItemInit.DIAMOND_APPLE, 1f);
        register(ItemInit.CHOCOLATE, 0.3f);
        register(ItemInit.ICE_CREAM_CONE, 0.1f);
        register(ItemInit.BANANA, 0.4f);
        register(ItemInit.ORANGE, 0.6f);
        register(ItemInit.BREAD_SLICE, 0.2f);
        register(ItemInit.TOMATO, 0.5f);
        register(ItemInit.PINEAPPLE, 0.8f);
    }
}
