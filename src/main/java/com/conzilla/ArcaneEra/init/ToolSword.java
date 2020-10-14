package com.conzilla.ArcaneEra.init;


import com.conzilla.ArcaneEra.ArcaneEra;
import com.conzilla.ArcaneEra.util.IHasModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
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
