package net.shade.advdelight.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shade.advdelight.AdvDelightMod;

public class ModItemGroup {
    public static final ItemGroup ADVENTURERS_DELIGHT = FabricItemGroupBuilder.build(
            new Identifier(AdvDelightMod.MOD_ID, "adventurers_delight"), () -> new ItemStack(ModItems.KEBAB)
    );
}
