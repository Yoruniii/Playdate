package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.WheeliePupBlockItem;
import net.yoruniii.playdate.item.custom.model.DinoPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.WheeliePupBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class WheeliePupBlockItemRenderer extends GeoItemRenderer<WheeliePupBlockItem> {
    public WheeliePupBlockItemRenderer() {
        super(new WheeliePupBlockItemModel());
    }
}
