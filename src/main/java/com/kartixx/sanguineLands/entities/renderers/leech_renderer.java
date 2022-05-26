package com.kartixx.sanguineLands.entities.renderers;

import com.kartixx.sanguineLands.entities.models.leech_model;
import com.kartixx.sanguineLands.entities.monsters.leech;
import com.kartixx.sanguineLands.sanguine_lands;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class leech_renderer extends GeoEntityRenderer<leech>{
    public leech_renderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new leech_model());
        this.shadowRadius = 0.3F;
    }

    @Override
    public ResourceLocation getTextureLocation(leech instance) {
        return new ResourceLocation(sanguine_lands.MOD_ID, "textures/entities/leech.png");
    }

    @Override
    public RenderType getRenderType(leech animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1F, 1F, 1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
