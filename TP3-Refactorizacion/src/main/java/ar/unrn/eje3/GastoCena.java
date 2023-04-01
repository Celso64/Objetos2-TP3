package ar.unrn.eje3;

public class GastoCena extends Gasto {

	private static final String NOMBRE = "Cena";
	private static final Integer GASTO_ALTO = 5000;

	public GastoCena(int monto) {
		super.monto = monto;
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
