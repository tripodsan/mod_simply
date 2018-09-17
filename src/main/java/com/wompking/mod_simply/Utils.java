package com.wompking.mod_simply;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class Utils {

    public static BlockPos getPrevBlockPos(Entity entity) {
        return new BlockPos(entity.prevPosX, entity.prevPosY + 0.5, entity.prevPosZ);
    }
}
