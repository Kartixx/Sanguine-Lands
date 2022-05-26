package com.kartixx.sanguineLands.items.food;

import net.minecraft.world.food.FoodProperties;

public class FoodInit {
    public static final FoodProperties BLOOD_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
}

//.effect(new MobEffectInstance(EffectInit.BLOOD_SICKNESS.get(), 600, 0), 0.3F)