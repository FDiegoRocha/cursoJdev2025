package exerciciosArquivoLeituraEscrita;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\cursoJdev2025\\src\\exerciciosArquivoLeituraEscrita\\PlanilhaAlunos.xlsx");
		
		XSSFWorkbook xssfworkbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = xssfworkbook.getSheetAt(0);
		
		for(Row row : sheet) {
			System.out.println(row.getCell(0) + " " + row.getCell(1) + " " + row.getCell(2));
		}

	}

}
