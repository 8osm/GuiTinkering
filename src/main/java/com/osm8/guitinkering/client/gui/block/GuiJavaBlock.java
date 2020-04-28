package com.osm8.guitinkering.client.gui.block;

import com.osm8.guitinkering.client.gui.SlimeSizeSliderFormatHelper;
import com.osm8.guitinkering.client.gui.SlimeSizeSliderResponder;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSlider;

import java.io.IOException;

public class GuiJavaBlock extends GuiScreen {
    public static final int BLOCK_JAVA_GUI_ID = 0;
    public void initGui()
    {
        this.addButton(new GuiButton(1, this.width/2 - 300, this.height/2 - 100, 200, 20, "Spawn a slime"));
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
        this.drawCenteredString(this.fontRenderer, "Java Block", this.width / 2, 40, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
