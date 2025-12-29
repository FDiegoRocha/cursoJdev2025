package aulasArquivoLeituraEscrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Teste {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\arquivo.csv");

		// leitura
		List<String> linhas = Files.readAllLines(path);
		
		for(String linha: linhas) {
			System.out.println(linha);
		}

		// escrita
		Files.write(path, "Texto".getBytes());

		

	}

}
