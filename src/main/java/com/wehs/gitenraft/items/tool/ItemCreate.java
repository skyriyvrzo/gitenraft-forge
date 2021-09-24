package com.wehs.gitenraft.items.tool;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import java.util.function.Supplier;

public enum ItemCreate implements Tier {

    Spear(2, 500, 3.0f, 5.0f, 10,
            ()->{return Ingredient.of(Items.IRON_INGOT);}),   // ToolLevel/Durability/AttackSpeed/AttackDamage[+2 Bonus AD]/enchantmentValue/Item use Repair

    Feathery_Sword(2, 350, 3.0f, 5.0f, 3,
            ()->{return Ingredient.of(Items.IRON_INGOT);}),
    High_Pickaxe(5, 500, 3.0f, 5.0f, 3,
            () ->{return null;}),
	
    Emerald_Pickaxe(5, 3072, 3.0f, 5.0f, 3, () ->{return Ingredient.of(Items.EMERALD);}),  
    Copper_Pickaxe(2, 203, 3.0f, 1.5f, 4, () ->{return Ingredient.of(Items.COPPER_INGOT);}), // ToolLevel/Durability/AttackSpeed/AttackDamage[+2 Bonus AD / Sword +1 Bonus AD]/enchantmentValue/Item use Repair
    Copper_Shovel(2, 203, 3.0f, 2.0f, 4, () ->{return Ingredient.of(Items.COPPER_INGOT);}),
    Copper_Axe(2, 203, 3.0f, 7.0f, 4, () ->{return Ingredient.of(Items.COPPER_INGOT);}),
    Copper_Sword(2, 203, 3.0f, 5.5f, 4, () ->{return Ingredient.of(Items.COPPER_INGOT);}),
    Copper_Hoe(2, 203, 3.0f, -1.0f, 4, () ->{return Ingredient.of(Items.COPPER_INGOT);});






    private final int toolLevel;
    private final int maxUses;
    private final float attackSpeed;
    private final float attackDamage;
    private final int enchantmentValue;
    private final Ingredient itemRepair;

    private ItemCreate(int toolLevel, int maxUses, float attackSpeed, float attackDamage, int enchantmentValue,
                       Supplier<Ingredient> itemRepairID)
    {
        this.toolLevel = toolLevel;
        this.maxUses = maxUses;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        this.enchantmentValue = enchantmentValue;
        this.itemRepair = itemRepairID.get();
    }

    public int getUses() {
        return this.maxUses;
    }
    public float getSpeed() {
        return this.attackSpeed;
    }
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }
    public int getLevel() {
        return this.toolLevel;
    }
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }
    public Ingredient getRepairIngredient() {
        return this.itemRepair;
    }
}
