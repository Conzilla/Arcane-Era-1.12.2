package com.conzilla.ArcaneEra.util;

import com.conzilla.ArcaneEra.ArcaneEra;
import com.conzilla.ArcaneEra.init.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ArcaneEra.MODTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		ArcaneEra.proxy.registerItemRenderer(this,0,"inventory");
		
	}

}
