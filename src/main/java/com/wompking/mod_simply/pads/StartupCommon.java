package com.wompking.mod_simply.pads;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon {

    public static BlockSpeedPad blockSpeedPad;  // this holds the unique instance of your block
    public static ItemBlock itemSpeedPad;  // this holds the unique instance of the ItemBlock corresponding to your block

    public static void preInitCommon() {
        blockSpeedPad = (BlockSpeedPad) (new BlockSpeedPad().setUnlocalizedName("speed_pad"));
        blockSpeedPad.setRegistryName("speed_pad");
        ForgeRegistries.BLOCKS.register(blockSpeedPad);

        // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
        itemSpeedPad = new ItemBlock(blockSpeedPad);
        itemSpeedPad.setRegistryName(blockSpeedPad.getRegistryName());
        ForgeRegistries.ITEMS.register(itemSpeedPad);
    }

    public static void initCommon() {
    }

    public static void postInitCommon() {
    }

}
