package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EspecialidadePanel extends javax.swing.JPanel {

    int linha;

    public EspecialidadePanel() {
        initComponents();
        criarTabelaEspecialidade();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEspecialidade = new javax.swing.JLabel();
        scrollEspecialidade = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();
        buttonDeletar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(960, 400));
        setLayout(null);

        labelEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEspecialidade.setForeground(new java.awt.Color(0, 51, 255));
        labelEspecialidade.setText("Especialidade");
        add(labelEspecialidade);
        labelEspecialidade.setBounds(20, 10, 100, 20);

        tableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollEspecialidade.setViewportView(tableEspecialidade);

        add(scrollEspecialidade);
        scrollEspecialidade.setBounds(20, 50, 920, 220);

        buttonDeletar.setBackground(new java.awt.Color(246, 246, 246));
        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/deletar48.png"))); // NOI18N
        buttonDeletar.setToolTipText("Excluir Plano de Saúde selecionado");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });
        add(buttonDeletar);
        buttonDeletar.setBounds(680, 300, 70, 60);

        buttonAdicionar.setBackground(new java.awt.Color(246, 246, 246));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar48.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar Especialidade");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(860, 300, 70, 60);

        buttonAlterar.setBackground(new java.awt.Color(246, 246, 246));
        buttonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar48.png"))); // NOI18N
        buttonAlterar.setToolTipText("Alterar Especialidade selecionado");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });
        add(buttonAlterar);
        buttonAlterar.setBounds(770, 300, 70, 60);
    }// </editor-fold>//GEN-END:initComponents
    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed

        // Obtemos o índice da linha selecionada na tabela
        linha = tableEspecialidade.getSelectedRow();

        // Verificamos se a linha é diferente de -1
        // -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione a especialidade que você deseja excluir!", "Especialidade", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonDeletarActionPerformed
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, TipoOperacao.ADICIONAR, null);
        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidade();
    }//GEN-LAST:event_buttonAdicionarActionPerformed
    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        linha = tableEspecialidade.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma especialidade para alterar.", "Especialidade", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed
    private void editar() {

        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());

        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, TipoOperacao.ALTERAR, especialidade);
        especialidadeDialog.setVisible(true);
        criarTabelaEspecialidade();
    }

    //Excluir a especialidade
    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão da especialidade selecionado?", "Especialidade", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDAO.excluir(getCodigo());
            criarTabelaEspecialidade();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tableEspecialidade.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JScrollPane scrollEspecialidade;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables
private void criarTabelaEspecialidade() {

        tableEspecialidade.setModel(EspecialidadeDAO.getTableModel());

        // Desativar o redimendionamento do JTable
        tableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(150);
        tableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(350);
        tableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(350);

        // Impedir/Bloquear a movimentação da colunas
        tableEspecialidade.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tableEspecialidade.setDefaultEditor(Object.class, null);

    }

}
