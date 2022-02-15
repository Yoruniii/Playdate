package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.HappySunPlushBlockItem;
import net.yoruniii.playdate.item.custom.PetuniaPigPlushBlockItem;
import net.yoruniii.playdate.item.custom.model.HappySunPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.PetuniaPigPlushBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PetuniaPigPlushBlockItemRenderer extends GeoItemRenderer<PetuniaPigPlushBlockItem> {
    public PetuniaPigPlushBlockItemRenderer() {
        super(new PetuniaPigPlushBlockItemModel());
    }
}
