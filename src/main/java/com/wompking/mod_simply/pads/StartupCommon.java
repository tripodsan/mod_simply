package com.wompking.mod_simply.pads;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class StartupCommon {

    public static BlockSpeedPad blockSpeedPad;  // this holds the unique instance of your block
    public static ItemBlock itemSpeedPad;  // this holds the unique instance of the ItemBlock corresponding to your block
    public static BlockFlameEmitter blockFlameEmitter;  // this holds the unique instance of your block
    public static ItemBlock itemBlockFlameEmitter;  // the itemBlock corresponding to the block

    public static void preInitCommon() {
        blockSpeedPad = (BlockSpeedPad) (new BlockSpeedPad().setUnlocalizedName("speed_pad"));
        blockSpeedPad.setRegistryName("speed_pad");
        ForgeRegistries.BLOCKS.register(blockSpeedPad);

        // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
        itemSpeedPad = new ItemBlock(blockSpeedPad);
        itemSpeedPad.setRegistryName(blockSpeedPad.getRegistryName());
        ForgeRegistries.ITEMS.register(itemSpeedPad);


        // each instance of your block should have a name that is unique within your mod.  use lower case.
        blockFlameEmitter = (BlockFlameEmitter)(new BlockFlameEmitter().setUnlocalizedName("mbe50_block_flame_emitter_unlocalised_name"));
        blockFlameEmitter.setRegistryName("mbe50_block_flame_emitter_registry_name");
        ForgeRegistries.BLOCKS.register(blockFlameEmitter);

        // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
        itemBlockFlameEmitter = new ItemBlock(blockFlameEmitter);
        itemBlockFlameEmitter.setRegistryName(blockFlameEmitter.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlockFlameEmitter);
    }

    public static void initCommon() {
    }

    public static void postInitCommon() {
    }

}
