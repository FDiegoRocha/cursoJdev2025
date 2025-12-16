package classeDates;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ClassePeriod {

	public static void main(String[] args) {
		
		LocalDate inicial = LocalDate.parse("2020-09-10");
		
		LocalDate Dfinal = LocalDate.parse("2024-10-11");
		
		Period periodo = Period.between(inicial, Dfinal);
		
		System.out.println("Dia: "+ periodo.getDays() );
		
		System.out.println("Mês: "+ periodo.getMonths() );

		System.out.println("Ano: "+ periodo.getYears());
		
		System.out.println("Total de meses: " + periodo.toTotalMonths());
		
		System.out.println("Diferença dos Periodos: " + periodo.getYears() + " ano(s) " + periodo.getMonths() + " mes(es) " + periodo.getDays() + " dia(s)." );
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		System.out.println("");
		System.out.println("Data Base Boletos: " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		for(int mes = 1; mes <= 12; mes ++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Data de vencimento do " + mes + "º Boleto : " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
		

	}

}
