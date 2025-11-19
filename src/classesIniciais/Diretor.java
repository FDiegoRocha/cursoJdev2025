package classesIniciais;

import java.util.Objects;

public class Diretor extends Pessoa {
	private String registroEducacao;
	private String tempoDirecao;
	private String titulacao;
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, int idade, String dataNascimento, String registroGeral, String numeroCPF, String nomePai, String nomeMae, 
			String registroEducação, String tempoDirecao, String titulacao) {
		super(nome, idade, dataNascimento, registroGeral, numeroCPF, nomePai, nomeMae);
		this.registroEducacao = registroGeral;
		this.tempoDirecao = tempoDirecao;
		this.titulacao = titulacao;
		
	}

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public String getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(registroEducacao);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(registroEducacao, other.registroEducacao);
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getDataNascimento()="
				+ getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral() + ", getNumeroCPF()="
				+ getNumeroCPF() + ", getNomePai()=" + getNomePai() + ", getNomeMae()=" + getNomeMae() + "]";
	}
	
	
}
