
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addinglard.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.addinglard.block.BronzeOreBlock;
import net.mcreator.addinglard.AddingLardMod;

public class AddingLardModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AddingLardMod.MODID);
	public static final RegistryObject<Block> BRONZE_ORE = REGISTRY.register("bronze_ore", () -> new BronzeOreBlock());
}
