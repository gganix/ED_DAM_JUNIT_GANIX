package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit12;

import java.util.Random;

public class GeneradorIp {

	private Random random = new Random();

	public int generarNumero(int min, int max) {
		return random.nextInt((max - min) + 1) + min;
	}

	public String generarIp() {
		int oct1 = generarNumero(1, 254);
		int oct2 = generarNumero(0, 255);
		int oct3 = generarNumero(0, 255);
		int oct4 = generarNumero(1, 254);

		return oct1 + "." + oct2 + "." + oct3 + "." + oct4;
	}

}
