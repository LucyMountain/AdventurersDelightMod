package net.shade.advdelight.entity.client;

import net.minecraft.util.Identifier;
import net.shade.advdelight.AdvDelightMod;
import net.shade.advdelight.entity.custom.ShrimpEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShrimpModel extends AnimatedGeoModel<ShrimpEntity> {
    @Override
    public Identifier getModelResource(ShrimpEntity object) {
        return new Identifier(AdvDelightMod.MOD_ID, "geo/shrimp.geo.json");
    }

    @Override
    public Identifier getTextureResource(ShrimpEntity object) {
        return new Identifier(AdvDelightMod.MOD_ID, "textures/entity/shrimp_texture.png");
    }

    @Override
    public Identifier getAnimationResource(ShrimpEntity animatable) {
        return new Identifier(AdvDelightMod.MOD_ID, "animations/shrimp.animation.json");
    }
}
