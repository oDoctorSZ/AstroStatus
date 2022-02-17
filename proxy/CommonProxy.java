package com.astro.astrostats.proxy;

import com.astro.astrostats.blocks.init.AstroBlocks;
import com.astro.astrostats.capabilities.IStats;
import com.astro.astrostats.capabilities.Stats;
import com.astro.astrostats.capabilities.StatsStorage;
import com.astro.astrostats.events.AstroEvent;
import com.astro.astrostats.events.CapabilityHandler;
import com.astro.astrostats.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class CommonProxy {


    public void preInit(FMLPreInitializationEvent event) {

    }


    public void init(FMLInitializationEvent event)
    {
        CapabilityManager.INSTANCE.register(IStats.class, new StatsStorage(), Stats.class);

    }


    public void posInit(FMLPostInitializationEvent event) {

    }


    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        AstroBlocks.registerItemBlocks(event);
    }


    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        AstroBlocks.registerBlocks(event);
    }

    public void registerRenderers() {

    }



}
