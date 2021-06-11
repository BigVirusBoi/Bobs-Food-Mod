package me.bigvirusboi.foodmod.init;

import com.google.common.collect.Sets;
import me.bigvirusboi.foodmod.FoodMod;
import me.bigvirusboi.foodmod.item.KnifeItem;
import me.bigvirusboi.foodmod.item.IceCreamItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MOD_ID);
    public static final Set<String> NEEDS_MODELS = Sets.newHashSet();
    public static final Set<Item> UNOBTAINABLE = Sets.newHashSet();

    // TODO currently only 1 use...
    public static final RegistryObject<Item> KNIFE = registerNoModel("knife", () ->
            new KnifeItem(new Item.Properties().group(FoodMod.GROUP).setNoRepair()
                    .defaultMaxDamage(64).maxDamage(64)));
    public static final RegistryObject<Item> HONEYED_APPLE = registerFood("honeyed_apple", ModFoods.HONEYED_APPLE);
    public static final RegistryObject<Item> DIAMOND_APPLE = registerFood("diamond_apple", ModFoods.DIAMOND_APPLE);
    public static final RegistryObject<Item> ICE_CREAM = registerItem("ice_cream");
    public static final RegistryObject<Item> FLOUR = registerItem("flour");
    public static final RegistryObject<Item> BACON = registerFood("bacon", ModFoods.BACON);
    public static final RegistryObject<Item> COOKED_BACON = registerFood("cooked_bacon", ModFoods.COOKED_BACON);
    public static final RegistryObject<Item> BREAD_SLICE = registerFood("bread_slice", ModFoods.BREAD_SLICE);
    public static final RegistryObject<Item> SALT = registerItem("salt");
    public static final RegistryObject<Item> BUTTER = registerFood("butter", ModFoods.BUTTER);
    public static final RegistryObject<Item> FRIED_EGG = registerFood("fried_egg", ModFoods.FRIED_EGG);

    public static final RegistryObject<Item> ICE_CREAM_CONE = registerFood("ice_cream_cone", ModFoods.ICE_CREAM_CONE);
    public static final RegistryObject<IceCreamItem> STRAWBERRY_ICE_CREAM = registerIceCream("strawberry_ice_cream");
    public static final RegistryObject<IceCreamItem> BANANA_ICE_CREAM = registerUnobtainableIceCream("banana_ice_cream");
    public static final RegistryObject<IceCreamItem> CHOCOLATE_ICE_CREAM = registerUnobtainableIceCream("chocolate_ice_cream");
    public static final RegistryObject<IceCreamItem> LEMON_ICE_CREAM = registerUnobtainableIceCream("lemon_ice_cream");
    public static final RegistryObject<IceCreamItem> MANGO_ICE_CREAM = registerUnobtainableIceCream("mango_ice_cream");
    public static final RegistryObject<IceCreamItem> VANILLA_ICE_CREAM = registerUnobtainableIceCream("vanilla_ice_cream");

    public static final RegistryObject<Item> STRAWBERRY = registerFood("strawberry", ModFoods.STRAWBERRY);
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = register("strawberry_seeds", () ->
            new BlockNamedItem(BlockInit.STRAWBERRIES.get(), new Item.Properties().group(FoodMod.GROUP)));

    // Unobtainable (for now)
    public static final RegistryObject<Item> CHOCOLATE = registerUnobtainableFood("chocolate", ModFoods.CHOCOLATE);
    public static final RegistryObject<Item> BANANA = registerUnobtainableFood("banana", ModFoods.BANANA);
    public static final RegistryObject<Item> ORANGE = registerUnobtainableFood("orange", ModFoods.ORANGE);
    public static final RegistryObject<Item> TOMATO = registerUnobtainableFood("tomato", ModFoods.TOMATO);
    public static final RegistryObject<Item> PINEAPPLE = registerUnobtainableFood("pineapple", ModFoods.PINEAPPLE);
    public static final RegistryObject<Item> MANGO = registerUnobtainableFood("mango", ModFoods.MANGO);
    public static final RegistryObject<Item> LEMON = registerUnobtainableFood("lemon", ModFoods.LEMON);
    public static final RegistryObject<Item> LIME = registerUnobtainableFood("lime", ModFoods.LIME);
    public static final RegistryObject<Item> COCONUT = registerUnobtainable("coconut");
    public static final RegistryObject<Item> CHILI = registerUnobtainableFood("chili", ModFoods.CHILI);
    public static final RegistryObject<Item> CUCUMBER = registerUnobtainableFood("cucumber", ModFoods.CUCUMBER);

    private static RegistryObject<Item> register(String name, Supplier<? extends Item> item) {
        NEEDS_MODELS.add(name);
        return ITEMS.register(name, item);
    }

    private static RegistryObject<Item> registerNoModel(String name) {
        Item item = new Item(new Item.Properties().group(FoodMod.GROUP));
        return registerNoModel(name, () -> item);
    }

    private static RegistryObject<Item> registerNoModel(String name, Supplier<? extends Item> item) {
        return ITEMS.register(name, item);
    }

    private static RegistryObject<Item> registerItem(String name) {
        Item item = new Item(new Item.Properties().group(FoodMod.GROUP));
        return register(name, () -> item);
    }

    private static RegistryObject<Item> registerFood(String name, Food food) {
        Item item = new Item(new Item.Properties().food(food).group(FoodMod.GROUP));
        return register(name, () -> item);
    }

    private static RegistryObject<Item> registerUnobtainable(String name) {
        Item item = new Item(new Item.Properties().group(FoodMod.UNOBTAINABLE));
        UNOBTAINABLE.add(item);
        return register(name, () -> item);
    }

    private static RegistryObject<Item> registerUnobtainableFood(String name, Food food) {
        Item item = new Item(new Item.Properties().food(food).group(FoodMod.UNOBTAINABLE));
        UNOBTAINABLE.add(item);
        return register(name, () -> item);
    }

    private static RegistryObject<IceCreamItem> registerIceCream(String name) {
        IceCreamItem item = new IceCreamItem(new Item.Properties().maxStackSize(1).group(FoodMod.GROUP));
        NEEDS_MODELS.add(name);
        return ITEMS.register(name, () -> item);
    }

    private static RegistryObject<IceCreamItem> registerUnobtainableIceCream(String name) {
        IceCreamItem item = new IceCreamItem(new Item.Properties().maxStackSize(1).group(FoodMod.UNOBTAINABLE));
        UNOBTAINABLE.add(item);
        NEEDS_MODELS.add(name);
        return ITEMS.register(name, () -> item);
    }
}