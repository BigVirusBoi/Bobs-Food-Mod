package me.bigvirusboi.foodmod.client;

import me.bigvirusboi.foodmod.FoodMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FoodMod.MOD_ID, value = Dist.CLIENT, bus = Bus.MOD)
public class ClientEventBus {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent e) {
        //RenderTypeLookup.setRenderLayer(BlockInit.HELLO.get(), RenderType.getCutout());
    }
}
