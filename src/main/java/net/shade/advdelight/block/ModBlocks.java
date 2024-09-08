package net.shade.advdelight.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shade.advdelight.AdvDelightMod;
import net.shade.advdelight.block.custom.WarpedWartCropBlock;
import net.shade.advdelight.block.entity.ModSignTypes;
import net.shade.advdelight.item.ModItemGroup;

public class ModBlocks {
    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2f)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block FLOWERING_AZALEA_LOG = registerBlock("flowering_azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block FLOWERING_AZALEA_WOOD = registerBlock("flowering_azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2f)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_SLAB = registerBlock("azalea_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs",
            new StairsBlock(ModBlocks.AZALEA_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_DOOR = registerBlock("azalea_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_FENCE = registerBlock("azalea_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_FENCE_GATE = registerBlock("azalea_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_BUTTON = registerBlock("azalea_button",
            new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_PRESSURE_PLATE = registerBlock("azalea_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_SIGN = registerBlockWithoutItem("azalea_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.AZALEA), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_WALL_SIGN = registerBlockWithoutItem("azalea_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.AZALEA), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block WARPED_WART_CROP = registerBlockWithoutItem("warped_wart_crop",
            new WarpedWartCropBlock(FabricBlockSettings.copy(Blocks.NETHER_WART)), ModItemGroup.ADVENTURERS_DELIGHT);

    private static Block registerBlockWithoutItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.BLOCK, new Identifier(AdvDelightMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(AdvDelightMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(AdvDelightMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        AdvDelightMod.LOGGER.debug("Registering Mod Blocks for "+ AdvDelightMod.MOD_ID);
    }
}
