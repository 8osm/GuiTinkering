package com.osm8.guitinkering.common.register;

import com.osm8.guitinkering.GuiTinkering;
import com.osm8.guitinkering.common.block.Blocks;
import com.osm8.guitinkering.common.item.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GuiTinkering.MODID)
public class ItemRegister {

    @SubscribeEvent
    public static void itemRegister(RegistryEvent.Register<Item> event){
        for (Item item: Items.ITEMS) {
            event.getRegistry().register(item);
        }
        for(Block blockItem: Blocks.BLOCKS){
            event.getRegistry().register(new ItemBlock(blockItem).setRegistryName(blockItem.getRegistryName()));
        }
    }
}
