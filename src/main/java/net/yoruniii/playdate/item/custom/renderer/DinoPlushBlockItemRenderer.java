package net.yoruniii.playdate.item.custom.renderer;

import net.yoruniii.playdate.item.custom.CreeperPlushBlockItem;
import net.yoruniii.playdate.item.custom.DinoPlushBlockItem;
import net.yoruniii.playdate.item.custom.model.CreeperPlushBlockItemModel;
import net.yoruniii.playdate.item.custom.model.DinoPlushBlockItemModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class DinoPlushBlockItemRenderer extends GeoItemRenderer<DinoPlushBlockItem> {
    public DinoPlushBlockItemRenderer() {
        super(new DinoPlushBlockItemModel());
    }
}
