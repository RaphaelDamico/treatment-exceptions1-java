package udemy.poo.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private int numeroDoQuarto;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(int numeroDoQuarto, Date checkin, Date checkout) {
		this.numeroDoQuarto = numeroDoQuarto;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}

	public long duracao() {
		long dif = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}

	public void atualizaDatas(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {

		return String.format("""
				Quarto: %d
				Checkin: %s
				CheckOut: %s
				Duração: %d noites
				""", numeroDoQuarto, sdf.format(checkIn), sdf.format(checkOut), duracao());
	}
}
