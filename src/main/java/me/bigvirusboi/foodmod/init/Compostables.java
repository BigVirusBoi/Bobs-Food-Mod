package me.bigvirusboi.foodmod.init;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class Compostables {
    private static void register(RegistryObject<Item> item, float chance) {
        ComposterBlock.CHANCES.put(item.get(), chance);
    }

    public static void registerCompostables() {
        register(ItemInit.HONEYED_APPLE, 0.75f);
        register(ItemInit.CHOCOLATE, 0.5f);
    }
}
