package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.LollipopClownPlushEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LollipopClownPlushModel extends AnimatedGeoModel<LollipopClownPlushEntity> {
    @Override
    public Identifier getModelLocation(LollipopClownPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/lollipop_clown_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(LollipopClownPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/lollipop_clown_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(LollipopClownPlushEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/lollipop_clown_plush.animation.json");
    }

}
