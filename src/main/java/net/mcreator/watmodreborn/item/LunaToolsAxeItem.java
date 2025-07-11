
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.watmodreborn.init.WatModRebornModItems;

public class LunaToolsAxeItem extends AxeItem {
	public LunaToolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 800;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(WatModRebornModItems.LUNA_ITEM.get()));
			}
		}, 1, -3.05f, new Item.Properties());
	}
}
