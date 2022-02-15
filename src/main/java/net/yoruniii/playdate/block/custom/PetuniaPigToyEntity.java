package net.yoruniii.playdate.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.entity.PetuniaPigEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class PetuniaPigToyEntity extends BlockEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public PetuniaPigToyEntity(BlockPos pos, BlockState state) {
        super(Playdate.PETUNIA_PIG_TOY_ENTITY, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, PetuniaPigToyEntity be) {
        boolean possessed = state.get(PetuniaPigToy.POSSESSED);
        if(world.isNight() && possessed)
        {
            world.removeBlock(pos, false);
            PetuniaPigEntity pig = new PetuniaPigEntity(Playdate.PETUNIA_PIG, world);
            world.spawnEntity(pig);
            pig.teleport(pos.getX(), pos.getY(), pos.getZ());
        }
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
