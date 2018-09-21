package com.wompking.mod_simply.pads;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ParticleEmitter extends Particle {
    private final Entity attachedEntity;
    private int age;
    private final int lifetime;

    public ParticleEmitter(World world, Entity entity, int lifetime) {
        super(world, entity.posX, entity.getEntityBoundingBox().minY + (double) (entity.height / 2.0F), entity.posZ, entity.motionX, entity.motionY, entity.motionZ);
        this.attachedEntity = entity;
        this.lifetime = lifetime;
        this.onUpdate();
    }

    /**
     * Renders the particle
     */
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
    }

    public void onUpdate() {
        if (this.rand.nextFloat() > 0.7) {
            float a = this.rand.nextFloat() * ((float)Math.PI * 2F);
            float r = this.rand.nextFloat() + 1;
            float dx = MathHelper.cos(a) * r;
            float dz = MathHelper.sin(a) * r;

            FlameParticle newEffect = new FlameParticle(this.world, this.attachedEntity.posX + (double)dx, this.attachedEntity.posY + 1, this.attachedEntity.posZ + (double)dz, 0.0D, 0.2D, 0.0D);
            Minecraft.getMinecraft().effectRenderer.addEffect(newEffect);
        }

        if (++this.age >= this.lifetime) {
            this.setExpired();
        }
    }

    /**
     * Retrieve what effect layer (what texture) the particle should be rendered with. 0 for the particle sprite sheet,
     * 1 for the main Texture atlas, and 3 for a custom texture
     */
    public int getFXLayer() {
        return 3;
    }
}