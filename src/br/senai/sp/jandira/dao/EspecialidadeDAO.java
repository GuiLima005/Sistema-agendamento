package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO { //Simular nosso banco de dados

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282086\\projetos\\especialidade.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282086\\projetos\\especialidade_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public EspecialidadeDAO(Especialidade especialidade) {
        especialidades.add(especialidade);
    }

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);

        try {
            // Gravar a especialidade no arquivo Especialidade.txt
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            bw.write(especialidade.getEspecialidadeSeperadoPorPontoEVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte.",
                    "Erro ao gravar", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            arquivoTemp.createNewFile();
            
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeperadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            // Fechar o arquivo temporário
            bwTemp.close();

            // Excluir o arquivo atual - especialidade.txt
            //arquivoAtual.delete();

            //Renomear o aquivo temporário
            //arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao criar o arquivo!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
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

    public static void getEspecialidade() {

        try {
            // Abrir o arquivo para leitura
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Especialidade novaEspecialidade = new Especialidade(
                        Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]);
                especialidades.add(novaEspecialidade);
                linha = br.readLine();
            }

            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao abrir o arquivo",
                    "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }

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
