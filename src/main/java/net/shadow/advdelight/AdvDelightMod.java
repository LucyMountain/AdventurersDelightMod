package net.shadow.advdelight;

import net.fabricmc.api.ModInitializer;
import net.shadow.advdelight.block.ModBlocks;
import net.shadow.advdelight.item.ModItems;
import net.shadow.advdelight.registries.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvDelightMod implements ModInitializer {

    public static final String MOD_ID = "advdelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModRegistries.registerStrippables();
    }
}