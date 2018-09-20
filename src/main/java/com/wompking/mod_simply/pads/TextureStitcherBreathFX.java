package com.wompking.mod_simply.pads;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by TGG on 19/06/2015.
 * Inserts our custom flame texture into the blocks+items texture sheet.
 */
public class TextureStitcherBreathFX
{
  @SubscribeEvent
  public void stitcherEventPre(TextureStitchEvent.Pre event) {
//    ResourceLocation flameRL = new ResourceLocation("mod_simply:entity/flame_fx");
    ResourceLocation flameRL = new ResourceLocation("mod_simply:entity/speed_pad");
    event.getMap().registerSprite(flameRL);
  }
}
