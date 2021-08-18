package com.wehs.gitenraft.items.tool;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.Level;

public class Scitic_spear extends PickaxeItem {
    public Scitic_spear(Properties PropertSpear1) {
        //super(ItemTier, attackDamage, speedAttack, Properties)
        super(ItemCreate.Spear, 4, -3, PropertSpear1);
    }
    //use is check right_click item of player
    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn){
        playerIn.getCooldowns().addCooldown(this, 1200);
        playerIn.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200,1));;
        return super.use(worldIn, playerIn, handIn);
    }
}
