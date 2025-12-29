package aulasArquivoLeituraEscrita;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraArquivos {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		// FORMAS DE LEITURA DE ARQUIVO
		
		//1ª FORMA
		//FileInputStream arquivo = new FileInputStream(new File("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\arquivo.csv"));
		
		//2ª FORMA
		Scanner leituraArquivo = new Scanner(new File("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\arquivo.csv"), "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(leituraArquivo.hasNext()) {
			
			String linha = leituraArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				String[] dados = linha.split(";");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				pessoas.add(pessoa);
			}
		}
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		leituraArquivo.close();
	}

}
