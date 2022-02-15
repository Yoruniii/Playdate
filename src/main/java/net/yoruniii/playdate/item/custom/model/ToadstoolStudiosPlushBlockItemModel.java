package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.ToadstoolStudiosPlushBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ToadstoolStudiosPlushBlockItemModel extends AnimatedGeoModel<ToadstoolStudiosPlushBlockItem> {
    @Override
    public Identifier getModelLocation(ToadstoolStudiosPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/toadstool_studios_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ToadstoolStudiosPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/toadstool_studios_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ToadstoolStudiosPlushBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/toadstool_studios_plush.animation.json");
    }
}
