package aulasArquivoLeituraEscrita;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\arquivo1.xls");
		
		// Se não existir cria o arquivo no caminho informado acima
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		Pessoa pessoa1 = new Pessoa("Fernando Diego", "fernando@gmail.com", 37);
		Pessoa pessoa2 = new Pessoa("Maria Julia", "julia@gmail.com", 23);
		Pessoa pessoa3 = new Pessoa("Fabio Junior", "fabio@gmail.com", 55);
		Pessoa pessoa4 = new Pessoa("Erick julio", "Erick@gmail.com", 40);
		
		// Pode vir do banco de dados ou qualquer fonte de dados
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		HSSFWorkbook hssfWorkBook = new HSSFWorkbook(); // serve para escrever a planilha
		HSSFSheet linhasPessoa = hssfWorkBook.createSheet("Planiha de pessoas Jdev Treinamento"); // criar a planilha
		
		int numeroLinha = 0;
		
		for(Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha ++); // Criando linha na planilha
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula ++); // célula 0
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula ++);// célula 1
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula ++);// célula 2
			celIdade.setCellValue(p.getIdade());
		}
		
		FileOutputStream saida = new FileOutputStream(arquivo);
		hssfWorkBook.write(saida); // escrever planilha em arquivo
		saida.flush();
		saida.close();
		
		System.out.println("Planilha criada!");

	}

}
