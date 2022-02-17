package com.astro.astrostats.events;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

public class AstroEvent extends Event {

    public void call() {
        MinecraftForge.EVENT_BUS.post(this);
    }

}
