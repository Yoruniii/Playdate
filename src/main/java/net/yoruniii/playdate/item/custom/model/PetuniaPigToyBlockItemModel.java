package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.PetuniaPigToyBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PetuniaPigToyBlockItemModel extends AnimatedGeoModel<PetuniaPigToyBlockItem> {
    @Override
    public Identifier getModelLocation(PetuniaPigToyBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/princess.geo.json");
    }

    @Override
    public Identifier getTextureLocation(PetuniaPigToyBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/petunia_pig_toy.png");
    }

    @Override
    public Identifier getAnimationFileLocation(PetuniaPigToyBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/petunia.animation.json");
    }
}
