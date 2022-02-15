package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.LollipopClownToyBlockItem;
import net.yoruniii.playdate.item.custom.model.CreeperPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.LollipopClownToyBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class LollipopClownToyBlockItemRenderer extends GeoItemRenderer<LollipopClownToyBlockItem> {
    public LollipopClownToyBlockItemRenderer() {
        super(new LollipopClownToyBlockItemModel());
    }
}
