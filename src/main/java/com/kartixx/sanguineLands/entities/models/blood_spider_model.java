package com.kartixx.sanguineLands.entities.models;

import com.kartixx.sanguineLands.entities.monsters.blood_spider;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class blood_spider_model extends AnimatedGeoModel<blood_spider>{
    @Override
    public ResourceLocation getModelLocation(blood_spider object) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "geo/blood_spider.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(blood_spider object) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "textures/entity/blood_spider/blood_spider.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(blood_spider animatable) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "animations/blood_spider.animation.json");
    }
}

// File related to entity crash