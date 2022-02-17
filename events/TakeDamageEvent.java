package com.astro.astrostats.events;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TakeDamageEvent extends AstroEvent {

    @SubscribeEvent
    public static void eventTest(AttackEntityEvent e) {
        e.getEntityPlayer().sendMessage(new TextComponentString("HIT"));
    }

}
