package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.PetuniaPigToyBlockItem;
import net.yoruniii.playdate.item.custom.model.CreeperPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.PetuniaPigToyBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PetuniaPigToyBlockItemRenderer extends GeoItemRenderer<PetuniaPigToyBlockItem> {
    public PetuniaPigToyBlockItemRenderer() {
        super(new PetuniaPigToyBlockItemModel());
    }
}
