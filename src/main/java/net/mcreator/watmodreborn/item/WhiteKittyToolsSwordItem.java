
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.watmodreborn.init.WatModRebornModItems;

public class WhiteKittyToolsSwordItem extends SwordItem {
	public WhiteKittyToolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 26;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return -3f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(WatModRebornModItems.WHITE_KITTY_CAT.get()));
			}
		}, 3, -3f, new Item.Properties());
	}
}
