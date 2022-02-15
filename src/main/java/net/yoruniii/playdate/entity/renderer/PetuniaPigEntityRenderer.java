package net.yoruniii.playdate.entity.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.yoruniii.playdate.entity.PetuniaPigEntity;
import net.yoruniii.playdate.entity.model.PetuniaPigEntityModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PetuniaPigEntityRenderer extends GeoEntityRenderer<PetuniaPigEntity> {
    public PetuniaPigEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new PetuniaPigEntityModel());
    }
}
