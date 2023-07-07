
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addinglard.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AddingLardModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(AddingLardModItems.BANDIT_DAGGER.get());
			tabData.accept(AddingLardModItems.BRONZEARMOR_HELMET.get());
			tabData.accept(AddingLardModItems.BRONZEARMOR_CHESTPLATE.get());
			tabData.accept(AddingLardModItems.BRONZEARMOR_LEGGINGS.get());
			tabData.accept(AddingLardModItems.BRONZEARMOR_BOOTS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AddingLardModItems.BANDIT_SPAWN_EGG.get());
			tabData.accept(AddingLardModItems.SKELETONKNIGHT_SPAWN_EGG.get());
		}
	}
}
