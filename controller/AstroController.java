package com.astro.astrostats.controller;

import com.astro.astrostats.capabilities.IStats;
import com.astro.astrostats.capabilities.StatsProvider;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Collection;
import java.util.UUID;

public class AstroController {

    private static final AstroController ASTRO_CONTROLLER = new AstroController();

    public static AstroController getInstance() {
        return ASTRO_CONTROLLER;
    }

    private AstroController() {}

    private final FMLCommonHandler fmlCommonHandler = FMLCommonHandler.instance();
    private final Table<Class<?>, Object, Object> hashBasedTable = HashBasedTable.create();

    public <T> void put(Class<T> clazz, Object uniqueId, T reference) {
        hashBasedTable.put(clazz, uniqueId, reference);
    }

    public void remove(Class<?> clazz, Object uniqueId) {
        hashBasedTable.remove(clazz, uniqueId);
    }

    public <T> T searchBy(Class<T> clazz, Object uniqueId) {
        return (T) hashBasedTable.get(clazz, uniqueId);
    }

    public <T> Collection<T> fill(Class<T> clazz) {
        return (Collection<T>) hashBasedTable.row(clazz).values();
    }

    @SideOnly(Side.SERVER)
    public IStats firstOf(final UUID uuid) {
        final MinecraftServer minecraftServer = fmlCommonHandler.getMinecraftServerInstance();

        final Entity entityPlayer = minecraftServer.getEntityFromUuid(uuid);

        return entityPlayer.getCapability(StatsProvider.STATS_CAPABILITY , null);
    }

}
