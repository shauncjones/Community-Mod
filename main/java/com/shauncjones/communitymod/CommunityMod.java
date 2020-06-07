package com.shauncjones.communitymod;

import com.shauncjones.communitymod.proxy.CommonProxy;
import com.shauncjones.communitymod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.core.Logger;


@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class CommunityMod {

    @Mod.Instance
    public static CommunityMod instance;

    @SidedProxy(clientSide = Reference.CLIENTPROXYCLASS, serverSide = Reference.SERVERPROXYCLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

}
