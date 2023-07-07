
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addinglard.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.addinglard.item.RawBronzeItem;
import net.mcreator.addinglard.item.BanditDaggerItem;
import net.mcreator.addinglard.AddingLardMod;

public class AddingLardModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AddingLardMod.MODID);
	public static final RegistryObject<Item> BANDIT_DAGGER = REGISTRY.register("bandit_dagger", () -> new BanditDaggerItem());
	public static final RegistryObject<Item> RAW_BRONZE = REGISTRY.register("raw_bronze", () -> new RawBronzeItem());
	public static final RegistryObject<Item> BANDIT_SPAWN_EGG = REGISTRY.register("bandit_spawn_egg", () -> new ForgeSpawnEggItem(AddingLardModEntities.BANDIT, -1, -1, new Item.Properties()));
}
