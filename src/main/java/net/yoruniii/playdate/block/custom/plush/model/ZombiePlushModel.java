package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.CreeperPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.ZombiePlushEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ZombiePlushModel extends AnimatedGeoModel<ZombiePlushEntity> {
    @Override
    public Identifier getModelLocation(ZombiePlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/zombie_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ZombiePlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/zombie_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ZombiePlushEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/zombie_plush.animation.json");
    }

}
