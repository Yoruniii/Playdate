package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.HappySunToyBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HappySunToyBlockItemModel extends AnimatedGeoModel<HappySunToyBlockItem> {
    @Override
    public Identifier getModelLocation(HappySunToyBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/happy_sun_toy.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HappySunToyBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/happy_sun_toy.png");
    }

    @Override
    public Identifier getAnimationFileLocation(HappySunToyBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/happy_sun.animation.json");
    }
}
