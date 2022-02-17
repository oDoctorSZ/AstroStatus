package com.astro.astrostats.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public class StatsStorage implements Capability.IStorage<IStats> {


    @Override
    public NBTBase writeNBT(Capability<IStats> capability, IStats instance, EnumFacing side) {

        NBTTagCompound nbt = new NBTTagCompound();

        for (Attributes type : Attributes.values()) {
            nbt.setInteger(type.name(), instance.getStats(type));
        }


        return nbt;
    }

    @Override
    public void readNBT(Capability<IStats> capability, IStats instance, EnumFacing side, NBTBase nbt) {

        NBTTagCompound compound = (NBTTagCompound) nbt;


        for (Attributes type : Attributes.values()) {
            instance.setStats(type, compound.getInteger(type.name()));
        }



    }
}
