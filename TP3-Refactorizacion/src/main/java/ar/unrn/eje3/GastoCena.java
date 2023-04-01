package ar.unrn.eje3;

import java.util.Objects;

public class GastoCena extends Gasto {

	private static final String NOMBRE = "Cena";
	private static final Integer GASTO_ALTO = 5000;

	public GastoCena(Integer monto) {
		super.monto = Objects.requireNonNull(monto);
	}

	@Override
	public Integer calcularGastoComida() {
		return super.monto;
	}

	@Override
	public String getNombre() {
		return NOMBRE;
	}

	@Override
	public Boolean esElevado() {
		return this.monto > GASTO_ALTO;
	}

}
