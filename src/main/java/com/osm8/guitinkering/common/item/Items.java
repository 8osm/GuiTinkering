package com.osm8.guitinkering.common.item;

import com.osm8.guitinkering.GuiTinkering;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

public class Items {
    public static List<Item> ITEMS = new ArrayList<Item>();

    public static final Item COFFEE = register(new ItemCoffee(), "coffee");

    public static Item register(Item item, String name) {
        item.setRegistryName(new ResourceLocation(GuiTinkering.MODID, name));
        item.setTranslationKey(GuiTinkering.MODID + "." + name);
        ITEMS.add(item);
        return item;
    }

}
