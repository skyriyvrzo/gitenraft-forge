package com.wehs.gitenraft;

import com.wehs.gitenraft.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GitenraftCreativeTab {
	   public static final CreativeModeTab NoteGroup = new NoteGroup("tab_note");
	   public static final CreativeModeTab GetGroup = new GetGroup("tab_get");


	    
		public static class NoteGroup extends CreativeModeTab {

			public NoteGroup(String string) {
				super("tab_note");
			}

			@Override
			public ItemStack makeIcon() {
	            return new ItemStack(ItemInit.Scitic_spear.get());
	            }
		};
		public static class GetGroup extends CreativeModeTab {

			public GetGroup(String string) {
				super("tab_get");
			}

			@Override
			public ItemStack makeIcon() {
	            return new ItemStack(ItemInit.pickaxeicon.get());
	            }
	    }
}
