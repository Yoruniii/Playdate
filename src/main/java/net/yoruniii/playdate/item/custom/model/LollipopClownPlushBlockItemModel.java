package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.LollipopClownPlushBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LollipopClownPlushBlockItemModel extends AnimatedGeoModel<LollipopClownPlushBlockItem> {
    @Override
    public Identifier getModelLocation(LollipopClownPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/lollipop_clown_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(LollipopClownPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/lollipop_clown_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(LollipopClownPlushBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/lollipop_clown_plush.animation.json");
    }
}
