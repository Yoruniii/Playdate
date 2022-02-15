package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.CreeperPlushEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CreeperPlushModel extends AnimatedGeoModel<CreeperPlushEntity> {
    @Override
    public Identifier getModelLocation(CreeperPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/creeper_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(CreeperPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/creeper_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(CreeperPlushEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/creeper_plush.animation.json");
    }

}
