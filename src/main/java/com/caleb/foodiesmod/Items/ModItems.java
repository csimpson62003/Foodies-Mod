package com.caleb.foodiesmod.Items;

import com.caleb.foodiesmod.FoodiesMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CARROT_CAKE = RegisterItems("carrot_cake", new Item(new FabricItemSettings()));


//Register Item Method
private static Item RegisterItems(String name, Item item){
    return Registry.register(Registries.ITEM, new Identifier(FoodiesMod.MOD_ID, name), item);
}

public static void RegisterModItems(){
    FoodiesMod.LOGGER.info("Registering FOODIES mod Items");
}
}