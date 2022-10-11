package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;

public class PlanosDeSaudePanel extends javax.swing.JPanel {

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
        buttonEditar = new javax.swing.JButton();

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
        scrollPlanoDeSaude.setBounds(20, 40, 920, 220);

        buttonDeletar.setBackground(new java.awt.Color(246, 246, 246));
        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/deletar48.png"))); // NOI18N
        buttonDeletar.setToolTipText("Excluir Plano de Saúde selecionado");
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

        buttonEditar.setBackground(new java.awt.Color(246, 246, 246));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar48.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar Plano de Saúde selecionado");
        add(buttonEditar);
        buttonEditar.setBounds(770, 300, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PlanosDeSaudeDialog planosDeSaudeDialog = new PlanosDeSaudeDialog(null, true);
        planosDeSaudeDialog.setVisible(true);
        
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonEditar;
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
