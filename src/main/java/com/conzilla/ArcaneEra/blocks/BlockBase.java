package com.conzilla.ArcaneEra.blocks;

import com.conzilla.ArcaneEra.ArcaneEra;
import com.conzilla.ArcaneEra.init.ModBlocks;
import com.conzilla.ArcaneEra.init.ModItems;
import com.conzilla.ArcaneEra.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ArcaneEra.MODTAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		ArcaneEra.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
