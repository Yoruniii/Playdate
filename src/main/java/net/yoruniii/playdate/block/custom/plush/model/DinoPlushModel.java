package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.CreeperPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DinoPlushModel extends AnimatedGeoModel<DinoPlushEntity> {
    @Override
    public Identifier getModelLocation(DinoPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/dino_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(DinoPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/dino_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(DinoPlushEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/dino_plush.animation.json");
    }

}
