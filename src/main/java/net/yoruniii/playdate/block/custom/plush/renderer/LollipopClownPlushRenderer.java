package net.yoruniii.playdate.block.custom.plush.renderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.LollipopClownPlushEntity;
import net.yoruniii.playdate.block.custom.plush.model.DinoPlushModel;
import net.yoruniii.playdate.block.custom.plush.model.LollipopClownPlushModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class LollipopClownPlushRenderer extends GeoBlockRenderer<LollipopClownPlushEntity> {
    public LollipopClownPlushRenderer() {
        super(new LollipopClownPlushModel());
    }

    @Override
    public RenderLayer getRenderType(LollipopClownPlushEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }
}
