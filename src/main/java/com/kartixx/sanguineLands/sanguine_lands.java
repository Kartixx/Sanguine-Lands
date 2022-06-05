package com.kartixx.sanguineLands;

import com.kartixx.sanguineLands.blocks.BlockInit;
import com.kartixx.sanguineLands.blocks.entity.BlockEntityInit;
import com.kartixx.sanguineLands.effects.EffectInit;
import com.kartixx.sanguineLands.entities.EntityInit;
import com.kartixx.sanguineLands.entities.renderers.blood_spider_renderer;
import com.kartixx.sanguineLands.entities.renderers.blood_zombie_renderer;
import com.kartixx.sanguineLands.entities.renderers.leech_renderer;
import com.kartixx.sanguineLands.fluids.FluidInit;
import com.kartixx.sanguineLands.items.ItemInit;
import com.kartixx.sanguineLands.items.mod_item_properties;
import com.kartixx.sanguineLands.screen.MenuInit;
import com.kartixx.sanguineLands.screen.sanguine_infuser_screen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.GeckoLib;

@Mod("sanguine_lands")
public class sanguine_lands {

    public static final String MOD_ID = "sanguine_lands";
    public static final CreativeModeTab SANGUINE_LANDS_TAB = new CreativeModeTab(MOD_ID) {

        @Override
        @OnlyIn(Dist.CLIENT)
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemInit.SCARLITE_GEM.get());
        }
    };

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(BlockInit.SANGUINE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.SANGUINE_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.SANGUINE_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(FluidInit.BLOOD_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidInit.BLOOD_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidInit.BLOOD_FLOWING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.SANGUINE_INFUSER.get(), RenderType.translucent());

        EntityRenderers.register(EntityInit.LEECH.get(), leech_renderer::new);
        EntityRenderers.register(EntityInit.BLOOD_SPIDER.get(), blood_spider_renderer::new);
        EntityRenderers.register(EntityInit.BLOOD_ZOMBIE.get(), blood_zombie_renderer::new);

        MenuScreens.register(MenuInit.SANGUINE_INFUSER_MENU.get(), sanguine_infuser_screen::new);

        mod_item_properties.addCustomItemProperties();
    }

    public sanguine_lands(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EntityInit.ENTITIES.register(bus);
        FluidInit.FLUIDS.register(bus);
        EffectInit.register(bus);
        BlockEntityInit.register(bus);
        MenuInit.register(bus);
        bus.addListener(this::clientSetup);

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
