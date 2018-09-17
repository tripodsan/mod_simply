package com.wompking.mod_simply;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * ClientProxy is used to set up the mod and start it running on normal minecraft.  It contains all the code that should run on the
 *   client side only.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public class ClientOnlyProxy extends CommonProxy
{

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
     */
    public void preInit()
    {
        super.preInit();
//        mod_simply.mbe70_configuration.StartupClientOnly.preInitClientOnly();

        com.wompking.mod_simply.mbe01_block_simple.StartupClientOnly.preInitClientOnly();

        com.wompking.mod_simply.pads.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe02_block_partial.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe03_block_variants.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe04_block_dynamic_block_model1.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe05_block_dynamic_block_model2.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe06_redstone.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe08_creative_tab.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe10_item_simple.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe11_item_variants.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe12_item_nbt_animate.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe13_item_tools.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe15_item_dynamic_item_model.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe20_tileentity_data.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe21_tileentityspecialrenderer.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe30_inventory_basic.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe31_inventory_furnace.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe35_recipes.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe40_hud_overlay.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe50_particle.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe60_network_messages.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe75_testing_framework.StartupClientOnly.preInitClientOnly();
//        com.wompking.minecraft.mod_simply.testingarea.StartupClientOnly.preInitClientOnly();
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes,
     * send FMLInterModComms messages to other mods.
     */
    public void init()
    {
        super.init();
//        mod_simply.mbe70_configuration.StartupClientOnly.initClientOnly();

        com.wompking.mod_simply.mbe01_block_simple.StartupClientOnly.initClientOnly();

        com.wompking.mod_simply.pads.StartupClientOnly.initClientOnly();

//        com.wompking.minecraft.mod_simply.mbe02_block_partial.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe03_block_variants.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe04_block_dynamic_block_model1.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe05_block_dynamic_block_model2.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe06_redstone.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe08_creative_tab.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe10_item_simple.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe11_item_variants.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe12_item_nbt_animate.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe13_item_tools.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe15_item_dynamic_item_model.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe20_tileentity_data.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe21_tileentityspecialrenderer.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe30_inventory_basic.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe31_inventory_furnace.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe35_recipes.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe40_hud_overlay.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe50_particle.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe60_network_messages.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.mbe75_testing_framework.StartupClientOnly.initClientOnly();
//        com.wompking.minecraft.mod_simply.testingarea.StartupClientOnly.initClientOnly();
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    public void postInit()
    {
        super.postInit();
//        mod_simply.mbe70_configuration.StartupClientOnly.postInitClientOnly();

        com.wompking.mod_simply.mbe01_block_simple.StartupClientOnly.postInitClientOnly();

        com.wompking.mod_simply.pads.StartupClientOnly.postInitClientOnly();

//        com.wompking.minecraft.mod_simply.mbe02_block_partial.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe03_block_variants.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe04_block_dynamic_block_model1.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe05_block_dynamic_block_model2.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe06_redstone.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe08_creative_tab.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe10_item_simple.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe11_item_variants.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe12_item_nbt_animate.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe13_item_tools.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe15_item_dynamic_item_model.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe20_tileentity_data.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe21_tileentityspecialrenderer.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe30_inventory_basic.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe31_inventory_furnace.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe35_recipes.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe40_hud_overlay.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe50_particle.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe60_network_messages.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.mbe75_testing_framework.StartupClientOnly.postInitClientOnly();
//        com.wompking.minecraft.mod_simply.testingarea.StartupClientOnly.postInitClientOnly();
    }

    @Override
    public boolean playerIsInCreativeMode(EntityPlayer player) {
        if (player instanceof EntityPlayerMP) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
            return entityPlayerMP.interactionManager.isCreative();
        } else if (player instanceof EntityPlayerSP) {
            return Minecraft.getMinecraft().playerController.isInCreativeMode();
        }
        return false;
    }

    @Override
    public boolean isDedicatedServer() {return false;}

}