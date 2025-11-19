package classesIniciais;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<>();
		
	public Aluno() {
	}
	

	public String getDataMatricula() {
		return dataMatricula;
	}


	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}


	public String getNomeEscola() {
		return nomeEscola;
	}


	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}


	public String getSerieMatriculado() {
		return serieMatriculado;
	}


	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}


	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public double getMedia() {
		double soma = 0.0;
		for(Disciplina disciplina : disciplinas) {
			soma += disciplina.getNota();
		}
		return soma/disciplinas.size();
	}
	
	public String getResultado() {
		if(getMedia() >= 50) {
			if(getMedia() >= 70) {
				return "Aprovado";
			}else {
				return "Recuperacao";
			}
		}else {
			return "Reprovado";
		}
	}

	
	
}
