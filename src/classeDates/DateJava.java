package classeDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateJava {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		/*
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar Data em milisegundos: " + calendar.getTimeInMillis());
		System.out.println("Dia do mês: " + date.getDate());
		System.out.println("Calendar Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Calendar Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Calendar Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto da hora: " + date.getMinutes());
		System.out.println("Calendar Minuto da hora: " + calendar.get(Calendar.MINUTE));
		System.out.println("Secundos: " + date.getSeconds());
		System.out.println("Calendar Secundos: " + calendar.get(Calendar.SECOND));
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Calendar Ano: " + calendar.get(Calendar.YEAR) );*/

		// ---------------- Simple Date Format -----------------------
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrão e string: " + sdf.format(date));
		
		System.out.println("Calendar Data atual em formato padrão e string: " + sdf.format(calendar.getTime()));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

		System.out.println("Data atual em formato banco de dados: " + sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Objeto Date: " + sdf2.parse("11/10/1994"));

		// ---------------------- Before e Afte -------------------------------
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimento = sdf3.parse("10/04/2021");
		Date dataAtualHoje = sdf3.parse("11/04/2021");
		
		if(dataVencimento.after(dataAtualHoje)) {
			System.out.println("Boleto vencido - Urgente!");
		}else {
			System.out.println("Boleto não vencido");
		}
		
		if(dataVencimento.before(dataAtualHoje)) {
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - Urgente!");
		}

	}

}
