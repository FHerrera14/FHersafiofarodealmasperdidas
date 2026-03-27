package com.fhersafio.farodealmasperdidas.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.fhersafio.farodealmasperdidas.procedures.BigColitaAlJugadorDejarDeUsarloProcedure;

public class BigColitaItem extends Item {
	public BigColitaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(6).fireResistant().food((new FoodProperties.Builder()).nutrition(5).saturationModifier(20f).build(), Consumables.DEFAULT_DRINK));
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		BigColitaAlJugadorDejarDeUsarloProcedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}