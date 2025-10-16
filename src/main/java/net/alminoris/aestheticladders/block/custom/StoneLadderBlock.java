package net.alminoris.aestheticladders.block.custom;

import net.alminoris.aestheticladders.util.helper.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class StoneLadderBlock extends Block implements SimpleWaterloggedBlock
{
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final BooleanProperty MOSSED = BooleanProperty.create("mossed");

    private static final VoxelShape SHAPE = StoneLadderBlock.box(0, 0, 5, 16, 16, 11);

    public StoneLadderBlock()
    {
        super(BlockBehaviour.Properties.copy(Blocks.STONE));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(MOSSED, false));
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos,
                                              Player player, InteractionHand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getItemInHand(hand);

        boolean currentMossed = state.getValue(MOSSED);
        Direction currentFacing = state.getValue(FACING);

        if (stack.getItem() == Blocks.VINE.asItem() && !currentMossed)
        {
            if (!world.isClientSide)
            {
                currentMossed = true;

                world.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(MOSSED, currentMossed), 3);

                stack.shrink(1);
            }

            return InteractionResult.SUCCESS;
        }

        if (stack.getItem() == Items.SHEARS && currentMossed)
        {
            if (!world.isClientSide)
            {
                currentMossed = false;

                world.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(MOSSED, currentMossed), 3);

                stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            }

            return InteractionResult.SUCCESS;
        }

        return super.use(state, world, pos, player, hand, hit);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.getValue(FACING);

        List<AABB> boxes = new ArrayList<>();
        boxes.add(SHAPE.bounds());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, MOSSED);
    }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }
}