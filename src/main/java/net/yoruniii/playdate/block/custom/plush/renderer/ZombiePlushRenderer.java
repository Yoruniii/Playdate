package net.yoruniii.playdate.block.custom.plush.renderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.yoruniii.playdate.block.custom.plush.be.CreeperPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.ZombiePlushEntity;
import net.yoruniii.playdate.block.custom.plush.model.CreeperPlushModel;
import net.yoruniii.playdate.block.custom.plush.model.ZombiePlushModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class ZombiePlushRenderer extends GeoBlockRenderer<ZombiePlushEntity> {
    public ZombiePlushRenderer() {
        super(new ZombiePlushModel());
    }

    @Override
    public RenderLayer getRenderType(ZombiePlushEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }
}
