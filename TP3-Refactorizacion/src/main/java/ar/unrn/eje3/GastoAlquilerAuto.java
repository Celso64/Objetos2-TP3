package ar.unrn.eje3;

import java.util.Objects;

public class GastoAlquilerAuto extends Gasto {

	private static final String NOMBRE = "Alquiler de Auto";

	public GastoAlquilerAuto(Integer monto) {
		super.monto = Objects.requireNonNull(monto);
	}

	@Override
	public Integer calcularGastoComida() {
		return 0;
	}

	@Override
	public String getNombre() {
		return NOMBRE;
	}

	@Override
	public Boolean esElevado() {
		return false;
	}

}
