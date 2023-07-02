package net.shadow.advdelight.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shadow.advdelight.AdvDelightMod;
import net.shadow.advdelight.entity.custom.ShrimpEntity;

public class ModEntities {
    public static final EntityType<ShrimpEntity> SHRIMP = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(AdvDelightMod.MOD_ID, "shrimp"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, ShrimpEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.2f)).build());
}
