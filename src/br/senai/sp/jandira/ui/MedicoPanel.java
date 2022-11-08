package br.senai.sp.jandira.ui;

public class MedicoPanel extends javax.swing.JPanel {

    public MedicoPanel() {
        initComponents();
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
        labelMedico.setBounds(20, 10, 100, 20);

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
//        linha = tableEspecialidade.getSelectedRow();
//
//        // Verificamos se a linha é diferente de -1
//        // -1 significa que o usuário não selecionou nada
//        if (linha != -1) {
//            excluir();
//        } else {
//            JOptionPane.showMessageDialog(this, "Por favor, selecione a especialidade que você deseja excluir!", "Especialidade", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
//        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true, TipoOperacao.ADICIONAR, null);
//        especialidadeDialog.setVisible(true);
//
//        criarTabelaEspecialidade();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
//        linha = tableEspecialidade.getSelectedRow();
//
//        if (linha != -1) {
//            editar();
//        } else {
//            JOptionPane.showMessageDialog(this, "Por favor, selecione uma especialidade para alterar.", "Especialidade", JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_buttonAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JScrollPane scrollMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables
}
