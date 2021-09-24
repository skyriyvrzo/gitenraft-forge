package com.wehs.gitenraft.items.tool;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class Copper_hoe extends HoeItem {
    public Copper_hoe(Properties PropertHoe) {
        //super(Properties, attackDamage, speedAttack, Properties)
        super(ItemCreate.Copper_Axe, 1, -1.5f, PropertHoe);   // Base AD +6.0 AD [can not change ]// Base Sp Atk +4.0 Sp Atk
    }
    
	@Override
	public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
		Material material = p_150893_2_.getMaterial();
		return material != Material.METAL && material != Material.HEAVY_METAL && material != Material.LEAVES ? super.getDestroySpeed(p_150893_1_, p_150893_2_) : this.speed * 1.75f;
		
	}
}
