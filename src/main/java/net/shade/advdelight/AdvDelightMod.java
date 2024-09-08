package net.shade.advdelight;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.shade.advdelight.block.ModBlocks;
import net.shade.advdelight.effect.ModEffects;
import net.shade.advdelight.entity.ModEntities;
import net.shade.advdelight.entity.custom.ShrimpEntity;
import net.shade.advdelight.item.ModItems;
import net.shade.advdelight.registries.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class AdvDelightMod implements ModInitializer {

    public static final String MOD_ID = "advdelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModRegistries.registerStrippables();

        ModEffects.registerEffects();

        GeckoLib.initialize();

        FabricDefaultAttributeRegistry.register(ModEntities.SHRIMP, ShrimpEntity.setAttributes());
    }
}