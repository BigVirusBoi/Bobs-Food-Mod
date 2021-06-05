package me.bigvirusboi.foodmod.init;

import me.bigvirusboi.foodmod.FoodMod;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MOD_ID);

    //

    private static RegistryObject<? extends Item> register(String name, Supplier<? extends Item> item) {
        return ITEMS.register(name, item);
    }
}