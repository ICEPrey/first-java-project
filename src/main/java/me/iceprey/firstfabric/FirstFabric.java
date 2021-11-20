package me.iceprey.firstfabric;

import net.fabricmc.api.ModInitializer;
import me.iceprey.firstfabric.block.ModBlocks;
import me.iceprey.firstfabric.item.ModItems;

public class FirstFabric implements ModInitializer {
    public static final String MOD_ID = "firstfabric";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        System.out.println("Hello Fabric world!");
    }
}