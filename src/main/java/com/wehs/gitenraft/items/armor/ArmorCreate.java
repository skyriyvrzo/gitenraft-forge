package com.wehs.gitenraft.items.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ArmorCreate implements ArmorMaterial {
    Lether_Armor_Type("first", 10, new int[]{1, 2, 3, 1}, 5, 0.0f, 0.0f,
            SoundEvents.ARMOR_EQUIP_LEATHER, () -> {
        return Ingredient.of(Items.LEATHER);}),

    private static final int[] baseDurability = {100, 100, 100, 100};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] baseDefense;
    private final int enchantmentValue;
    private final float toughness;
    private final float knockbackResistance;
    private final SoundEvent equipSound;
    private final Ingredient itemRepair;

    ArmorCreate(String name, int durabilityMultiplier, int[] baseDefense, int enchantmentValue, float toughness, float knockbackResistance,
                SoundEvent equipSound, Supplier<Ingredient> itemRepair)
    {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.baseDefense = baseDefense;
        this.enchantmentValue = enchantmentValue;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.equipSound = equipSound;
        this.itemRepair = itemRepair.get();
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return baseDurability[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.baseDefense[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.itemRepair;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
