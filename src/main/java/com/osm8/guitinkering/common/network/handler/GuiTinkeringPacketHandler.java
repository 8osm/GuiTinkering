package com.osm8.guitinkering.common.network.handler;

import com.osm8.guitinkering.common.network.message.OpenGuiMessage;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class GuiTinkeringPacketHandler {
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("guitinkering");
    public static void registerPackets(){
        INSTANCE.registerMessage(OpenGuiMessage.OpenGuiMessageHandler.class, OpenGuiMessage.class, 1, Side.SERVER);
    }
}
