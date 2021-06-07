package me.bigvirusboi.foodmod.init;

import me.bigvirusboi.foodmod.FoodMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FoodMod.MOD_ID);

    public static final Lazy<SoundEvent> LAZY_ICE_CREAM_LICK = Lazy.of(() -> new SoundEvent(new ResourceLocation(FoodMod.MOD_ID, "item.ice_cream.lick")));

    public static final RegistryObject<SoundEvent> ICE_CREAM_LICK = SOUNDS.register("item.ice_cream.lick", LAZY_ICE_CREAM_LICK);
}
