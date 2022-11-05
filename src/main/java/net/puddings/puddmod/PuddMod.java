package net.puddings.puddmod;

import net.fabricmc.api.ModInitializer;
import net.puddings.puddmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// test comment lol
public class PuddMod implements ModInitializer {
	public static final String MOD_ID = "puddmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
