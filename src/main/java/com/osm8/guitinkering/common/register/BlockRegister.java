package com.osm8.guitinkering.common.register;

import com.osm8.guitinkering.GuiTinkering;
import com.osm8.guitinkering.common.block.Blocks;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GuiTinkering.MODID)
public class BlockRegister {

    @SubscribeEvent
    public static void blockRegister(RegistryEvent.Register<Block> event){
        for (Block block: Blocks.BLOCKS) {
            event.getRegistry().register(block);
        }
    }
}
