
package DAO;

import DTO.PlanilhaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PlanilhaDAO {
    
       Connection conexao;
       ResultSet rs;
       ArrayList<PlanilhaDTO> lista = new ArrayList<>();
    
  public void CreateAplanilha( PlanilhaDTO planilha_) {
        try {
            String sql = " insert into planilha  (id_planilha, material, quantidade, valor_unidade, total) values (?,?,?,?,?);";

            conexao = new ConexaoDAO().conectaBD();

            PreparedStatement statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, planilha_.getId_material());
            statement.setString(2, planilha_.getMaterial());
            statement.setString(3, planilha_.getQuantidade());
            statement.setString(4, planilha_.getValorUnidade());
            statement.setString(5, planilha_.getTotal());

            statement.execute();
            statement.close();

            System.out.println("materiais cadastrados!");
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar materiais " + ex);
        }
    }

    /*public ArrayList<PlanilhaDTO> readALLplanilha() {

        return null;
    }*/

    /*public void updateConta(PlanilhaDTO Aplanilha_) {

    }*/
     
    
     public ArrayList<PlanilhaDTO> readAllplanilha_(){
        try {
            String sql = "SELECT * FROM planilha";
            
            conexao = new ConexaoDAO().conectaBD();
            PreparedStatement statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery(); 
            
            while(rs.next()) {
            PlanilhaDTO objProdutoDTO = new PlanilhaDTO();
            
            objProdutoDTO.setId_material(rs.getInt("id_planilha"));
            objProdutoDTO.setMaterial(rs.getString("material"));
            objProdutoDTO.setQuantidade(rs.getString("quantidade"));
            objProdutoDTO.setValorUnidade(rs.getString("valor_unidade"));
            objProdutoDTO.setTotal(rs.getString("total"));
           
            
            lista.add(objProdutoDTO);
            } 
           
            statement.close(); 
            
            return lista;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir na lista " + ex);
            return null;
        }
    }
     
      public void update(PlanilhaDTO objProdutoDTO) {
         try {
            String sql = "UPDATE planilha  SET material=?, quantidade=?, valor_unidade=?, total=? WHERE id_planilha =?" ;
            
            conexao = new ConexaoDAO().conectaBD();
            PreparedStatement statement = conexao.prepareStatement(sql);
            
            statement.setInt(5, objProdutoDTO.getId_material());
            statement.setString(1, objProdutoDTO.getMaterial());
            statement.setString(2, objProdutoDTO.getQuantidade());
            statement.setString(3,objProdutoDTO.getValorUnidade());
            statement.setString(4, objProdutoDTO.getTotal());
           
            
            statement.execute(); 
            statement.close();
            
            System.out.println("Dado alterado com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar material no Banco de dados " + ex);
        }
    }
      
      public void Delete(PlanilhaDTO ProdutoDTO_) {
          try {
            String sql = "DELETE FROM planilha  WHERE id_planilha=?" ;
            
            conexao = new ConexaoDAO().conectaBD();
            PreparedStatement statement = conexao.prepareStatement(sql);
          
            statement.setInt(1, ProdutoDTO_.getId_material());
            
            statement.execute(); 
            statement.close();
            
            System.out.println("material excluido  com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir o material no Banco de dados " + ex);
        }
    }
    
}
