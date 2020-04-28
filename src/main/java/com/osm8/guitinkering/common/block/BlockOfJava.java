package com.osm8.guitinkering.common.block;

import com.osm8.guitinkering.GuiTinkering;
import com.osm8.guitinkering.client.gui.block.GuiJavaBlock;
import com.osm8.guitinkering.common.material.MaterialCoffee;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class BlockOfJava extends BlockBase {
    public BlockOfJava() {
        super(new MaterialCoffee());
        this.setCreativeTab(CreativeTabs.REDSTONE);
        this.setLightLevel(0.5f);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote){
            playerIn.openGui(GuiTinkering.instance, GuiJavaBlock.BLOCK_JAVA_GUI_ID, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
            return true;
        }
        return true;
    }
}
