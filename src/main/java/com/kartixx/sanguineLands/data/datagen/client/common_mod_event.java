package com.kartixx.sanguineLands.data.datagen.client;

import com.kartixx.sanguineLands.entities.EntityInit;
import com.kartixx.sanguineLands.entities.monsters.blood_spider;
import com.kartixx.sanguineLands.entities.monsters.blood_zombie;
import com.kartixx.sanguineLands.entities.monsters.leech;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = sanguine_lands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class common_mod_event {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.BLOOD_ZOMBIE.get(), blood_zombie.createAttributes().build());
        event.put(EntityInit.BLOOD_SPIDER.get(), blood_spider.createAttributes().build());
        event.put(EntityInit.LEECH.get(), leech.createAttributes().build());
    }
}