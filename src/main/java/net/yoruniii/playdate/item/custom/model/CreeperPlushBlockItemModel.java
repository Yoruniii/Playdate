package net.yoruniii.playdate.item.custom.model;

import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.plush.be.CreeperPlushEntity;
import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CreeperPlushBlockItemModel extends AnimatedGeoModel<CreeperPlushBlockItem> {
    @Override
    public Identifier getModelLocation(CreeperPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "geo/creeper_plush.geo.json");
    }

    @Override
    public Identifier getTextureLocation(CreeperPlushBlockItem object) {
        return new Identifier(Playdate.MOD_ID, "textures/block/creeper_plush.png");
    }

    @Override
    public Identifier getAnimationFileLocation(CreeperPlushBlockItem animatable) {
        return new Identifier(Playdate.MOD_ID, "animations/creeper_plush.animation.json");
    }
}
