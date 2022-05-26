package com.kartixx.sanguineLands.data.datagen.server;

import com.kartixx.sanguineLands.blocks.BlockInit;
import com.kartixx.sanguineLands.data.mod_tags;
import com.kartixx.sanguineLands.items.ItemInit;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class mod_recipe_provider extends RecipeProvider {

    public mod_recipe_provider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {


        // Shaped Recipes

        ShapedRecipeBuilder.shaped(ItemInit.BLOOD_IRON_PICKAXE.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .define('b', Items.STICK)
                .pattern("aaa").pattern(" b ").pattern(" b ")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_PICKAXE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.BLOOD_IRON_SWORD.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .define('b', Items.STICK)
                .pattern("a").pattern("a").pattern("b")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_SWORD.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.BLOOD_IRON_AXE.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .define('b', Items.STICK)
                .pattern("aa ").pattern("ab ").pattern(" b ")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_AXE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.BLOOD_IRON_SHOVEL.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").pattern("b")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_SHOVEL.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.BLOOD_IRON_BLOCK.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .pattern("aaa").pattern("aaa").pattern("aaa")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.BLOOD_IRON_BLOCK.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.SCARLITE_PICKAXE.get(), 1)
                .define('a', ItemInit.SCARLITE_GEM.get().asItem())
                .define('b', Items.STICK)
                .pattern("aaa").pattern(" b ").pattern(" b ")
                .unlockedBy("has_" + ItemInit.SCARLITE_GEM.get().getRegistryName().getPath(), has(ItemInit.SCARLITE_GEM.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.SCARLITE_PICKAXE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.SCARLITE_SWORD.get(), 1)
                .define('a', ItemInit.SCARLITE_GEM.get().asItem())
                .define('b', Items.STICK)
                .pattern("a").pattern("a").pattern("b")
                .unlockedBy("has_" + ItemInit.SCARLITE_GEM.get().getRegistryName().getPath(), has(ItemInit.SCARLITE_GEM.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.SCARLITE_SWORD.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.SCARLITE_AXE.get(), 1)
                .define('a', ItemInit.SCARLITE_GEM.get().asItem())
                .define('b', Items.STICK)
                .pattern("aa ").pattern("ab ").pattern(" b ")
                .unlockedBy("has_" + ItemInit.SCARLITE_GEM.get().getRegistryName().getPath(), has(ItemInit.SCARLITE_GEM.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.SCARLITE_AXE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.SCARLITE_SHOVEL.get(), 1)
                .define('a', ItemInit.SCARLITE_GEM.get().asItem())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").pattern("b")
                .unlockedBy("has_" + ItemInit.SCARLITE_GEM.get().getRegistryName().getPath(), has(ItemInit.SCARLITE_GEM.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.SCARLITE_SHOVEL.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.CRIMIUM_PICKAXE.get(), 1)
                .define('a', ItemInit.CRIMIUM_INGOT.get().asItem())
                .define('b', Items.STICK)
                .pattern("aaa").pattern(" b ").pattern(" b ")
                .unlockedBy("has_" + ItemInit.CRIMIUM_INGOT.get().getRegistryName().getPath(), has(ItemInit.CRIMIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.CRIMIUM_PICKAXE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.CRIMIUM_SWORD.get(), 1)
                .define('a', ItemInit.CRIMIUM_INGOT.get().asItem())
                .define('b', Items.STICK)
                .pattern("a").pattern("a").pattern("b")
                .unlockedBy("has_" + ItemInit.CRIMIUM_INGOT.get().getRegistryName().getPath(), has(ItemInit.CRIMIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.CRIMIUM_SWORD.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.CRIMIUM_AXE.get(), 1)
                .define('a', ItemInit.CRIMIUM_INGOT.get().asItem())
                .define('b', Items.STICK)
                .pattern("aa ").pattern("ab ").pattern(" b ")
                .unlockedBy("has_" + ItemInit.CRIMIUM_INGOT.get().getRegistryName().getPath(), has(ItemInit.CRIMIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.CRIMIUM_AXE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.CRIMIUM_SHOVEL.get(), 1)
                .define('a', ItemInit.CRIMIUM_INGOT.get().asItem())
                .define('b', Items.STICK)
                .pattern("a").pattern("b").pattern("b")
                .unlockedBy("has_" + ItemInit.CRIMIUM_INGOT.get().getRegistryName().getPath(), has(ItemInit.CRIMIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.CRIMIUM_SHOVEL.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.SANGUINE_PRESSURE_PLATE.get(), 1)
                .define('a', BlockInit.SANGUINE_PLANKS.get().asItem())
                .pattern("aa")
                .unlockedBy("has_" + BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_PLANKS.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_PRESSURE_PLATE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.SANGUINE_DOOR.get(), 3)
                .define('a', BlockInit.SANGUINE_PLANKS.get().asItem())
                .pattern("aa")
                .pattern("aa")
                .pattern("aa")
                .unlockedBy("has_" + BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_PLANKS.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_DOOR.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.SANGUINE_TRAPDOOR.get(), 2)
                .define('a', BlockInit.SANGUINE_PLANKS.get().asItem())
                .pattern("aaa")
                .pattern("aaa")
                .unlockedBy("has_" + BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_PLANKS.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_TRAPDOOR.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.SANGUINE_STAIRS.get(), 4)
                .define('a', BlockInit.SANGUINE_PLANKS.get().asItem())
                .pattern("a  ")
                .pattern("aa ")
                .pattern("aaa")
                .unlockedBy("has_" + BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_PLANKS.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_STAIRS.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.SANGUINE_SLAB.get(), 6)
                .define('a', BlockInit.SANGUINE_PLANKS.get().asItem())
                .pattern("aaa")
                .unlockedBy("has_" + BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_PLANKS.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_SLAB.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.SANGUINE_FENCE.get(), 3)
                .define('a', BlockInit.SANGUINE_PLANKS.get().asItem())
                .define('b', Items.STICK)
                .pattern("aba")
                .pattern("aba")
                .unlockedBy("has_" + BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_PLANKS.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_FENCE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.SANGUINE_FENCE_GATE.get(), 1)
                .define('a', BlockInit.SANGUINE_PLANKS.get().asItem())
                .define('b', Items.STICK)
                .pattern("bab")
                .pattern("bab")
                .unlockedBy("has_" + BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_PLANKS.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_FENCE_GATE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.SANGUINE_WOOD.get(), 3)
                .define('a', BlockInit.SANGUINE_LOG.get().asItem())
                .pattern("aa").pattern("aa")
                .unlockedBy("has_" + BlockInit.SANGUINE_LOG.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_LOG.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_WOOD.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(BlockInit.STRIPPED_SANGUINE_WOOD.get(), 3)
                .define('a', BlockInit.STRIPPED_SANGUINE_LOG.get().asItem())
                .pattern("aa").pattern("aa")
                .unlockedBy("has_" + BlockInit.SANGUINE_LOG.get().getRegistryName().getPath(), has(BlockInit.STRIPPED_SANGUINE_LOG.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.STRIPPED_SANGUINE_WOOD.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.BLOOD_IRON_HELMET.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .pattern("aaa").pattern("a a")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_HELMET.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.BLOOD_IRON_CHESTPLATE.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .pattern("a a").pattern("aaa").pattern("aaa")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_CHESTPLATE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.BLOOD_IRON_LEGGINGS.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .pattern("aaa").pattern("a a").pattern("a a")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_LEGGINGS.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.BLOOD_IRON_BOOTS.get(), 1)
                .define('a', ItemInit.BLOOD_IRON_INGOT.get().asItem())
                .pattern("a a").pattern("a a")
                .unlockedBy("has_" + ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath(), has(ItemInit.BLOOD_IRON_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_BOOTS.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.SCARLITE_HELMET.get(), 1)
                .define('a', ItemInit.SCARLITE_GEM.get().asItem())
                .pattern("aaa").pattern("a a")
                .unlockedBy("has_" + ItemInit.SCARLITE_GEM.get().getRegistryName().getPath(), has(ItemInit.SCARLITE_GEM.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.SCARLITE_HELMET.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.SCARLITE_CHESTPLATE.get(), 1)
                .define('a', ItemInit.SCARLITE_GEM.get().asItem())
                .pattern("a a").pattern("aaa").pattern("aaa")
                .unlockedBy("has_" + ItemInit.SCARLITE_GEM.get().getRegistryName().getPath(), has(ItemInit.SCARLITE_GEM.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.SCARLITE_CHESTPLATE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.SCARLITE_LEGGINGS.get(), 1)
                .define('a', ItemInit.SCARLITE_GEM.get().asItem())
                .pattern("aaa").pattern("a a").pattern("a a")
                .unlockedBy("has_" + ItemInit.SCARLITE_GEM.get().getRegistryName().getPath(), has(ItemInit.SCARLITE_GEM.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.SCARLITE_LEGGINGS.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.SCARLITE_BOOTS.get(), 1)
                .define('a', ItemInit.SCARLITE_GEM.get().asItem())
                .pattern("a a").pattern("a a")
                .unlockedBy("has_" + ItemInit.SCARLITE_GEM.get().getRegistryName().getPath(), has(ItemInit.SCARLITE_GEM.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.SCARLITE_BOOTS.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.CRIMIUM_HELMET.get(), 1)
                .define('a', ItemInit.CRIMIUM_INGOT.get().asItem())
                .pattern("aaa").pattern("a a")
                .unlockedBy("has_" + ItemInit.CRIMIUM_INGOT.get().getRegistryName().getPath(), has(ItemInit.CRIMIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.CRIMIUM_HELMET.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.CRIMIUM_CHESTPLATE.get(), 1)
                .define('a', ItemInit.CRIMIUM_INGOT.get().asItem())
                .pattern("a a").pattern("aaa").pattern("aaa")
                .unlockedBy("has_" + ItemInit.CRIMIUM_INGOT.get().getRegistryName().getPath(), has(ItemInit.CRIMIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.CRIMIUM_CHESTPLATE.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.CRIMIUM_LEGGINGS.get(), 1)
                .define('a', ItemInit.CRIMIUM_INGOT.get().asItem())
                .pattern("aaa").pattern("a a").pattern("a a")
                .unlockedBy("has_" + ItemInit.CRIMIUM_INGOT.get().getRegistryName().getPath(), has(ItemInit.CRIMIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.CRIMIUM_LEGGINGS.get().getRegistryName().getPath()));

        ShapedRecipeBuilder.shaped(ItemInit.CRIMIUM_BOOTS.get(), 1)
                .define('a', ItemInit.CRIMIUM_INGOT.get().asItem())
                .pattern("a a").pattern("a a")
                .unlockedBy("has_" + ItemInit.CRIMIUM_INGOT.get().getRegistryName().getPath(), has(ItemInit.CRIMIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.CRIMIUM_BOOTS.get().getRegistryName().getPath()));

        // Shapeless Recipe

        ShapelessRecipeBuilder.shapeless(ItemInit.RAW_HEMATITE.get(), 1)
                .requires(Items.COAL)
                .requires(Items.RAW_IRON)
                .requires(ItemInit.BLOOD_SHARD.get())
                .requires(ItemInit.BLOOD_SHARD.get())
                .unlockedBy("has_" + ItemInit.BLOOD_SHARD.get().getRegistryName().getPath(), has(ItemInit.BLOOD_SHARD.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.RAW_HEMATITE.get().getRegistryName().getPath()));

        ShapelessRecipeBuilder.shapeless(ItemInit.BLOOD_IRON_INGOT.get(), 9)
                .requires(BlockInit.BLOOD_IRON_BLOCK.get())
                .unlockedBy("has_" + ItemInit.BLOOD_SHARD.get().getRegistryName().getPath(), has(BlockInit.BLOOD_IRON_BLOCK.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath()));

        ShapelessRecipeBuilder.shapeless(BlockInit.SANGUINE_BUTTON.get(), 1)
                .requires(BlockInit.SANGUINE_PLANKS.get())
                .unlockedBy("has_" + BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_PLANKS.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_BUTTON.get().getRegistryName().getPath()));

        ShapelessRecipeBuilder.shapeless(BlockInit.SANGUINE_PLANKS.get(), 4)
                .requires(mod_tags.Items.SANGUINE_LOGS)
                .unlockedBy("has_" + BlockInit.SANGUINE_LOG.get().getRegistryName().getPath(), has(BlockInit.SANGUINE_LOG.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        BlockInit.SANGUINE_PLANKS.get().getRegistryName().getPath()));

        // Cooking Recipe

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemInit.RAW_HEMATITE.get()),
                        ItemInit.BLOOD_IRON_INGOT.get(), 1f, 200)
                .unlockedBy("has_ore" + ItemInit.RAW_HEMATITE.get().getRegistryName().getPath(), has(ItemInit.RAW_HEMATITE.get()))
                .save(consumer, new ResourceLocation(sanguine_lands.MOD_ID,
                        ItemInit.BLOOD_IRON_INGOT.get().getRegistryName().getPath() + "_smelting"));

    }
}