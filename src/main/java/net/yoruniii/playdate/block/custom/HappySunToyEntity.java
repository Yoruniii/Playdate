package net.yoruniii.playdate.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.entity.HappySunEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class HappySunToyEntity extends BlockEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public HappySunToyEntity(BlockPos pos, BlockState state) {
        super(Playdate.HAPPY_SUN_TOY_ENTITY, pos, state);
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

    public static void tick(World world, BlockPos pos, BlockState state, HappySunToyEntity be) {
        boolean possessed = state.get(HappySunToy.POSSESSED);
        if(world.isNight() && possessed)
        {
            world.removeBlock(pos, false);
            HappySunEntity sun = new HappySunEntity(Playdate.HAPPY_SUN, world);
            world.spawnEntity(sun);
            sun.teleport(pos.getX(), pos.getY(), pos.getZ());
        }
    }

}
