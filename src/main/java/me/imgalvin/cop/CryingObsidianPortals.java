package me.imgalvin.cop;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class CryingObsidianPortals implements ModInitializer {
	@Override
	public void onInitialize() {
		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.CRYING_OBSIDIAN)
				.destDimID(Identifier.of("the_nether"))
				.tintColor(82,24,250)
				.registerPortal();
	}
}