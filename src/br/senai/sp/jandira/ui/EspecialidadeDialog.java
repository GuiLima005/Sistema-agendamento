package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;
    
    public EspecialidadeDialog(java.awt.Frame parent, boolean modal, TipoOperacao tipoOperacao, Especialidade especialidade) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.especialidade = especialidade ;
    
        // Preencher os campos, caso o tipo de operação for ALTERAR
        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }
     private void preencherFormulario() {
        labelTitulo.setText("Especialidade - " + tipoOperacao);
        textCodigo.setText(especialidade.getCodigo().toString());
        textNomeDaEspecialidade.setText(especialidade.getNome());
        textDescricao.setText(especialidade.getDescricao());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNomeDaEspecialidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textDescricao = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de Agendamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(246, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelTitulo.setText("Especialidades - Adicionar");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lista48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelTitulo)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Detalhes das Especialidades");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 20, 250, 25);

        textCodigo.setEditable(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        jPanel3.add(textCodigo);
        textCodigo.setBounds(50, 100, 130, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Código:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 70, 50, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nome da Especialidade:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(50, 150, 150, 20);
        jPanel3.add(textNomeDaEspecialidade);
        textNomeDaEspecialidade.setBounds(50, 180, 580, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Descrição");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 240, 90, 20);
        jPanel3.add(textDescricao);
        textDescricao.setBounds(50, 270, 580, 30);

        buttonCancelar.setBackground(new java.awt.Color(246, 246, 246));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar48.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonCancelar);
        buttonCancelar.setBounds(730, 270, 70, 60);

        buttonAdicionar.setBackground(new java.awt.Color(246, 246, 246));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar48.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonAdicionar);
        buttonAdicionar.setBounds(820, 270, 70, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed
    
    private void atualizar() {
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());

        if (validarCadastro()) {
            EspecialidadeDAO.atualizar(especialidade);
            JOptionPane.showMessageDialog(this, "Especialidade atualizado com sucesso!", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    
    private void gravar() {

        //Criar um objeto Especialidade
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescricao.getText());

        if (validarCadastro()) {
            EspecialidadeDAO.gravar(especialidade);

            JOptionPane.showMessageDialog(this, "Especialidade gravada com sucesso!", "Especialidade", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    
    private boolean validarCadastro() {
        if (textNomeDaEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor preencha o nome da especialidade", "Especialidade", JOptionPane.ERROR_MESSAGE);

            textNomeDaEspecialidade.requestFocus();

            return false;
        }
        if (textDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor preecha a descrição da especialidade", "Aviso", JOptionPane.ERROR_MESSAGE);

            textDescricao.requestFocus();

            return false;
        }
        return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
 

