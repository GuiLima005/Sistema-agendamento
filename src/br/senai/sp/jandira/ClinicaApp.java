package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
	
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		
		System.out.println(especialidade.getNome());		
		
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.seTipoDoPlano("Bronze");
//		
//		JOptionPane.showMessageDialog(null, plano.getOperadora());
//		JOptionPane.showMessageDialog(null, plano.getTipoDoPlano());
//		JOptionPane.showMessageDialog(null, plano.getDadosDoPlano());
//		
		PlanoDeSaude planoBradesco = new PlanoDeSaude();
		planoBradesco.setOperadora("Bradesco");
		planoBradesco.seTipoDoPlano("Ouro");
		
		System.out.println(planoBradesco.getTipoDoPlano());
//		JOptionPane.showMessageDialog(null, planoBradesco.getOperadora());
	
		System.out.println(planoBradesco.getDadosDoPlano());
	
	
	
	
	}

}
