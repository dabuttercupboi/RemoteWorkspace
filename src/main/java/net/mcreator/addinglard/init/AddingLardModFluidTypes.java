
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addinglard.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.addinglard.fluid.types.PeeFluidType;
import net.mcreator.addinglard.AddingLardMod;

public class AddingLardModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, AddingLardMod.MODID);
	public static final RegistryObject<FluidType> PEE_TYPE = REGISTRY.register("pee", () -> new PeeFluidType());
}
