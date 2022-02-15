package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.EndermanPlushBlockItem;
import net.yoruniii.playdate.item.custom.model.DinoPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.EndermanPlushBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class EndermanPlushBlockItemRenderer extends GeoItemRenderer<EndermanPlushBlockItem> {
    public EndermanPlushBlockItemRenderer() {
        super(new EndermanPlushBlockItemModel());
    }
}
