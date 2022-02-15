package net.yoruniii.playdate;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.yoruniii.playdate.block.ModBlocks;
import net.yoruniii.playdate.block.custom.plush.renderer.*;
import net.yoruniii.playdate.block.custom.renderer.HappySunToyEntityRenderer;
import net.yoruniii.playdate.block.custom.renderer.LollipopClownToyEntityRenderer;
import net.yoruniii.playdate.block.custom.renderer.PetuniaPigToyEntityRenderer;
import net.yoruniii.playdate.entity.renderer.HappySunEntityRenderer;
import net.yoruniii.playdate.entity.renderer.LollipopClownEntityRenderer;
import net.yoruniii.playdate.entity.renderer.PetuniaPigEntityRenderer;
import net.yoruniii.playdate.item.custom.renderer.*;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PlaydateClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockEntityRendererRegistry.register(Playdate.CREEPER_PLUSH_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new CreeperPlushRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.CREEPER_PLUSH_BLOCK_ITEM, new CreeperPlushBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.DINO_PLUSH_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new DinoPlushRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.DINO_PLUSH_BLOCK_ITEM, new DinoPlushBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.ENDERMAN_PLUSH_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new EndermanPlushRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.ENDERMAN_PLUSH_BLOCK_ITEM, new EndermanPlushBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.HAPPY_SUN_PLUSH_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new HappySunPlushRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.HAPPY_SUN_PLUSH_BLOCK_ITEM, new HappySunPlushBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.LOLLIPOP_CLOWN_PLUSH_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new LollipopClownPlushRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.LOLLIPOP_CLOWN_PLUSH_BLOCK_ITEM, new LollipopClownPlushBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.PETUNIA_PIG_PLUSH_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new PetuniaPigPlushRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.PETUNIA_PIG_PLUSH_BLOCK_ITEM, new PetuniaPigPlushBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.RUBBER_DUCKY_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new RubberDuckyRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.RUBBER_DUCKY_BLOCK_ITEM, new RubberDuckyBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.TOADSTOOL_STUDIOS_PLUSH_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new ToadstoolStudiosPlushRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.TOADSTOOL_STUDIOS_PLUSH_BLOCK_ITEM, new ToadstoolStudiosPlushBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.WHEELIE_PUP_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new WheeliePupRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.WHEELIE_PUP_BLOCK_ITEM, new WheeliePupBlockItemRenderer());

        BlockEntityRendererRegistry.register(Playdate.ZOMBIE_PLUSH_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new ZombiePlushRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.ZOMBIE_PLUSH_BLOCK_ITEM, new ZombiePlushBlockItemRenderer());

        EntityRendererRegistry.register(Playdate.PETUNIA_PIG, PetuniaPigEntityRenderer::new);
        BlockEntityRendererRegistry.register(Playdate.PETUNIA_PIG_TOY_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new PetuniaPigToyEntityRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.PETUNIA_PIG_TOY_BLOCK_ITEM, new PetuniaPigToyBlockItemRenderer());

        EntityRendererRegistry.register(Playdate.HAPPY_SUN, HappySunEntityRenderer::new);
        BlockEntityRendererRegistry.register(Playdate.HAPPY_SUN_TOY_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new HappySunToyEntityRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.HAPPY_SUN_TOY_BLOCK_ITEM, new HappySunToyBlockItemRenderer());

        EntityRendererRegistry.register(Playdate.LOLLIPOP_CLOWN, LollipopClownEntityRenderer::new);
        BlockEntityRendererRegistry.register(Playdate.LOLLIPOP_CLOWN_TOY_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new LollipopClownToyEntityRenderer());
        GeoItemRenderer.registerItemRenderer(Playdate.LOLLIPOP_CLOWN_TOY_BLOCK_ITEM, new LollipopClownToyBlockItemRenderer());
    }
}
