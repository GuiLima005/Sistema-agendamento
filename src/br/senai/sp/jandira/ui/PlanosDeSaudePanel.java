package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanosDeSaudePanel extends javax.swing.JPanel {

    int linha;

    public PlanosDeSaudePanel() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        scrollPlanoDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonDeletar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(960, 400));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Plano de Saúde");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 110, 20);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanoDeSaude.setViewportView(tablePlanosDeSaude);

        add(scrollPlanoDeSaude);
        scrollPlanoDeSaude.setBounds(20, 50, 920, 220);

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
        buttonAdicionar.setToolTipText("Adicionar Plano de Saúde");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(860, 300, 70, 60);

        buttonAlterar.setBackground(new java.awt.Color(246, 246, 246));
        buttonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar48.png"))); // NOI18N
        buttonAlterar.setToolTipText("Alterar Plano de Saúde selecionado");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });
        add(buttonAlterar);
        buttonAlterar.setBounds(770, 300, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PlanosDeSaudeDialog planosDeSaudeDialog = new PlanosDeSaudeDialog(null, true, TipoOperacao.ADICIONAR, null);
        planosDeSaudeDialog.setVisible(true);

        criarTabelaPlanosDeSaude();

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed

        // Obtemos o índice da linha selecionada na tabela
        linha = tablePlanosDeSaude.getSelectedRow();

        // Verificamos se a linha é diferente de -1
        // -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione o plano que você deseja excluir!", "Plano de Saúde", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonDeletarActionPerformed
    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        
        linha = tablePlanosDeSaude.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um plano de saúde para alterar.", "Plano de Saúde", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void editar() {
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());

        PlanosDeSaudeDialog planosDeSaudeDialog = new PlanosDeSaudeDialog(null, true, TipoOperacao.ALTERAR, planoDeSaude);
        planosDeSaudeDialog.setVisible(true);
        criarTabelaPlanosDeSaude();
    }

    //Excluir o plano
    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão do plano de saúde selecionado?", "Plano de Saúde", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            criarTabelaPlanosDeSaude();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tablePlanosDeSaude.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollPlanoDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables
 private void criarTabelaPlanosDeSaude() {

        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());

        // Desativar o redimendionamento do JTable
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(150);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(350);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(350);

        // Impedir/Bloquear a movimentação da colunas
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);

    }

}
