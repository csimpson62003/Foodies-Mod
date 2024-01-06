package com.caleb.foodiesmod.Items;

import com.caleb.foodiesmod.FoodiesMod;
import com.caleb.foodiesmod.Blocks.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FOODIES_GROUP = Registry.register(Registries.ITEM_GROUP,
    new Identifier(FoodiesMod.MOD_ID, "blah"),
    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.foodies_group"))
    .icon(() -> new ItemStack(ModBlocks.CARROT_CAKE)).entries((displayContext, entries) ->{
        entries.add(ModBlocks.CARROT_CAKE);
        entries.add(ModItems.CARROT_JUICE);
        entries.add(ModItems.HUNGER_STICK);
    }).build());

    

    public static void registerItemGroups(){
        FoodiesMod.LOGGER.info("Adding the foodies item group");
    }
}
