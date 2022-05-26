package com.kartixx.sanguineLands.entities.models;

import com.kartixx.sanguineLands.entities.monsters.leech;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class leech_model extends AnimatedGeoModel<leech> {
    @Override
    public ResourceLocation getModelLocation(leech object) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "entities/models/leech.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(leech object) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "textures/entities/leech.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(leech animatable) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "entities/animations/leech.animation.json");
    }
}
