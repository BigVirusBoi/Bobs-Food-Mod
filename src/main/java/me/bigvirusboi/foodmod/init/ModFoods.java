package me.bigvirusboi.foodmod.init;

import net.minecraft.item.Food;

public class ModFoods {
    public static final Food HONEYED_APPLE = simpleFood(6, 5.6F);
    public static final Food CHOCOLATE = simpleFood(2, 0.2F);

    private static Food simpleFood(int hunger, float saturation) {
        return new Food.Builder().hunger(hunger).saturation(saturation).build();
    }
}
