package com.wehs.gitenraft.init;

import com.wehs.gitenraft.GitenraftMain;
import com.wehs.gitenraft.GitenraftCreativeTab;
import com.wehs.gitenraft.items.armor.ArmorCreate;
import com.wehs.gitenraft.items.tool.Emerald_pickaxe;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
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
    public static final RegistryObject<Item> Emerald_pickaxe = ITEMS.register("emerald_pickaxe",
            () -> new Emerald_pickaxe(new Item.Properties().tab(GitenraftCreativeTab.GetGroup)));

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
    
    //ore
    public static final RegistryObject<Item> Emerald_Ingot = ITEMS.register("emerald_ingot", () -> new Item(new Item.Properties().tab(GitenraftCreativeTab.GetGroup)));
    
    
    //creativetab icon
    public static final RegistryObject<Item> pickaxeicon = ITEMS.register("pickaxe_icon", ()-> new  Item(new Item.Properties().stacksTo(512)));

}
