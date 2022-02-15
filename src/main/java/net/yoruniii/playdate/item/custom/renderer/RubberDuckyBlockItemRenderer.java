package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.RubberDuckyBlockItem;
import net.yoruniii.playdate.item.custom.model.DinoPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.RubberDuckyBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class RubberDuckyBlockItemRenderer extends GeoItemRenderer<RubberDuckyBlockItem> {
    public RubberDuckyBlockItemRenderer() {
        super(new RubberDuckyBlockItemModel());
    }
}
