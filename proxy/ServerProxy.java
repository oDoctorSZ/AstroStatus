package com.astro.astrostats.proxy;

import com.astro.astrostats.utils.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Reference.MODID, value = Side.SERVER)
public class ServerProxy extends CommonProxy {


    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }


    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }


    @Override
    public void posInit(FMLPostInitializationEvent event) {
        super.posInit(event);
    }


}
