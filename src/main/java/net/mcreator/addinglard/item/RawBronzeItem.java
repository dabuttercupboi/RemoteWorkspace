
package net.mcreator.addinglard.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawBronzeItem extends Item {
	public RawBronzeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
