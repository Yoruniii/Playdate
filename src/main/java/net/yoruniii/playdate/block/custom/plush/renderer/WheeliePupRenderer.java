package net.yoruniii.playdate.block.custom.plush.renderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.yoruniii.playdate.block.custom.plush.be.DinoPlushEntity;
import net.yoruniii.playdate.block.custom.plush.be.WheeliePupEntity;
import net.yoruniii.playdate.block.custom.plush.model.DinoPlushModel;
import net.yoruniii.playdate.block.custom.plush.model.WheeliePupModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class WheeliePupRenderer extends GeoBlockRenderer<WheeliePupEntity> {
    public WheeliePupRenderer() {
        super(new WheeliePupModel());
    }

    @Override
    public RenderLayer getRenderType(WheeliePupEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }
}
