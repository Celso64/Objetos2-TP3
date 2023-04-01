package ar.unrn.eje1;

public class Ticket {

	private Double monto;
	private Integer puntos;

	public Ticket(Double monto, Integer puntos) {
		this.monto = monto;
		this.puntos = puntos;
	}

	Double getMonto() {
		return monto;
	}

	Integer getPuntos() {
		return puntos;
	}

}
