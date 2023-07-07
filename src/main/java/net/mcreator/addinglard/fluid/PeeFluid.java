
package net.mcreator.addinglard.fluid;

public abstract class PeeFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> AddingLardModFluidTypes.PEE_TYPE.get(), () -> AddingLardModFluids.PEE.get(), () -> AddingLardModFluids.FLOWING_PEE.get())
			.explosionResistance(100f).bucket(() -> AddingLardModItems.PEE_BUCKET.get()).block(() -> (LiquidBlock) AddingLardModBlocks.PEE.get());

	private PeeFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PeeFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PeeFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
