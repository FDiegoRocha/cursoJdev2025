package aulasArquivoLeituraEscrita;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoEscrita {

	public static void main(String[] args) throws IOException {
		Pessoa pessoa1 = new Pessoa("Fernando Diego", "fernando@gmail.com", 37);
		Pessoa pessoa2 = new Pessoa("Maria Julia", "julia@gmail.com", 23);
		Pessoa pessoa3 = new Pessoa("Fabio Junior", "fabio@gmail.com", 55);
		
		// Pode vir do banco de dados ou qualquer fonte de dados
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		// Objeto do tipo File
		File arquivo = new File("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\arquivo.csv");
		
		// Se não existir cria o arquivo no caminho informado acima
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		// instancia um objeto para escrever no arquivo
		FileWriter escreverArquivo = new FileWriter(arquivo);
		
		// FORMA DE LER ARQUIVO
		//FileReader reader = new FileReader("");
		
		for(Pessoa p : pessoas) {
			escreverArquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}
		
		escreverArquivo.flush();
		escreverArquivo.close();
	}

}
