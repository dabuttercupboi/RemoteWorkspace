
package net.mcreator.addinglard.client.renderer;

public class BanditRenderer extends HumanoidMobRenderer<BanditEntity, HumanoidModel<BanditEntity>> {

	public BanditRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(BanditEntity entity) {
		return new ResourceLocation("adding_lard_:textures/entities/2020_04_22_bandit-fix-2-14184919.png");
	}

}
