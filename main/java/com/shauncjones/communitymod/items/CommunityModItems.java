package com.shauncjones.communitymod.items;

import com.shauncjones.communitymod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class CommunityModItems {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MISC);

    public static void register(IForgeRegistry<Item> registry){

        registry.registerAll(
                ingotCopper
        );

    }

    public static void registerModels(){
        ingotCopper.registerItemModel();
    }

}
