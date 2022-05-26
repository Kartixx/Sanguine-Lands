package com.kartixx.sanguineLands.data.datagen.client;

import com.kartixx.sanguineLands.blocks.BlockInit;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class mod_block_state_provider extends BlockStateProvider{

    public mod_block_state_provider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, sanguine_lands.MOD_ID, helper);
    }


    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.BLOOD_IRON_BLOCK.get());
        simpleBlock(BlockInit.SANGUINE_PLANKS.get());
        simpleBlock(BlockInit.SANGUINE_LEAVES.get());
        simpleBlock(BlockInit.SANGUINE_SAPLING.get());

        final ResourceLocation default_plank = blockTexture(BlockInit.SANGUINE_PLANKS.get());
        stairsBlock((StairBlock) BlockInit.SANGUINE_STAIRS.get(), default_plank);
        slabBlock((SlabBlock) BlockInit.SANGUINE_SLAB.get(), default_plank, default_plank);
        fenceGateBlock((FenceGateBlock) BlockInit.SANGUINE_FENCE_GATE.get(), default_plank);
        buttonBlock((ButtonBlock) BlockInit.SANGUINE_BUTTON.get(), default_plank);
        pressurePlateBlock((PressurePlateBlock) BlockInit.SANGUINE_PRESSURE_PLATE.get(), default_plank);

        /* Manually Created
        doorBlock((DoorBlock) BlockInit.SANGUINE_DOOR.get(), default_plank, default_plank);
        trapdoorBlock((TrapDoorBlock) BlockInit.SANGUINE_TRAPDOOR.get(), default_plank, true);
        fenceBlock((FenceBlock) BlockInit.SANGUINE_FENCE.get(), default_plank);
         */

        logBlock((RotatedPillarBlock)BlockInit.SANGUINE_LOG.get());
        logBlock((RotatedPillarBlock)BlockInit.STRIPPED_SANGUINE_LOG.get());
        logBlock((RotatedPillarBlock)BlockInit.SANGUINE_WOOD.get());
        logBlock((RotatedPillarBlock)BlockInit.STRIPPED_SANGUINE_WOOD.get());

    }

}
