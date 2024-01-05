package com.caleb.foodiesmod.Items;

import net.minecraft.item.FoodComponent;

public class FoodItems {

    public static final FoodComponent getFoodComponent(int hunger, float saturation){
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).alwaysEdible().build();
    }

}
