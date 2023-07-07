
package net.mcreator.addinglard.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class RawBronzeItem extends Item {
	public RawBronzeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}