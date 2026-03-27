package com.fhersafio.farodealmasperdidas.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.fhersafio.farodealmasperdidas.procedures.NacatamalAlJugadorDejarDeUsarloProcedure;

public class NacatamalItem extends Item {
	public NacatamalItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(12).food((new FoodProperties.Builder()).nutrition(20).saturationModifier(10f).build()).usingConvertsTo(Items.DRIED_KELP));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		NacatamalAlJugadorDejarDeUsarloProcedure.execute(entity);
		return super.releaseUsing(itemstack, world, entity, time);
	}
}