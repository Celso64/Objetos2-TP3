package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class Recaudacion {
	public static List<Map<String, String>> where(Map<String, String> options) throws IOException {

		// Encapsule las manipulaciones referentes a los datos del .csv en la clase CSV
		// Extrai las clases Main y NoSuchEntryException y las puse en archivos propios
		Tabla tabla = new CSVTabla(new CSVReader(new FileReader("data.csv")));

		List<String> claves = new ArrayList<>(options.keySet());

		claves.forEach(x -> tabla.filtrarPorColumna(x, options.get(x)));

		return tabla.generarTabla();
	}

}
