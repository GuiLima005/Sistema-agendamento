package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282086\\projetos\\medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282086\\projetos\\medico_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public static void gravar(Medico medico) {
        medicos.add(medico);

        try {
            // Gravar medico no arquivo medico.txt
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            String novoMedico = medico.getMedicoSeperadoPorPontoEVirgula();

            bw.write(novoMedico);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte.",
                    "Erro ao gravar", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static boolean excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }

        atualizarArquivo();

        return false;

    }

    private static void atualizarArquivo() {

        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeperadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            // Fechar o arquivo temporário
            bwTemp.close();

            // Excluir o arquivo atual - medico.txt
            arquivoAtual.delete();

            //Renomear o aquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao criar o arquivo médico!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m), medico);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<Medico> listarTodos() {
        return medicos;
    }

    public static void getListaMedicos() {

        try {
            // Abrir o arquivo para leitura
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

                        
            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Medico novoMedico = new Medico(Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2], linhaVetor[3], linhaVetor[4]);
                medicos.add(novoMedico);
                linha = br.readLine();
            }

            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao abrir o arquivo medico",
                    "Erro de leitura", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static DefaultTableModel getTableModel() {

        //Matriz que receberá os medicos
        //que serão utilizados na tabela (JTable)
        Object[][] dados = new Object[medicos.size()][3];

        //For Each, para extrair cada objeto Medico do
        //Arraylist especialidades e separar cada dado na matriz dados
        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();

            i++;
        }

        //Definir um vetor com os nomes das colunas da tabela
        String[] titulos = {"Código", "CRM", "Nome do médico"};

        //Criar o modelo que será utilizado pela JTable
        //para exibir os dados dos medicos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
