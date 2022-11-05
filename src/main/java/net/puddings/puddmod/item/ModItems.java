package net.puddings.puddmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.puddings.puddmod.PuddMod;

public class ModItems {

    public static final Item COMPRESSED_SEEDS = registerItem("compressed_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.SEEDS)));

    public static final Item DOUBLE_COMPRESSED_SEEDS = registerItem("double_compressed_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.SEEDS)));

    public static final Item TRIPLE_COMPRESSED_SEEDS = registerItem("triple_compressed_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.SEEDS)));

    public static final Item QUAD_COMPRESSED_SEEDS = registerItem("quad_compressed_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.SEEDS)));

    public static final Item QUINT_COMPRESSED_SEEDS = registerItem("quint_compressed_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.SEEDS)));

    public static final Item SEX_COMPRESSED_SEEDS = registerItem("sex_compressed_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.SEEDS)));

    public static final Item SEPT_COMPRESSED_SEEDS = registerItem("sept_compressed_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.SEEDS)));

    public static final Item OCTUPLE_COMPRESSED_SEEDS = registerItem("octuple_compressed_seeds",
            new Item(new FabricItemSettings().group(ModItemGroup.SEEDS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PuddMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        PuddMod.LOGGER.debug("Registering Mod Items for " + PuddMod.MOD_ID);
    }
}
