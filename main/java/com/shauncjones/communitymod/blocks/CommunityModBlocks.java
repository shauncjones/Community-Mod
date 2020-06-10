package com.shauncjones.communitymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class CommunityModBlocks {

    public static BlockBase blockCopper = new BlockBase(Material.IRON,"block_copper");

    public static void register(IForgeRegistry<Block> registry){
        registry.registerAll(
                blockCopper
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry){
        registry.registerAll(
                blockCopper.createItemBlock()
        );
    }

    public static void registerModels(){
        blockCopper.registerItemModel(Item.getItemFromBlock(blockCopper));
    }

}
