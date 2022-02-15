package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.WheeliePupBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WheeliePupBlockItemModel extends AnimatedGeoModel<WheeliePupBlockItem> {
    @Override
    public Identifier getModelLocation(WheeliePupBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/wheelie_pup.geo.json");
    }

    @Override
    public Identifier getTextureLocation(WheeliePupBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/wheelie_pup.png");
    }

    @Override
    public Identifier getAnimationFileLocation(WheeliePupBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/wheelie_pup.animation.json");
    }
}
