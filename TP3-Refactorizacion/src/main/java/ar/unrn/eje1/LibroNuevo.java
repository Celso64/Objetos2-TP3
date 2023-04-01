package ar.unrn.eje1;

import java.util.Objects;

public class LibroNuevo extends Libro {

	private final Double RECARGO = 3.0;

	private final Integer PUNTOS_BASE = 1;
	private final Integer PUNTOS_CON_BONUS = 2;

	public LibroNuevo(String nombre) {
		super.nombre = Objects.requireNonNull(nombre);
	}

	@Override
	public Double calcularMonto(Integer diasAlquilados) {
		return diasAlquilados * RECARGO;
	}

	@Override
	public Integer calcularPuntos(Integer diasAlquilados) {
		return (diasAlquilados > 1) ? PUNTOS_BASE : PUNTOS_CON_BONUS;
	}

}
