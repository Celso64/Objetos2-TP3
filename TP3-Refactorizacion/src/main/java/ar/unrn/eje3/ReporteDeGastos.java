package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {

	public ReporteDeGastos() {
	}

	public String imprimir(List<Gasto> gastos) {

		StringBuffer constructorDeReporte = new StringBuffer(128);
		int total = 0;
		int gastosDeComida = 0;

		constructorDeReporte.append("Expenses ").append(LocalDate.now().toString()).append("\n\n");

		for (Gasto gasto : gastos) {

			gastosDeComida += gasto.calcularGastoComida();
			String nombreGasto = gasto.getNombre();
			String marcaExcesoComidas = gasto.esElevado() ? "X" : " ";

			constructorDeReporte.append(nombreGasto).append("\t").append(gasto.getMonto()).append("\t")
					.append(marcaExcesoComidas).append("\n");

			total += gasto.getMonto();
		}

		constructorDeReporte.append("\nGastos de comida: ").append(gastosDeComida).append("\n")
				.append("Total de gastos: ").append(total);

		return constructorDeReporte.toString();
	}
}
