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
    }
}
