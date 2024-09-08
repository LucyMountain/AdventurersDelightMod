package net.shade.advdelight.util;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shade.advdelight.AdvDelightMod;

public class ModItemTags {
    public static final TagKey<Item> AZALEA_LOGS = createTag("azalea_logs");
    private static TagKey<Item> createTag(String name) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(AdvDelightMod.MOD_ID, name));
    }

}