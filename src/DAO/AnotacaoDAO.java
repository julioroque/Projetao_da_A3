
package DAO;

import DTO.AnotacoesDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnotacaoDAO {
    
    Connection conexao;
       ResultSet rs;
       ArrayList<AnotacoesDTO> lista2 = new ArrayList<>();
    
  public void CreateAplanilha( AnotacoesDTO Anotacao_) {
        try {
            String sql = " insert into anotacoes  (anotacao) values (?)";

            conexao = new ConexaoDAO().conectaBD();

            PreparedStatement statement = conexao.prepareStatement(sql);
            
            
            statement.setString(1, Anotacao_.getAnotacoes());
            

            statement.execute();
            statement.close();

            System.out.println("materiais cadastrados!");
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar materiais " + ex);
        }
    
  }
}
