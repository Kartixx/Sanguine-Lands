package com.kartixx.sanguineLands.entities.models;

import com.kartixx.sanguineLands.entities.monsters.blood_zombie;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class blood_zombie_model extends AnimatedGeoModel<blood_zombie> {
    @Override
    public ResourceLocation getModelLocation(blood_zombie object) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "entities/models/blood_zombie.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(blood_zombie object) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "textures/entities/blood_zombie.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(blood_zombie animatable) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "entities/animations/blood_zombie.animation.json");
    }
}
