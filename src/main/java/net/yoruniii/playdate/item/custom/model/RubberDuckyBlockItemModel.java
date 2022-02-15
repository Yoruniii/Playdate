package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.RubberDuckyBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RubberDuckyBlockItemModel extends AnimatedGeoModel<RubberDuckyBlockItem> {
    @Override
    public Identifier getModelLocation(RubberDuckyBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/rubber_ducky.geo.json");
    }

    @Override
    public Identifier getTextureLocation(RubberDuckyBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/rubber_ducky.png");
    }

    @Override
    public Identifier getAnimationFileLocation(RubberDuckyBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/rubber_ducky.animation.json");
    }
}
