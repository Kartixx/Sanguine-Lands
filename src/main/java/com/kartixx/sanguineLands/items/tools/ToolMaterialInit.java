package com.kartixx.sanguineLands.items.tools;

import com.kartixx.sanguineLands.items.ItemInit;
import com.kartixx.sanguineLands.data.datagen.base_tool_material;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolMaterialInit {
    /*
    Iron Values:
    2.0f, 14, 2, 6.0f, 250
    */
    public static final Tier BLOOD_IRON = new base_tool_material(2.0f, 14, 2, 6.0f, 375,
            () -> Ingredient.of(ItemInit.BLOOD_IRON_INGOT.get()));

    /*
    Diamond Values:
    3.0f, 10, 3, 8.0f, 1561
    */
    public static final Tier SCARLITE = new base_tool_material(3.0f, 14, 3, 8.0f, 1951,
            () -> Ingredient.of(ItemInit.SCARLITE_GEM.get()));

    /*
   Netherite Values:
   4.0f, 15, 4, 9.0f, 2031
   */
    public static final Tier CRIMIUM = new base_tool_material(4.0f, 15, 4, 9.0f, 2539,
            () -> Ingredient.of(ItemInit.CRIMIUM_INGOT.get()));

    private ToolMaterialInit() {}
}