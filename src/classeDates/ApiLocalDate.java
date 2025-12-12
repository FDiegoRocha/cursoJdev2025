package classeDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiLocalDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")));
		
		LocalDate date1 = LocalDate.parse("2025-10-11");
		System.out.println(date1);
		
		System.out.println("Dia mês: "+date.getDayOfMonth());
		System.out.println("Mês: " + date.getMonth());
		System.out.println("Valor Mês: " + date.getMonthValue());
		System.out.println("Ano: " + date.getYear());
		System.out.println("Dia da Semana: " + date.getDayOfWeek());
		System.out.println("Dia da Semana: " + date.getDayOfWeek().getValue());



	}

}
