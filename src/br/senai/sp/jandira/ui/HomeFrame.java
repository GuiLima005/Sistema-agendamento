package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    private EspecialidadePanel especialidadePanel;
    private PlanosDeSaudePanel planosDeSaudePanel;
    private MedicoPanel medicoPanel;

    private final int POSICAO_X = 10;
    private final int POSICAO_Y = 230;
    private final int LARGURA = 960;
    private final int ALTURA = 400;

    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.getListaPlanosDeSaude();
        EspecialidadeDAO.getEspecialidade();
        MedicoDAO.getMedico();
        initPanels();

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
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();

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

        buttonAgenda.setBackground(new java.awt.Color(246, 246, 246));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda32.png"))); // NOI18N
        buttonAgenda.setToolTipText("Trocar para Módulo Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(130, 150, 90, 50);

        buttonPaciente.setBackground(new java.awt.Color(246, 246, 246));
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/pacinte32.png"))); // NOI18N
        buttonPaciente.setToolTipText("Pacientes");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(250, 150, 90, 50);

        buttonMedico.setBackground(new java.awt.Color(246, 246, 246));
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico32.png"))); // NOI18N
        buttonMedico.setToolTipText("Médicos");
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(370, 150, 90, 50);

        buttonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lista32.png"))); // NOI18N
        buttonEspecialidade.setToolTipText("Especialidades");
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidade);
        buttonEspecialidade.setBounds(490, 150, 90, 50);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano32.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano de Saúde");
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(610, 150, 90, 50);

        buttonSair.setBackground(new java.awt.Color(246, 246, 246));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sair32.png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(850, 150, 90, 50);

        panelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("SISACON");
        panelHome.add(jLabel3);
        jLabel3.setBounds(40, 30, 210, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Dados para contato:");
        panelHome.add(jLabel4);
        jLabel4.setBounds(750, 170, 180, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("www.sisacon.com.br");
        panelHome.add(jLabel5);
        jLabel5.setBounds(750, 270, 130, 20);

        jLabel6.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel6);
        jLabel6.setBounds(40, 100, 240, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("E-mail: suporte@sisacon.com.br");
        panelHome.add(jLabel7);
        jLabel7.setBounds(750, 210, 200, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Telefone (11) 95555-5555");
        panelHome.add(jLabel8);
        jLabel8.setBounds(750, 240, 170, 20);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        panelHome.add(jPanel2);
        jPanel2.setBounds(40, 120, 900, 2);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 230, 960, 400);

        buttonHome.setBackground(new java.awt.Color(0, 153, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/homet-32.png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 150, 90, 50);

        setBounds(0, 0, 998, 699);
    }// </editor-fold>//GEN-END:initComponents
    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed


    }//GEN-LAST:event_buttonSairActionPerformed
    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed


    }//GEN-LAST:event_buttonAgendaActionPerformed
    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed
        buttonEspecialidade.setBackground(new java.awt.Color(0, 153, 255));
        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonMedico.setBackground(new java.awt.Color(246, 246, 246));
        panelHome.setVisible(false);
        medicoPanel.setVisible(false);
        especialidadePanel.setVisible(true);
    }//GEN-LAST:event_buttonEspecialidadeActionPerformed
    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed


    }//GEN-LAST:event_buttonPacienteActionPerformed
    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        buttonMedico.setBackground(new java.awt.Color(0, 153, 255));
        buttonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        medicoPanel.setVisible(true);
        panelHome.setVisible(false);
        especialidadePanel.setVisible(false);
        planosDeSaudePanel.setVisible(false);
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        buttonPlanoDeSaude.setBackground(new java.awt.Color(0, 153, 255));
        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        buttonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        buttonMedico.setBackground(new java.awt.Color(246, 246, 246));
        panelHome.setVisible(false);
        especialidadePanel.setVisible(false);
        medicoPanel.setVisible(false);
        planosDeSaudePanel.setVisible(true);
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed
    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonHome.setBackground(new java.awt.Color(0, 153, 255));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonEspecialidade.setBackground(new java.awt.Color(246, 246, 246));
        buttonMedico.setBackground(new java.awt.Color(246, 246, 246));
        panelHome.setVisible(true);
        planosDeSaudePanel.setVisible(false);
        especialidadePanel.setVisible(false);
        medicoPanel.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        medicoPanel = new MedicoPanel();

        medicoPanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);

        getContentPane().add(medicoPanel);
        medicoPanel.setVisible(false);

        especialidadePanel = new EspecialidadePanel();

        especialidadePanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);

        getContentPane().add(especialidadePanel);
        especialidadePanel.setVisible(false);

        planosDeSaudePanel = new PlanosDeSaudePanel();

        planosDeSaudePanel.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);

        getContentPane().add(planosDeSaudePanel);
        planosDeSaudePanel.setVisible(false);
    }

}
