package net.shadow.advdelight.registries;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.shadow.advdelight.block.ModBlocks;

public class ModRegistries {

    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.AZALEA_LOG, ModBlocks.STRIPPED_AZALEA_LOG);
        StrippableBlockRegistry.register(ModBlocks.AZALEA_WOOD, ModBlocks.STRIPPED_AZALEA_WOOD);
    }
}
