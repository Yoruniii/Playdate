package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.ToadstoolStudiosPlush;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.ToadstoolStudiosPlushEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ToadstoolStudiosPlushModel extends AnimatedGeoModel<ToadstoolStudiosPlushEntity> {
    @Override
    public Identifier getModelLocation(ToadstoolStudiosPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/toadstool_studios_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ToadstoolStudiosPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/toadstool_studios_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ToadstoolStudiosPlushEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/toadstool_studios_plush.animation.json");
    }

}
