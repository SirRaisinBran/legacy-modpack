package net.sirraisinbran.legacy.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.sirraisinbran.legacy.LegacyMod;
import net.sirraisinbran.legacy.block.LegacyBlocks;

import java.util.Random;

public class WetSoilBlock extends Block {

    protected static final VoxelShape SHAPE;
    protected static final VoxelShape COLLISION_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

    public WetSoilBlock(AbstractBlock.Settings settings) {
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

    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return !this.getDefaultState().canPlaceAt(ctx.getWorld(), ctx.getBlockPos()) ? Block.pushEntitiesUpBeforeBlockChange(this.getDefaultState(), LegacyBlocks.SOIL.getDefaultState(), ctx.getWorld(), ctx.getBlockPos()) : super.getPlacementState(ctx);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.UP && !state.canPlaceAt(world, pos)) {
            world.createAndScheduleBlockTick(pos, this, 1);
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!isWet(world, pos, state, true)){
            world.setBlockState(pos, LegacyBlocks.SOIL.getDefaultState());
        } else if (!world.getBlockState(pos.up()).isAir() && !world.getFluidState(pos.up()).isIn(FluidTags.WATER) && !world.getBlockState(pos.up()).isIn(LegacyMod.OW_FOLIAGE)){
            world.setBlockState(pos, LegacyBlocks.SOIL.getDefaultState());
        }
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return COLLISION_SHAPE;
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    static {
        SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    }
}
