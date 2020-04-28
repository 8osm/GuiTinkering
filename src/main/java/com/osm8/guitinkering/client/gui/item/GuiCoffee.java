package com.osm8.guitinkering.client.gui.item;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

public class GuiCoffee extends GuiScreen {
    public static final int ITEM_COFFEE_GUI_ID = 1;
    public void initGui()
    {
        this.addButton(new GuiButton(1, this.width/2 - 100, this.height/2 - 100, 200, 20, "Spawn a slime"));
    }

    protected void actionPerformed(GuiButton button) throws IOException
    {
        switch (button.id)
        {
            case 1:
                mc.player.getEntityWorld();
        }
    }


    public void updateScreen()
    {
        super.updateScreen();
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, "Coffee", this.width / 2, 40, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
