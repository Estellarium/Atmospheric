package com.bagel.rosewood.core.registry;

import com.bagel.rosewood.common.entity.RosewoodBoatEntity;
import com.bagel.rosewood.common.items.RosewoodBoatItem;
import com.bagel.rosewood.core.Rosewood;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RosewoodItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Rosewood.MODID);
	
	public static RegistryObject<Item> PASSIONFRUIT = RegistryUtils.createItem("passionfruit", () -> new Item(new Item.Properties().food(RosewoodFoods.PASSIONFRUIT).group(ItemGroup.FOOD)));
	public static RegistryObject<Item> SHIMMERING_PASSIONFRUIT = RegistryUtils.createItem("shimmering_passionfruit", () -> new Item(new Item.Properties().food(RosewoodFoods.SHIMMERING_PASSIONFRUIT).group(ItemGroup.FOOD)));
	public static RegistryObject<Item> ROSEWOOD_BOAT = RegistryUtils.createItem("rosewood_boat", () -> new RosewoodBoatItem(RosewoodBoatEntity.Type.ROSEWOOD, new Item.Properties().group(ItemGroup.TRANSPORTATION)));

}