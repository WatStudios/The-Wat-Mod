
package net.mcreator.watmodreborn.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SirKittyMakerBlock extends Block {
	public SirKittyMakerBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().mapColor(MapColor.COLOR_CYAN).sound(SoundType.WOOL).strength(0.05f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
