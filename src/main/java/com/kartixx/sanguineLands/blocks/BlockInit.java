package com.kartixx.sanguineLands.blocks;

import com.kartixx.sanguineLands.blocks.wood.mod_flammable_rotated_pillar_block;
import com.kartixx.sanguineLands.items.ItemInit;
import com.kartixx.sanguineLands.world.feature.tree.sanguine_tree_grower;
import com.kartixx.sanguineLands.sanguine_lands;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, sanguine_lands.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    public static final RegistryObject<Block> BLOOD_IRON_BLOCK = register("blood_iron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .color(MaterialColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    //Sanguine Wood Redstone Blocks
    public static final RegistryObject<Block> SANGUINE_BUTTON = register("sanguine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .noCollission()
                    .color(MaterialColor.COLOR_RED)
                    .sound(SoundType.WOOD)
            ), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));
    
    public static final RegistryObject<Block> SANGUINE_PRESSURE_PLATE = register("sanguine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .noCollission()
                    .color(MaterialColor.COLOR_RED)
                    .sound(SoundType.WOOD)
            ), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Block> SANGUINE_DOOR = register("sanguine_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .color(MaterialColor.COLOR_RED)
                    .sound(SoundType.WOOD)
            ), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));
    
    public static final RegistryObject<Block> SANGUINE_TRAPDOOR = register("sanguine_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .color(MaterialColor.COLOR_RED)
                    .sound(SoundType.WOOD)
            ), 
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    //Sanguine Wood Building Blocks
    public static final RegistryObject<Block> SANGUINE_STAIRS = register("sanguine_stairs",
            () -> new StairBlock(() -> BlockInit.SANGUINE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .color(MaterialColor.COLOR_RED)
                    .sound(SoundType.WOOD)
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Block> SANGUINE_SLAB = register("sanguine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .color(MaterialColor.COLOR_RED)
                    .sound(SoundType.WOOD)
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Block> SANGUINE_FENCE = register("sanguine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .color(MaterialColor.COLOR_RED)
                    .sound(SoundType.WOOD)
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));
    
    public static final RegistryObject<Block> SANGUINE_FENCE_GATE = register("sanguine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .color(MaterialColor.COLOR_RED)
                    .sound(SoundType.WOOD)
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    // Sanguine Woods
    public static final RegistryObject<Block> SANGUINE_LOG = register("sanguine_log",
            () -> new mod_flammable_rotated_pillar_block(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .color(MaterialColor.COLOR_RED)
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Block> SANGUINE_WOOD = register("sanguine_wood",
            () -> new mod_flammable_rotated_pillar_block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .color(MaterialColor.COLOR_RED)
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Block> STRIPPED_SANGUINE_LOG = register("stripped_sanguine_log",
            () -> new mod_flammable_rotated_pillar_block(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .color(MaterialColor.COLOR_RED)
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Block> STRIPPED_SANGUINE_WOOD = register("stripped_sanguine_wood",
            () -> new mod_flammable_rotated_pillar_block(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .color(MaterialColor.COLOR_RED)
            ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));


    public static final RegistryObject<Block> SANGUINE_PLANKS = register("sanguine_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {

                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Block> SANGUINE_LEAVES = register("sanguine_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {

                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));

    public static final RegistryObject<Block> SANGUINE_SAPLING = register("sanguine_sapling",
            () -> new SaplingBlock(new sanguine_tree_grower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(sanguine_lands.SANGUINE_LANDS_TAB)));


    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block){
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
            Function<RegistryObject<T>, Supplier<? extends Item>> item){
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}

/*
{
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }
 */
