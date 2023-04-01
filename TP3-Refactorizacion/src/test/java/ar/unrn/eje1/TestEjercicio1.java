package ar.unrn.eje1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEjercicio1 {

	private Libro libro;
	private CopiaLibro copia;
	private Cliente cliente;
	private Ticket ticket;

	@BeforeEach
	void inicializacion() {
		cliente = new Cliente("Juan");
	}

	@Test
	void alquilarLibroRegularUnDia() {

		libro = new LibroRegular("La milla verde");
		copia = new CopiaLibro(libro);

		cliente.alquilar(copia, 1);
		ticket = cliente.calcularDeudaYPuntosObtenidos();

		assertEquals(ticket.getMonto(), Double.valueOf(2.0));// Monto
		assertEquals(ticket.getPuntos(), Integer.valueOf(1));// Puntos
	}

	@Test
	void alquilarLibroRegularTresDias() {

		libro = new LibroRegular("La milla verde");
		copia = new CopiaLibro(libro);

		cliente.alquilar(copia, 3);
		ticket = cliente.calcularDeudaYPuntosObtenidos();

		assertEquals(ticket.getMonto(), Double.valueOf(3.5));// Monto
		assertEquals(ticket.getPuntos(), Integer.valueOf(1));// Puntos
	}

	@Test
	void alquilarLibroInfantilUnDia() {

		libro = new LibroInfantil("Programacion Concurrente con Java");
		copia = new CopiaLibro(libro);

		cliente.alquilar(copia, 1);
		ticket = cliente.calcularDeudaYPuntosObtenidos();

		assertEquals(ticket.getMonto(), Double.valueOf(1.5));// Monto
		assertEquals(ticket.getPuntos(), Integer.valueOf(1));// Puntos
	}

	@Test
	void alquilarLibroInfantilCuatroDias() {

		libro = new LibroInfantil("Programacion Concurrente con Java");
		copia = new CopiaLibro(libro);

		cliente.alquilar(copia, 4);
		ticket = cliente.calcularDeudaYPuntosObtenidos();

		assertEquals(ticket.getMonto(), Double.valueOf(3.0));// Monto
		assertEquals(ticket.getPuntos(), Integer.valueOf(1));// Puntos
	}

	@Test
	void alquilarLibroNuevoPrimerDia() {

		libro = new LibroNuevo("Programacion en Fortran");
		copia = new CopiaLibro(libro);

		cliente.alquilar(copia, 1);
		ticket = cliente.calcularDeudaYPuntosObtenidos();

		assertEquals(ticket.getMonto(), Double.valueOf(3.0));// Monto
		assertEquals(ticket.getPuntos(), Integer.valueOf(2));// Puntos
	}

	@Test
	void alquilarLibroNuevoTercerDia() {

		libro = new LibroNuevo("Programacion en Fortran");
		copia = new CopiaLibro(libro);

		cliente.alquilar(copia, 3);
		ticket = cliente.calcularDeudaYPuntosObtenidos();

		assertEquals(ticket.getMonto(), Double.valueOf(9.0));// Monto
		assertEquals(ticket.getPuntos(), Integer.valueOf(1));// Puntos
	}

}
