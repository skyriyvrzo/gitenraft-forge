package com.wehs.gitenraft.items.tool;

import net.minecraft.world.item.PickaxeItem;

public class Emerald_pickaxe extends PickaxeItem {
    public Emerald_pickaxe(Properties PropertPickaxe) {
        //super(Properties, attackDamage, speedAttack, Properties)
        super(ItemCreate.Emerald_Pickaxe, -1, -2.8f, PropertPickaxe);   // Base AD +6.0 AD// Base AS +4.0 AS
    }
}
