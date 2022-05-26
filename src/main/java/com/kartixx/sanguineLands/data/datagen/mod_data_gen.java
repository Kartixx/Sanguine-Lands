package com.kartixx.sanguineLands.data.datagen;

import com.kartixx.sanguineLands.data.datagen.client.lang.mod_en_us_provider;
import com.kartixx.sanguineLands.data.datagen.client.mod_block_state_provider;
import com.kartixx.sanguineLands.data.datagen.client.mod_item_model_provider;
import com.kartixx.sanguineLands.data.datagen.server.mod_block_tags_provider;
import com.kartixx.sanguineLands.data.datagen.server.mod_item_tags_provider;
import com.kartixx.sanguineLands.data.datagen.server.mod_loot_table_provider;
import com.kartixx.sanguineLands.data.datagen.server.mod_recipe_provider;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = sanguine_lands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class mod_data_gen {

    @SubscribeEvent
    public static void gather_data(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            // Client Data Generation
            generator.addProvider(new mod_block_state_provider(generator, helper));
            generator.addProvider(new mod_item_model_provider(generator, helper));
            generator.addProvider(new mod_en_us_provider(generator));

        }

        if (event.includeServer()) {

            mod_block_tags_provider blockTags = new mod_block_tags_provider(generator, helper);

            // Server Data Generation
            generator.addProvider(new mod_recipe_provider(generator));
            generator.addProvider(blockTags);
            generator.addProvider(new mod_item_tags_provider(generator, blockTags, helper));
            generator.addProvider(new mod_loot_table_provider(generator));
        }
    }
}
