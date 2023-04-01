package ar.unrn.eje1;

public class LibroInfantil extends Libro {

	private final Double MONTO_BASE = 1.5;
	private final Double RECARGO = 1.5;
	private final Integer TOLERACIA_DIAS = 3;

	private final Integer PUNTOS_BASE = 1;

	public LibroInfantil(String nombre) {
		super.nombre = nombre;
	}

	@Override
	public Double calcularMonto(Integer diasAlquilados) {

		Double valorDias = (diasAlquilados < TOLERACIA_DIAS) ? 0.0 : diasAlquilados - 3.0;

		return (MONTO_BASE + valorDias * RECARGO);
	}

	@Override
	public Integer calcularPuntos(Integer diasAlquilados) {
		return PUNTOS_BASE;
	}

}
