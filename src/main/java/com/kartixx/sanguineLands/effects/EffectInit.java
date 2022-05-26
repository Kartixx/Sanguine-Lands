package com.kartixx.sanguineLands.effects;

import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectInit {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, sanguine_lands.MOD_ID);

    public static final RegistryObject<MobEffect> BLOOD_SICKNESS = MOB_EFFECTS.register("blood_sickness",
            () -> new blood_sickness_effect(MobEffectCategory.HARMFUL, 5505024));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
