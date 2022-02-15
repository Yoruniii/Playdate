package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DinoPlushBlockItemModel extends AnimatedGeoModel<DinoPlushBlockItem> {
    @Override
    public Identifier getModelLocation(DinoPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/dino_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(DinoPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/dino_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(DinoPlushBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/dino_plush.animation.json");
    }
}
