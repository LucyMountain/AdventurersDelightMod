package net.shade.advdelight.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.shade.advdelight.AdvDelightMod;
import net.shade.advdelight.entity.custom.ShrimpEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class ShrimpRenderer extends GeoEntityRenderer<ShrimpEntity> {
    public ShrimpRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ShrimpModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public Identifier getTextureResource(ShrimpEntity instance) {
        return new Identifier(AdvDelightMod.MOD_ID, "textures/entity/shrimp_texture.png");
    }

    @Override
    public RenderLayer getRenderType(ShrimpEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(0.5f, 0.5f, 0.5f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder,
                packedLightIn, textureLocation);
    }
}
