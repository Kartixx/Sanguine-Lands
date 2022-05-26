package com.kartixx.sanguineLands.world.feature.tree;

import com.kartixx.sanguineLands.world.feature.mod_configured_features;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class sanguine_tree_grower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        return mod_configured_features.SANGUINE_FOREST_TREE;
    }

}
