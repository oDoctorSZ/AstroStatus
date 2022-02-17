package com.astro.astrostats;

import com.astro.astrostats.proxy.CommonProxy;
import com.astro.astrostats.utils.Reference;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class AstroStats
{

    @Mod.Instance
    public static AstroStats instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }


    @EventHandler
    public void posInit(FMLPostInitializationEvent event) {
        proxy.posInit(event);
    }

    public static String appendModID(String value) {
        return Reference.MODID + ":" + value;
    }


}
