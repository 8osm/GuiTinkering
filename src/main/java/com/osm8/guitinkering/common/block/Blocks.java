package com.osm8.guitinkering.common.block;

import com.osm8.guitinkering.GuiTinkering;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class Blocks {
    public static List<Block> BLOCKS = new ArrayList<>();

    public static final Block BLOCK_OF_JAVA = register(new BlockOfJava(), "java_block");

    public static Block register(Block block, String name) {
        block.setRegistryName(new ResourceLocation(GuiTinkering.MODID, name));
        block.setTranslationKey(GuiTinkering.MODID + "." + name);
        BLOCKS.add(block);
        return block;
    }
}
