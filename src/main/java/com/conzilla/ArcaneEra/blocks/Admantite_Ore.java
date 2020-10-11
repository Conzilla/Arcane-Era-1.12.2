package com.conzilla.ArcaneEra.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Admantite_Ore extends BlockBase
{

	public Admantite_Ore(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 3);
	}

}
