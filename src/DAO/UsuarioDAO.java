
package DAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {
 
     Connection conexao; 
    
    public void CreateUser (UsuarioDTO usuario){
        try {
            String sql = "insert into usuario (email,nome,senha) values ('?','?','?')";
            
            conexao = new ConexaoDAO().conectaBD();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(2,usuario.getEmail());
            statement.setString(1,usuario.getNomeUsuario());
            statement.setString(3,usuario.getSenha());
            
            statement.execute();
            statement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar usuario");
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public ArrayList<UsuarioDTO>readAllusuario(){
        
        return null;
    }
     
}