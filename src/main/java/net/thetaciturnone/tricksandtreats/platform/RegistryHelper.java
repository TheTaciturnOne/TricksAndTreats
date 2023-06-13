package net.thetaciturnone.tricksandtreats.platform;

import net.minecraft.sound.SoundEvent;

import java.util.function.Supplier;

public final class RegistryHelper {
    public static <T extends SoundEvent> Supplier<T> registerSoundEvent(String name, Supplier<T> soundEvent) {
        throw new AssertionError();
    }
}
