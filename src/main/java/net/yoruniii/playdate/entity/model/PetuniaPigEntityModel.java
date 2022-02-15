package net.yoruniii.playdate.entity.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.entity.PetuniaPigEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PetuniaPigEntityModel extends AnimatedGeoModel<PetuniaPigEntity> {
    @Override
    public Identifier getModelLocation(PetuniaPigEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/princess.geo.json");
    }

    @Override
    public Identifier getTextureLocation(PetuniaPigEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/entity/possessed_petunia_pig.png");
    }

    @Override
    public Identifier getAnimationFileLocation(PetuniaPigEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/petunia.animation.json");
    }
}
