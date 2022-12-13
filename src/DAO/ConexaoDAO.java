package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;*/


public class ConexaoDAO {
    
  
    public Connection conectaBD(){
        Connection conexao = null;
        try {
            String url =  "jdbc:mysql://localhost:3306/projeto?serverTimezone=UTC";
                  String usuario = "root";
                  String senha = "123456";
                  
            conexao = DriverManager.getConnection(url, usuario, senha);
            
           
        } catch (SQLException ex) {
            System.out.println("erro ao conectar com o banco" +ex);
            
        }
        return conexao;
    }
}
