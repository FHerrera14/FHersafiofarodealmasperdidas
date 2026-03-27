package com.fhersafio.farodealmasperdidas;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

import com.fhersafio.farodealmasperdidas.init.FhersafioFaroDeAlmasPerdidasModOverlays;
import com.fhersafio.farodealmasperdidas.init.FhersafioFaroDeAlmasPerdidasModBlocksRenderers;

@Environment(EnvType.CLIENT)
public class FhersafioFaroDeAlmasPerdidasModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		FhersafioFaroDeAlmasPerdidasModBlocksRenderers.clientLoad();
		FhersafioFaroDeAlmasPerdidasModOverlays.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}