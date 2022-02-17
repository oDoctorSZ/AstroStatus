package com.astro.astrostats.blocks.init;

import com.astro.astrostats.blocks.BlockCopper;
import com.astro.astrostats.blocks.base.AstroBlock;
import com.astro.astrostats.utils.IInitModel;
import com.astro.astrostats.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class AstroBlocks {

    @GameRegistry.ObjectHolder(Reference.MODID + ":" + "block_copper")
    public static final BlockCopper COPPER = new BlockCopper("block_copper");

    public static final AstroBlock[] BLOCKS = new AstroBlock[]
    {
            COPPER
    };


    @SideOnly(Side.CLIENT)
    public static void initializeBlockModels() {
        for (IInitModel block : BLOCKS) {
            block.initializeModel();
        }
    }

    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();
        registry.registerAll(BLOCKS);

        // Register TileEntities
        //GameRegistry.registerTileEntity(TileEntityCustom.class, ID+"_te_custom");
    }

    public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
        for (AstroBlock itemBlock : BLOCKS) {
            itemBlock.registerItemBlock(event);
        }
    }






}
