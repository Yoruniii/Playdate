package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.WheeliePupBlockItem;
import net.yoruniii.playdate.item.custom.ZombiePlushBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ZombiePlushBlockItemModel extends AnimatedGeoModel<ZombiePlushBlockItem> {
    @Override
    public Identifier getModelLocation(ZombiePlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/zombie_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ZombiePlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/zombie_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ZombiePlushBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/zombie_plush.animation.json");
    }
}
