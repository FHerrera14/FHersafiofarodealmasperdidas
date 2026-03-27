package com.fhersafio.farodealmasperdidas.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class BigColitaAlJugadorDejarDeUsarloProcedure {
	public static boolean eventResult = true;

	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
			_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 600, 2, false, true));
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 300, 2, false, true));
		}
	}
}