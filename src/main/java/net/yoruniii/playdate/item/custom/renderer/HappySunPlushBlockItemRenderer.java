package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.HappySunPlushBlockItem;
import net.yoruniii.playdate.item.custom.model.DinoPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.HappySunPlushBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class HappySunPlushBlockItemRenderer extends GeoItemRenderer<HappySunPlushBlockItem> {
    public HappySunPlushBlockItemRenderer() {
        super(new HappySunPlushBlockItemModel());
    }
}
