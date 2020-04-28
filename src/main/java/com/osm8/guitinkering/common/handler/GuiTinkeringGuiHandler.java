package com.osm8.guitinkering.common.handler;

import com.osm8.guitinkering.client.gui.block.GuiJavaBlock;
import com.osm8.guitinkering.client.gui.item.GuiCoffee;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiTinkeringGuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        player.sendMessage(new TextComponentString("hey"));
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        player.sendMessage(new TextComponentString("called getclientguielement"));
        switch (ID){
            case GuiJavaBlock.BLOCK_JAVA_GUI_ID:
                return new GuiJavaBlock();
            case GuiCoffee.ITEM_COFFEE_GUI_ID:
                return new GuiCoffee();
        }
        return null;
    }
}
