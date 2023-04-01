package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
	private List<Alquiler> alquileres = new ArrayList<Alquiler>();
	@SuppressWarnings("unused")
	private String name;

	public Cliente(String nombre) {
		this.name = Objects.requireNonNull(nombre);
	}

	/*
	 * Antes: Pedia los datos usando Getters anidados para hacer el calculo aca.
	 * Devolvia un Object[2], habia que recordar que significaba cada campo.
	 */

	/*
	 * Ahora: Usa polimorfismo para delegar la responsabilidad del calculo a los
	 * objetos involucrados. Devuelve un objeto Ticket, con sus metodos podemos
	 * recuperar sus datos de forma simple.
	 */

	public Ticket calcularDeudaYPuntosObtenidos() {

		double total = 0.0;
		int puntosAlquilerFrecuente = 0;

		for (Alquiler alquiler : alquileres) {
			total += alquiler.calcularMonto();
			puntosAlquilerFrecuente += alquiler.calcularPuntos();
		}

		return new Ticket(total, puntosAlquilerFrecuente);
	}

	// En vez de delegar al codigo cliente la construccion del Alquiler, le dejo la
	// responsabilidad al Modelo
	public void alquilar(CopiaLibro copiaLibro, Integer diasDeAlquiler) {
		alquileres.add(new Alquiler(copiaLibro, diasDeAlquiler));
	}

}