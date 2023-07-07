
package net.mcreator.addinglard.client.renderer;

public class SkeletonknightRenderer extends HumanoidMobRenderer<SkeletonknightEntity, HumanoidModel<SkeletonknightEntity>> {

	public SkeletonknightRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(SkeletonknightEntity entity) {
		return new ResourceLocation("adding_lard_:textures/entities/2019_05_12_skeleton-knight-12989943.png");
	}

}
