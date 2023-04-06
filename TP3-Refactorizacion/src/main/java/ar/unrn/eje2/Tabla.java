package ar.unrn.eje2;

import java.util.List;
import java.util.Map;

public interface Tabla {

	void filtrarPorColumna(String columna, String valorFiltro);

	List<Map<String, String>> generarTabla();

}
