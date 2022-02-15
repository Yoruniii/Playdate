package net.yoruniii.playdate.entity.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.yoruniii.playdate.entity.HappySunEntity;
import net.yoruniii.playdate.entity.LollipopClownEntity;
import net.yoruniii.playdate.entity.model.HappySunEntityModel;
import net.yoruniii.playdate.entity.model.LollipopClownEntityModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LollipopClownEntityRenderer extends GeoEntityRenderer<LollipopClownEntity> {
    public LollipopClownEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LollipopClownEntityModel());
    }
}
