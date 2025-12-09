package classeDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		
		// Simular data que vem do banco de dados
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println("Somando dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.YEAR, 1);
		
		System.out.println("Somando 1 ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		
		long quant = ChronoUnit.DAYS.between(LocalDate.parse("2025-01-01"), LocalDate.now());
		
		long quant1 = ChronoUnit.MONTHS.between(LocalDate.parse("2025-01-01"), LocalDate.now()); 
		
		long quant2 = ChronoUnit.HOURS.between(LocalDateTime.parse("2025-12-09T11:40:00"), LocalDateTime.now());
		
		long quant3 = ChronoUnit.YEARS.between(LocalDateTime.parse("2023-12-09T11:40:00"), LocalDateTime.parse("2025-12-09T11:40:00"));
		
		System.out.println("Possui " + quant + " dias entre a faixa de data");
		
		System.out.println("Possui " + quant2 + " horas entre a faixa de data");
		
		System.out.println("Possui " + quant1 + " meses entre a faixa de data");
		
		System.out.println("Possui " + quant3 + " anos entre a faixa de data");
	}

}
