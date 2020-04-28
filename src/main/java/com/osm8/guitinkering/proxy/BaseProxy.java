package com.osm8.guitinkering.proxy;

import com.osm8.guitinkering.GuiTinkering;
import com.osm8.guitinkering.common.handler.GuiTinkeringGuiHandler;
import com.osm8.guitinkering.common.network.handler.GuiTinkeringPacketHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public interface BaseProxy {
    public void preInit(FMLPreInitializationEvent event);

    public void init(FMLInitializationEvent event);

    public void postInit(FMLPostInitializationEvent event);
}
