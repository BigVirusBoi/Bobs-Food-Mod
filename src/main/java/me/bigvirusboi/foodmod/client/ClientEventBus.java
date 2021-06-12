package me.bigvirusboi.foodmod.client;

import me.bigvirusboi.foodmod.FoodMod;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static me.bigvirusboi.foodmod.init.BlockInit.*;

@Mod.EventBusSubscriber(modid = FoodMod.MOD_ID, value = Dist.CLIENT, bus = Bus.MOD)
public class ClientEventBus {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent e) {
        RenderTypeLookup.setRenderLayer(STRAWBERRIES.get(), RenderType.getCutout());
    }
}
