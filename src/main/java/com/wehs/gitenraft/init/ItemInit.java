package com.wehs.gitenraft.init;

import com.wehs.gitenraft.items.tool.*;
import com.wehs.gitenraft.GitenraftMain;
import com.wehs.gitenraft.GitenraftCreativeTab;
import com.wehs.gitenraft.items.armor.ArmorCreate;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
// import item
import com.wehs.gitenraft.items.tool.Cop_sword;
import com.wehs.gitenraft.items.tool.Scitic_spear;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            GitenraftMain.MOD_ID);
    //tool
    public static final RegistryObject<Item> Scitic_spear = ITEMS.register("scitic_spear",
            () -> new Scitic_spear(new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));

    public static final RegistryObject<Item> Cop_sword = ITEMS.register("cop_sword",
            () -> new Cop_sword(new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));

    //new {
    public static final RegistryObject<Item> Singcet_sword = ITEMS.register("singcet_sword",
            () -> new Singcet_sword(new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));
    //new }

    public static final RegistryObject<Item> Emerald_pickaxe = ITEMS.register("emerald_pickaxe",
            () -> new Emerald_pickaxe(new Item.Properties().tab(GitenraftCreativeTab.GetGroup)));
    
    public static final RegistryObject<Item> Copper_sword = ITEMS.register("copper_sword", () -> new Copper_sword(new Item.Properties().tab(GitenraftCreativeTab.GetGroup)));
    public static final RegistryObject<Item> Copper_pickaxe = ITEMS.register("copper_pickaxe", () -> new Copper_pickaxe(new Item.Properties().tab(GitenraftCreativeTab.GetGroup)));
    public static final RegistryObject<Item> Copper_shovel = ITEMS.register("copper_shovel", () -> new Copper_shovel(new Item.Properties().tab(GitenraftCreativeTab.GetGroup)));
    public static final RegistryObject<Item> Copper_axe = ITEMS.register("copper_axe", () -> new Copper_axe(new Item.Properties().tab(GitenraftCreativeTab.GetGroup)));
    public static final RegistryObject<Item> Copper_hoe = ITEMS.register("copper_hoe", () -> new Copper_hoe(new Item.Properties().tab(GitenraftCreativeTab.GetGroup)));

    //armor
    public static final RegistryObject<Item> First_Chestplate = ITEMS.register("first_chestplate",
            () -> new ArmorItem(ArmorCreate.Lether_Armor_Type, EquipmentSlot.CHEST,
                    new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));

    public static final RegistryObject<Item> First_Leggings = ITEMS.register("first_leggings",
            () -> new ArmorItem(ArmorCreate.Lether_Armor_Type, EquipmentSlot.LEGS,
                    new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));

    public static final RegistryObject<Item> First_Boots = ITEMS.register("first_boots",
            ()-> new ArmorItem(ArmorCreate.Lether_Armor_Type, EquipmentSlot.FEET,
                    new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));
        //glaeese
    public static final RegistryObject<Item> Glasses = ITEMS.register("glasses",
            () -> new ArmorItem(ArmorCreate.Glasses, EquipmentSlot.HEAD,
                     new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));

    public static final RegistryObject<Item> BigGlasses = ITEMS.register("big_glasses",
            () -> new ArmorItem(ArmorCreate.GlassesB, EquipmentSlot.HEAD,
                    new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));

    public static final RegistryObject<Item> BigGlasses1 = ITEMS.register("big_glasses1",
            () -> new ArmorItem(ArmorCreate.GlassesB1, EquipmentSlot.HEAD,
                    new Item.Properties().tab(GitenraftCreativeTab.NoteGroup)));
    
    
    //creativetab icon
    public static final RegistryObject<Item> pickaxeicon = ITEMS.register("pickaxe_icon", ()-> new  Item(new Item.Properties().stacksTo(512)));

    
    public static final RegistryObject<SpawnEggItem> IRON_GOLEM_SPAWN_EGG = ITEMS.register("iron_golem_spawn_egg", () -> new SpawnEggItem(EntityType.IRON_GOLEM, 12960449, 16769484, new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(GitenraftCreativeTab.SpawnEggGroup)));
    public static final RegistryObject<SpawnEggItem> SNOW_GOLEM_SPAWN_EGG = ITEMS.register("snow_golem_spawn_egg", () -> new SpawnEggItem(EntityType.SNOW_GOLEM, 15663103, 16753185, new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(GitenraftCreativeTab.SpawnEggGroup)));
    public static final RegistryObject<SpawnEggItem> ILLUSIONER_SPAWN_EGG = ITEMS.register("illusioner_spawn_egg", () -> new SpawnEggItem(EntityType.ILLUSIONER, 9804699, 4547222, new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(GitenraftCreativeTab.SpawnEggGroup)));
    public static final RegistryObject<SpawnEggItem> WITHER_SPAWN_EGG = ITEMS.register("wither_spawn_egg", () -> new SpawnEggItem(EntityType.WITHER, 9914699, 4657222, new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(GitenraftCreativeTab.SpawnEggGroup)));
    public static final RegistryObject<SpawnEggItem> ENDER_DRAGON_SPAWN_EGG = ITEMS.register("ender_dragon_spawn_egg", () -> new SpawnEggItem(EntityType.ENDER_DRAGON, 9904699, 4647222, new Item.Properties().tab(CreativeModeTab.TAB_MISC).tab(GitenraftCreativeTab.SpawnEggGroup)));

}
