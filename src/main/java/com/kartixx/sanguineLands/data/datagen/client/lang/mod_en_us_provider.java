package com.kartixx.sanguineLands.data.datagen.client.lang;

import com.kartixx.sanguineLands.blocks.BlockInit;
import com.kartixx.sanguineLands.effects.EffectInit;
import com.kartixx.sanguineLands.entities.EntityInit;
import com.kartixx.sanguineLands.items.ItemInit;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class mod_en_us_provider extends LanguageProvider {

    public mod_en_us_provider(DataGenerator gen) {
        super(gen, sanguine_lands.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {

        // Item Groups
        add("itemGroup.sanguine_lands", "Sanguine Lands");

        // Items
        add(ItemInit.BLOOD_SHARD.get(), "Blood Shard");
        add(ItemInit.RAW_HEMATITE.get(), "Raw Hematite");
        add(ItemInit.BLOOD_IRON_INGOT.get(), "Bloodwrought Iron Ingot");
        add(ItemInit.SCARLITE_GEM.get(), "Scarlite Gem");
        add(ItemInit.CRIMIUM_INGOT.get(), "Crimium Ingot");
        add(ItemInit.BLOOD_BUCKET.get(), "Blood Bucket");

        add(ItemInit.BLOOD_IRON_HELMET.get(), "Bloodwrought Iron Helmet");
        add(ItemInit.BLOOD_IRON_CHESTPLATE.get(), "Bloodwrought Iron Chestplate");
        add(ItemInit.BLOOD_IRON_LEGGINGS.get(), "Bloodwrought Iron Leggings");
        add(ItemInit.BLOOD_IRON_BOOTS.get(), "Bloodwrought Iron Boots");

        add(ItemInit.BLOOD_IRON_SWORD.get(), "Bloodwrought Iron Sword");
        add(ItemInit.BLOOD_IRON_PICKAXE.get(), "Bloodwrought Iron Pickaxe");
        add(ItemInit.BLOOD_IRON_AXE.get(), "Bloodwrought Iron Axe");
        add(ItemInit.BLOOD_IRON_SHOVEL.get(), "Bloodwrought Iron Shovel");

        add(ItemInit.SCARLITE_HELMET.get(), "Scarlite Helmet");
        add(ItemInit.SCARLITE_CHESTPLATE.get(), "Scarlite Chestplate");
        add(ItemInit.SCARLITE_LEGGINGS.get(), "Scarlite Leggings");
        add(ItemInit.SCARLITE_BOOTS.get(), "Scarlite Boots");

        add(ItemInit.SCARLITE_SWORD.get(), "Scarlite Sword");
        add(ItemInit.SCARLITE_PICKAXE.get(), "Scarlite Pickaxe");
        add(ItemInit.SCARLITE_AXE.get(), "Scarlite Axe");
        add(ItemInit.SCARLITE_SHOVEL.get(), "Scarlite Shovel");

        add(ItemInit.CRIMIUM_HELMET.get(), "Crimium Helmet");
        add(ItemInit.CRIMIUM_CHESTPLATE.get(), "Crimium Chestplate");
        add(ItemInit.CRIMIUM_LEGGINGS.get(), "Crimium Leggings");
        add(ItemInit.CRIMIUM_BOOTS.get(), "Crimium Boots");

        add(ItemInit.CRIMIUM_SWORD.get(), "Crimium Sword");
        add(ItemInit.CRIMIUM_PICKAXE.get(), "Crimium Pickaxe");
        add(ItemInit.CRIMIUM_AXE.get(), "Crimium Axe");
        add(ItemInit.CRIMIUM_SHOVEL.get(), "Crimium Shovel");

        add(ItemInit.BLOOD_SPIDER_SPAWN_EGG.get(), "Crimson Crawler Spawn Egg");
        add(ItemInit.BLOOD_ZOMBIE_SPAWN_EGG.get(), "Blood Walker Spawn Egg");
        add(ItemInit.LEECH_SPAWN_EGG.get(), "Leech Spawn Egg");

        add(ItemInit.BLOOD_APPLE.get(), "Bloody Apple");

        // Blocks
        add(BlockInit.BLOOD_IRON_BLOCK.get(), "Block of Bloodwrought Iron");
        add(BlockInit.SANGUINE_PLANKS.get(), "Sanguine Planks");
        add(BlockInit.STRIPPED_SANGUINE_WOOD.get(), "Stripped Sanguine Wood");
        add(BlockInit.STRIPPED_SANGUINE_LOG.get(), "Stripped Sanguine Log");
        add(BlockInit.SANGUINE_WOOD.get(), "Sanguine Wood");
        add(BlockInit.SANGUINE_LOG.get(), "Sanguine Log");
        add(BlockInit.SANGUINE_SAPLING.get(), "Sanguine Sapling");
        add(BlockInit.SANGUINE_LEAVES.get(), "Sanguine Leaves");

        add(BlockInit.SANGUINE_STAIRS.get(), "Sanguine Stairs");
        add(BlockInit.SANGUINE_SLAB.get(), "Sanguine Slab");
        add(BlockInit.SANGUINE_FENCE.get(), "Sanguine Fence");
        add(BlockInit.SANGUINE_FENCE_GATE.get(), "Sanguine Fence Gate");

        add(BlockInit.SANGUINE_BUTTON.get(), "Sanguine Button");
        add(BlockInit.SANGUINE_PRESSURE_PLATE.get(), "Sanguine Pressure Plate");
        add(BlockInit.SANGUINE_TRAPDOOR.get(), "Sanguine Trapdoor");
        add(BlockInit.SANGUINE_DOOR.get(), "Sanguine Door");

        add(BlockInit.SANGUINE_INFUSER.get(), "Sanguine Infuser");

        //Entities
        add(EntityInit.BLOOD_ZOMBIE.get(), "Blood Walker");
        add(EntityInit.BLOOD_SPIDER.get(), "Crimson Crawler");
        add(EntityInit.LEECH.get(), "Leech");

        //Mob Effects
        add(EffectInit.BLOOD_SICKNESS.get(), "Blood Sickness");
    }

}
