package com.astro.astrostats.proxy;

import com.astro.astrostats.blocks.init.AstroBlocks;
import com.astro.astrostats.utils.Reference;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Reference.MODID, value = Side.CLIENT)
public class ClientProxy extends CommonProxy {

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

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        AstroBlocks.initializeBlockModels();
    }

    @Override
    public void registerRenderers() {

    }
}
