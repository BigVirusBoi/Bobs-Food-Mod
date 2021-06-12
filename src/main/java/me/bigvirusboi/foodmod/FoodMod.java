package me.bigvirusboi.foodmod;

import me.bigvirusboi.foodmod.client.ClientEventBus;
import me.bigvirusboi.foodmod.init.BlockInit;
import me.bigvirusboi.foodmod.init.Compostables;
import me.bigvirusboi.foodmod.init.ItemInit;
import me.bigvirusboi.foodmod.init.SoundInit;
import me.bigvirusboi.foodmod.world.gen.BiomeFeatures;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@Mod(FoodMod.MOD_ID)
@Mod.EventBusSubscriber(modid = FoodMod.MOD_ID)
public class FoodMod {
    public static final String MOD_ID = "bobs_food_mod";

    public FoodMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);

        SoundInit.SOUNDS.register(bus);
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(ClientEventBus::clientSetup);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, BiomeFeatures::generateFeatures);
    }

    private void commonSetup(final FMLCommonSetupEvent e) {
        e.enqueueWork(Compostables::registerCompostables);
    }

    @SubscribeEvent
    public void onToolTip(ItemTooltipEvent e) {
        Item item = e.getItemStack().getItem();
        if (ItemInit.UNOBTAINABLE.contains(item)) {
            e.getToolTip().add(new TranslationTextComponent(I18n.format("tooltip.bobs_food_mod.unobtainable")));
        }
    }



    public static final FoodItemGroup GROUP = FoodItemGroup.instance;
    public static final UnobtainableItemGroup UNOBTAINABLE = UnobtainableItemGroup.instance;

    private static class FoodItemGroup extends ItemGroup {
        public static final FoodItemGroup instance = new FoodItemGroup(ItemGroup.GROUPS.length, "bobs_food");

        private FoodItemGroup(int index, String label) {
            super(index, label);
        }

        @Nonnull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.HONEYED_APPLE.get());
        }
    }

    private static class UnobtainableItemGroup extends ItemGroup {
        public static final UnobtainableItemGroup instance = new UnobtainableItemGroup(ItemGroup.GROUPS.length, "bobs_food");

        private UnobtainableItemGroup(int index, String label) {
            super(index, label);
        }

        @Nonnull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.CHOCOLATE.get());
        }
    }

    public static ResourceLocation getId(String path) {
        return new ResourceLocation(FoodMod.MOD_ID, path);
    }
}
