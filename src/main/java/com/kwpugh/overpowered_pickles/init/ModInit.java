package com.kwpugh.overpowered_pickles.init;

import com.kwpugh.overpowered_pickles.OverpoweredPickles;
import com.kwpugh.overpowered_pickles.items.ItemAbsurdPickle;
import com.kwpugh.overpowered_pickles.items.ItemCleansingPickle;
import com.kwpugh.overpowered_pickles.items.ItemFarcicalPickle;
import com.kwpugh.overpowered_pickles.items.ItemInsanePickle;
import com.kwpugh.overpowered_pickles.items.ItemLudicruousPickle;
import com.kwpugh.overpowered_pickles.items.ItemPreposterousPickle;
import com.kwpugh.overpowered_pickles.items.ItemRidiculousPickle;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModInit
{
	public static final Item PICKLE_STAR;		
	public static final Item ABSURD_PICKLE;	
	public static final Item RIDICULOUS_PICKLE;	
	public static final Item LUDICROUS_PICKLE;	
	public static final Item INSANE_PICKLE;	
	public static final Item FARCICAL_PICKLE;	
	public static final Item PREPOSTEROUS_PICKLE;	
	public static final Item CLEANSING_PICKLE;	
	
	public static void init()
	{
		
	}

	static
	{
		PICKLE_STAR = register("pickle_star", new Item((new Item.Settings()).maxCount(16).group(OverpoweredPickles.OVERPOWERED_PICKLES_GROUP)));
		ABSURD_PICKLE = register("absurd_pickle", new ItemAbsurdPickle((new Item.Settings()).food(FoodList.absurd_pickle).group(OverpoweredPickles.OVERPOWERED_PICKLES_GROUP)));
		RIDICULOUS_PICKLE = register("ridiculous_pickle", new ItemRidiculousPickle((new Item.Settings()).food(FoodList.ridiculous_pickle).group(OverpoweredPickles.OVERPOWERED_PICKLES_GROUP)));
		LUDICROUS_PICKLE = register("ludicrous_pickle", new ItemLudicruousPickle((new Item.Settings()).food(FoodList.ludicrous_pickle).group(OverpoweredPickles.OVERPOWERED_PICKLES_GROUP)));
		INSANE_PICKLE = register("insane_pickle", new ItemInsanePickle((new Item.Settings()).food(FoodList.insane_pickle).group(OverpoweredPickles.OVERPOWERED_PICKLES_GROUP)));
		
		FARCICAL_PICKLE = register("farcical_pickle", new ItemFarcicalPickle((new Item.Settings()).food(FoodList.insane_pickle).group(OverpoweredPickles.OVERPOWERED_PICKLES_GROUP)));
		PREPOSTEROUS_PICKLE = register("preposterous_pickle", new ItemPreposterousPickle((new Item.Settings()).food(FoodList.insane_pickle).group(OverpoweredPickles.OVERPOWERED_PICKLES_GROUP)));
		
		CLEANSING_PICKLE = register("cleansing_pickle", new ItemCleansingPickle((new Item.Settings()).food(FoodList.cleansing_pickle).group(OverpoweredPickles.OVERPOWERED_PICKLES_GROUP)));    
	}
	
	public static Item register(String name, Item item)
	{
	    return Registry.register(Registry.ITEM, new Identifier(OverpoweredPickles.MOD_ID, name), item);
	}
}