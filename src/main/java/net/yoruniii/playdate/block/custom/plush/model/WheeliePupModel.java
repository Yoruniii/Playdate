package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.WheeliePupEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WheeliePupModel extends AnimatedGeoModel<WheeliePupEntity> {
    @Override
    public Identifier getModelLocation(WheeliePupEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/wheelie_pup.geo.json");
    }

    @Override
    public Identifier getTextureLocation(WheeliePupEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/wheelie_pup.png");
    }

    @Override
    public Identifier getAnimationFileLocation(WheeliePupEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/wheelie_pup.animation.json");
    }

}
