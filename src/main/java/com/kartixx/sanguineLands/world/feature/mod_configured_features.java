package com.kartixx.sanguineLands.world.feature;

import com.google.common.collect.ImmutableList;
import com.kartixx.sanguineLands.blocks.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class mod_configured_features {

    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_, int p_195152_) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new BlobFoliagePlacer(ConstantInt.of(p_195152_), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SANGUINE_FOREST_TREE =
            FeatureUtils.register("sanguine_forest", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(BlockInit.SANGUINE_LOG.get()),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(BlockInit.SANGUINE_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SANGUINE_TREE =
            FeatureUtils.register("sanguine", Feature.TREE,
                    createStraightBlobTree(BlockInit.SANGUINE_LOG.get(), BlockInit.SANGUINE_LEAVES.get(), 5, 3, 0, 3).decorators(ImmutableList.of(LeaveVineDecorator.INSTANCE)).build());

    public static final Holder<PlacedFeature> SANGUINE_FOREST_CHECKED = PlacementUtils.register("sanguine_forest_checked", SANGUINE_FOREST_TREE,
            PlacementUtils.filteredByBlockSurvival(BlockInit.SANGUINE_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> SANGUINE_FOREST_SPAWN =
            FeatureUtils.register("sanguine_forest_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(SANGUINE_FOREST_CHECKED,
                            0.5F)), SANGUINE_FOREST_CHECKED));

    public static final Holder<PlacedFeature> SANGUINE_CHECKED = PlacementUtils.register("sanguine_checked", SANGUINE_TREE,
            PlacementUtils.filteredByBlockSurvival(BlockInit.SANGUINE_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> SANGUINE_SPAWN =
            FeatureUtils.register("sanguine_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(SANGUINE_CHECKED,
                            0.5F)), SANGUINE_CHECKED));

}
