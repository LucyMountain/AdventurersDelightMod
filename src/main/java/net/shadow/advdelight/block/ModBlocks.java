package net.shadow.advdelight.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shadow.advdelight.AdvDelightMod;
import net.shadow.advdelight.block.custom.ModDoorBlock;
import net.shadow.advdelight.item.ModItemGroup;

public class ModBlocks {
    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2f)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.ADVENTURERS_DELIGHT);
    public static final Block AZALEA_DOOR = registerBlock("azalea_door",
            new ModDoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)), ModItemGroup.ADVENTURERS_DELIGHT);

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
