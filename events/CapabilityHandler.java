package com.astro.astrostats.events;

import com.astro.astrostats.capabilities.Attributes;
import com.astro.astrostats.capabilities.IStats;
import com.astro.astrostats.capabilities.StatsProvider;
import com.astro.astrostats.utils.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CapabilityHandler extends AstroEvent {

    public static final ResourceLocation RESOURCE_LOCATION = new ResourceLocation(Reference.MODID, "stats");

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void attachCapability(AttachCapabilitiesEvent<Entity> event) {

        if (event.getObject() instanceof EntityPlayer) {
            event.addCapability(RESOURCE_LOCATION, new StatsProvider());
        }

    }

    @SubscribeEvent(priority =  EventPriority.HIGHEST)
    public static void onRespawn(PlayerEvent.Clone event) {
        final Entity player = event.getEntityPlayer();
        final Entity original = event.getOriginal();

        IStats stats = player.getCapability(StatsProvider.STATS_CAPABILITY, null);
        IStats oldStats = original.getCapability(StatsProvider.STATS_CAPABILITY, null);

        for (Attributes attr : Attributes.values()) {
            stats.setStats(attr, oldStats.getStats(attr));
        }


    }




}
