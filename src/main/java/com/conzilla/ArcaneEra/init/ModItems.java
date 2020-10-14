package com.conzilla.ArcaneEra.init;

import java.util.ArrayList;
import java.util.List;

import com.conzilla.ArcaneEra.util.ItemBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item ADMANTITE_INGOT = new ItemBase("admantite_ingot");
	public static final ToolMaterial MATERIAL_ADMANTITE = EnumHelper.addToolMaterial("material_admantite",3,1570,10.0F,4.0F,22);
	
	public static final ItemSword ADMANTITE_SWORD = new ToolSword("admantite_sword", MATERIAL_ADMANTITE);
}
