package me.iceprey.firstfabric;

import me.iceprey.firstfabric.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class FirstFabric implements ModInitializer {
	public static final String MOD_ID = "firstfabric";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();

		System.out.println("Hello Fabric world!");
	}
}