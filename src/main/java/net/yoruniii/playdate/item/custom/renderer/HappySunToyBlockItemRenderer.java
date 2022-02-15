package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.HappySunToyBlockItem;
import net.yoruniii.playdate.item.custom.model.CreeperPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.HappySunToyBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class HappySunToyBlockItemRenderer extends GeoItemRenderer<HappySunToyBlockItem> {
    public HappySunToyBlockItemRenderer() {
        super(new HappySunToyBlockItemModel());
    }
}
