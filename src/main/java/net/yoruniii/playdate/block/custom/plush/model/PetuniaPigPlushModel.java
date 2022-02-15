package net.yoruniii.playdate.block.custom.plush.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.PetuniaPigPlushEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PetuniaPigPlushModel extends AnimatedGeoModel<PetuniaPigPlushEntity> {
    @Override
    public Identifier getModelLocation(PetuniaPigPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/petunia_pig_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(PetuniaPigPlushEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/petunia_pig_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(PetuniaPigPlushEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/petunia_pig_plush.animation.json");
    }

}
