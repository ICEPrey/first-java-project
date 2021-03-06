package me.iceprey.firstfabric.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import me.iceprey.firstfabric.FirstFabric;
import me.iceprey.firstfabric.item.ModItemGroup;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("block_shaq",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(FirstFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(FirstFabric.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.RUBY)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + FirstFabric.MOD_ID);
    }
}