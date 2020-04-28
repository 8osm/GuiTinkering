package com.osm8.guitinkering.common.network.message;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class OpenGuiMessage implements IMessage {
    public OpenGuiMessage() {}

    private int guiToOpen;
    public OpenGuiMessage(int guiId) {
        this.guiToOpen = guiToOpen;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        buf.writeInt(guiToOpen);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        guiToOpen = buf.readInt();
    }
    public static class OpenGuiMessageHandler implements IMessageHandler<OpenGuiMessage, IMessage>{

        @Override
        public IMessage onMessage(OpenGuiMessage message, MessageContext ctx) {
            return null;
        }
    }
}
