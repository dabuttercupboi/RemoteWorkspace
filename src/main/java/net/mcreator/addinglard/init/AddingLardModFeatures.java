
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addinglard.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.addinglard.world.features.ores.BronzeOreFeature;
import net.mcreator.addinglard.world.features.BanditHideoutFeature;
import net.mcreator.addinglard.AddingLardMod;

@Mod.EventBusSubscriber
public class AddingLardModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AddingLardMod.MODID);
	public static final RegistryObject<Feature<?>> BANDIT_HIDEOUT = REGISTRY.register("bandit_hideout", BanditHideoutFeature::new);
	public static final RegistryObject<Feature<?>> BRONZE_ORE = REGISTRY.register("bronze_ore", BronzeOreFeature::new);
}
