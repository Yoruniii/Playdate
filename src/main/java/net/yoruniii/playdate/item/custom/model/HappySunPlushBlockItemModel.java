package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.HappySunPlushBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HappySunPlushBlockItemModel extends AnimatedGeoModel<HappySunPlushBlockItem> {
    @Override
    public Identifier getModelLocation(HappySunPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/happy_sun_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HappySunPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/happy_sun_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(HappySunPlushBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/happy_sun_plush.animation.json");
    }
}
