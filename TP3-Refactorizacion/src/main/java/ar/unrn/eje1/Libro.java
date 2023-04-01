package ar.unrn.eje1;

public abstract class Libro {

	// Removi los codigos de precio para usar Polimorfismo en su lugar
	// De la clase Libro extienden LibroInfantil, LibroRegular y LibroNuevo
	// La clase Libro se volvio abstracta

	protected String nombre;

	// cambie la firma nombre() -> getNombre() para ganar legibilidad
	public String getNombre() {
		return nombre;
	}

	public abstract Double calcularMonto(Integer diasAlquilados);

	public abstract Integer calcularPuntos(Integer diasAlquilados);
}