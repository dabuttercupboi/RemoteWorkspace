
package net.mcreator.addinglard.item;

import net.minecraft.network.chat.Component;

public class PeeItem extends BucketItem {

	public PeeItem() {
		super(AddingLardModFluids.PEE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

}
