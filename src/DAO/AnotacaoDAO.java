
package DAO;

import DTO.AnotacoesDTO;
import DTO.PlanilhaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnotacaoDAO {
    
    Connection conexao;
       ResultSet rs;
       ArrayList<AnotacoesDTO> lista2 = new ArrayList<>();
    
  public void CreateAnotacao( AnotacoesDTO Anotacao_) {
        try {
            String sql = "insert into anotacoes  (id_anotacoes, anotacao) values (?,?);";

            conexao = new ConexaoDAO().conectaBD();

            PreparedStatement statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, Anotacao_.getiD_Anotacao());
            statement.setString(2, Anotacao_.getAnotacoes());
            

            statement.execute();
            statement.close();

            System.out.println("Anotação salva com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar anotação " + ex);
        }
    
  }

public ArrayList<AnotacoesDTO> readAllAnotacao_(){
        try {
            String sql = "SELECT * FROM anotacoes";
            
            conexao = new ConexaoDAO().conectaBD();
            PreparedStatement statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery(); 
            
            while(rs.next()) {
            AnotacoesDTO objAnotacaoDTO = new AnotacoesDTO();
                       
             objAnotacaoDTO.setiD_Anotacao(rs.getInt("id_anotacoes"));
            objAnotacaoDTO.setAnotacoes(rs.getString("anotacao"));
           
            
            lista2.add(objAnotacaoDTO);
            } 
           
            statement.close(); 
            
            return lista2;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir anotacao na lista " + ex);
            return null;
        }
}

public void update(AnotacoesDTO objAnotacaoDTO) {
         try {
            String sql = "UPDATE anotacoes  SET anotacao =? WHERE id_anotacoes =?" ;
            
            conexao = new ConexaoDAO().conectaBD();
            PreparedStatement statement = conexao.prepareStatement(sql);
            
              statement.setInt(2, objAnotacaoDTO.getiD_Anotacao());
              statement.setString(1, objAnotacaoDTO.getAnotacoes());
            
            
            statement.execute(); 
            statement.close();
            
            System.out.println("Dado da anotacao alterado com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar anotacao no Banco de dados " + ex);
        }
    }

public void Delete(AnotacoesDTO anotacoesDTO_) {
          try {
            String sql = "DELETE FROM anotacoes  WHERE id_anotacoes =?" ;
            
            conexao = new ConexaoDAO().conectaBD();
            PreparedStatement statement = conexao.prepareStatement(sql);
          
            statement.setInt(1, anotacoesDTO_.getiD_Anotacao());
            
            statement.execute(); 
            statement.close();
            
            System.out.println("material excluido  com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir anotacao no Banco de dados " + ex);
        }
    }
}

