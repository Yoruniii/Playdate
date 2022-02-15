package net.yoruniii.playdate.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.yoruniii.playdate.Playdate;

public class ModGroup {
    public static final ItemGroup PLAYDATE_GROUP = FabricItemGroupBuilder.build(new Identifier(Playdate.MOD_ID, "playdate_group"),
            () -> new ItemStack(ModItems.STUFFING));
}
