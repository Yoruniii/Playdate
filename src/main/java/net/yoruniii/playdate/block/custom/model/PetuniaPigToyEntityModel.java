package net.yoruniii.playdate.block.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.PetuniaPigToyEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PetuniaPigToyEntityModel extends AnimatedGeoModel<PetuniaPigToyEntity> {
    @Override
    public Identifier getModelLocation(PetuniaPigToyEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/princess.geo.json");
    }

    @Override
    public Identifier getTextureLocation(PetuniaPigToyEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/petunia_pig_toy.png");
    }

    @Override
    public Identifier getAnimationFileLocation(PetuniaPigToyEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/petunia.animation.json");
    }
}
