package com.caleb.foodiesmod.Blocks;

import com.caleb.foodiesmod.FoodiesMod;
import com.caleb.foodiesmod.Blocks.CustomBlocks.CarrotCake;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
public static final Block CARROT_CAKE = registerBlock("carrot_cake", new CarrotCake(FabricBlockSettings.create()));
    private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, new Identifier(FoodiesMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FoodiesMod.MOD_ID, name), new BlockItem(block, new Item.Settings().maxCount(1)));
    }

    public static void registerModBlocks() {
        FoodiesMod.LOGGER.info("Registering FOODIES mod blocks");
    }
}