package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.ToadstoolStudiosPlushBlockItem;
import net.yoruniii.playdate.item.custom.model.DinoPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.ToadstoolStudiosPlushBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ToadstoolStudiosPlushBlockItemRenderer extends GeoItemRenderer<ToadstoolStudiosPlushBlockItem> {
    public ToadstoolStudiosPlushBlockItemRenderer() {
        super(new ToadstoolStudiosPlushBlockItemModel());
    }
}
