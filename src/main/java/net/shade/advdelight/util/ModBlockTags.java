package net.shade.advdelight.util;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shade.advdelight.AdvDelightMod;

public class ModBlockTags {
    public static final TagKey<Block> AZALEA_LOGS = createTag("azalea_logs");
    private static TagKey<Block> createTag(String name) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(AdvDelightMod.MOD_ID, name));
    }

}