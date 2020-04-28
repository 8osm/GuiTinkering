package com.osm8.guitinkering.client.handlers;

import com.osm8.guitinkering.GuiTinkering;
import com.osm8.guitinkering.client.gui.IngameMenuMutable;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = GuiTinkering.MODID)
public class GuiEventHandler {
    @SubscribeEvent
    public static void injectGuiButtons(GuiOpenEvent event) throws NoSuchFieldException, IllegalAccessException {
//        GuiScreen ingameMenu;

        if(event.getGui() instanceof GuiIngameMenu){
//            ingameMenu = event.getGui();
//            Field buttonListField = ingameMenu.getClass().getSuperclass().getDeclaredField("buttonList");
//            buttonListField.setAccessible(true);
//            List<GuiButton> buttonList = (List<GuiButton>) buttonListField.get(ingameMenu);
//            buttonList.add(new GuiButton(999, ingameMenu.width / 2 - 500, ingameMenu.height / 4 + 24 + -16, "Hello Blyat"));
            event.setGui(new IngameMenuMutable());
        }
    }
}
