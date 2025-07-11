
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FlyingEssenceItem extends Item {
	public FlyingEssenceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
