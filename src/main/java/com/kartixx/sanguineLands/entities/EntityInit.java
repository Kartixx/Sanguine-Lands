package com.kartixx.sanguineLands.entities;

import com.kartixx.sanguineLands.entities.monsters.blood_spider;
import com.kartixx.sanguineLands.entities.monsters.blood_zombie;
import com.kartixx.sanguineLands.entities.monsters.leech;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            sanguine_lands.MOD_ID);

    public static final RegistryObject<EntityType<blood_zombie>> BLOOD_ZOMBIE = ENTITIES.register("blood_zombie",
            () -> EntityType.Builder.of(blood_zombie::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f)
                    .fireImmune()
                    .build(new ResourceLocation(sanguine_lands.MOD_ID, "blood_zombie").toString()));

    public static final RegistryObject<EntityType<blood_spider>> BLOOD_SPIDER = ENTITIES.register("blood_spider",
            () -> EntityType.Builder.of(blood_spider::new, MobCategory.MONSTER)
                    .sized(1.4f, 0.9f)
                    .build(new ResourceLocation(sanguine_lands.MOD_ID, "blood_spider").toString()));

    public static final RegistryObject<EntityType<leech>> LEECH = ENTITIES.register("leech",
            () -> EntityType.Builder.of(leech::new, MobCategory.MONSTER)
                    .sized(0.4f, 0.3f)
                    .build(new ResourceLocation(sanguine_lands.MOD_ID, "leech").toString()));
}

// File related to entity crash