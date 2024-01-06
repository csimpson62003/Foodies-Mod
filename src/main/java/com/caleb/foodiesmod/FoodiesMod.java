package com.caleb.foodiesmod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.caleb.foodiesmod.Blocks.ModBlocks;
import com.caleb.foodiesmod.Items.ModItemGroup;
import com.caleb.foodiesmod.Items.ModItems;

import net.fabricmc.api.ModInitializer;

public class FoodiesMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "foodiesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	FoodiesModSounds.RegisterSounds();
		ModItems.RegisterModItems();
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}