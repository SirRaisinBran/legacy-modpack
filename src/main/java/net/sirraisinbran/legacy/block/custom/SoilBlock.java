package net.sirraisinbran.legacy.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.sirraisinbran.legacy.LegacyMod;
import net.sirraisinbran.legacy.block.LegacyBlocks;

import java.util.Random;

public class SoilBlock extends Block {

    public SoilBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public boolean isWet(BlockView world, BlockPos pos, BlockState state, boolean isClient){
        return world.getFluidState(pos.north(1)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.west(1)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.south(1)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.east(1)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.up(1)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.down(1)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.north(2)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.west(2)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.south(2)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.east(2)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.up(2)).isIn(FluidTags.WATER)
                || world.getFluidState(pos.down(2)).isIn(FluidTags.WATER);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (isWet(world, pos, state, true) && (world.getBlockState(pos.up()).isAir() || world.getBlockState(pos.up()).isIn(LegacyMod.OW_FOLIAGE) || world.getFluidState(pos.up()).isIn(FluidTags.WATER))){
            world.setBlockState(pos, LegacyBlocks.WET_SOIL.getDefaultState());
        }
    }
}
