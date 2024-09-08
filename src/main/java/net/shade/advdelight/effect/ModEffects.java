package net.shade.advdelight.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shade.advdelight.AdvDelightMod;

public class ModEffects {
    public static StatusEffect SCULKED = registerStatusEffect("sculked");

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(AdvDelightMod.MOD_ID, name),
                new SculkedEffect(StatusEffectCategory.NEUTRAL, 3124687));
    }

    public static void registerEffects() {
        AdvDelightMod.LOGGER.debug("Registering Mod Effects for "+ AdvDelightMod.MOD_ID);
    }
}
