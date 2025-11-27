package classesExecutaveis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import ClassesConstantes.StatusAluno;
import classesIniciais.Aluno;
import classesIniciais.Disciplina;
import classesIniciais.FuncaoAutenticacao;
import classesIniciais.Secretario;
import excecao.ExcecaoProcessarNota;
import interfacesIniciais.PermitirAcesso;

public class Application {

	public static void main(String[] args) {
		
		
		try {
			
			lerArquivo();
			
			
			String login = JOptionPane.showInputDialog("Informe o Login");
			String senha = JOptionPane.showInputDialog("Informe a Senha");
			
			// Interface com construtor
			PermitirAcesso permitirAcesso = new Secretario(login, senha);
			// interface com funcao
			//FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
			
			//autenticacao.autenticarCursoJava(permitirAcesso)
			
			if(new FuncaoAutenticacao(permitirAcesso).autenticarCursoJava()) {
				List<Aluno> alunos = new ArrayList<>();
				
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
				
				
				
				for(int qtd = 1; qtd <= 1; qtd++) {
				
					String nome = JOptionPane.showInputDialog("Nome do aluno "+qtd);
					String idade = JOptionPane.showInputDialog("Idade");
					
					Aluno aluno = new Aluno();
					
					aluno.setNome(nome);
					aluno.setIdade(Integer.valueOf(idade));
					
					for(int pos = 1; pos <= 2; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da "+ pos+ "ª Disciplina" );
						//String notaDisciplina = JOptionPane.showInputDialog("Nota da "+ pos+ "ª Disciplina");
						
						Disciplina disciplina = new Disciplina();
						disciplina.setNome(nomeDisciplina);
						//disciplina.setNota(Double.parseDouble(notaDisciplina));
						
						aluno.getDisciplinas().add(disciplina);
					}
					
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
					
					if(escolha == 0) {
						
						
						while(escolha == 0) {
							String disciplinas = "Digite o numero para remoção:\n";
							int posic=1;
							for(Disciplina disc : aluno.getDisciplinas()) {
								disciplinas += posic +": " + disc.getNome()+"\n";
								posic++;
							}
							String disciplinaRemover = JOptionPane.showInputDialog(disciplinas);
							aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover)-1);
							
							escolha = JOptionPane.showConfirmDialog(null, "Continuar a remover?");	
							if(aluno.getDisciplinas().size() == 0) {
								JOptionPane.showMessageDialog(null, "Não existem mais disciplinas!");
								escolha = 1;
							}
						}
					}
					
					alunos.add(aluno);				
					
				}
				
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				
				for (Aluno aluno : alunos) {
					if(aluno.getResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					}else if(aluno.getResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}else if(aluno.getResultado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}
				
				
				System.out.println("-----------------ALUNOS APROVADO----------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(aluno.getNome() + " - " + aluno.getMedia());
				}
				System.out.println("-----------------ALUNOS EM RECUPERACAO----------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(aluno.getNome() + " - " + aluno.getMedia());
				}
				System.out.println("-----------------ALUNOS REPROVADOS----------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(aluno.getNome() + " - " + aluno.getMedia());
				}
						
				
				/*for(Aluno aluno : alunos) {
					if(aluno.getNome().equalsIgnoreCase("alex")) {
						alunos.remove(aluno);
						break;
					}else {
						System.out.println(aluno);
						System.out.println("Média: " + aluno.getMedia());
						System.out.println("Resultado: " + aluno.getResultado());
						System.out.println("------------------------------------");
					}
				}*/
	
					
				}else {
					JOptionPane.showMessageDialog(null, "Acesso negado!");
				}
		
		}catch(Exception e) {
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();
			System.out.println("Mensagem: " + e.getMessage());
			
			for(int i = 0; i > e.getStackTrace().length; i++) {
				saida.append("Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("Médoto de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("linha de erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("classe: " + e.getClass().getName());
			}
			JOptionPane.showMessageDialog(null, "Erro a processar notas!" + saida.toString());
			
		}
	}
	
	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File file = new File("c://lines.txt");
			Scanner scanner = new Scanner(file);
			scanner.close();
		}catch(FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}

}
