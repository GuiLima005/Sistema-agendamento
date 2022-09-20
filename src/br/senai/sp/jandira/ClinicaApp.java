package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
	
		//ESpecialidades
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Fisioterapia");
		especialidade3.setDescricao("Ela estuda, diagnostica, previne e trata os distúrbios, entre outros, cinético-funcionais decorrentes de alterações de órgãos e sistemas humanos.");
		
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Gastroenterologia");
		
		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Cliníca geral");
		especialidade5.setDescricao("O clínico geral é o profissional responsável por diagnosticar doenças, desde as mais simples até as mais complexas");
		
		//Planos
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Unimed");
		plano1.seTipoDoPlano("Bronze");

		
		PlanoDeSaude plano2 = new PlanoDeSaude();
		plano2.setOperadora("Bradesco");
		plano2.seTipoDoPlano("Ouro");
		
		//Endereço
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Rua Elton Silva");
		endereco1.setNumero("905");
		endereco1.setBairro("Centro");
		endereco1.setCidade("Jandira");
		endereco1.setEstado(Estados.SAO_PAULO);
		endereco1.setComplemento("Escola");
		endereco1.setPontoDeReferencia("Em frente a escola");
		endereco1.setCep("06600-025");
		
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Av. Barão de Limeira");
		endereco2.setNumero("158");
		endereco2.setBairro("Santa Cecília");
		endereco2.setCidade("São Paulo");
		endereco2.setEstado(Estados.RIO_GRANDE_DO_SUL);
		endereco2.setComplemento("Escola");
		endereco2.setCep("06658-006");

		//Médicos
		Medico medico1 = new Medico();
		medico1.setNome("Ana Paula");
		medico1.setCrm("8956-96");
		medico1.setSexo("Feminino");
		medico1.setDataDeNascimento(LocalDate.of(1997, 5, 15)); //15/05/1997
		
		//A Dra. Ana é Cliníca Geral e Fisioterapeuta
		Especialidade[] especialidades = {especialidade3, especialidade5};
		medico1.setEspecialidades(especialidades);
		
		//Criar o Dr. Pedro Oliveira, nascido em 20/08/1984 e 
		// que trabalha com o cardiologia, fisioterapia e clinica geral
		Medico medico2 = new Medico();
		medico2.setNome("Pedro Oliveira");
		medico2.setCrm("8956-18");
		medico2.setSexo("Masculino");
		medico2.setDataDeNascimento(LocalDate.of(1984, 8, 20)); //20/08/1984
	
		
		Especialidade[] especialidades2 = {especialidade1, especialidade3, especialidade5};
		medico2.setEspecialidades(especialidades2);
	
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Guilherme Lima");
		paciente1.setCpf("123-456-789-10");
		paciente1.setGenero(Genero.MASCULINO);
		paciente1.setEmail("gui@gmail.com");
		paciente1.setPlanoDeSaude(plano2);
		paciente1.setRg("12.345.678.9");
		paciente1.setTelefone("(11)12345-6789");
		paciente1.setEndereco(endereco1);
		paciente1.setTipoSanguineo("O+");
	
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Gustavo Lima");
		paciente2.setCpf("109-876-543-21");
		paciente2.setGenero(Genero.MASCULINO);
		paciente2.setEmail("gustavo@gmail.com");
		paciente2.setPlanoDeSaude(plano1);
		paciente2.setRg("98.765.432.1");
		paciente2.setTelefone("(11)98765-4321");
		paciente2.setEndereco(endereco2);
		paciente2.setTipoSanguineo("O+");
		
		//Exibir os dados do paciente
		// Nome:
	    // Cidade:
		// Estado:
		// Telefone:
		// Operadora do plano de saúde:
		
		System.out.println("Nome: " + paciente1.getNome());
		System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
		System.out.println("Estado: " + paciente1.getEndereco().getEstado());
		System.out.println("Telefone: " + paciente1.getTelefone());
		System.out.println("Operadora: " + paciente1.getPlanoDeSaude().getOperadora());
		System.out.println("-----------------------------------------------------------");
		System.out.println("Nome: " + paciente2.getNome());
		System.out.println("Cidade: " + paciente2.getEndereco().getCidade());
		System.out.println("Estado: " + paciente2.getEndereco().getEstado());
		System.out.println("Telefone: " + paciente2.getTelefone());
		System.out.println("Operadora: " + paciente2.getPlanoDeSaude().getOperadora());
		
		//Fazer agendamento para paciente1
		//O paciente precisar passar com um cliníco geral
		//No dia 22/09/2022, 15h25
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);	
		agenda1.setEspecialidade(especialidade5);
		agenda1.setMedico(medico2);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(15, 25));
		agenda1.setObservacao("Paciente reclamando de dor nas costas");
		
		// Exibir os dados do agendamento
		//"Nome do paciente:" +
		//Especialidade:
		//Nome do medíco:
		//Data e hora do atendimento:
		//Observação:
		//Plano de saúde (Operadora):
		System.out.println();
		System.out.println("--------------AGENDA---------------");
		System.out.println("Nome do paciente:" + agenda1.getPaciente().getNome());
		System.out.println("Especialidade:" + agenda1.getEspecialidade().getNome());
		System.out.println("medíco:" + agenda1.getMedico().getNome());
		System.out.println("Data:" + agenda1.getDataDaConsulta() + " - " + agenda1.getHoraDaConsulta());
		System.out.println("Obs:" + agenda1.getObservacao());
		System.out.println("Plano de saúde:" + agenda1.getPaciente().getPlanoDeSaude().getOperadora());
		
		//Fazer um agendamento de consulta para o paciente2
		//O paciente2 precisa passar com um cardiologita
		//No dia 26/09/2022, as 09h00
		
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);	
		agenda2.setEspecialidade(especialidade1);
		agenda2.setMedico(medico2);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 9, 26));
		agenda2.setHoraDaConsulta(LocalTime.of(9, 00));
		agenda2.setObservacao("Paciente tossindo muito");
		
		System.out.println();
		System.out.println("--------------AGENDA2---------------");
		System.out.println("Nome do paciente:" + agenda2.getPaciente().getNome());
		System.out.println("Especialidade:" + agenda2.getEspecialidade().getNome());
		System.out.println("medíco:" + agenda2.getMedico().getNome());
		System.out.println("Data:" + agenda2.getDataDaConsulta() + " - " + agenda2.getHoraDaConsulta());
		System.out.println("Obs:" + agenda2.getObservacao());
		System.out.println("Plano de saúde:" + agenda2.getPaciente().getPlanoDeSaude().getOperadora());
		
		
		
	}
}
