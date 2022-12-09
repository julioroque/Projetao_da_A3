
package DAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class UsuarioDAO {
 
     Connection conexao; 
    
    public void CreateUser (UsuarioDTO usuario){
        try {
            String sql = "insert into usuario  (email, senha, nome) values (?,?,?)";
            
            conexao = new ConexaoDAO().conectaBD();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,usuario.getEmail());
            statement.setString(2,usuario.getNomeUsuario());
            statement.setString(3,usuario.getSenha());
            
            statement.execute();
            statement.close();
            
        } catch (SQLException ex) {
            System.out.println("erro ao conectar com o banco" +ex);
        }
    
    }
    
    public ArrayList<UsuarioDTO>readAllusuario(){
        
        return null;
    }
     
     Connection conn = null;
    
    public ResultSet autenticaUsuario(UsuarioDTO usuarioDTO){
        try {
            conn = new ConexaoDAO().conectaBD();
            String query = "select * from usuario where email=? and senha=?";
            
            PreparedStatement pstm = conn.prepareStatement(query);
            
            pstm.setString(1, usuarioDTO.getEmail());
            pstm.setString(2,usuarioDTO.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException ex) { 
            System.out.println("Erro na consulta para autenticção" + ex);
            return null;
        }
    }
    
}