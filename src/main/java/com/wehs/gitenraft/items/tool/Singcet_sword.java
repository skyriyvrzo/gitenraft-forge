package com.wehs.gitenraft.items.tool;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.Level;

public class Singcet_sword extends SwordItem {
    public Singcet_sword(Properties FeatSword1) {
        super(ItemCreate.Feathery_Sword, -3, -2, FeatSword1);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn){
        double playerX = playerIn.getX();
        double playerY = playerIn.getY();
        double playerZ = playerIn.getZ();
        playerIn.getCooldowns().addCooldown(this, 600);
        worldIn.playSound(playerIn, playerX, playerY, playerZ, SoundEvents.BLAZE_DEATH, SoundSource.AMBIENT, 1.0f,1.0f);
        worldIn.addParticle(ParticleTypes.EXPLOSION.getType(), playerX, playerY, playerZ, 0.0D, 0.0D, 0.0D);
        playerIn.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,200,1));
        return super.use(worldIn, playerIn, handIn);
    }
}
