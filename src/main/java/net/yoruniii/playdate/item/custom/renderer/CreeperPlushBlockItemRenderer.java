package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.model.CreeperPlushBlockItemModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class CreeperPlushBlockItemRenderer extends GeoItemRenderer<CreeperPlushBlockItem> {
    public CreeperPlushBlockItemRenderer() {
        super(new CreeperPlushBlockItemModel());
    }
}
