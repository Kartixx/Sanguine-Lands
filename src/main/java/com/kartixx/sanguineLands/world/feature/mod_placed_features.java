package com.kartixx.sanguineLands.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class mod_placed_features {

    public static final Holder<PlacedFeature> SANGUINE_PLACED = PlacementUtils.register("sanguine_placed",
            mod_configured_features.SANGUINE_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(1, 0.1f, 1)));

    public static final Holder<PlacedFeature> SANGUINE_FOREST_PLACED = PlacementUtils.register("sanguine_forest_placed",
            mod_configured_features.SANGUINE_FOREST_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 1)));

}
