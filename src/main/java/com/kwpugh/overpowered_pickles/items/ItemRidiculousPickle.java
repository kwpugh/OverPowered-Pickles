package com.kwpugh.overpowered_pickles.items;

import java.util.List;

import com.kwpugh.overpowered_pickles.util.PlayerSpecialAbilities;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class ItemRidiculousPickle extends Item
{
	public ItemRidiculousPickle(Item.Settings settings)
	{
		super(settings);
	}
	   
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
	{
		PlayerEntity player = (PlayerEntity) (user);
	   
		PlayerSpecialAbilities.giveNewMaxHealth(world, player, stack, 40);
	   
		return this.isFood() ? user.eatFood(world, stack) : stack;   
	}
	
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
	    tooltip.add(new TranslatableText("item.overpowered_pickles.ridiculous_pickle.line1").formatted(Formatting.YELLOW));
	    
	} 
}