package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.EndermanPlushEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EndermanPlushModel extends AnimatedGeoModel<EndermanPlushEntity> {
    @Override
    public Identifier getModelLocation(EndermanPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/enderman_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(EndermanPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/enderman_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(EndermanPlushEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/enderman_plush.animation.json");
    }

}
