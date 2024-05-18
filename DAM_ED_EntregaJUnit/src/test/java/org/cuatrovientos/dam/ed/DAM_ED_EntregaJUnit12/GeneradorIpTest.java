/**
 * 
 */
package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class GeneradorIpTest {

	private GeneradorIp generadorIp;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		generadorIp = new GeneradorIp();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		generadorIp = null;
	}

	/**
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit12.GeneradorIp#generarNumero(int, int)}.
	 */
	@Test
	public void testGenerarNumero() {
		for (int i = 0; i < 1000; i++) {
			int min = 0;
			int max = 254;
			int numero = generadorIp.generarNumero(min, max);

			assertTrue(numero >= min, "El número generado es menor que el mínimo esperado");
			assertTrue(numero <= max, "El número generado es mayor que el máximo esperado");

			numero = generadorIp.generarNumero(100, 100);
			assertEquals(100, numero, "El número generado no es igual al esperado");
		}
	}

	/**
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit12.GeneradorIp#generarIp()}.
	 */
	@Test
	void testGenerarIp() {
		String ip = generadorIp.generarIp();
		String[] partes = ip.split("\\.");
		int primero = Integer.parseInt(partes[0]);
		int ultimo = Integer.parseInt(partes[3]);
		assertNotEquals(0, primero, "La IP no puede empezar con 0");
		assertNotEquals(0, ultimo, "La IP no puede terminar con 0");
	}
}
