package com.shauncjones.communitymod.util;

import com.shauncjones.communitymod.items.CommunityModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CommunityModTab extends CreativeTabs {


    public CommunityModTab() {
        super(Reference.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(CommunityModItems.ingotCopper);
    }
}
