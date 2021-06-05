package me.bigvirusboi.foodmod.data;

import me.bigvirusboi.foodmod.FoodMod;
import me.bigvirusboi.foodmod.data.client.ModBlockStateProvider;
import me.bigvirusboi.foodmod.data.client.ModItemModelProvider;
import me.bigvirusboi.foodmod.data.recipe.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = FoodMod.MOD_ID, bus = Bus.MOD)
public final class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();

        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

        gen.addProvider(new ModRecipeProvider(gen));
    }
}
