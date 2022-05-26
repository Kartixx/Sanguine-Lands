package com.kartixx.sanguineLands.entities.renderers;

import com.kartixx.sanguineLands.entities.models.blood_zombie_model;
import com.kartixx.sanguineLands.entities.monsters.blood_zombie;
import com.kartixx.sanguineLands.sanguine_lands;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class blood_zombie_renderer extends GeoEntityRenderer<blood_zombie>{
    public blood_zombie_renderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new blood_zombie_model());
        this.shadowRadius = 0.3F;
    }

    @Override
    public ResourceLocation getTextureLocation(blood_zombie instance) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "textures/entities/blood_zombie.png");
    }

    @Override
    public RenderType getRenderType(blood_zombie animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

// File related to entity crash
