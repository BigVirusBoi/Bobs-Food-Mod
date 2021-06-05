package me.bigvirusboi.foodmod;

import me.bigvirusboi.foodmod.client.ClientEventBus;
import me.bigvirusboi.foodmod.init.Compostables;
import me.bigvirusboi.foodmod.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod(FoodMod.MOD_ID)
@Mod.EventBusSubscriber(modid = FoodMod.MOD_ID)
public class FoodMod {
    public static final String MOD_ID = "bobs_food_mod";
    public static final Logger LOGGER = LogManager.getLogger();

    public FoodMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);

        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(ClientEventBus::clientSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent e) {
        e.enqueueWork(Compostables::registerCompostables);
    }



    public static final FoodItemGroup GROUP = FoodItemGroup.instance;

    private static class FoodItemGroup extends ItemGroup {
        public static final FoodItemGroup instance = new FoodItemGroup(ItemGroup.GROUPS.length, "bobsFood");

        private FoodItemGroup(int index, String label) {
            super(index, label);
        }

        @Nonnull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.HONEYED_APPLE.get());
        }
    }

    public static ResourceLocation getId(String path) {
        return new ResourceLocation(FoodMod.MOD_ID, path);
    }
}
