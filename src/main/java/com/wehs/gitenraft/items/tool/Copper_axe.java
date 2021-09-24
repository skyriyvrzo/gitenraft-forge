package com.wehs.gitenraft.items.tool;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class Copper_axe extends AxeItem {
    public Copper_axe(Properties PropertAxe) {
        //super(Properties, attackDamage, speedAttack, Properties)
        super(ItemCreate.Copper_Axe, 1, -3.2f, PropertAxe);   //Attack Damage// Base Sp Atk +4.0 Sp Atk
    }
    
	@Override
	public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
		Material material = p_150893_2_.getMaterial();
		return material != Material.METAL && material != Material.HEAVY_METAL && material != Material.WOOD ? super.getDestroySpeed(p_150893_1_, p_150893_2_) : this.speed * 1.75f;
		
	}
}
