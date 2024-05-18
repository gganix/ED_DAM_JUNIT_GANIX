/**
 * 
 */
package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ProductoTest {

	private Producto producto;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto("pan", 0.50f, 1);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		producto = null;
	}

	/**
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit13.Producto#precioTotal()}.
	 */
	@Test
	void testPrecioTotal() {
		assertEquals(0.50f, producto.precioTotal());
	}

	/**
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit13.Producto#Producto(java.lang.String, float, int)}.
	 */
	@Test
	void testProducto() {
		assertEquals("pan", producto.getNombre());
		assertEquals(0.50f, producto.getPrecio());
		assertEquals(1, producto.getCantidad());
	}

	/**
	 * Test method for
	 * {@link org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit13.Producto#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("Nombre: " + producto.getNombre() + "\nPrecio: " + producto.getPrecio() + "\nCantidad="
				+ producto.getCantidad(), producto.toString());
	}

}
