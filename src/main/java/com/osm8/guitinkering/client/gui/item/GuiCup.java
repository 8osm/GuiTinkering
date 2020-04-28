package com.osm8.guitinkering.client.gui.item;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public class GuiCup extends GuiContainer{
    public static final int ITEM_CUP_GUI_ID = 2;

    public GuiCup(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
    }

    @Override
    public void initGui() {
        this.addButton(new GuiButton(1, this.width/2 - 100, this.height/2 - 100, 200, 20, "Spawn a slime"));
    }
}
