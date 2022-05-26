package com.kartixx.sanguineLands.world;

import com.kartixx.sanguineLands.world.gen.mod_tree_generator;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = sanguine_lands.MOD_ID)
public class mod_world_events {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        mod_tree_generator.generateTrees(event);
    }
}
