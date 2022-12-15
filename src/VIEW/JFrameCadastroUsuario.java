package VIEW;

import DTO.UsuarioDTO;
import DAO.UsuarioDAO;
import java.awt.Color;


public class JFrameCadastroUsuario extends javax.swing.JFrame {


    public JFrameCadastroUsuario() {
        initComponents();
        
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtemailcad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnomecad = new javax.swing.JTextField();
        txtsenhacad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 0));
        setMinimumSize(new java.awt.Dimension(480, 440));
        getContentPane().setLayout(null);

        txtemailcad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtemailcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailcadActionPerformed(evt);
            }
        });
        getContentPane().add(txtemailcad);
        txtemailcad.setBounds(50, 190, 257, 28);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 300, 72, 22);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CADASTRE-SE NA INOVA-CASA ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 20, 310, 40);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("CADASTRE-SE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 300, 120, 22);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DIGITE SEU EMAIL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 150, 184, 22);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("SENHA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 220, 62, 22);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("SEU NOME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 103, 25);

        txtnomecad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnomecad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomecadActionPerformed(evt);
            }
        });
        getContentPane().add(txtnomecad);
        txtnomecad.setBounds(50, 120, 257, 30);

        txtsenhacad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtsenhacad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhacadActionPerformed(evt);
            }
        });
        getContentPane().add(txtsenhacad);
        txtsenhacad.setBounds(50, 260, 257, 26);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/toolnation-4-900x600.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-110, 0, 590, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailcadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailcadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JFrameLogin jFrameLogin_ = new JFrameLogin();
       jFrameLogin_.setVisible(true ); 
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String nome = txtnomecad.getText();
       String email = txtemailcad.getText();
       String senha = txtsenhacad.getText();
       
       UsuarioDTO usuario_ = new UsuarioDTO(email, nome, senha);
       
        UsuarioDAO repository = new UsuarioDAO();
        
        repository.CreateUser(usuario_);
        
         txtnomecad.setText("");
        txtemailcad.setText("");
        txtsenhacad.setText("");
        
        
        
          JFrameLogin jFrameLogin_ = new JFrameLogin();
       jFrameLogin_.setVisible(true ); 
       this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnomecadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomecadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomecadActionPerformed

    private void txtsenhacadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhacadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhacadActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtemailcad;
    private javax.swing.JTextField txtnomecad;
    private javax.swing.JTextField txtsenhacad;
    // End of variables declaration//GEN-END:variables
}
