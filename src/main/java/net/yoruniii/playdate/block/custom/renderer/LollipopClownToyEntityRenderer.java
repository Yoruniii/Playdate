package net.yoruniii.playdate.block.custom.renderer;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.yoruniii.playdate.block.custom.LollipopClownToyEntity;
import net.yoruniii.playdate.block.custom.model.LollipopClownToyEntityModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class LollipopClownToyEntityRenderer extends GeoBlockRenderer<LollipopClownToyEntity> {
    public LollipopClownToyEntityRenderer() {
        super(new LollipopClownToyEntityModel());
    }

}
