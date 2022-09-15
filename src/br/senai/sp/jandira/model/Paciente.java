package br.senai.sp.jandira.model;

public class Paciente {

	private String nome;
	private String email;
	private PlanoDeSaude planoDeSaude;
//	private String 
//	private String 
//	private String 
//	private String 
//	private String 
	
	//Métodos de acesso
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}
}
