package com.kartixx.sanguineLands.data.datagen.server;

import com.kartixx.sanguineLands.data.datagen.base_loot_table_provider;
import com.kartixx.sanguineLands.blocks.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class mod_loot_table_provider extends base_loot_table_provider {

    public mod_loot_table_provider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        dropSelf(BlockInit.BLOOD_IRON_BLOCK.get());
        dropSelf(BlockInit.SANGUINE_LOG.get());
        dropSelf(BlockInit.SANGUINE_WOOD.get());
        dropSelf(BlockInit.STRIPPED_SANGUINE_LOG.get());
        dropSelf(BlockInit.STRIPPED_SANGUINE_WOOD.get());
        dropSelf(BlockInit.SANGUINE_PLANKS.get());
        dropSelf(BlockInit.SANGUINE_SAPLING.get());
        dropSelf(BlockInit.SANGUINE_STAIRS.get());
        dropSelf(BlockInit.SANGUINE_SLAB.get());
        dropSelf(BlockInit.SANGUINE_FENCE.get());
        dropSelf(BlockInit.SANGUINE_FENCE_GATE.get());
        dropSelf(BlockInit.SANGUINE_DOOR.get());
        dropSelf(BlockInit.SANGUINE_TRAPDOOR.get());
        dropSelf(BlockInit.SANGUINE_BUTTON.get());
        dropSelf(BlockInit.SANGUINE_PRESSURE_PLATE.get());
    }

    protected void silkTouch(Block block, Item silk, int min, int max) {
        add(block, createSilkTouchTable(block.getRegistryName().getPath(), block, silk, min, max));
    }

    protected void dropSelf(Block block) {
        add(block, createSimpleTable(block.getRegistryName().getPath(), block));
    }
}
