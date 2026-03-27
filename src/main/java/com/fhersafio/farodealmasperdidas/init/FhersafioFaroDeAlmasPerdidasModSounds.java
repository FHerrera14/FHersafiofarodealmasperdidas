/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.fhersafio.farodealmasperdidas.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.fhersafio.farodealmasperdidas.FhersafioFaroDeAlmasPerdidasMod;

public class FhersafioFaroDeAlmasPerdidasModSounds {
	public static SoundEvent BREAK_FARO;
	public static SoundEvent PLACE_FARO;
	public static SoundEvent DROP_FARO;
	public static SoundEvent PLAYER_DEAD;
	public static SoundEvent PLAYER_REVIVE;
	public static SoundEvent FIRST_GEM_MISSION;
	public static SoundEvent SECOND_GEM_MISSION;
	public static SoundEvent THIRD_GEM_MISSION;
	public static SoundEvent FOUR_GEM_MISSION_FINAL_BOSS;
	public static SoundEvent VILLAGE_MISSION;

	public static void load() {
		BREAK_FARO = register("break_faro", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "break_faro")));
		PLACE_FARO = register("place_faro", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "place_faro")));
		DROP_FARO = register("drop_faro", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "drop_faro")));
		PLAYER_DEAD = register("player_dead", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "player_dead")));
		PLAYER_REVIVE = register("player_revive", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "player_revive")));
		FIRST_GEM_MISSION = register("first_gem_mission", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "first_gem_mission")));
		SECOND_GEM_MISSION = register("second_gem_mission", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "second_gem_mission")));
		THIRD_GEM_MISSION = register("third_gem_mission", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "third_gem_mission")));
		FOUR_GEM_MISSION_FINAL_BOSS = register("four_gem_mission_final_boss", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "four_gem_mission_final_boss")));
		VILLAGE_MISSION = register("village_mission", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("fhersafio_faro_de_almas_perdidas", "village_mission")));
	}

	private static SoundEvent register(String registryname, SoundEvent element) {
		return Registry.register(BuiltInRegistries.SOUND_EVENT, ResourceLocation.fromNamespaceAndPath(FhersafioFaroDeAlmasPerdidasMod.MODID, registryname), element);
	}
}