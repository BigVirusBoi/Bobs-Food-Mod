package me.bigvirusboi.foodmod.init;

import net.minecraft.item.Food;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class ModFoods {
    public static final Food HONEYED_APPLE = simpleFood(6, 4.5F);
    public static final Food CHOCOLATE = simpleFood(2, 0.2F);
    public static final Food ICE_CREAM_CONE = simpleFood(1, 0F);
    public static final Food BANANA = simpleFood(3, 0.5F);
    public static final Food ORANGE = simpleFood(5, 0.7F);
    public static final Food BREAD_SLICE = simpleFood(1, 0.2F);
    public static final Food FRIED_EGG = simpleFood(2, 0.3F);
    public static final Food TOMATO = simpleFood(4, 0.5F);
    public static final Food BUTTER = simpleFood(0, 0.1F);
    public static final Food PINEAPPLE = simpleFood(7, 0.75F);
    public static final Food MANGO = simpleFood(5, 0.6F);
    public static final Food LEMON = simpleFood(3, 0.2F);
    public static final Food LIME = simpleFood(3, 0.2F);
    public static final Food STRAWBERRY = simpleFood(2, 0.2F);
    public static final Food CHILI = simpleFood(2, 0.2F);
    public static final Food CUCUMBER = simpleFood(4, 0.4F);

    public static final Food BACON = meat(1, 0.2F);
    public static final Food COOKED_BACON = meat(3, 0.3F);

    public static final Food DIAMOND_APPLE = food(5, 1.2F)
            .effect(buildEffect(Effects.REGENERATION, 400, 1), 1.0F)
            .effect(buildEffect(Effects.RESISTANCE, 2000, 0), 1.0F)
            .effect(buildEffect(Effects.FIRE_RESISTANCE, 2000, 0), 1.0F)
            .effect(buildEffect(Effects.ABSORPTION, 2400, 3), 1.0F)
            .effect(buildEffect(Effects.SPEED, 200, 4), 1.0F)
            .setAlwaysEdible().build();



    private static Food.Builder food(int hunger, float saturation) {
        return new Food.Builder().hunger(hunger).saturation(saturation);
    }

    private static Food simpleFood(int hunger, float saturation) {
        return food(hunger, saturation).build();
    }

    private static Food meat(int hunger, float saturation) {
        return food(hunger, saturation).meat().build();
    }
    
    private static Supplier<EffectInstance> buildEffect(Effect effectIn, int duration, int amplifier) {
        return () -> new EffectInstance(effectIn, duration, amplifier);
    }
}
