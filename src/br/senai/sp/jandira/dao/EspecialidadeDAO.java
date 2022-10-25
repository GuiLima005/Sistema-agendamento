package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO { //Simular nosso banco de dados

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public EspecialidadeDAO(Especialidade especialidade) {
        especialidades.add(especialidade);
    }

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                return true;
            }
        }
        return false;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidades;
    }

    public static void criarEspecialidadeTeste() {
        Especialidade e1 = new Especialidade("Cardiologia", "cuida do coração");
        Especialidade e2 = new Especialidade("Cardiologia", "cuida do coração");
        Especialidade e3 = new Especialidade("Cardiologia", "cuida do coração");
        Especialidade e4 = new Especialidade("Cardiologia", "cuida do coração");
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);

    }

    public static DefaultTableModel getTableModel() {

        //Matriz que receberá as especialidades
        //que serão utilizados na tabela (JTable)
        Object[][] dados = new Object[especialidades.size()][3];

        //For Each, para extrair cada objeto Especialidade do
        //Arraylist especialidades e separar cada dado na matriz dados
        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }

        //Definir um vetor com os nomes das colunas da tabela
        String[] titulos = {"Código", "Especialidades", "Descrição"};

        //Criar o modelo que será utilizado pela JTable
        //para exibir os dados das especialidades
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
