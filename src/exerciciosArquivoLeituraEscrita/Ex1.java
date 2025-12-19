package exerciciosArquivoLeituraEscrita;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Ex1 {

	public static void main(String[] args) throws IOException {
		
		File arq = new File("C:\\cursoJdev2025\\src\\exerciciosArquivoLeituraEscrita\\PlanilhaAlunos.xlsx");
		
		XSSFWorkbook xssfworkbook = new XSSFWorkbook();
		
		XSSFSheet sheet = xssfworkbook.createSheet("Alunos");
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		cell.setCellValue("Nome");
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Idade");
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("Curso");
		
		row = sheet.createRow(1);
		
		cell = row.createCell(0);
		cell.setCellValue("Julia");
		cell1 = row.createCell(1);
		cell1.setCellValue("30");
		cell2 = row.createCell(2);
		cell2.setCellValue("JAVA");
		
		row = sheet.createRow(2);
		
		cell = row.createCell(0);
		cell.setCellValue("Felipe");
		cell1 = row.createCell(1);
		cell1.setCellValue("25");
		cell2 = row.createCell(2);
		cell2.setCellValue("HTML");
		
		row = sheet.createRow(3);
		
		cell = row.createCell(0);
		cell.setCellValue("Maria");
		cell1 = row.createCell(1);
		cell1.setCellValue("40");
		cell2 = row.createCell(2);
		cell2.setCellValue("Administração");
		
		FileOutputStream out = new FileOutputStream(arq);
		xssfworkbook.write(out);
		
		out.flush();
		out.close();
		xssfworkbook.close();
		

	}

}
