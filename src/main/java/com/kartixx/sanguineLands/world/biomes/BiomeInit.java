package com.kartixx.sanguineLands.world.biomes;

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BiomeInit {
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registry.register(mod_overworld.hotRed().setRegistryName(mod_biomes.HOT_RED.location()));
        registry.register(mod_overworld.coldBlue().setRegistryName(mod_biomes.COLD_BLUE.location()));
    }
}
