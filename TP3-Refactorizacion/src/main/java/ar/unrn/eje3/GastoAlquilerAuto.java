package ar.unrn.eje3;

public class GastoAlquilerAuto extends Gasto {

	private static final String NOMBRE = "Alquiler de Auto";

	public GastoAlquilerAuto(int monto) {
		super.monto = monto;
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
