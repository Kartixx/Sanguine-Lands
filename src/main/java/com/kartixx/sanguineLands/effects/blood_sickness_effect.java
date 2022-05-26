package com.kartixx.sanguineLands.effects;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class blood_sickness_effect extends MobEffect{

    public static final DamageSource BLOOD_SICKNESS = (new DamageSource("blood_sickness")).bypassArmor();

    public blood_sickness_effect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (pLivingEntity.getHealth() > 2.5F) {
            pLivingEntity.hurt(BLOOD_SICKNESS, 2.0F);
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        int j = 150 >> pAmplifier;
        if (j > 0) {
            return pDuration % j == 0;
        } else {
            return true;
        }
    }
}
