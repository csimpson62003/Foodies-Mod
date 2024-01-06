package com.caleb.foodiesmod.Items.Food;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance; // Import the StatusEffectInstance class
import net.minecraft.item.FoodComponent;


public class FoodItems {

    public static final FoodComponent getFoodComponent(int hunger, float saturation){
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).alwaysEdible().build();
    }

    public static final FoodComponent getFoodComponent(int hunger, float saturation, StatusEffect statusEffect){
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).alwaysEdible().statusEffect(new StatusEffectInstance(statusEffect), saturation).build();
    }

}
