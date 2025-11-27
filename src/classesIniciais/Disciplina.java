package classesIniciais;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {
	private String nome;
	private double[] notas = new double[4];
	
	public Disciplina() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double getMediaNotas() {
		double somaNotas = 0.0;
		
		for(double nota : notas) {
			somaNotas += nota;
		}
		
		return somaNotas / notas.length;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(nome);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(nome, other.nome) && Arrays.equals(notas, other.notas);
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}

	
	

}
