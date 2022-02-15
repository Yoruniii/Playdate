package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.HappySunPlushEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HappySunPlushModel extends AnimatedGeoModel<HappySunPlushEntity> {
    @Override
    public Identifier getModelLocation(HappySunPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/happy_sun_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HappySunPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/happy_sun_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(HappySunPlushEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/happy_sun_plush.animation.json");
    }

}
