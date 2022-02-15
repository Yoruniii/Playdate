package net.yoruniii.playdate.block.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.HappySunToyEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HappySunToyEntityModel extends AnimatedGeoModel<HappySunToyEntity> {
    @Override
    public Identifier getModelLocation(HappySunToyEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/happy_sun_toy.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HappySunToyEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/happy_sun_toy.png");
    }

    @Override
    public Identifier getAnimationFileLocation(HappySunToyEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/happy_sun.animation.json");
    }


}
