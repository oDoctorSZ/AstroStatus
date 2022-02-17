package com.astro.astrostats.blocks.base;

import com.astro.astrostats.AstroStats;
import com.astro.astrostats.utils.IInitModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AstroBlock extends Block implements IInitModel {

    public AstroBlock(String unlocalizedName, CreativeTabs tab, float hardness, float resistance, Material blockMaterialIn, MapColor blockMapColor, SoundType soundType) {
        super(blockMaterialIn, blockMapColor);
        this.setUnlocalizedName(AstroStats.appendModID(unlocalizedName));
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(soundType);
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    @SideOnly(Side.CLIENT)
    public void initializeModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


    @SuppressWarnings("ConstantConditions")
    public void registerItemBlock(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(this).setRegistryName(getRegistryName()));
    }

}
