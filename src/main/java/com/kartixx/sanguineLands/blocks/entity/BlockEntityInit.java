package com.kartixx.sanguineLands.blocks.entity;

import com.kartixx.sanguineLands.blocks.BlockInit;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, sanguine_lands.MOD_ID);

    public static final RegistryObject<BlockEntityType<sanguine_infuser_entity>> SANGUINE_INFUSER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("sanguine_infuser_block_entity", () ->
                    BlockEntityType.Builder.of(sanguine_infuser_entity::new,
                            BlockInit.SANGUINE_INFUSER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
