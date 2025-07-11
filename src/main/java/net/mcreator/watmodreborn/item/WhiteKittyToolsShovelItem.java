
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.watmodreborn.init.WatModRebornModItems;

public class WhiteKittyToolsShovelItem extends ShovelItem {
	public WhiteKittyToolsShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 26;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return -1f;
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
		}, 1, -3f, new Item.Properties());
	}
}
