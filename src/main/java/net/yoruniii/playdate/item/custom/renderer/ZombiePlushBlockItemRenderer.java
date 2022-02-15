package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.ZombiePlushBlockItem;
import net.yoruniii.playdate.item.custom.model.CreeperPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.ZombiePlushBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class ZombiePlushBlockItemRenderer extends GeoItemRenderer<ZombiePlushBlockItem> {
    public ZombiePlushBlockItemRenderer() {
        super(new ZombiePlushBlockItemModel());
    }
}
