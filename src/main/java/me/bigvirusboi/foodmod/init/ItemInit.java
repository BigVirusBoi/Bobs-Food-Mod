package me.bigvirusboi.foodmod.init;

import com.google.common.collect.Sets;
import me.bigvirusboi.foodmod.FoodMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.function.Supplier;

// TODO knife for cutting pork into bacon or something

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MOD_ID);
    public static final Set<String> NEEDS_MODELS = Sets.newHashSet();
    public static final Set<Item> UNOBTAINABLE = Sets.newHashSet();

    public static final RegistryObject<Item> HONEYED_APPLE = registerFood("honeyed_apple", ModFoods.HONEYED_APPLE);
    public static final RegistryObject<Item> DIAMOND_APPLE = registerFood("diamond_apple", ModFoods.DIAMOND_APPLE);
    // Unobtainable (for now)
    public static final RegistryObject<Item> CHOCOLATE = registerUnobtainableFood("chocolate", ModFoods.CHOCOLATE);
    public static final RegistryObject<Item> BACON = registerUnobtainableFood("bacon", ModFoods.BACON);
    public static final RegistryObject<Item> COOKED_BACON = registerUnobtainableFood("cooked_bacon", ModFoods.COOKED_BACON);
    public static final RegistryObject<Item> ICE_CREAM_CONE = registerUnobtainableFood("ice_cream_cone", ModFoods.ICE_CREAM_CONE);

    private static RegistryObject<Item> register(String name, Supplier<? extends Item> item) {
        NEEDS_MODELS.add(name);
        return ITEMS.register(name, item);
    }

    private static RegistryObject<Item> registerFood(String name, Food food) {
        Item item = new Item(new Item.Properties().food(food).group(FoodMod.GROUP));
        return register(name, () -> item);
    }

    private static RegistryObject<Item> registerUnobtainableFood(String name, Food food) {
        Item item = new Item(new Item.Properties().food(food).group(FoodMod.GROUP));
        UNOBTAINABLE.add(item);
        return register(name, () -> item);
    }
}