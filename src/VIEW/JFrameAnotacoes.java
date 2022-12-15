/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DTO.AnotacoesDTO;
import DAO.AnotacaoDAO;

public class JFrameAnotacoes extends javax.swing.JFrame {

   
    public JFrameAnotacoes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_An = new javax.swing.JTextPane();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("OBRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 12, 100, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Planilhas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 52, 100, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Anotações");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 90, 100, 30);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setText("ANOTAÇÕES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(197, 64, 156, 31);

        jScrollPane2.setViewportView(txt_An);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(24, 133, 530, 240);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setText("EDITE SUA ANOTAÇÃO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(370, 410, 152, 30);
        jButton5.getAccessibleContext().setAccessibleName("EDITAR ANOTAÇÕES");

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setText("ADICIONAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 412, 93, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/img.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-17, -48, 710, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      JFrameObras jFrameObras_ = new JFrameObras();
      jFrameObras_.setVisible(true);
      this.dispose();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      JFramePlanilha jFramePlanilha_ = new JFramePlanilha();
      jFramePlanilha_.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.Ad_ANOTACÃO();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAnotacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane txt_An;
    // End of variables declaration//GEN-END:variables

private void Ad_ANOTACÃO() {
        
         
        String total = txt_An.getText();
        
        
        AnotacoesDTO objAnotacao_ = new AnotacoesDTO();
        
        AnotacaoDAO objProdutoDAO = new AnotacaoDAO(); 
        objProdutoDAO.CreateAplanilha(objAnotacao_);
       
        limpaCampos();
        //listaProdutos();
    }
private void limpaCampos(){
    txt_An.setText("");
}

}
