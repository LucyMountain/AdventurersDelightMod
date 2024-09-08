package net.shade.advdelight;

import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.shade.advdelight.block.ModBlocks;
import net.shade.advdelight.entity.ModEntities;
import net.shade.advdelight.entity.client.ShrimpRenderer;

public class AdvDelightModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZALEA_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZALEA_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_WART_CROP, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.SHRIMP, ShrimpRenderer::new);
    }
}
