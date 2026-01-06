package aulasArquivoLeituraEscrita;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando2 {

		public static void main(String[] args) throws IOException {
			
			File file = new File("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\arquivo1.xls");
			
			FileInputStream entrada = new FileInputStream(file);
			
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
			
			HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
			
			Iterator<Row> linhaIterator = planilha.iterator();
			
			while(linhaIterator.hasNext()) {
				Row linha = linhaIterator.next();
				
				Cell cell = linha.getCell(0);
				String conteudoCell = cell.getStringCellValue();
				cell.setCellValue(conteudoCell + " Editado para aula");
			}
			
			entrada.close();
			FileOutputStream saida = new FileOutputStream(file);
			hssfWorkbook.write(saida);
			
			saida.flush();
			saida.close();
			
			System.out.println("Planilha Editada!");
			
		}
}
