package com.wompking.mod_simply.pads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.wompking.mod_simply.Utils;
import com.wompking.mod_simply.mbe01_block_simple.BlockSimple;
import com.wompking.mod_simply.mbe01_block_simple.StartupCommon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Pads {

    public static final Logger log = LogManager.getLogger();

    public Pads() {
        log.info("pads initialized");
    }

    /**
     * default logger
     */

    @SubscribeEvent
    public void joinEvent(EntityJoinWorldEvent evt) {
//        log.info("entity joined: {}", evt.getEntity());
    }

    @SubscribeEvent
    public void livingUpdate(LivingEvent.LivingUpdateEvent evt) {
        if (evt.getEntity() instanceof EntityPlayer) {
            EntityPlayer p = (EntityPlayer) evt.getEntity();

            BlockPos pos = p.getPosition();
            BlockPos prevPos = Utils.getPrevBlockPos(p);
            if (!pos.equals(prevPos)) {
                pos = pos.down();
                IBlockState state = p.world.getBlockState(pos);
//                log.info("player walked {} over {}", pos, block);
                if (state.getBlock().equals(StartupCommon.blockSimple)) {
                    log.info("over speed block");
                }
//                if (state.getMaterial() != Material.AIR) {
//                    p.world.setBlockState(pos, StartupCommon.blockSimple.getDefaultState());
//                }
            }
        }
    }
}
