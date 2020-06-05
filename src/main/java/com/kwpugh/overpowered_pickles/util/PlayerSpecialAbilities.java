package com.kwpugh.overpowered_pickles.util;

import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class PlayerSpecialAbilities
{	
	//Set player health beyond normal max health
	public static void giveNewMaxHealth(World world, PlayerEntity player, ItemStack itemstack, float newMax)
	{		
		player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(newMax);
		player.setHealth(newMax);
		
		return;
	}
	
	//Set player extra abroption hearts
	public static void giveYellowHearts(World world, PlayerEntity player, ItemStack itemstack, float newAbsorption)
	{		
		player.setAbsorptionAmount(newAbsorption);
		
		return;
	}
}