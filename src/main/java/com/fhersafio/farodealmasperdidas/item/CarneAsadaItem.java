package com.fhersafio.farodealmasperdidas.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.fhersafio.farodealmasperdidas.procedures.CarneAsadaAlJugadorDejarDeUsarloProcedure;

public class CarneAsadaItem extends Item {
	public CarneAsadaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(12).food((new FoodProperties.Builder()).nutrition(15).saturationModifier(5f).build()).usingConvertsTo(Items.STICK));
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		CarneAsadaAlJugadorDejarDeUsarloProcedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}