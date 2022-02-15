package net.yoruniii.playdate.block.custom.plush.renderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.yoruniii.playdate.block.custom.plush.be.CreeperPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.model.CreeperPlushModel;
import net.yoruniii.playdate.block.custom.plush.model.DinoPlushModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class DinoPlushRenderer extends GeoBlockRenderer<DinoPlushEntity> {
    public DinoPlushRenderer() {
        super(new DinoPlushModel());
    }

    @Override
    public RenderLayer getRenderType(DinoPlushEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }
}
