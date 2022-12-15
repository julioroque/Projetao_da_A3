package VIEW;

import DTO.ObrasDTO;
import DAO.ObrasDAO;
import java.awt.Color;

public class JFrameObras extends javax.swing.JFrame {

    public JFrameObras() {
        initComponents();
        
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtinicio = new javax.swing.JTextField();
        txttermino = new javax.swing.JTextField();
        txtobra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 390));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("obras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 60, 72, 32);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Planilha");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 60, 72, 32);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Anotações");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 60, 90, 32);

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("ADICIONAR PLANILHA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(272, 180, 160, 27);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("BEM VINDO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 140, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("FILTRAR SELEÇÃO");
        jLabel2.setMinimumSize(new java.awt.Dimension(110, 200));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 120, 130, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NOME DA OBRA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 160, 120, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DATA DE TÉRMINO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 220, 140, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("DATA DE INICIO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 220, 110, 20);

        txtinicio.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(txtinicio);
        txtinicio.setBounds(50, 250, 130, 22);

        txttermino.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(txttermino);
        txttermino.setBounds(276, 250, 160, 22);

        txtobra.setBackground(new java.awt.Color(204, 204, 255));
        txtobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtobraActionPerformed(evt);
            }
        });
        getContentPane().add(txtobra);
        txtobra.setBounds(50, 180, 156, 27);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/TC-Sand.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-30, -20, 550, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFramePlanilha jFramePlanilha_ = new JFramePlanilha();
        jFramePlanilha_.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFrameAnotacoes jFrameAnotacoes_ = new JFrameAnotacoes();
        jFrameAnotacoes_.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
      //variaveis
        String nomeO = txtobra.getText();
        String dataI = txtinicio.getText();
        String dataT = txttermino.getText();

        //metedo para inserir no banco de dados
        ObrasDTO model = new ObrasDTO(nomeO, dataI, dataT);

        ObrasDAO repository = new ObrasDAO();

        repository.CreateAobra(model);
        
        //codigo para pular de janela + declarando o objeto
        JFramePlanilha jFramePlanilha_ = new JFramePlanilha();
        jFramePlanilha_.setVisible(true);
        this.dispose();
        
        //metedo para adicionar o valor recebido a outra Jframe que precisa do metedo declarado a cima.
        jFramePlanilha_.exportarDados(model);
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtobraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtobraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameObras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtinicio;
    private javax.swing.JTextField txtobra;
    private javax.swing.JTextField txttermino;
    // End of variables declaration//GEN-END:variables
}
