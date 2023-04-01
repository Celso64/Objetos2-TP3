package ar.unrn.eje2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.opencsv.CSVReader;

class CSV {

	private List<String> csvNombreColumnas;
	private List<String[]> csvDatos;

	CSV(CSVReader reader) {

		Objects.requireNonNull(reader);
		this.csvDatos = new ArrayList<>();

		reader.forEach(csvDatos::add);
		this.csvNombreColumnas = List.of(csvDatos.get(0));
		this.csvDatos.remove(0);
	}

	void filtrarPorColumna(String columna, String valorFiltro) {

		if (!this.csvNombreColumnas.contains(columna))
			throw new RuntimeException("La columna no existe");

		Integer clave = this.csvNombreColumnas.indexOf(columna);
		csvDatos = csvDatos.stream().filter(x -> x[clave].equals(valorFiltro)).toList();
	}

	List<Map<String, String>> generarTabla() {

		List<Map<String, String>> tabla = new ArrayList<>();

		for (int i = 0; i < this.csvDatos.size(); i++) {
			tabla.add(this.generarFila(i));
		}

		return tabla;

	}

	private Map<String, String> generarFila(Integer posicion) {
		Map<String, String> fila = new HashMap<>();
		for (int i = 0; i < this.csvNombreColumnas.size(); i++) {
			fila.put(this.csvNombreColumnas.get(i), this.csvDatos.get(posicion)[i]);
		}
		return fila;
	}

}
