package com.kartixx.sanguineLands.items.armor;

import com.kartixx.sanguineLands.items.ItemInit;
import com.kartixx.sanguineLands.data.datagen.base_armor_material;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    /*
    Iron Values:
    Enchantability - 9
    Durability - 195, 225, 240, 165
    Armor - 2, 5, 6, 2
    Knockback Resistance - 0
     */
    public static final ArmorMaterial BLOOD_IRON = new base_armor_material(11, new int[] { 293, 338, 360, 248 },
            new int[] { 2, 5, 6, 2 }, 0.05f, 1f, sanguine_lands.MOD_ID + ":blood_iron",
            SoundEvents.ARMOR_EQUIP_IRON, () -> Ingredient.of(ItemInit.BLOOD_IRON_INGOT.get()));

    /*
    Diamond Values:
    Enchantability - 10
    Durability - 429, 495, 528, 363
    Armor - 3, 6, 8, 3
    Knockback Resistance - 0
     */
    public static final ArmorMaterial SCARLITE = new base_armor_material(12, new int[] { 536, 619, 660, 454 },
            new int[] { 3, 6, 8, 3 }, 0.05f, 2f, sanguine_lands.MOD_ID + ":scarlite",
            SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ItemInit.SCARLITE_GEM.get()));

    /*
    Netherite Values:
    Enchantability - 15
    Durability - 481, 555, 592, 407
    Armor - 3, 6, 8, 3
    Knockback Resistance - 0.1
     */
    public static final ArmorMaterial CRIMIUM = new base_armor_material(15, new int[] { 601, 694, 740, 509 },
            new int[] { 3, 6, 8, 3 }, 0.2f, 3f, sanguine_lands.MOD_ID + ":crimium",
            SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(ItemInit.CRIMIUM_INGOT.get()));

    private ArmorMaterialInit() {
    }
}
