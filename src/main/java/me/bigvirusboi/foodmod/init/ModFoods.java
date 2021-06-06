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
