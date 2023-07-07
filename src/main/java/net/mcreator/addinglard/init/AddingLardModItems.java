
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addinglard.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.addinglard.item.RawBronzeItem;
import net.mcreator.addinglard.item.BronzeswordItem;
import net.mcreator.addinglard.item.BronzeingotItem;
import net.mcreator.addinglard.item.BronzearmorItem;
import net.mcreator.addinglard.item.BanditDaggerItem;
import net.mcreator.addinglard.AddingLardMod;

public class AddingLardModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AddingLardMod.MODID);
	public static final RegistryObject<Item> BANDIT_DAGGER = REGISTRY.register("bandit_dagger", () -> new BanditDaggerItem());
	public static final RegistryObject<Item> RAW_BRONZE = REGISTRY.register("raw_bronze", () -> new RawBronzeItem());
	public static final RegistryObject<Item> BANDIT_SPAWN_EGG = REGISTRY.register("bandit_spawn_egg", () -> new ForgeSpawnEggItem(AddingLardModEntities.BANDIT, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BRONZEINGOT = REGISTRY.register("bronzeingot", () -> new BronzeingotItem());
	public static final RegistryObject<Item> BRONZEARMOR_HELMET = REGISTRY.register("bronzearmor_helmet", () -> new BronzearmorItem.Helmet());
	public static final RegistryObject<Item> BRONZEARMOR_CHESTPLATE = REGISTRY.register("bronzearmor_chestplate", () -> new BronzearmorItem.Chestplate());
	public static final RegistryObject<Item> BRONZEARMOR_LEGGINGS = REGISTRY.register("bronzearmor_leggings", () -> new BronzearmorItem.Leggings());
	public static final RegistryObject<Item> BRONZEARMOR_BOOTS = REGISTRY.register("bronzearmor_boots", () -> new BronzearmorItem.Boots());
	public static final RegistryObject<Item> BRONZE_ORE = block(AddingLardModBlocks.BRONZE_ORE);
	public static final RegistryObject<Item> SKELETONKNIGHT_SPAWN_EGG = REGISTRY.register("skeletonknight_spawn_egg", () -> new ForgeSpawnEggItem(AddingLardModEntities.SKELETONKNIGHT, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BRONZESWORD = REGISTRY.register("bronzesword", () -> new BronzeswordItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
