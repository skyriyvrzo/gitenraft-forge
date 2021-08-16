package com.wehs.gitenraft.items.tool;

import net.minecraft.world.item.PickaxeItem;

public class Emerald_pickaxe extends PickaxeItem {
    public Emerald_pickaxe(Properties PropertPickaxe) {
        //super(Properties, attackDamage, speedAttack, Properties)
        super(ItemCreate.High_Pickaxe, -3, -2, PropertPickaxe);
    }
}
