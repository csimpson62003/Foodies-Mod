package com.caleb.foodiesmod;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class FoodiesModSounds {

    public static final SoundEvent SILENT_SOUND = registerSoundEvent("silent_sound");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(FoodiesMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void RegisterSounds(){
        FoodiesMod.LOGGER.info("Registering FOODIES mod Sounds");
    }
}