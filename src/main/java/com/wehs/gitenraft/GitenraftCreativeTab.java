package com.wehs.gitenraft;

import com.wehs.gitenraft.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GitenraftCreativeTab {
	   public static final CreativeModeTab NoteGroup = new NoteGroup("tab_note");
	   public static final CreativeModeTab GetGroup = new GetGroup("tab_get");
	   public static final CreativeModeTab SpawnEggGroup = new SpawnEggGroup("tab_spawnegg");


	    
		public static class NoteGroup extends CreativeModeTab {

			public NoteGroup(String tab1) {
				super("tab_note");
			}

			@Override
			public ItemStack makeIcon() {
	            return new ItemStack(ItemInit.Scitic_spear.get());
	            }
		};
		public static class GetGroup extends CreativeModeTab {

			public GetGroup(String tab2) {
				super("tab_get");
			}

			@Override
			public ItemStack makeIcon() {
	            return new ItemStack(ItemInit.pickaxeicon.get());
	            }
	    };
		public static class SpawnEggGroup extends CreativeModeTab {

			public SpawnEggGroup(String tab3) {
				super("tab_spawnegg");
			}

			@Override
			public ItemStack makeIcon() {
	            return new ItemStack(ItemInit.SNOW_GOLEM_SPAWN_EGG.get());
	            }
	    }
}
