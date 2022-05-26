package com.kartixx.sanguineLands.data.datagen.server;

import com.kartixx.sanguineLands.blocks.BlockInit;
import com.kartixx.sanguineLands.sanguine_lands;
import com.kartixx.sanguineLands.data.mod_tags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class mod_block_tags_provider extends BlockTagsProvider {

    public mod_block_tags_provider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, sanguine_lands.MOD_ID, helper);
    }

    @Override
    protected void addTags() {

        tag(mod_tags.Blocks.SANGUINE_LOGS).add(
                BlockInit.SANGUINE_LOG.get(),
                BlockInit.SANGUINE_WOOD.get(),
                BlockInit.STRIPPED_SANGUINE_LOG.get(),
                BlockInit.STRIPPED_SANGUINE_WOOD.get());

        tag(BlockTags.LOGS_THAT_BURN).addTag(mod_tags.Blocks.SANGUINE_LOGS);
        tag(BlockTags.LOGS).addTag(mod_tags.Blocks.SANGUINE_LOGS);
        tag(mod_tags.Blocks.SANGUINE_WOODEN).addTag(mod_tags.Blocks.SANGUINE_LOGS);

        tag(mod_tags.Blocks.SANGUINE_WOODEN).add(
                BlockInit.SANGUINE_PLANKS.get(),
                BlockInit.SANGUINE_STAIRS.get(),
                BlockInit.SANGUINE_SLAB.get(),
                BlockInit.SANGUINE_FENCE.get(),
                BlockInit.SANGUINE_FENCE_GATE.get(),
                BlockInit.SANGUINE_BUTTON.get(),
                BlockInit.SANGUINE_PRESSURE_PLATE.get(),
                BlockInit.SANGUINE_TRAPDOOR.get(),
                BlockInit.SANGUINE_DOOR.get()
        );

        tag(BlockTags.WOODEN_STAIRS).add(BlockInit.SANGUINE_STAIRS.get());
        tag(BlockTags.WOODEN_SLABS).add(BlockInit.SANGUINE_SLAB.get());
        tag(BlockTags.WOODEN_FENCES).add(BlockInit.SANGUINE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(BlockInit.SANGUINE_FENCE_GATE.get());

        tag(BlockTags.WOODEN_BUTTONS).add(BlockInit.SANGUINE_BUTTON.get());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(BlockInit.SANGUINE_PRESSURE_PLATE.get());
        tag(BlockTags.WOODEN_TRAPDOORS).add(BlockInit.SANGUINE_TRAPDOOR.get());
        tag(BlockTags.WOODEN_DOORS).add(BlockInit.SANGUINE_DOOR.get());
        tag(BlockTags.SAPLINGS).add(BlockInit.SANGUINE_SAPLING.get());
        tag(BlockTags.LEAVES).add(BlockInit.SANGUINE_LEAVES.get());
        tag(BlockTags.PLANKS).add(BlockInit.SANGUINE_PLANKS.get());
    }
}
