package aulasArquivoLeituraEscrita;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreverJson {

	public static void main(String[] args) throws IOException {
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Fernando Diego");
		usuario1.setLogin("Fernandão");
		usuario1.setSenha("123456");
		usuario1.setCpf("45678912365");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("João Silva");
		usuario2.setLogin("João");
		usuario2.setSenha("65479");
		usuario2.setCpf("78945698");
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		// Biblioteca Gson = cria um arquivo json estruturado
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// converte os objetos em json
		String jsonUser = gson.toJson(usuarios);
		
		//System.out.println(jsonUser);
		
		FileWriter escritaArq = new FileWriter("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\filjson.json"); 
		
		escritaArq.write(jsonUser);
		escritaArq.flush();
		escritaArq.close();
		
		// --------------------------------- LENDO ARQUIVO JSON ---------------------------------------------
		
		FileReader fileReader = new FileReader("C:\\cursoJdev2025\\src\\aulasArquivoLeituraEscrita\\filjson.json");
		// transoforma o arquivo em Array de json
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		System.out.println(jsonArray);
		
		List<Usuario> listUsuarios = new ArrayList<>();
		
		for(JsonElement jsonElement : jsonArray) {
			// converte elementos json em objetos Usuario
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
		}
		
		
	}

}
