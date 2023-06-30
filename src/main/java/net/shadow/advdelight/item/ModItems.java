package net.shadow.advdelight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shadow.advdelight.AdvDelightMod;

public class ModItems {

    public static final  Item KEBAB = registerItem("kebab",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item QUATRO_FORMAGI_PIZZA = registerItem("quatro_formagi_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item HAM_AND_CHEESE_PIZZA = registerItem("ham_and_cheese_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item PEPPERONI_PIZZA = registerItem("pepperoni_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item PEAR = registerItem("pear",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item CHORUS_PIE = registerItem("chorus_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item CHORUS_PIE_SLICE = registerItem("chorus_pie_slice",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item SAUSAGE = registerItem("sausage",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item NETHER_WART_STEW = registerItem("nether_wart_stew",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item WARPED_WART = registerItem("warped_wart",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item WARPED_WART_STEW = registerItem("warped_wart_stew",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AdvDelightMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AdvDelightMod.LOGGER.debug("Registering Mod Items for "+ AdvDelightMod.MOD_ID);
    }
}
