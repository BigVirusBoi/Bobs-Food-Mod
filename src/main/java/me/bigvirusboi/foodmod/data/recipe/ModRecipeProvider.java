package me.bigvirusboi.foodmod.data.recipe;

import me.bigvirusboi.foodmod.FoodMod;
import me.bigvirusboi.foodmod.init.ItemInit;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.CookingRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(@Nonnull Consumer<IFinishedRecipe> consumer) {
        buildShapedRecipe(ItemInit.KNIFE.get(), 1, Items.IRON_INGOT)
                .key('S', Items.STICK).key('I', Items.IRON_INGOT)
                .patternLine(" I")
                .patternLine("S ").build(consumer);
        buildShapedRecipe(ItemInit.DIAMOND_APPLE.get(), 1, Items.DIAMOND)
                .key('D', Items.DIAMOND).key('A', Items.GOLDEN_APPLE)
                .patternLine(" D ")
                .patternLine("DAD")
                .patternLine(" D ").build(consumer);

        buildShapelessRecipe(ItemInit.ICE_CREAM.get(), 1, Items.MILK_BUCKET)
                .addIngredient(Items.MILK_BUCKET).addIngredient(Items.SNOWBALL).addIngredient(Items.SUGAR)
                .build(consumer);
        buildShapelessRecipe(ItemInit.BUTTER.get(), 1, Items.MILK_BUCKET)
                .addIngredient(Items.MILK_BUCKET).addIngredient(Items.MILK_BUCKET).addIngredient(ItemInit.SALT.get())
                .build(consumer);
        buildShapelessRecipe(ItemInit.ICE_CREAM_CONE.get(), 8, ItemInit.FLOUR.get())
                .addIngredient(ItemInit.FLOUR.get(), 2).addIngredient(ItemInit.SALT.get())
                .addIngredient(ItemInit.BUTTER.get()).addIngredient(Items.MILK_BUCKET)
                .addIngredient(Items.EGG).addIngredient(Items.SUGAR)
                .build(consumer);
        buildShapelessRecipe(ItemInit.BANANA_ICE_CREAM.get(), 1, ItemInit.ICE_CREAM.get())
                .addIngredient(ItemInit.BANANA.get()).addIngredient(ItemInit.ICE_CREAM.get()).addIngredient(ItemInit.ICE_CREAM_CONE.get())
                .build(consumer);
        buildShapelessRecipe(ItemInit.CHOCOLATE_ICE_CREAM.get(), 1, ItemInit.ICE_CREAM.get())
                .addIngredient(ItemInit.CHOCOLATE.get()).addIngredient(ItemInit.ICE_CREAM.get()).addIngredient(ItemInit.ICE_CREAM_CONE.get())
                .build(consumer);

        buildShapelessRecipe(ItemInit.BACON.get(), 2, Items.PORKCHOP)
                .addIngredient(Items.PORKCHOP).addIngredient(ItemInit.KNIFE.get())
                .build(consumer);
        buildShapelessRecipe(ItemInit.HONEYED_APPLE.get(), 1, Items.HONEY_BOTTLE)
                .addIngredient(Items.APPLE).addIngredient(Items.HONEY_BOTTLE).build(consumer);
        buildShapelessRecipe(ItemInit.FLOUR.get(), 4, Items.WHEAT).addIngredient(Items.WHEAT)
                .build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(Items.WATER_BUCKET), ItemInit.SALT.get(), 0, 50)
                .addCriterion("has_item", hasItem(Items.WATER_BUCKET)).build(consumer);

        // Meat
        buildMeatRecipes(ItemInit.BACON.get(), ItemInit.COOKED_BACON.get(), ItemInit.BACON.get(), consumer);
    }



    private ShapedRecipeBuilder buildShapedRecipe(Item result, int count, Item criterion) {
        return ShapedRecipeBuilder.shapedRecipe(result, count).addCriterion("has_item", hasItem(criterion));
    }

    private ShapelessRecipeBuilder buildShapelessRecipe(Item result, int count, Item criterion) {
        return ShapelessRecipeBuilder.shapelessRecipe(result, count).addCriterion("has_item", hasItem(criterion));
    }

    @SuppressWarnings("deprecation")
    private void buildMeatRecipes(Item input, Item result, IItemProvider criterion, Consumer<IFinishedRecipe> consumer) {
        String path = Registry.ITEM.getKey(result).getPath();

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(input), result, 0.35F, 200)
                .addCriterion("has_item", hasItem(criterion)).build(consumer);
        CookingRecipeBuilder.cookingRecipe(Ingredient.fromItems(input), result, 0.35F, 100, CookingRecipeSerializer.SMOKING)
                .addCriterion("has_item", hasItem(criterion)).build(consumer, modId(path + "_from_smoking"));
        CookingRecipeBuilder.cookingRecipe(Ingredient.fromItems(input), result, 0.35F, 100, CookingRecipeSerializer.CAMPFIRE_COOKING)
                .addCriterion("has_item", hasItem(criterion)).build(consumer, modId(path + "_from_campfire_cooking"));
    }

    private ResourceLocation modId(String path) {
        return FoodMod.getId(path);
    }
}
