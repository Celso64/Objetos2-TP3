package ar.unrn.eje3;

import java.util.Objects;

public class GastoDesayuno extends Gasto {

	private static final String NOMBRE = "Desayuno";
	private static final Integer GASTO_ALTO = 1000;

	public GastoDesayuno(Integer monto) {
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
