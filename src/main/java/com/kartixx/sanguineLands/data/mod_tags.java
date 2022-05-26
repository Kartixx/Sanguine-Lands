package com.kartixx.sanguineLands.data;

import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class mod_tags {
    public static class Blocks {
        public static final TagKey<Block> SANGUINE_LOGS = tag("sanguine_logs");
        public static final TagKey<Block> SANGUINE_WOODEN = tag("sanguine_wooden");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(sanguine_lands.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SANGUINE_BREWABLES = tag("sanguine_brewables");
        public static final TagKey<Item> SANGUINE_LOGS = tag("sanguine_logs");
        public static final TagKey<Item> SANGUINE_WOODEN = tag("sanguine_wooden");
        public static final TagKey<Item> SANGUINE_TOOLS = tag("sanguine_tools");
        public static final TagKey<Item> SANGUINE_ARMOR = tag("sanguine_armor");
        public static final TagKey<Item> BLOOD_IRON_TOOLS = tag("blood_iron_tools");
        public static final TagKey<Item> BLOOD_IRON_ARMOR = tag("blood_iron_armor");
        public static final TagKey<Item> SCARLITE_TOOLS = tag("scarlite_tools");
        public static final TagKey<Item> SCARLITE_ARMOR = tag("scarlite_armor");
        public static final TagKey<Item> CRIMIUM_TOOLS = tag("crimium_tools");
        public static final TagKey<Item> CRIMIUM_ARMOR = tag("crimium_armor");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(sanguine_lands.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}

/*





 */