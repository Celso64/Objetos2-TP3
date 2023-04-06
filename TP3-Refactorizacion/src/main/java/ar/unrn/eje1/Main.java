package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {
		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");

		Cliente yo = new Cliente("Javier");

		yo.alquilar(new CopiaLibro(elTunel), 5);
		yo.alquilar(new CopiaLibro(antesDelFin), 3);

		Ticket resultado = yo.calcularDeudaYPuntosObtenidos();

		System.out.println(resultado.getMonto());
		System.out.println(resultado.getPuntos());
	}
}