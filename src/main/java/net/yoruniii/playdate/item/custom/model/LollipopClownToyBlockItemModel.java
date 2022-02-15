package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.LollipopClownToyBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LollipopClownToyBlockItemModel extends AnimatedGeoModel<LollipopClownToyBlockItem> {
    @Override
    public Identifier getModelLocation(LollipopClownToyBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/lollipop_clown.geo.json");
    }

    @Override
    public Identifier getTextureLocation(LollipopClownToyBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/lollipop_clown_toy.png");
    }

    @Override
    public Identifier getAnimationFileLocation(LollipopClownToyBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/lollipop_clown.animation.json");
    }
}
