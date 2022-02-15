package net.yoruniii.playdate.entity.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.entity.HappySunEntity;
import net.yoruniii.playdate.entity.PetuniaPigEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HappySunEntityModel extends AnimatedGeoModel<HappySunEntity> {
    @Override
    public Identifier getModelLocation(HappySunEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/happy_sun.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HappySunEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/entity/happy_sun_possessed.png");
    }

    @Override
    public Identifier getAnimationFileLocation(HappySunEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/happy_sun.animation.json");
    }
}
