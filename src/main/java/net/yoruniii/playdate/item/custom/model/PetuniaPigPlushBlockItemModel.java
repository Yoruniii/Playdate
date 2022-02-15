package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.item.custom.EndermanPlushBlockItem;
import net.yoruniii.playdate.item.custom.PetuniaPigPlushBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PetuniaPigPlushBlockItemModel extends AnimatedGeoModel<PetuniaPigPlushBlockItem> {
    @Override
    public Identifier getModelLocation(PetuniaPigPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/petunia_pig_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(PetuniaPigPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/petunia_pig_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(PetuniaPigPlushBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/petunia_pig_plush.animation.json");
    }
}
