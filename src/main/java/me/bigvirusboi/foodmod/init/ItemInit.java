package me.bigvirusboi.foodmod.init;

import me.bigvirusboi.foodmod.FoodMod;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MOD_ID);

    public static final RegistryObject<Item> HONEYED_APPLE = registerFood("honeyed_apple", ModFoods.HONEYED_APPLE);

    private static RegistryObject<Item> register(String name, Supplier<? extends Item> item) {
        return ITEMS.register(name, item);
    }

    private static RegistryObject<Item> registerFood(String name, Food food) {
        Item item = new Item(new Item.Properties().food(food).group(FoodMod.GROUP));
        return register(name, () -> item);
    }
}