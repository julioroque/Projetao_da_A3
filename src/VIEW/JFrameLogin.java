package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JFrameLogin extends javax.swing.JFrame {

    public JFrameLogin() {
        initComponents();

        setLocationRelativeTo(null);
       // getContentPane().setBackground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_U_senha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_U_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);
        getContentPane().add(txt_U_senha);
        txt_U_senha.setBounds(65, 160, 257, 22);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(153, 194, 82, 22);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("CADASTRA-SE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(254, 234, 117, 22);

        txt_U_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_U_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_U_email);
        txt_U_email.setBounds(65, 86, 257, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(163, 21, 52, 25);

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("EMAIL:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(171, 64, 37, 16);

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("SENHA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(164, 126, 41, 16);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/toolnation-4-900x600.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(600, 500));
        jLabel4.setMinimumSize(new java.awt.Dimension(500, 600));
        jLabel4.setPreferredSize(new java.awt.Dimension(515, 500));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-180, -20, 670, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            String email_ = txt_U_email.getText();
            String senha = txt_U_senha.getText();

            // colocar o usuario do tipo DTO
            UsuarioDTO usuarioDTO = new UsuarioDTO();
            usuarioDTO.setEmail(email_);
            usuarioDTO.setSenha(senha);

            //metodo que tem acesso ao banco de dados
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            ResultSet rs = usuarioDAO.autenticaUsuario(usuarioDTO);
            if (rs.next()) {
                System.out.println("Parabéns você consegiu acessar!!");
                JFrameObras jFrameObras_ = new JFrameObras();
                jFrameObras_.setVisible(true);
                this.dispose();
            } else {
                System.out.println("Usuario não existe");
            }
        } catch (SQLException ex) {
            System.out.println("deu erro");
        }

        /*JFrameObras jFrameObras_ = new JFrameObras();
      jFrameObras_.setVisible(true);
      this.dispose();  */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrameCadastroUsuario JFrameCadastroUsuario = new JFrameCadastroUsuario();
        JFrameCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_U_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_U_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_U_emailActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
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
    private javax.swing.JTextField txt_U_email;
    private javax.swing.JTextField txt_U_senha;
    // End of variables declaration//GEN-END:variables
}
