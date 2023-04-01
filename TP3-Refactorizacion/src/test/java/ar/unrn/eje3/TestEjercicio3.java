package ar.unrn.eje3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEjercicio3 {

	private ReporteDeGastos reportador = new ReporteDeGastos();
	private List<Gasto> gastos;
	private StringBuffer reporte;
	private Integer gastoCena, gastoDesayuno, gastoAuto;

	@BeforeEach
	void inicializar() {
		reporte = new StringBuffer(128);
	}

	@Test
	void reporteCuandoLosGastosSonBajos() {

		gastoCena = 15;
		gastoDesayuno = 135;
		gastoAuto = 200;

		gastos = List.of(new GastoCena(gastoCena), new GastoDesayuno(gastoDesayuno), new GastoAlquilerAuto(gastoAuto));

		reporte.append("Expenses ").append(LocalDate.now().toString()).append("\n\n");
		reporte.append("Cena").append("\t").append(gastoCena).append("\t ").append("\n");
		reporte.append("Desayuno").append("\t").append(gastoDesayuno).append("\t ").append("\n");
		reporte.append("Alquiler de Auto").append("\t").append(gastoAuto).append("\t ").append("\n");
		reporte.append("\nGastos de comida: ").append(gastoCena + gastoDesayuno).append("\n")
				.append("Total de gastos: ").append(gastoCena + gastoDesayuno + gastoAuto);

		assertEquals(reportador.imprimir(gastos), reporte.toString());
	}

	@Test
	void reporteCuandoLosGastoDeCenaSonAltos() {

		gastoCena = 5001;
		gastoDesayuno = 135;
		gastoAuto = 200;

		gastos = List.of(new GastoCena(gastoCena), new GastoDesayuno(gastoDesayuno), new GastoAlquilerAuto(gastoAuto));

		reporte.append("Expenses ").append(LocalDate.now().toString()).append("\n\n");
		reporte.append("Cena").append("\t").append(gastoCena).append("\tX").append("\n");
		reporte.append("Desayuno").append("\t").append(gastoDesayuno).append("\t ").append("\n");
		reporte.append("Alquiler de Auto").append("\t").append(gastoAuto).append("\t ").append("\n");
		reporte.append("\nGastos de comida: ").append(gastoCena + gastoDesayuno).append("\n")
				.append("Total de gastos: ").append(gastoCena + gastoDesayuno + gastoAuto);

		assertEquals(reportador.imprimir(gastos), reporte.toString());
	}

	@Test
	void reporteCuandoLosGastoDeDesayunoSonAltos() {

		gastoCena = 15;
		gastoDesayuno = 1001;
		gastoAuto = 200;

		gastos = List.of(new GastoCena(gastoCena), new GastoDesayuno(gastoDesayuno), new GastoAlquilerAuto(gastoAuto));

		reporte.append("Expenses ").append(LocalDate.now().toString()).append("\n\n");
		reporte.append("Cena").append("\t").append(gastoCena).append("\t ").append("\n");
		reporte.append("Desayuno").append("\t").append(gastoDesayuno).append("\tX").append("\n");
		reporte.append("Alquiler de Auto").append("\t").append(gastoAuto).append("\t ").append("\n");
		reporte.append("\nGastos de comida: ").append(gastoCena + gastoDesayuno).append("\n")
				.append("Total de gastos: ").append(gastoCena + gastoDesayuno + gastoAuto);

		assertEquals(reportador.imprimir(gastos), reporte.toString());
	}

}
