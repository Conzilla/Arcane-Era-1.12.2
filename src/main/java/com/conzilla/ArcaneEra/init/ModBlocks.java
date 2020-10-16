package com.conzilla.ArcaneEra.init;

import java.util.ArrayList;
import java.util.List;

import com.conzilla.ArcaneEra.blocks.Admantite_Ore;
import com.conzilla.ArcaneEra.blocks.Mythril_Ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks  
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ADMANTITE_ORE = new Admantite_Ore("admantite_ore",Material.ROCK);
	public static final Block MYTHRIL_ORE = new Mythril_Ore("mythril_ore",Material.ROCK);  
}
