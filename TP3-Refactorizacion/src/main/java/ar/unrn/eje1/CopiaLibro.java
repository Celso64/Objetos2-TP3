package ar.unrn.eje1;

import java.util.Objects;

public class CopiaLibro {
	private Libro libro;

	// Me aseguro que no pase un valor nulo
	public CopiaLibro(Libro libro) {
		this.libro = Objects.requireNonNull(libro);
	}

	// Quite el Getter de libro

	public Double calcularMonto(Integer diasAlquilados) {
		return this.libro.calcularMonto(diasAlquilados);
	}

	public Integer calcularPuntos(Integer diasAlquilados) {
		return this.libro.calcularPuntos(diasAlquilados);
	}
}