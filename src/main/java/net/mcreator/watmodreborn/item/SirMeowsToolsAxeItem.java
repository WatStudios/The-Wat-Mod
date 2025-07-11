
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.watmodreborn.init.WatModRebornModItems;

public class SirMeowsToolsAxeItem extends AxeItem {
	public SirMeowsToolsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 190;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(WatModRebornModItems.SIR_MEOWS_CAT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
