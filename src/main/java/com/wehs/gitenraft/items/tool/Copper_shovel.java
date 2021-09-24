package com.wehs.gitenraft.items.tool;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class Copper_shovel extends ShovelItem {
    public Copper_shovel(Properties PropertShovel) {
        //super(Properties, attackDamage, speedAttack, Properties)
        super(ItemCreate.Copper_Shovel, 1, -2.8f, PropertShovel);   //Attack Damage// Base Sp Atk +4.0 Sp Atk
    }
    
	@Override
	public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
		Material material = p_150893_2_.getMaterial();
		return material != Material.METAL && material != Material.HEAVY_METAL && material != Material.DIRT ? super.getDestroySpeed(p_150893_1_, p_150893_2_) : this.speed * 1.75f;
		
	}
}
