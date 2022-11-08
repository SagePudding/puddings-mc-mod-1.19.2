package net.puddings.puddmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.puddings.puddmod.PuddMod;
import net.puddings.puddmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.COMPRESSED);

    public static final Block DOUBLE_COMPRESSED_COBBLESTONE = registerBlock("double_compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.COMPRESSED);

    public static final Block TRIPLE_COMPRESSED_COBBLESTONE = registerBlock("triple_compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.COMPRESSED);

    public static final Block QUAD_COMPRESSED_COBBLESTONE = registerBlock("quad_compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.COMPRESSED);

    public static final Block QUINT_COMPRESSED_COBBLESTONE = registerBlock("quint_compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.COMPRESSED);

    public static final Block SEX_COMPRESSED_COBBLESTONE = registerBlock("sex_compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.COMPRESSED);

    public static final Block SEPT_COMPRESSED_COBBLESTONE = registerBlock("sept_compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.COMPRESSED);

    public static final Block OCTUPLE_COMPRESSED_COBBLESTONE = registerBlock("octuple_compressed_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.COMPRESSED);

    public static final Block COMPRESSED_DIRT = registerBlock("compressed_dirt",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).requiresTool()),
            ModItemGroup.COMPRESSED);

    public static final Block DOUBLE_COMPRESSED_DIRT = registerBlock("double_compressed_dirt",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).requiresTool()),
            ModItemGroup.COMPRESSED);

    public static final Block TRIPLE_COMPRESSED_DIRT = registerBlock("triple_compressed_dirt",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).requiresTool()),
            ModItemGroup.COMPRESSED);

    public static final Block QUAD_COMPRESSED_DIRT = registerBlock("quad_compressed_dirt",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).requiresTool()),
            ModItemGroup.COMPRESSED);

    public static final Block QUINT_COMPRESSED_DIRT = registerBlock("quint_compressed_dirt",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).requiresTool()),
            ModItemGroup.COMPRESSED);

    public static final Block SEX_COMPRESSED_DIRT = registerBlock("sex_compressed_dirt",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).requiresTool()),
            ModItemGroup.COMPRESSED);

    public static final Block SEPT_COMPRESSED_DIRT = registerBlock("sept_compressed_dirt",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).requiresTool()),
            ModItemGroup.COMPRESSED);

    public static final Block OCT_COMPRESSED_DIRT = registerBlock("oct_compressed_dirt",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(1f).requiresTool()),
            ModItemGroup.COMPRESSED);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(PuddMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(PuddMod.MOD_ID, name), new BlockItem(block,
                new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        PuddMod.LOGGER.debug("Registering ModBlocks for " + PuddMod.MOD_ID);
    }
}
