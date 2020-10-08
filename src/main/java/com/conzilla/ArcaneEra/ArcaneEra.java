package com.conzilla.ArcaneEra;

import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
 
@Mod(modid = ArcaneEra.MODID, name = ArcaneEra.NAME, version = ArcaneEra.VERSION)
public class ArcaneEra 
{




    public static final String MODID = "ae";
    public static final String NAME = "ArcaneEra";
    public static final String VERSION = "1.0";

    @SuppressWarnings("unused")
	private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }


}
