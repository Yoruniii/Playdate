package net.yoruniii.playdate.entity.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.yoruniii.playdate.entity.HappySunEntity;
import net.yoruniii.playdate.entity.PetuniaPigEntity;
import net.yoruniii.playdate.entity.model.HappySunEntityModel;
import net.yoruniii.playdate.entity.model.PetuniaPigEntityModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HappySunEntityRenderer extends GeoEntityRenderer<HappySunEntity> {
    public HappySunEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new HappySunEntityModel());
    }
}
