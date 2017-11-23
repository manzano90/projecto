package br.usp.pcs.mvc;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	private String CPF;
	private String endereçao;
	private int codigo;
	
	public Cliente(String nome, String email, String telefone, String cpf, String endereçao, int codigo) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		CPF = cpf;
		this.endereçao = endereçao;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCPF() {
		return CPF;
	}

	public String getEndereçao() {
		return endereçao;
	}

	public int getCodigo() {
		return codigo;
	}	
}
