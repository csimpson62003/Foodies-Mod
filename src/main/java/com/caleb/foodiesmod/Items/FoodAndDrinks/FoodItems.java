package com.caleb.foodiesmod.Items.FoodAndDrinks;

import net.minecraft.entity.effect.StatusEffectInstance; // Import the StatusEffectInstance class
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;


public class FoodItems {

    public static final FoodComponent getFoodComponent(int hunger, float saturation){
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 6*20, 1), 1.0f)
    .build();
    }

  
}
