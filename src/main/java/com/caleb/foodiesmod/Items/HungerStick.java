package com.caleb.foodiesmod.Items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class HungerStick extends Item{

    public HungerStick(Settings settings) {
        super(settings);
        //TODO Auto-generated constructor stub
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        player.setCurrentHand(hand);
        if(player.getHungerManager().getFoodLevel() > 0){
        player.getHungerManager().add(-1,0);
        }
        int foodLevel = player.getHungerManager().getFoodLevel();
        if (!world.isClient) {
            player.sendMessage(Text.literal("Your current food level is: " + foodLevel));
        }
        return TypedActionResult.consume(player.getStackInHand(hand));
    }
}
