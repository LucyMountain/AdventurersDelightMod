package net.shade.advdelight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.ComposterBlock;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shade.advdelight.AdvDelightMod;
import net.shade.advdelight.block.ModBlocks;
import net.shade.advdelight.entity.ModEntities;
import net.shade.advdelight.sound.ModSounds;

public class ModItems {

    // todo: fix recipes: chorus pie, warped wart stew/nether wart stew
    // todo: shrimpy: add bucket texture, fix spawn egg texture
    // todo: effects: add warped wart effect, potion making
    // todo: add chorus pie model and eating ability (remember new PieItem from farmers delight)
    // todo: make warped wart harvestable
    // todo: azalea spawning/mining
    public static final  Item KEBAB = registerItem("kebab",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.9F).build()).group(ModItemGroup.ADVENTURERS_DELIGHT)));

    public static final  Item PEAR = registerCompostItem("pear",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build()).group(ModItemGroup.ADVENTURERS_DELIGHT)), 0.65F);
    public static final  Item ORANGE = registerCompostItem("orange",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.3F).build()).group(ModItemGroup.ADVENTURERS_DELIGHT)), 0.65F);

    public static final Item CHORUS_PIE = registerItem("chorus_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT).maxCount(1)));
    public static final Item CHORUS_PIE_SLICE = registerItem("chorus_pie_slice",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 30,0), 0.5F).hunger(3).saturationModifier(0.3F).build()).group(ModItemGroup.ADVENTURERS_DELIGHT).maxCount(16)));

    public static final Item NETHER_WART_STEW = registerItem("nether_wart_stew",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 35,0), 1F).hunger(6).saturationModifier(0.6F).build()).group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item WARPED_WART = registerItem("warped_wart",
            new AliasedBlockItem(ModBlocks.WARPED_WART_CROP, new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item WARPED_WART_STEW = registerItem("warped_wart_stew",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 0,0), 1F).hunger(6).saturationModifier(0.6F).build()).group(ModItemGroup.ADVENTURERS_DELIGHT)));

    public static final Item SHRIMP_SPAWN_EGG = registerItem("shrimp_spawn_egg",
            new SpawnEggItem(ModEntities.SHRIMP, 0xEA6132, 0xA5190C, new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item SHRIMP_BUCKET = registerItem("shrimp_bucket",
            new SpawnEggItem(ModEntities.SHRIMP, 0x948e8d, 0x3b3635, new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item SPIN_MUSIC_DISC = registerItem("spin_music_disc",
            new MusicDiscItem(7, ModSounds.SPIN,
                    new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT).maxCount(1), 28));

    public static final Item AZALEA_SIGN = registerItem("azalea_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT).maxCount(16),
                    ModBlocks.AZALEA_SIGN, ModBlocks.AZALEA_WALL_SIGN));

    /* To be added later:
    public static final Item SHRIMP = registerItem("shrimp",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item QUATRO_FORMAGI_PIZZA = registerItem("quatro_formagi_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item HAM_AND_CHEESE_PIZZA = registerItem("ham_and_cheese_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item PEPPERONI_PIZZA = registerItem("pepperoni_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item HAWAIIAN_PIZZA = registerItem("hawaiian_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final  Item KIWI_PIZZA = registerItem("kiwi_pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    public static final Item SAUSAGE = registerItem("sausage",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVENTURERS_DELIGHT)));
    */


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AdvDelightMod.MOD_ID, name), item);
    }

    private static Item registerCompostItem(String name, Item item, float levelIncreaseChance) {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put((ItemConvertible)item.asItem(), levelIncreaseChance);
        return Registry.register(Registry.ITEM, new Identifier(AdvDelightMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AdvDelightMod.LOGGER.debug("Registering Mod Items for "+ AdvDelightMod.MOD_ID);
    }
}
