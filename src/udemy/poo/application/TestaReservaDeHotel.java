package udemy.poo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import udemy.poo.classes.Reserva;

public class TestaReservaDeHotel {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de checkIn: ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data de checkOut: ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reserva rsv = new Reserva(numero, checkIn, checkOut);
			System.out.println("Reserva: " + rsv);
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva:  ");
			System.out.print("Data de checkIn: ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de checkOut: ");
			checkOut = sdf.parse(sc.next());

			rsv.atualizaDatas(checkIn, checkOut);
			System.out.println(rsv);

		}

		sc.close();
	}
}
