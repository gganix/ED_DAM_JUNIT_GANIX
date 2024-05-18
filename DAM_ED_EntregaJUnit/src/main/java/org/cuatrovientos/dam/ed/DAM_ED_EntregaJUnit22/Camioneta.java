package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit22;

import java.util.ArrayList;
import java.util.Random;

public class Camioneta implements Transporte {
	private ArrayList<Paquete> paquetes;

	public ArrayList<Paquete> getPaquetes() {
		return paquetes;
	}

	public Camioneta() {
		this.paquetes = new ArrayList<>();
	}

	@Override
	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete);
	}

	@Override
	public float pesoTotal() {
		float total = 0;
		for (Paquete p : paquetes) {
			total += p.getPeso();
		}
		return total;
	}

	@Override
	public int recorrerDistancia() {
		Random rand = new Random();
		return 70 + rand.nextInt(31);
	}
}
