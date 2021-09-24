package com.wehs.gitenraft.items.tool;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class Emerald_pickaxe extends PickaxeItem {
    public Emerald_pickaxe(Properties PropertPickaxe) {
        //super(Properties, attackDamage, speedAttack, Properties)
        super(ItemCreate.Emerald_Pickaxe, 1, -2.8f, PropertPickaxe);   // Attack Damage// Base Sp Atk +4.0 Sp Atk
    }
    
	@Override
	public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
		Material material = p_150893_2_.getMaterial();
		return material != Material.METAL && material != Material.HEAVY_METAL && material != Material.STONE ? super.getDestroySpeed(p_150893_1_, p_150893_2_) : this.speed * 4;
		
	}
}
