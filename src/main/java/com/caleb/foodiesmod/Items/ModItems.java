package com.caleb.foodiesmod.Items;

import com.caleb.foodiesmod.FoodiesMod;
import com.caleb.foodiesmod.Items.Drink.JuicePotion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Potion CARROT_JUICE = RegisterPotion("carrot_juice", new JuicePotion(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600,1)));

    private static Item RegisterItems(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FoodiesMod.MOD_ID, name), item);
    }
    private static Potion RegisterPotion(String name, Potion potion){
        return Registry.register(Registries.POTION, new Identifier(FoodiesMod.MOD_ID, name), potion);
    }

    public static void RegisterModItems(){
        FoodiesMod.LOGGER.info("Registering FOODIES mod Items");
        FoodiesMod.LOGGER.info("Registering FOODIES mod Potions");
    }
}
