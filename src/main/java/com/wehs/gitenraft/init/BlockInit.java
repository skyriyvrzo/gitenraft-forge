package com.wehs.gitenraft.init;

import com.wehs.gitenraft.GitenraftMain;

import com.wehs.gitenraft.blocks.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GitenraftMain.MOD_ID);

	
	public static final RegistryObject<Block> usb_charger = BLOCKS.register("usb_charger", () -> new usb_charger(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)
			.requiresCorrectToolForDrops()
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(0)
			.strength(0.4f)
			.lightLevel(value -> 6)
			.sound(SoundType.METAL)));
}