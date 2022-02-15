package net.yoruniii.playdate.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yoruniii.playdate.Playdate;
import net.yoruniii.playdate.block.custom.*;
import net.yoruniii.playdate.block.custom.plush.*;
import net.yoruniii.playdate.item.ModGroup;

public class ModBlocks extends Block {
    public ModBlocks(Settings settings) {
        super(settings);
    }

    public static final Block SOFTWOOD = registerBlock("softwood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1).breakByHand(true).requiresTool().sounds(BlockSoundGroup.WOOD)));


    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(Playdate.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Playdate.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Playdate.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + Playdate.MOD_ID);
    }

}
