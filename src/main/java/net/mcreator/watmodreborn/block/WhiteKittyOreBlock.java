
package net.mcreator.watmodreborn.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class WhiteKittyOreBlock extends Block {
	public WhiteKittyOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.4f, 0.01f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
