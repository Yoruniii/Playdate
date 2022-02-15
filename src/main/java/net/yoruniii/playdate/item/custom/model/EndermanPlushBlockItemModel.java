package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.EndermanPlushBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EndermanPlushBlockItemModel extends AnimatedGeoModel<EndermanPlushBlockItem> {
    @Override
    public Identifier getModelLocation(EndermanPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/enderman_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(EndermanPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/enderman_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(EndermanPlushBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/enderman_plush.animation.json");
    }
}
