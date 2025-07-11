
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CatEssenceItem extends Item {
	public CatEssenceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
