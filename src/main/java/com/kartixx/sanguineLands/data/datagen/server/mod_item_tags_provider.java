package com.kartixx.sanguineLands.data.datagen.server;

import com.kartixx.sanguineLands.blocks.BlockInit;
import com.kartixx.sanguineLands.items.ItemInit;
import com.kartixx.sanguineLands.sanguine_lands;
import com.kartixx.sanguineLands.data.mod_tags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class mod_item_tags_provider extends ItemTagsProvider {

    public mod_item_tags_provider(DataGenerator generator, BlockTagsProvider blocks, ExistingFileHelper helper) {
        super(generator, blocks, sanguine_lands.MOD_ID, helper);
    }

    @Override
    protected void addTags() {

        tag(Tags.Items.GEMS).add(ItemInit.SCARLITE_GEM.get());
        tag(Tags.Items.ORES).add(ItemInit.RAW_HEMATITE.get());
        tag(Tags.Items.INGOTS).add(ItemInit.BLOOD_IRON_INGOT.get());
        tag(Tags.Items.INGOTS).add(ItemInit.CRIMIUM_INGOT.get());
        tag(Tags.Items.DYES_RED).add(ItemInit.BLOOD_SHARD.get());

        tag(ItemTags.SAPLINGS).add(BlockInit.SANGUINE_SAPLING.get().asItem());
        tag(ItemTags.LEAVES).add(BlockInit.SANGUINE_LEAVES.get().asItem());
        tag(ItemTags.PLANKS).add(BlockInit.SANGUINE_PLANKS.get().asItem());
        tag(ItemTags.WOODEN_BUTTONS).add(BlockInit.SANGUINE_BUTTON.get().asItem());
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(BlockInit.SANGUINE_PRESSURE_PLATE.get().asItem());
        tag(ItemTags.WOODEN_TRAPDOORS).add(BlockInit.SANGUINE_TRAPDOOR.get().asItem());
        tag(ItemTags.WOODEN_DOORS).add(BlockInit.SANGUINE_DOOR.get().asItem());

        tag(mod_tags.Items.SANGUINE_LOGS).add(
                BlockInit.SANGUINE_LOG.get().asItem(),
                BlockInit.SANGUINE_WOOD.get().asItem(),
                BlockInit.STRIPPED_SANGUINE_LOG.get().asItem(),
                BlockInit.STRIPPED_SANGUINE_WOOD.get().asItem());

        tag(ItemTags.LOGS_THAT_BURN).addTag(mod_tags.Items.SANGUINE_LOGS);
        tag(ItemTags.LOGS).addTag(mod_tags.Items.SANGUINE_LOGS);

        tag(mod_tags.Items.SANGUINE_WOODEN).add(
                BlockInit.SANGUINE_PLANKS.get().asItem(),
                BlockInit.SANGUINE_STAIRS.get().asItem(),
                BlockInit.SANGUINE_SLAB.get().asItem(),
                BlockInit.SANGUINE_FENCE.get().asItem(),
                BlockInit.SANGUINE_FENCE_GATE.get().asItem(),
                BlockInit.SANGUINE_BUTTON.get().asItem(),
                BlockInit.SANGUINE_PRESSURE_PLATE.get().asItem(),
                BlockInit.SANGUINE_TRAPDOOR.get().asItem(),
                BlockInit.SANGUINE_DOOR.get().asItem()
        );

        tag(mod_tags.Items.BLOOD_IRON_ARMOR).add(
                ItemInit.BLOOD_IRON_HELMET.get(),
                ItemInit.BLOOD_IRON_CHESTPLATE.get(),
                ItemInit.BLOOD_IRON_LEGGINGS.get(),
                ItemInit.BLOOD_IRON_BOOTS.get()
        );
        tag(mod_tags.Items.SANGUINE_ARMOR).addTag(mod_tags.Items.BLOOD_IRON_ARMOR);
        tag(mod_tags.Items.BLOOD_IRON_TOOLS).add(
                ItemInit.BLOOD_IRON_SWORD.get(),
                ItemInit.BLOOD_IRON_PICKAXE.get(),
                ItemInit.BLOOD_IRON_AXE.get(),
                ItemInit.BLOOD_IRON_SHOVEL.get()
        );
        tag(mod_tags.Items.SANGUINE_TOOLS).addTag(mod_tags.Items.BLOOD_IRON_TOOLS);

        tag(mod_tags.Items.SCARLITE_ARMOR).add(
                ItemInit.SCARLITE_HELMET.get(),
                ItemInit.SCARLITE_CHESTPLATE.get(),
                ItemInit.SCARLITE_LEGGINGS.get(),
                ItemInit.SCARLITE_BOOTS.get()
        );

        tag(mod_tags.Items.SANGUINE_ARMOR).addTag(mod_tags.Items.SCARLITE_ARMOR);
        tag(mod_tags.Items.SCARLITE_TOOLS).add(
                ItemInit.SCARLITE_SWORD.get(),
                ItemInit.SCARLITE_PICKAXE.get(),
                ItemInit.SCARLITE_AXE.get(),
                ItemInit.SCARLITE_SHOVEL.get()
        );
        tag(mod_tags.Items.SANGUINE_TOOLS).addTag(mod_tags.Items.SCARLITE_TOOLS);

        tag(mod_tags.Items.CRIMIUM_ARMOR).add(
                ItemInit.CRIMIUM_HELMET.get(),
                ItemInit.CRIMIUM_CHESTPLATE.get(),
                ItemInit.CRIMIUM_LEGGINGS.get(),
                ItemInit.CRIMIUM_BOOTS.get()
        );
        tag(mod_tags.Items.SANGUINE_ARMOR).addTag(mod_tags.Items.CRIMIUM_ARMOR);
        tag(mod_tags.Items.CRIMIUM_TOOLS).add(
                ItemInit.CRIMIUM_SWORD.get(),
                ItemInit.CRIMIUM_PICKAXE.get(),
                ItemInit.CRIMIUM_AXE.get(),
                ItemInit.CRIMIUM_SHOVEL.get()
        );
        tag(mod_tags.Items.SANGUINE_TOOLS).addTag(mod_tags.Items.CRIMIUM_TOOLS);
    }
}
