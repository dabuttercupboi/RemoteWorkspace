
package net.mcreator.addinglard.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.addinglard.init.AddingLardModFluids;

public class PeeBlock extends LiquidBlock {
	public PeeBlock() {
		super(() -> AddingLardModFluids.PEE.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
