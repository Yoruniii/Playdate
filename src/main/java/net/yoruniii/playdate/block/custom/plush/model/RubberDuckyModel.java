package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.RubberDuckyEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RubberDuckyModel extends AnimatedGeoModel<RubberDuckyEntity> {
    @Override
    public Identifier getModelLocation(RubberDuckyEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/rubber_ducky.geo.json");
    }

    @Override
    public Identifier getTextureLocation(RubberDuckyEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/rubber_ducky.png");
    }

    @Override
    public Identifier getAnimationFileLocation(RubberDuckyEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/rubber_ducky.animation.json");
    }

}
