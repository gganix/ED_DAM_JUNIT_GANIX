package org.cuatrovientos.dam.ed.DAM_ED_EntregaJUnit13;

public class Producto {

	private String nombre;
	private float precio;
	private int cantidad;

	public float precioTotal() {
		return precio * cantidad;
	}

	public Producto(String nombre, float precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPrecio: " + precio + "\nCantidad=" + cantidad;
	}

}
