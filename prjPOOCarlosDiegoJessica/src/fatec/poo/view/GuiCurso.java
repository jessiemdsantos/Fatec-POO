
package fatec.poo.view;

import fatec.poo.model.Curso;
import java.text.NumberFormat;
import java.util.ArrayList;

public class GuiCurso extends javax.swing.JFrame {

    
    public GuiCurso(ArrayList<Curso> cadCurso) {
        initComponents();
        cadastro = cadCurso;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSiglaCurso = new javax.swing.JTextField();
        txtNomeCurso = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JTextField();
        txtProgramaCurso = new javax.swing.JTextField();
        txtValorCurso = new javax.swing.JTextField();
        txtValHoraInstrutor = new javax.swing.JTextField();
        txtDataVigencia = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Curso");

        jLabel1.setText("Sigla curso");

        jLabel2.setText("Nome curso");

        jLabel3.setText("Carga horária");

        jLabel4.setText("Valor curso");

        jLabel5.setText("Programa do curso");

        jLabel6.setText("Dada de vigência");

        jLabel7.setText("Valor hora instrutor");

        txtNomeCurso.setEnabled(false);

        txtCargaHoraria.setEnabled(false);

        txtProgramaCurso.setEnabled(false);

        txtValorCurso.setEnabled(false);

        txtValHoraInstrutor.setEnabled(false);

        try {
            txtDataVigencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataVigencia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDataVigencia.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Inserir.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Remover.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProgramaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValHoraInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDataVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtValHoraInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProgramaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int x;
        for(x = 0; x < cadastro.size(); x++){
            if(cadastro.get(x).getSigla().equals(txtSiglaCurso.getText())){
                break;
            }
        }
        
        if(x < cadastro.size()){
            posCurso = x; //localizou o objeto Curso no ArrayList            
        }else{
            posCurso = -1; // não localizou o objeto Curso no ArrayList            
        }
        
        if (posCurso >= 0){//operação de Alterar ou Excluir
            txtNomeCurso.setText(cadastro.get(posCurso).getNome());
            txtCargaHoraria.setText(NumberFormat.getInstance().format(cadastro.get(posCurso).getCargaHoraria()));
            txtDataVigencia.setText(cadastro.get(posCurso).getDataVigencia());
            txtValorCurso.setText(NumberFormat.getInstance().format(cadastro.get(posCurso).getValor()));
            txtValHoraInstrutor.setText(NumberFormat.getInstance().format(cadastro.get(posCurso).getValorHoraInstrutor()));
            txtProgramaCurso.setText(cadastro.get(posCurso).getPrograma());
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }else{
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
        txtSiglaCurso.setEnabled(false);
        txtNomeCurso.setEnabled(true);
        txtCargaHoraria.setEnabled(true);
        txtDataVigencia.setEnabled(true);
        txtValorCurso.setEnabled(true);
        txtValHoraInstrutor.setEnabled(true);
        txtProgramaCurso.setEnabled(true);        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        //instanciação do objeto classe Curso
        Curso curso = new Curso(txtSiglaCurso.getText(), txtNomeCurso.getText());
        curso.setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));
        curso.setDataVigencia(txtDataVigencia.getText().replaceAll("/", ""));
        curso.setValor(Double.parseDouble(txtValorCurso.getText()));
        curso.setValorHoraInstrutor(Double.parseDouble(txtValHoraInstrutor.getText()));
        curso.setPrograma(txtProgramaCurso.getText());
        cadastro.add(curso);//insere o objeto no ArrayList
        
        txtSiglaCurso.setText(null);
        txtNomeCurso.setText(null);
        txtCargaHoraria.setText(null);
        txtDataVigencia.setText(null);
        txtValorCurso.setText(null);
        txtValHoraInstrutor.setText(null);
        txtProgramaCurso.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtSiglaCurso.setEnabled(true);
        txtNomeCurso.setEnabled(false);
        txtCargaHoraria.setEnabled(false);
        txtDataVigencia.setEnabled(false);
        txtValorCurso.setEnabled(false);
        txtValHoraInstrutor.setEnabled(false);
        txtProgramaCurso.setEnabled(false);
        txtSiglaCurso.requestFocus();
        
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        cadastro.get(posCurso).setNome(txtNomeCurso.getText());
        cadastro.get(posCurso).setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));
        cadastro.get(posCurso).setDataVigencia(txtDataVigencia.getText().replaceAll("/", ""));        
        cadastro.get(posCurso).setValor(Double.parseDouble(txtValorCurso.getText()));
        cadastro.get(posCurso).setValorHoraInstrutor(Double.parseDouble(txtValHoraInstrutor.getText()));
        cadastro.get(posCurso).setPrograma(txtProgramaCurso.getText());  
        
        txtSiglaCurso.setText(null);
        txtNomeCurso.setText(null);
        txtCargaHoraria.setText(null);
        txtDataVigencia.setText(null);
        txtValorCurso.setText(null);
        txtValHoraInstrutor.setText(null);
        txtProgramaCurso.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtSiglaCurso.setEnabled(true);
        txtNomeCurso.setEnabled(false);
        txtCargaHoraria.setEnabled(false);
        txtDataVigencia.setEnabled(false);
        txtValorCurso.setEnabled(false);
        txtValHoraInstrutor.setEnabled(false);
        txtProgramaCurso.setEnabled(false);
        txtSiglaCurso.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (posCurso >=0){
            cadastro.remove(posCurso);
            posCurso = -1;
        }
        txtSiglaCurso.setText(null);
        txtNomeCurso.setText(null);
        txtCargaHoraria.setText(null);
        txtDataVigencia.setText(null);
        txtValorCurso.setText(null);
        txtValHoraInstrutor.setText(null);
        txtProgramaCurso.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtSiglaCurso.setEnabled(true);
        txtNomeCurso.setEnabled(false);
        txtCargaHoraria.setEnabled(false);
        txtDataVigencia.setEnabled(false);
        txtValorCurso.setEnabled(false);
        txtValHoraInstrutor.setEnabled(false);
        txtProgramaCurso.setEnabled(false);
        txtSiglaCurso.requestFocus();        
    }//GEN-LAST:event_btnExcluirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JFormattedTextField txtDataVigencia;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtProgramaCurso;
    private javax.swing.JTextField txtSiglaCurso;
    private javax.swing.JTextField txtValHoraInstrutor;
    private javax.swing.JTextField txtValorCurso;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Curso> cadastro;
    private int posCurso;
}
