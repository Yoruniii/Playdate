package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.LollipopClownPlushBlockItem;
import net.yoruniii.playdate.item.custom.model.DinoPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.LollipopClownPlushBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class LollipopClownPlushBlockItemRenderer extends GeoItemRenderer<LollipopClownPlushBlockItem> {
    public LollipopClownPlushBlockItemRenderer() {
        super(new LollipopClownPlushBlockItemModel());
    }
}
