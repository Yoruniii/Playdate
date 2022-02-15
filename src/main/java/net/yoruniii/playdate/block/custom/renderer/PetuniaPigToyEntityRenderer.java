package net.yoruniii.playdate.block.custom.renderer;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.yoruniii.playdate.block.custom.PetuniaPigToyEntity;
import net.yoruniii.playdate.block.custom.model.PetuniaPigToyEntityModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class PetuniaPigToyEntityRenderer extends GeoBlockRenderer<PetuniaPigToyEntity> {
    public PetuniaPigToyEntityRenderer() {
        super(new PetuniaPigToyEntityModel());
    }

    @Override
    public RenderLayer getRenderType(PetuniaPigToyEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }


}
