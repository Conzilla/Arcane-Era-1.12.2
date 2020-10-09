package com.conzilla.ArcaneEra;

import org.apache.logging.log4j.Logger;

import com.conzilla.ArcaneEra.util.Refrence;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
 
@Mod(modid = Refrence.MODID, name = Refrence.NAME, version = Refrence.VERSION)

public class ArcaneEra 
{
    @SidedProxy(clientSide = "com.conzilla.ArcaneEra.proxy.ClientProxy" ,serverSide = "com.eternal_plasma.smep.proxy.CommonProxy")
    public static com.conzilla.ArcaneEra.proxy.CommonProxy proxy;




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
