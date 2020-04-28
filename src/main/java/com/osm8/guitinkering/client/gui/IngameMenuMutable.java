package com.osm8.guitinkering.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;

import java.io.IOException;

public class IngameMenuMutable extends GuiIngameMenu {
    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.add(new GuiButton(100, super.width / 2 - 200, super.height / 4 + 24 + -16, "Spawn a custom Slime"));
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);

        switch (button.id){
            case 100:
                this.mc.displayGuiScreen(new SlimeSpawnerPanel());
        }
    }
}
