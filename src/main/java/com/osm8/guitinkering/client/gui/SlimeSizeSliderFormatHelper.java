package com.osm8.guitinkering.client.gui;

import net.minecraft.client.gui.GuiSlider;

public class SlimeSizeSliderFormatHelper implements GuiSlider.FormatHelper {
    @Override
    public String getText(int id, String name, float value) {
        switch (id){
            case 0:
                return "Fucking Slider:" + value;
        }
        return "";
    }
}
