package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit22;

public interface Transporte {
	void incluirPaquete(Paquete paquete);

	float pesoTotal();

	int recorrerDistancia();
}