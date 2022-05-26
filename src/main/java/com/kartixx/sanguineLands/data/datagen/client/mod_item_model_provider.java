package com.kartixx.sanguineLands.data.datagen.client;

import com.kartixx.sanguineLands.blocks.BlockInit;
import com.kartixx.sanguineLands.items.ItemInit;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class mod_item_model_provider extends ItemModelProvider {

    public mod_item_model_provider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, sanguine_lands.MOD_ID, helper);
    }

    protected void simpleBlockItem(Item item) {
        getBuilder(item.getRegistryName().toString()).parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
    }

    protected void oneLayerItem(Item item, ResourceLocation texture) {
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/generated")))
                    .texture("layer0", itemTexture);
        } else {
            System.out.println(
                    "Texture for " + item.getRegistryName().toString() + " not present at " + itemTexture.toString());
        }
    }

    protected void SpawnItem(Item item) {
            getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/template_spawn_egg")));
    }

    protected void oneLayerHandheldItem(Item item, ResourceLocation texture) {
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/handheld")))
                    .texture("layer0", itemTexture);
        } else {
            System.out.println(
                    "Texture for " + item.getRegistryName().toString() + " not present at " + itemTexture.toString());
        }
    }

    protected void oneLayerHandheldItem(Item item) {
        oneLayerHandheldItem(item, item.getRegistryName());
    }

    protected void oneLayerItem(Item item) {
        oneLayerItem(item, item.getRegistryName());
    }

    @Override
    protected void registerModels() {
        //Block Items

        simpleBlockItem(BlockInit.BLOOD_IRON_BLOCK.get().asItem());
        simpleBlockItem(BlockInit.SANGUINE_LOG.get().asItem());
        simpleBlockItem(BlockInit.SANGUINE_WOOD.get().asItem());
        simpleBlockItem(BlockInit.SANGUINE_LEAVES.get().asItem());
        simpleBlockItem(BlockInit.STRIPPED_SANGUINE_LOG.get().asItem());
        simpleBlockItem(BlockInit.STRIPPED_SANGUINE_WOOD.get().asItem());
        simpleBlockItem(BlockInit.SANGUINE_PLANKS.get().asItem());

        simpleBlockItem(BlockInit.SANGUINE_STAIRS.get().asItem());
        simpleBlockItem(BlockInit.SANGUINE_SLAB.get().asItem());
        simpleBlockItem(BlockInit.SANGUINE_FENCE_GATE.get().asItem());
        simpleBlockItem(BlockInit.SANGUINE_PRESSURE_PLATE.get().asItem());

        oneLayerItem(BlockInit.SANGUINE_SAPLING.get().asItem());



        //Simple Items

        oneLayerItem(ItemInit.BLOOD_SHARD.get());
        oneLayerItem(ItemInit.RAW_HEMATITE.get());
        oneLayerItem(ItemInit.BLOOD_IRON_INGOT.get());
        oneLayerItem(ItemInit.SCARLITE_GEM.get());
        oneLayerItem(ItemInit.CRIMIUM_INGOT.get());
        oneLayerItem(ItemInit.BLOOD_BUCKET.get());

        oneLayerItem(ItemInit.BLOOD_IRON_HELMET.get());
        oneLayerItem(ItemInit.BLOOD_IRON_CHESTPLATE.get());
        oneLayerItem(ItemInit.BLOOD_IRON_LEGGINGS.get());
        oneLayerItem(ItemInit.BLOOD_IRON_BOOTS.get());

        oneLayerHandheldItem(ItemInit.BLOOD_IRON_SWORD.get());
        oneLayerHandheldItem(ItemInit.BLOOD_IRON_PICKAXE.get());
        oneLayerHandheldItem(ItemInit.BLOOD_IRON_AXE.get());
        oneLayerHandheldItem(ItemInit.BLOOD_IRON_SHOVEL.get());

        oneLayerItem(ItemInit.SCARLITE_HELMET.get());
        oneLayerItem(ItemInit.SCARLITE_CHESTPLATE.get());
        oneLayerItem(ItemInit.SCARLITE_LEGGINGS.get());
        oneLayerItem(ItemInit.SCARLITE_BOOTS.get());

        oneLayerHandheldItem(ItemInit.SCARLITE_SWORD.get());
        oneLayerHandheldItem(ItemInit.SCARLITE_PICKAXE.get());
        oneLayerHandheldItem(ItemInit.SCARLITE_AXE.get());
        oneLayerHandheldItem(ItemInit.SCARLITE_SHOVEL.get());

        oneLayerItem(ItemInit.CRIMIUM_HELMET.get());
        oneLayerItem(ItemInit.CRIMIUM_CHESTPLATE.get());
        oneLayerItem(ItemInit.CRIMIUM_LEGGINGS.get());
        oneLayerItem(ItemInit.CRIMIUM_BOOTS.get());

        oneLayerHandheldItem(ItemInit.CRIMIUM_SWORD.get());
        oneLayerHandheldItem(ItemInit.CRIMIUM_PICKAXE.get());
        oneLayerHandheldItem(ItemInit.CRIMIUM_AXE.get());
        oneLayerHandheldItem(ItemInit.CRIMIUM_SHOVEL.get());

        oneLayerHandheldItem(ItemInit.BLOOD_APPLE.get());

        SpawnItem(ItemInit.BLOOD_ZOMBIE_SPAWN_EGG.get());
        SpawnItem(ItemInit.BLOOD_SPIDER_SPAWN_EGG.get());
        SpawnItem(ItemInit.LEECH_SPAWN_EGG.get());
    }
}
