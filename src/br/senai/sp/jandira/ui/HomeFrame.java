package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaudeTeste();
        criarTabelaPlanosDeSaude();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonAgenda = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonEspecialidade = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        panelPlanoDeSaude = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scrollPlanoDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonDeletar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 30, 470, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 100);

        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda32.png"))); // NOI18N
        buttonAgenda.setToolTipText("Trocar para Módulo Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(30, 150, 100, 50);

        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/pacinte32.png"))); // NOI18N
        buttonPaciente.setToolTipText("Pacientes");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(150, 150, 100, 50);

        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico32.png"))); // NOI18N
        buttonMedico.setToolTipText("Médicos");
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(270, 150, 100, 50);

        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lista32.png"))); // NOI18N
        buttonEspecialidade.setToolTipText("Especialidades");
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidade);
        buttonEspecialidade.setBounds(390, 150, 100, 50);

        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano32.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano de Saúde");
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(510, 150, 100, 50);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sair32.png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(850, 150, 100, 50);

        panelPlanoDeSaude.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPlanoDeSaude.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Plano de Saúde");
        panelPlanoDeSaude.add(jLabel3);
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

        panelPlanoDeSaude.add(scrollPlanoDeSaude);
        scrollPlanoDeSaude.setBounds(20, 40, 920, 220);

        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/deletar48.png"))); // NOI18N
        buttonDeletar.setToolTipText("Excluir Plano de Saúde selecionado");
        panelPlanoDeSaude.add(buttonDeletar);
        buttonDeletar.setBounds(680, 300, 70, 60);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar48.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar Plano de Saúde");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        panelPlanoDeSaude.add(buttonAdicionar);
        buttonAdicionar.setBounds(860, 300, 70, 60);

        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar48.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar Plano de Saúde selecionado");
        panelPlanoDeSaude.add(buttonEditar);
        buttonEditar.setBounds(770, 300, 70, 60);

        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setBounds(10, 230, 960, 400);

        setBounds(0, 0, 998, 655);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidadeActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPlanoDeSaude;
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
