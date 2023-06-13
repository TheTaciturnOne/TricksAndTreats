package net.thetaciturnone.tricksandtreats;

import net.fabricmc.api.ModInitializer;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.thetaciturnone.tricksandtreats.block.ModBlocks;
import net.thetaciturnone.tricksandtreats.item.ModItems;
import net.thetaciturnone.tricksandtreats.platform.RegistryHelper;
import net.thetaciturnone.tricksandtreats.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;


public class TricksAndTreats implements ModInitializer {

	public static final String MOD_ID = "tricksandtreats";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier makeID(String path) {
		return new Identifier(
				MOD_ID,
				path
		);
	}

	public static String makeStringID(String name) {
		return MOD_ID + ":" + name;
	}


    @Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
	}
}
