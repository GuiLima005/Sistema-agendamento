package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {
    
    int linha;

    public MedicoPanel() {
        initComponents();
        criarTabelaMedico();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMedico = new javax.swing.JLabel();
        scrollMedico = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonDeletar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setLayout(null);

        labelMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMedico.setForeground(new java.awt.Color(0, 51, 255));
        labelMedico.setText("Médicos");
        add(labelMedico);
        labelMedico.setBounds(20, 10, 70, 20);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollMedico.setViewportView(tableMedico);

        add(scrollMedico);
        scrollMedico.setBounds(20, 50, 920, 220);

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

//        // Obtemos o índice da linha selecionada na tabela
        linha = tableMedico.getSelectedRow();
//
//        // Verificamos se a linha é diferente de -1
//        // -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o Médico que você deseja excluir!", "Médico", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        MedicoDialog medicoDialog = new MedicoDialog(null, true, TipoOperacao.ADICIONAR, null);
        medicoDialog.setVisible(true);

        criarTabelaMedico();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        linha = tableMedico.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um Médico para alterar.", "Médico", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed
private void editar() {

        Medico medico = MedicoDAO.getMedico(getCodigo());

        MedicoDialog medicoDialog = new MedicoDialog(
                null, true, TipoOperacao.ALTERAR, medico);
        medicoDialog.setVisible(true);
        criarTabelaMedico();
    }

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão do Médico selecionado?", "Médico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            criarTabelaMedico();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JScrollPane scrollMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables
private void criarTabelaMedico() {

        tableMedico.setModel(MedicoDAO.getTableModel());

        // Desativar o redimendionamento do JTable
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(150);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(350);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(417);

        // Impedir/Bloquear a movimentação da colunas
        tableMedico.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tableMedico.setDefaultEditor(Object.class, null);

    }
}
