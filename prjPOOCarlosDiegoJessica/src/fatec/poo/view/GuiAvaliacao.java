/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Instrutor;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Turma;
import java.util.ArrayList;
import static fatec.poo.model.Pessoa.validarCPF;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GuiAvaliacao extends javax.swing.JFrame {

    /**
     * Creates new form GuiAvaliacao
     */
    public GuiAvaliacao(ArrayList<Pessoa> cadAlunoInstrutor) {
        initComponents();
        this.cadAlunoInstrutor = cadAlunoInstrutor;
      
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtQtdeTurmas = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLupa = new javax.swing.JButton();
        txtValorAReceber = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Total de Horas a Pagar Instrutor");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Nome");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCpf.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtQtdeTurmas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtQtdeTurmas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtQtdeTurmas.setEnabled(false);
        txtQtdeTurmas.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtQtdeTurmas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtQtdeTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdeTurmasActionPerformed(evt);
            }
        });

        jLabel2.setText("Qtde. Turmas");

        jLabel4.setText("Valor Total a Receber ");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Inserir.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Consultar.png"))); // NOI18N
        btnLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaActionPerformed(evt);
            }
        });

        txtValorAReceber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtValorAReceber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtValorAReceber.setEnabled(false);
        txtValorAReceber.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtValorAReceber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtNome.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.setEnabled(false);
        txtNome.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorAReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLupa))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtdeTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLupa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQtdeTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValorAReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnCalcular))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaActionPerformed
       // Validando CPF
        String cpf = txtCpf.getText().replaceAll("[\\.\\-]", "");

        if (!validarCPF(cpf)) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(
                frame,
                "Insira um CPF válido",
                "Mensagem de Erro",
                JOptionPane.ERROR_MESSAGE
            );
            txtCpf.requestFocus();
            return;
        }

        posInstrutor = -1; // padrao instrutor nao encontrado

        for (int x = 0; x < cadAlunoInstrutor.size(); x++){
            if ((cadAlunoInstrutor.get(x) instanceof Instrutor) &&
                    (cadAlunoInstrutor.get(x).getCpf().equals(cpf))){
                posInstrutor = x;
            }
        }

        // Cpf indicado não é do instrutor
        if (posInstrutor == -1) {
            JOptionPane.showMessageDialog(null,"Instrutor não Cadastrado", "Aviso", JOptionPane.ERROR_MESSAGE);
            txtCpf.requestFocus();
            return;
        }
        
        txtNome.setText(cadAlunoInstrutor.get(posInstrutor).getNome());
        btnCalcular.setEnabled(true);   
    }

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {

    }//GEN-LAST:event_btnLupaActionPerformed

    private void txtQtdeTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdeTurmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdeTurmasActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        ArrayList<Turma> turmas = ((Instrutor) cadAlunoInstrutor.get(posInstrutor)).getTurmas();

        if (turmas.size() == 0) {
            JOptionPane.showMessageDialog(null,"Não há ocorrência de turmas", "Aviso", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double total = 0.00;

        for (int i = 0; i < turmas.size(); i++) {
            total += turmas.get(i).getCurso().getValorHoraInstrutor() * turmas.get(i).getCurso().getCargaHoraria();
        }

        txtQtdeTurmas.setText(String.valueOf(turmas.size()));
        txtValorAReceber.setText(String.valueOf(total));

        // Foco no cpf
        txtCpf.requestFocus();
    }//GEN-LAST:event_btnCalcularActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLupa;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtNome;
    private javax.swing.JFormattedTextField txtQtdeTurmas;
    private javax.swing.JFormattedTextField txtValorAReceber;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> cadAlunoInstrutor;
    private int posInstrutor;
}
