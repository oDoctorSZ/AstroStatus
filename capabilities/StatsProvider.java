package com.astro.astrostats.capabilities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class StatsProvider implements ICapabilitySerializable<NBTTagCompound> {

    @CapabilityInject(IStats.class)
    public static final Capability<IStats> STATS_CAPABILITY = null;

    private final IStats instance = STATS_CAPABILITY.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == STATS_CAPABILITY;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return capability == STATS_CAPABILITY ? STATS_CAPABILITY.cast(this.instance) : null;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        return (NBTTagCompound) STATS_CAPABILITY.getStorage().writeNBT(STATS_CAPABILITY, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        STATS_CAPABILITY.getStorage().readNBT(STATS_CAPABILITY, this.instance, null, nbt);
    }

}
