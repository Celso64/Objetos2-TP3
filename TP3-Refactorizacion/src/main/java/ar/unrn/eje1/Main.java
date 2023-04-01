package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {
		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(elTunelCopia, 5);
		yo.alquilar(antesDelFinCopia, 3);
		Ticket resultado = yo.calcularDeudaYPuntosObtenidos();
		System.out.println(resultado.getMonto());
		System.out.println(resultado.getPuntos());
	}
}