package com.wehs.gitenraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class usb_charger extends Block {
   public usb_charger(BlockBehaviour.Properties p_55206_) {
      super(p_55206_);
   }

   public boolean isSignalSource(BlockState p_55213_) {
      return true;
   }

   public int getSignal(BlockState p_55208_, BlockGetter p_55209_, BlockPos p_55210_, Direction p_55211_) {
      return 15;
   }
}