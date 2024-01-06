package com.caleb.foodiesmod.Items.FoodAndDrinks;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
public class DrinkItems extends Item {
    public DrinkItems(int hunger, float saturation, StatusEffect effect, int duration, int amplifier, Item recipeRemainder) {
        super(new Item.Settings().maxCount(1).recipeRemainder(recipeRemainder)
                .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).alwaysEdible().statusEffect(new StatusEffectInstance(effect, 20*duration, amplifier), 1f)
                        .build())
        );
    }

 @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        player.setCurrentHand(hand);
        return TypedActionResult.consume(player.getStackInHand(hand));
    }
@Override
public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
    ItemStack itemStack = new ItemStack(Items.GLASS_BOTTLE);
    if (!world.isClient) {
        if (stack.isFood()) {
            Item item = stack.getItem();
            if (item.isFood()) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20*30, 1));
                if (user instanceof PlayerEntity) {
                    PlayerEntity player = (PlayerEntity) user;
                    player.getHungerManager().eat(item, itemStack);
                }
            }
        }
        if (!(user instanceof PlayerEntity) || !((PlayerEntity)user).getAbilities().creativeMode) {
            stack.decrement(1);
        }
    }
    return itemStack;
}
}