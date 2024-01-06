package com.caleb.foodiesmod.Items;

import com.caleb.foodiesmod.FoodiesMod;
import com.caleb.foodiesmod.Items.FoodAndDrinks.DrinkItems;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
  //  public static final Item CARROT_JUICE = RegisterItems("carrot_juice", new DrinkItem(new FabricItemSettings()));
  public static final Item CARROT_JUICE = 
  RegisterItems("carrot_juice", new DrinkItems(2, 0.6f, StatusEffects.NIGHT_VISION, 20, 1, Items.GLASS_BOTTLE));

  public static final Item HUNGER_STICK = RegisterItems("hunger_stick", new HungerStick(new Item.Settings()));

    private static Item RegisterItems(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FoodiesMod.MOD_ID, name), item);
    }

    public static void RegisterModItems(){
        FoodiesMod.LOGGER.info("Registering FOODIES mod Items");
        FoodiesMod.LOGGER.info("Registering FOODIES mod Potions");
    }
}
