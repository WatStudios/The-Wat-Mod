
package net.mcreator.watmodreborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.watmodreborn.init.WatModRebornModItems;

public class LunaToolsPickaxeItem extends PickaxeItem {
	public LunaToolsPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 800;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(WatModRebornModItems.LUNA_ITEM.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
