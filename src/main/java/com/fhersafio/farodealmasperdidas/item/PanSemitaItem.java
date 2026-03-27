package com.fhersafio.farodealmasperdidas.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.fhersafio.farodealmasperdidas.procedures.PanSemitaAlJugadorDejarDeUsarloProcedure;

public class PanSemitaItem extends Item {
	public PanSemitaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(12).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(5f).build()));
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		PanSemitaAlJugadorDejarDeUsarloProcedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}