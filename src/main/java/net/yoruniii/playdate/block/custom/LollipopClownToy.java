package net.yoruniii.playdate.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class LollipopClownToy extends BlockWithEntity{

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public static BooleanProperty POSSESSED = BooleanProperty.of("possessed");

    public LollipopClownToy(Settings settings) {
        super(settings.nonOpaque());
        this.setDefaultState(this.getDefaultState().with(POSSESSED, false));
    }

    public VoxelShape makeShape(){
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0, 0.25, 0.75, 2.5, 0.75));

        return shape;
    }
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, POSSESSED);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack item = player.getStackInHand(hand);
        boolean possessed = state.get(POSSESSED);
        if(item.getItem() == ModItems.BOTTLED_SOUL && !possessed)
        {
            ItemUsage.consumeHeldItem(world, player, hand);
            player.giveItemStack(new ItemStack(Items.GLASS_BOTTLE));
            world.setBlockState(pos, state.with(POSSESSED, true));
        }
        return ActionResult.CONSUME;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new LollipopClownToyEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, Playdate.LOLLIPOP_CLOWN_TOY_ENTITY, (world1, pos, state1, be) -> LollipopClownToyEntity.tick(world1, pos, state1, be));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.makeShape();
    }
}
