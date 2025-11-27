package classesExecutaveis;

import classesIniciais.Aluno;
import classesIniciais.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		double[] notas = {8.5, 6.3, 7.7, 9.2};
		double[] notasLogica = {7.5, 5.3, 8.7, 6.2};
		
		//Criação de aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Diego Rocha");
		aluno.setNomeEscola("JDEV Treinamentos");
		
		//Criação Disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("Curso Java");
		disciplina.setNotas(notas);
		
		Disciplina disciplinaLogica = new Disciplina();
		disciplinaLogica.setNome("Curso Logica");
		disciplinaLogica.setNotas(notasLogica);
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplinaLogica);
		
		System.out.println("Nome do Aluno: " + aluno.getNome() + ", inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("----------Disciplinas do Aluno----------");
		for(Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + disc.getNome());
			int pos = 1;
			double notaMax = 0.0;
			double notaMin = 0.0;
			for(double nota: disc.getNotas()) {
				System.out.println("Nota " + pos +" é igual a: "+ nota);
				if(pos == 1) {
					notaMax = nota;
					notaMin = nota;
				}else {
					if(nota > notaMax) {
						notaMax = nota;
					}
					if(nota < notaMin) {
						notaMin = nota;
					}
				}
				pos++;
			}
			System.out.println("A maior nota da disciplina "+ disc.getNome() + " é: " + notaMax);
			System.out.println("A menor nota da disciplina "+ disc.getNome() + " é: " + notaMin);
		}
		
		

	}

}
