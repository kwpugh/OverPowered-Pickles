package com.kwpugh.overpowered_pickles;

import com.kwpugh.overpowered_pickles.init.ModInit;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class OverpoweredPickles implements ModInitializer
{
	public static final String MOD_ID = "overpowered_pickles";

	public static final ItemGroup OVERPOWERED_PICKLES_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "overpowered_pickles_group"), () -> new ItemStack(ModInit.INSANE_PICKLE));
		
	@Override
	public void onInitialize()
	{
		ModInit.init();
	}

}