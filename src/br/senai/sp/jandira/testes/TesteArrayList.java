package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
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
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		
		int i = 0;
		
		while (i < planos.size()) {
		System.out.println(planos.get(i).getOperadora());
		i++;
		}
		
		// Looping FOR
//		for(contador;condição;acumulador) {
//			
//		}
		System.out.println("------------------------------------");
		for(int contador = 0; contador < planos.size(); contador++) {
			System.out.println(planos.get(contador).getOperadora());
		}
		
		//Interação em listas - ArrayList<>
		System.out.println("------------------------------------");
		for(PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		
		//Criar 3 especialidades, guardar as especialidades em um arraylist 
		//e exibir o nome das especialidades usando for each
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardiologia");
		e1.setDescricao("Cuida do coração");
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Otorrino");
		e2.setDescricao("Cuida do ouvido");
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Fisioterapia");
		e3.setDescricao("Cuida dos ossos e músculos");
		
		
		
		ArrayList<Especialidade> especialidade = new ArrayList<>();
		especialidade.add(e1);
		especialidade.add(e2);
		especialidade.add(e3);
		
		System.out.println("------------------------------------");
		for(Especialidade e : especialidade) {
			System.out.printf("%s --> %s\n", e.getNome(), e.getDescricao());
		}
		
		
		
		
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		System.out.println(dao.listarTodos());
//		
//		
		
	}

}
