package com.astro.astrostats.blocks;

import com.astro.astrostats.blocks.base.AstroBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopper extends AstroBlock {
    public BlockCopper(String unlocalized_name) {
        super(unlocalized_name, CreativeTabs.BUILDING_BLOCKS, 5.0F, 10.0F, Material.ROCK, MapColor.IRON, SoundType.ANVIL);
    }
}
