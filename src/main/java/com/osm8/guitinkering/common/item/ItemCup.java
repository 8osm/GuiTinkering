package com.osm8.guitinkering.common.item;

import com.osm8.guitinkering.GuiTinkering;
import com.osm8.guitinkering.client.gui.item.GuiCoffee;
import com.osm8.guitinkering.client.gui.item.GuiCup;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemCup extends ItemBase{
    public ItemCup(){
        super();
        this.setCreativeTab(CreativeTabs.REDSTONE);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.openGui(GuiTinkering.instance, GuiCup.ITEM_CUP_GUI_ID, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
        return new ActionResult<>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
