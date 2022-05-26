package com.kartixx.sanguineLands.implementation;

import com.kartixx.sanguineLands.sanguine_lands;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class jei_plugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(sanguine_lands.MOD_ID, "jei_plugin");
    }
}
