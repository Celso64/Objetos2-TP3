package ar.unrn.eje1;

import java.util.Objects;

public class Alquiler {
	private CopiaLibro copia;
	private int diasAlquilados;

	public Alquiler(CopiaLibro copia, int diasAlquilados) {
		this.copia = Objects.requireNonNull(copia);
		this.diasAlquilados = Objects.requireNonNull(diasAlquilados);
	}

	// Quite el Getter de copia y de dias alquilados
	// En su lugar, calcula internamente el valor pedido (Tell, dont ask)
	public Double calcularMonto() {
		return this.copia.calcularMonto(this.diasAlquilados);
	}

	public Integer calcularPuntos() {
		return this.copia.calcularPuntos(this.diasAlquilados);
	}

}
