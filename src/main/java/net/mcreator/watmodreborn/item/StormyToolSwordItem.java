
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.watmodreborn.init.WatModRebornModItems;

public class StormyToolSwordItem extends SwordItem {
	public StormyToolSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
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
		}, 3, -2.8f, new Item.Properties());
	}
}
