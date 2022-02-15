package net.yoruniii.playdate.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yoruniii.playdate.Playdate;

public class ModItems extends Item {
    public ModItems(Settings settings) {
        super(settings);
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//ITEMS
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final Item STUFFING = registerItem("stuffing",
            new Item(new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP)));

    public static final Item BOTTLED_SOUL = registerItem("bottled_soul",
            new Item(new FabricItemSettings().maxCount(1).group(ModGroup.PLAYDATE_GROUP)));

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//REGISTER
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Playdate.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Playdate.MOD_ID);
    }

}
