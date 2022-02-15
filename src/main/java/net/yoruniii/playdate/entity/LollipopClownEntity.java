package net.yoruniii.playdate.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.MobNavigation;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.ModBlocks;
import net.yoruniii.playdate.block.custom.LollipopClownToy;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class LollipopClownEntity extends HostileEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public LollipopClownEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        ((MobNavigation)this.getNavigation()).setCanPathThroughDoors(true);
        this.ignoreCameraFrustum = true;
    }


    protected void initGoals() {
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.initCustomGoals();
    }

    protected void initCustomGoals() {
        this.goalSelector.add(2, new AttackGoal(this));
        this.goalSelector.add(6, new MoveThroughVillageGoal(this, 1.0D, true, 4, this::canBreakDoors));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0D));
        this.targetSelector.add(2, new ActiveTargetGoal(this, PlayerEntity.class, true));
    }

    public boolean canBreakDoors() {
        return true;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {

        if(event.isMoving())
        {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
            return PlayState.CONTINUE;
        }
        else
        {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("entity_idle", true));
            return PlayState.CONTINUE;
        }

    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void tick() {
        if(this.world.isDay()){
            this.kill();
        }

        super.tick();
    }

    @Override
    protected void onKilledBy(LivingEntity adversary) {
        BlockPos posEntity = new BlockPos(this.getBlockPos());
        if(this.dead && adversary == null){
            this.world.setBlockState(posEntity, Playdate.LOLLIPOP_CLOWN_TOY.getStateWithProperties(Playdate.LOLLIPOP_CLOWN_TOY.getDefaultState()).with(LollipopClownToy.POSSESSED, true));
        }
        super.onKilledBy(adversary);
    }
}
