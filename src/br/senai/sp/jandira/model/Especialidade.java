package br.senai.sp.jandira.model;

public class Especialidade {

	private String nome;
	private String descricao;
	
	
	//Método de acesso getters and setters
	public	void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}