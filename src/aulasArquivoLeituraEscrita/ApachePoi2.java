package aulasArquivoLeituraEscrita;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\arquivo1.xls");
		
		FileInputStream entrada = new FileInputStream(arquivo);
	
		HSSFWorkbook hssfWorkBook = new HSSFWorkbook(entrada); // serve para leitura a planilha
		
		HSSFSheet planilha = hssfWorkBook.getSheetAt(0); // pega a primeira planliha do arquivo excel
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(linhaIterator.hasNext()) { // enquanto tiver linha continue;
			Row linha = linhaIterator.next(); // pegando cada linha;

			Iterator<Cell> celula = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while(celula.hasNext()) {
				Cell cell = celula.next();
				
				switch(cell.getColumnIndex()) {
				
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2: 
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
			}
			pessoas.add(pessoa);
			
		}
		
		entrada.close();
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		
		

	}

}
