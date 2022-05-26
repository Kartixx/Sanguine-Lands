package com.kartixx.sanguineLands.items;

import com.kartixx.sanguineLands.entities.EntityInit;
import com.kartixx.sanguineLands.fluids.FluidInit;
import com.kartixx.sanguineLands.items.armor.ArmorMaterialInit;
import com.kartixx.sanguineLands.items.food.FoodInit;
import com.kartixx.sanguineLands.items.tools.ToolMaterialInit;
import com.kartixx.sanguineLands.sanguine_lands;
import com.kartixx.sanguineLands.items.armor.mod_armor_item_blood_iron;
import com.kartixx.sanguineLands.items.armor.mod_armor_item_crimium_absorption;
import com.kartixx.sanguineLands.items.armor.mod_armor_item_crimium_fire_resistance;
import com.kartixx.sanguineLands.items.armor.mod_armor_item_scarlite;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, sanguine_lands.MOD_ID);

    //General Items
    public static final RegistryObject<Item> BLOOD_SHARD = register("blood_shard",
            () -> new Item(new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB).stacksTo(16)));

    public static final RegistryObject<Item> BLOOD_BUCKET = register("blood_bucket",
            () -> new BucketItem(FluidInit.BLOOD_FLUID, new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB).stacksTo(1)));

    // Food
    public static final RegistryObject<Item> BLOOD_APPLE = register("blood_apple",
            () -> new Item(new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB).food(FoodInit.BLOOD_APPLE)));

    //Minerals
    public static final RegistryObject<Item> RAW_HEMATITE = register("raw_hematite",
            () -> new Item(new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> BLOOD_IRON_INGOT = register("blood_iron_ingot",
            () -> new Item(new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> SCARLITE_GEM = register("scarlite_gem",
            () -> new Item(new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> CRIMIUM_INGOT = register("crimium_ingot",
            () -> new Item(new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));


    //Bloodwrought Armor
    public static final RegistryObject<ArmorItem> BLOOD_IRON_HELMET = register("blood_iron_helmet",
            () -> new mod_armor_item_blood_iron(ArmorMaterialInit.BLOOD_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<ArmorItem> BLOOD_IRON_CHESTPLATE = register("blood_iron_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.BLOOD_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> BLOOD_IRON_LEGGINGS = register("blood_iron_leggings",
            () -> new ArmorItem(ArmorMaterialInit.BLOOD_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> BLOOD_IRON_BOOTS = register("blood_iron_boots",
            () -> new ArmorItem(ArmorMaterialInit.BLOOD_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    //Scarlite Armor
    public static final RegistryObject<ArmorItem> SCARLITE_HELMET = register("scarlite_helmet",
            () -> new mod_armor_item_scarlite(ArmorMaterialInit.SCARLITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<ArmorItem> SCARLITE_CHESTPLATE = register("scarlite_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.SCARLITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> SCARLITE_LEGGINGS = register("scarlite_leggings",
            () -> new ArmorItem(ArmorMaterialInit.SCARLITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> SCARLITE_BOOTS = register("scarlite_boots",
            () -> new ArmorItem(ArmorMaterialInit.SCARLITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    //Crimium Armor
    public static final RegistryObject<ArmorItem> CRIMIUM_HELMET = register("crimium_helmet",
            () -> new mod_armor_item_crimium_absorption(ArmorMaterialInit.CRIMIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<ArmorItem> CRIMIUM_CHESTPLATE = register("crimium_chestplate",
            () -> new mod_armor_item_crimium_fire_resistance(ArmorMaterialInit.CRIMIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> CRIMIUM_LEGGINGS = register("crimium_leggings",
            () -> new ArmorItem(ArmorMaterialInit.CRIMIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Item> CRIMIUM_BOOTS = register("crimium_boots",
            () -> new ArmorItem(ArmorMaterialInit.CRIMIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    //Bloodwrought Tools
    public static final RegistryObject<SwordItem> BLOOD_IRON_SWORD = register("blood_iron_sword",
            () -> new SwordItem(ToolMaterialInit.BLOOD_IRON, 4, -2.4f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<PickaxeItem> BLOOD_IRON_PICKAXE = register("blood_iron_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.BLOOD_IRON, 1, -2.8f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<AxeItem> BLOOD_IRON_AXE = register("blood_iron_axe",
            () -> new AxeItem(ToolMaterialInit.BLOOD_IRON, 6, -3.1f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<ShovelItem> BLOOD_IRON_SHOVEL = register("blood_iron_shovel",
            () -> new ShovelItem(ToolMaterialInit.BLOOD_IRON, 1, -3.0f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    //Scarlite Tools
    public static final RegistryObject<SwordItem> SCARLITE_SWORD = register("scarlite_sword",
            () -> new SwordItem(ToolMaterialInit.SCARLITE, 4, -2.4f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<PickaxeItem> SCARLITE_PICKAXE = register("scarlite_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.SCARLITE, 1, -2.8f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<AxeItem> SCARLITE_AXE = register("scarlite_axe",
            () -> new AxeItem(ToolMaterialInit.SCARLITE, 6, -3.1f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<ShovelItem> SCARLITE_SHOVEL = register("scarlite_shovel",
            () -> new ShovelItem(ToolMaterialInit.SCARLITE, 1, -3.0f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    //Crimium Tools
    public static final RegistryObject<SwordItem> CRIMIUM_SWORD = register("crimium_sword",
            () -> new SwordItem(ToolMaterialInit.CRIMIUM, 4, -2.4f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<PickaxeItem> CRIMIUM_PICKAXE = register("crimium_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.CRIMIUM, 1, -2.8f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<AxeItem> CRIMIUM_AXE = register("crimium_axe",
            () -> new AxeItem(ToolMaterialInit.CRIMIUM, 6, -3.1f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<ShovelItem> CRIMIUM_SHOVEL = register("crimium_shovel",
            () -> new ShovelItem(ToolMaterialInit.CRIMIUM, 1, -3.0f,
                    new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    //Spawn Eggs
    public static final RegistryObject<ForgeSpawnEggItem> BLOOD_ZOMBIE_SPAWN_EGG = register("blood_zombie_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.BLOOD_ZOMBIE, 0x968B75, 0x7F0000,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> BLOOD_SPIDER_SPAWN_EGG = register("blood_spider_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.BLOOD_SPIDER, 0x582C28, 0x100303,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> LEECH_SPAWN_EGG = register("leech_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.LEECH, 0x420A0A, 0x2E2833,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name, item);
    }
}
