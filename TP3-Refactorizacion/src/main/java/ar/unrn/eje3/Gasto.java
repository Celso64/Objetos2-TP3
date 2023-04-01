package ar.unrn.eje3;

public abstract class Gasto {

	protected int monto;

	public abstract Integer calcularGastoComida();

	public abstract String getNombre();

	public abstract Boolean esElevado();

	public int getMonto() {
		return monto;
	}

}
