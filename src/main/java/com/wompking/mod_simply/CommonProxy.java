package com.wompking.mod_simply;

import net.minecraft.entity.player.EntityPlayer;

/**
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 *   Standalone client and the dedicated server.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public abstract class CommonProxy {

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    public void preInit()
    {
        //read config first
//        com.wompking.minecraft.mod_simply.mbe70_configuration.StartupCommon.preInitCommon();

        com.wompking.mod_simply.mbe01_block_simple.StartupCommon.preInitCommon();

        com.wompking.mod_simply.pads.StartupCommon.preInitCommon();

//        com.wompking.minecraft.mod_simply.mbe02_block_partial.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe03_block_variants.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe04_block_dynamic_block_model1.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe05_block_dynamic_block_model2.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe06_redstone.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe08_creative_tab.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe10_item_simple.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe11_item_variants.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe12_item_nbt_animate.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe13_item_tools.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe15_item_dynamic_item_model.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe20_tileentity_data.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe21_tileentityspecialrenderer.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe30_inventory_basic.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe31_inventory_furnace.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe35_recipes.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe40_hud_overlay.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe50_particle.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe60_network_messages.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.mbe75_testing_framework.StartupCommon.preInitCommon();
//        com.wompking.minecraft.mod_simply.testingarea.StartupCommon.preInitCommon();
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init()
    {
//        com.wompking.minecraft.mod_simply.mbe70_configuration.StartupCommon.initCommon();

        com.wompking.mod_simply.mbe01_block_simple.StartupCommon.initCommon();
        com.wompking.mod_simply.pads.StartupCommon.initCommon();

//        com.wompking.minecraft.mod_simply.mbe02_block_partial.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe03_block_variants.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe04_block_dynamic_block_model1.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe05_block_dynamic_block_model2.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe06_redstone.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe08_creative_tab.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe10_item_simple.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe11_item_variants.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe12_item_nbt_animate.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe13_item_tools.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe15_item_dynamic_item_model.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe20_tileentity_data.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe21_tileentityspecialrenderer.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe30_inventory_basic.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe31_inventory_furnace.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe35_recipes.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe40_hud_overlay.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe50_particle.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe60_network_messages.StartupCommon.initCommon();
//        com.wompking.minecraft.mod_simply.mbe75_testing_framework.StartupCommon.initCommon();
//    com.wompking.minecraft.mod_simply.testingarea.StartupCommon.initCommon();
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit()
    {
//        com.wompking.minecraft.mod_simply.mbe70_configuration.StartupCommon.postInitCommon();

        com.wompking.mod_simply.mbe01_block_simple.StartupCommon.postInitCommon();
        com.wompking.mod_simply.pads.StartupCommon.postInitCommon();

//        com.wompking.minecraft.mod_simply.mbe02_block_partial.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe03_block_variants.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe04_block_dynamic_block_model1.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe05_block_dynamic_block_model2.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe06_redstone.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe08_creative_tab.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe10_item_simple.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe11_item_variants.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe12_item_nbt_animate.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe13_item_tools.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe15_item_dynamic_item_model.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe20_tileentity_data.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe21_tileentityspecialrenderer.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe30_inventory_basic.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe31_inventory_furnace.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe35_recipes.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe40_hud_overlay.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe50_particle.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe60_network_messages.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.mbe75_testing_framework.StartupCommon.postInitCommon();
//        com.wompking.minecraft.mod_simply.testingarea.StartupCommon.postInitCommon();
    }

    // helper to determine whether the given player is in creative mode
    //  not necessary for most examples
    abstract public boolean playerIsInCreativeMode(EntityPlayer player);

    /**
     * is this a dedicated server?
     * @return true if this is a dedicated server, false otherwise
     */
    abstract public boolean isDedicatedServer();
}