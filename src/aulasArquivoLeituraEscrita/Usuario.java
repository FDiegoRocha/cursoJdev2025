package aulasArquivoLeituraEscrita;

import java.io.Serializable;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String login;
	private String senha;
	private String Cpf;

	public Usuario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	
	

}
