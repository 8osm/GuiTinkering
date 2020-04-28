package com.osm8.guitinkering.common.item.container;

import com.osm8.guitinkering.common.item.ItemCup;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;

public class ContainerCup extends Container {
    private ItemCup itemCup;

    public ContainerCup(IInventory playerInv, ItemCup itemCup) {
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}

