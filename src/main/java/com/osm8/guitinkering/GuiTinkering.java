package com.osm8.guitinkering;


import com.osm8.guitinkering.common.handler.GuiTinkeringGuiHandler;
import com.osm8.guitinkering.common.network.handler.GuiTinkeringPacketHandler;
import com.osm8.guitinkering.proxy.BaseProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = GuiTinkering.MODID, name = GuiTinkering.MODNAME)
public class GuiTinkering {
    @Mod.Instance
    public static GuiTinkering instance;
    public static final String MODID = "guitinkering";
    public static final String MODNAME = "GUI Tinkering";

    @SidedProxy(clientSide = "com.osm8.guitinkering.proxy.ClientProxy", serverSide = "com.osm8.guitinkering.proxy.CommonProxy")
    public static BaseProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        GuiTinkeringPacketHandler.registerPackets();
        NetworkRegistry.INSTANCE.registerGuiHandler(GuiTinkering.instance, new GuiTinkeringGuiHandler());
        proxy.init(event);
    }

    @Mod.EventHandler
    public void preInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
