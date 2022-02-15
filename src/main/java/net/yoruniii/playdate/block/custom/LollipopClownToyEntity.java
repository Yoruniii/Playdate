package net.yoruniii.playdate.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.entity.LollipopClownEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class LollipopClownToyEntity extends BlockEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public LollipopClownToyEntity(BlockPos pos, BlockState state) {
        super(Playdate.LOLLIPOP_CLOWN_TOY_ENTITY, pos, state);
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

    public static void tick(World world, BlockPos pos, BlockState state, LollipopClownToyEntity be) {
        boolean possessed = state.get(LollipopClownToy.POSSESSED);
        if(world.isNight() && possessed)
        {
            world.removeBlock(pos, false);
            LollipopClownEntity clown = new LollipopClownEntity(Playdate.LOLLIPOP_CLOWN, world);
            world.spawnEntity(clown);
            clown.teleport(pos.getX(), pos.getY(), pos.getZ());
        }
    }

}
