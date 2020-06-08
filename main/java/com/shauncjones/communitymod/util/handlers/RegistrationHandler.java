package com.shauncjones.communitymod.util.handlers;

import com.shauncjones.communitymod.CommunityMod;
import com.shauncjones.communitymod.blocks.CommunityModBlocks;
import com.shauncjones.communitymod.items.CommunityModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        CommunityModItems.register(event.getRegistry());
        CommunityModBlocks.registerItemBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent event){
        CommunityModItems.registerModels();
        CommunityModBlocks.registerModels();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        CommunityModBlocks.register(event.getRegistry());
    }

}
