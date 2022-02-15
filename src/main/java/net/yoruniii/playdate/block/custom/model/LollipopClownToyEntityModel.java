package net.yoruniii.playdate.block.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.LollipopClownToyEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LollipopClownToyEntityModel extends AnimatedGeoModel<LollipopClownToyEntity> {
    @Override
    public Identifier getModelLocation(LollipopClownToyEntity object) {
        return new Identifier(Playdate.MOD_ID, "geo/lollipop_clown.geo.json");
    }

    @Override
    public Identifier getTextureLocation(LollipopClownToyEntity object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/lollipop_clown_toy.png");
    }

    @Override
    public Identifier getAnimationFileLocation(LollipopClownToyEntity animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/lollipop_clown.animation.json");
    }


}
