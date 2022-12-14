package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22282086\\projetos\\plano_de_saude.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282086\\projetos\\plano_de_saude_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);

        try {
            // Gravar o plano de saúde no arquivo
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            String novoPlanoDeSaude = planoDeSaude.getPlanoDeSaudeSeperadoPorPontoEVirgula();

            bw.write(novoPlanoDeSaude);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte.",
                    "Erro ao gravar", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                planos.remove(p);
                break;
            }
        }

        atualizarArquivo();
        
        return false;
    }

    private static void atualizarArquivo() {
        // Reconstruir um arquivo atualizado, ou seja,
        // sem o plano que foi removido

        // Passo 01 - Criar uma representação dos arquivos que serão manipulados        
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            //Criar o arquivo temporário para escrita
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar os planos no arquivo temporário
            for (PlanoDeSaude p : planos) {
                bwTemp.write(p.getPlanoDeSaudeSeperadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            // Fechar o arquivo temporário
            bwTemp.close();

            // Excluir o arquivo atual - plano_de_saude.txt
            arquivoAtual.delete();

            //Renomear o aquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao criar o arquivo plano de sade!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void getListaPlanosDeSaude() {

        try {
            // Abrir o arquivo para leitura
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude(
                        Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]);
                planos.add(novoPlanoDeSaude);
                linha = br.readLine();
            }

            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao abrir o arquivo plano de saúde",
                    "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static DefaultTableModel getTableModel() {

        //Matriz que receberá os planos de saúde
        //que serão utilizados na tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        //For Each, para extrair cada objeto plano de saúde do
        //Arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        //Definir um vetor com os nomes das colunas da tabela
        String[] titulos = {"Código", "Nome da operadora", "Tipo do plano"};

        //Criar o modelo que será utilizado pela JTable
        //para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
