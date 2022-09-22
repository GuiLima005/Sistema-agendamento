package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) {

//		// Vetor com 3 planos de saúde
//		PlanoDeSaude plano1 = new PlanoDeSaude();
//		plano1.setOperadora("Unimed");
//		plano1.seTipoDoPlano("Bronze");
//		
//		PlanoDeSaude[] planos = {plano1, new PlanoDeSaude("Porto Seguro"), new PlanoDeSaude("Allianz", "Ouro")};
//		
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[0].getTipoDoPlano());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[1].getTipoDoPlano());
//		System.out.println(planos[2].getOperadora());
//		System.out.println(planos[2].getTipoDoPlano());
//		
//		
//		//Utilização do ArrayList
//		ArrayList<String> cidades = new ArrayList<>();
//		cidades.add("São Paulo");
//		cidades.add("Jandira");
//		cidades.add("Barueri");
//		cidades.add("Itapevi");
//		cidades.add("Cotia");
//		cidades.add("Carapicuíba");
//		
//		System.out.println(cidades.get(4));
//		System.out.println(cidades.size());
//		
//		ArrayList<PlanoDeSaude> planos2 = new ArrayList<>();
//		planos2.add(new PlanoDeSaude("Notredame"));
//		planos2.add(new PlanoDeSaude("Ativia"));
//		planos2.add(new PlanoDeSaude("Bio Saúde"));
//		planos2.add(new PlanoDeSaude("Blue Med", "Exclusive"));
//		
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("Ameplan");
//		planoNovo.seTipoDoPlano("Prata");
//		
//		planos2.add(planoNovo);
//		
//		//Adicoinar o tipo do plano no plano Notredame
//		planos2.get(0).seTipoDoPlano("Basic");
//		
//		System.out.println(planos2.get(4).getDadosDoPlano());	
//		System.out.println(planos2.get(0).getDadosDoPlano());	
//		
////		int nota1 = 10;
////		Integer nota2 = 5;
//		
//		
//		ArrayList<Double> precoslist = new ArrayList<>();
//		precoslist.add(5.9);
//		
//		System.out.println(precoslist.get(0));
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		
		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		dao.gravar(plano1);
		dao.gravar(plano2);
		
		System.out.println(dao.listarTodos());
		
		
		
	}

}
