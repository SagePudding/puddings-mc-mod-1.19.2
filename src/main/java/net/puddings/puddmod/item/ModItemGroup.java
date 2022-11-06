package net.puddings.puddmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.puddings.puddmod.PuddMod;

public class ModItemGroup {
    public static final ItemGroup COMPRESSED = FabricItemGroupBuilder.build(new Identifier(PuddMod.MOD_ID,
            "compressed"), () -> new ItemStack(ModItems.COMPRESSED_SEEDS));
}
