
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.watmodreborn.init.WatModRebornModItems;

public class StormyToolHoeItem extends HoeItem {
	public StormyToolHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(WatModRebornModItems.STORMY_CAT.get()));
			}
		}, 0, 0f, new Item.Properties());
	}
}
