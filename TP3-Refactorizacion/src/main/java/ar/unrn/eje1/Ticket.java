package ar.unrn.eje1;

import java.util.Objects;

public class Ticket {

	private Double monto;
	private Integer puntos;

	public Ticket(Double monto, Integer puntos) {
		this.monto = Objects.requireNonNull(monto);
		this.puntos = Objects.requireNonNull(puntos);
	}

	Double getMonto() {
		return monto;
	}

	Integer getPuntos() {
		return puntos;
	}

}
