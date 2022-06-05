package com.kartixx.sanguineLands.entities.models;

import com.kartixx.sanguineLands.entities.monsters.leech;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class leech_model extends AnimatedGeoModel<leech> {
    @Override
    public ResourceLocation getModelLocation(leech object) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "geo/leech.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(leech object) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "textures/entity/leech/leech.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(leech animatable) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "animations/leech.animation.json");
    }
}

// File related to entity crash