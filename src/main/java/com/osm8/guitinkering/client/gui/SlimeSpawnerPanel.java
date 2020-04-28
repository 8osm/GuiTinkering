package com.osm8.guitinkering.client.gui;

import net.minecraft.client.gui.*;
import net.minecraft.client.gui.GuiSlider;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.io.IOException;

public class SlimeSpawnerPanel extends GuiScreen {
    private int saveStep;
    private int visibleTime;


    public void initGui()
    {
        this.addButton(new GuiSlider(new SlimeSizeSliderResponder(), 0, this.width/2 - 100, this.height/2 - 100, "Slime Size", 0, 25, 5, new SlimeSizeSliderFormatHelper()));
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
        ++this.visibleTime;
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, "bruh", this.width / 2, 40, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
