package net.yoruniii.playdate.entity.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.entity.HappySunEntity;
import net.yoruniii.playdate.entity.LollipopClownEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LollipopClownEntityModel extends AnimatedGeoModel<LollipopClownEntity> {
    @Override
    public Identifier getModelLocation(LollipopClownEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/lollipop_clown.geo.json");
    }

    @Override
    public Identifier getTextureLocation(LollipopClownEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/entity/lollipop_clown_possessed.png");
    }

    @Override
    public Identifier getAnimationFileLocation(LollipopClownEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/lollipop_clown.animation.json");
    }
}
