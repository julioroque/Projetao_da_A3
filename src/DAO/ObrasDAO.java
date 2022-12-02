package DAO;

import DTO.ObrasDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ObrasDAO {

    Connection conexao;

    public void CreateAobra(ObrasDTO obra) {
        try {
            String sql = "insert into cadobra (nome_obra,data_inicio,data_fim) values (?,?,?)";

            conexao = new ConexaoDAO().conectaBD();

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, obra.getNomeDaObra());
            statement.setString(2, obra.getDataInicio());
            statement.setString(3, obra.getDataFim());

            statement.execute();
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar a obra");
            Logger.getLogger(ObrasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<ObrasDTO> readALLobras() {

        return null;
    }

    public void updateConta(ObrasDTO Aobra_) {

    }

}
