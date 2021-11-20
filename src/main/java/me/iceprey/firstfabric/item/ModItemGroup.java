package me.iceprey.firstfabric.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import me.iceprey.firstfabric.FirstFabric;

public class ModItemGroup {
    public static final ItemGroup RUBY = FabricItemGroupBuilder.build(new Identifier(FirstFabric.MOD_ID, "ruby"),
            () -> new ItemStack(ModItems.RUBY));
}