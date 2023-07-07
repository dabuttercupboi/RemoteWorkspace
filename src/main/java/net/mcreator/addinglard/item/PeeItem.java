
package net.mcreator.addinglard.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.addinglard.init.AddingLardModFluids;

public class PeeItem extends BucketItem {
	public PeeItem() {
		super(AddingLardModFluids.PEE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
