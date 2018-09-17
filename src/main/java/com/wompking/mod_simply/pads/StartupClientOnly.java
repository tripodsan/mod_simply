package com.wompking.mod_simply.pads;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;

public class StartupClientOnly {
    public static void preInitClientOnly() {
        // This step is necessary in order to make your block render properly when it is an item (i.e. in the inventory
        //   or in your hand or thrown on the ground).
        // It must be done on client only, and must be done after the block has been created in Common.preinit().
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("mod_simply:block_speed_pad", "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(StartupCommon.itemSpeedPad, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
    }

    public static void initClientOnly() {
    }

    public static void postInitClientOnly() {
        MinecraftForge.EVENT_BUS.register(new Pads());
    }
}
