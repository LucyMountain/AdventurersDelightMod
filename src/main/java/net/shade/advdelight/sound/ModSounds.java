package net.shade.advdelight.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shade.advdelight.AdvDelightMod;

public class ModSounds {
    public static SoundEvent SPIN = registerSoundEvent("spin");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(AdvDelightMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
