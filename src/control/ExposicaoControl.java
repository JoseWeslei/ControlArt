package control;

import dao.AcessoMySql;
import entity.ExposicaoBean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExposicaoControl {
    
    PreparedStatement pstm;
    ResultSet rs;
        
    AcessoMySql bd = new AcessoMySql();
    
    String consultaCodExposicao = "SELECT * FROM Exposicao WHERE codigoExposicao LIKE ?";
    String consultaNomeExposicao = "SELECT * FROM Exposicao WHERE nomeExp LIKE ?";
    String consultaDescricaoExposicao = "SELECT * FROM Exposicao WHERE descricaoExposicao LIKE ?";
    
    String cadastraExposicao = "INSERT INTO Exposicao (NomeExp, DescricaoExp, "
            + "DataInicioExp, DataFimExp, PisoExp, SetorExp) VALUE (?, ?, ?, ?, ?, ?)";
    
    String alteraExposicao = "UPDATE Exposicao SET NomeExp = ?, DescricaoExp = ?, "
            + "DataInicioExp = ?, DataFimExp  = ?, PisoExp = ?, SetorExp = ? WHERE CodigoExp = ?";
    
    public void alterarExposicao(ExposicaoBean exposicao){
        
        try{
            
            pstm = bd.conectar().prepareStatement(alteraExposicao);
            pstm.setString(1, exposicao.getNomeExposicao());
            pstm.setString(2, exposicao.getDescricaoExposicao());
            pstm.setString(3, exposicao.getDataInicioExposicao());
            pstm.setString(4, exposicao.getDataFimExposicao());
            pstm.setInt(5, exposicao.getPiso());
            pstm.setString(6, exposicao.getSetor());
            pstm.setInt(7, exposicao.getCodigoExposicao());
            pstm.executeUpdate();
            bd.desconectar();
        }catch (SQLException e){
            Logger.getLogger(ExposicaoControl.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    public void cadastrarExposicao(ExposicaoBean exposicao){
        
        try{
            pstm = bd.conectar().prepareStatement(cadastraExposicao);
            pstm.setString(1, exposicao.getNomeExposicao());
            pstm.setString(2, exposicao.getDescricaoExposicao());
            pstm.setString(3, exposicao.getDataInicioExposicao());
            pstm.setString(4, exposicao.getDataFimExposicao());
            pstm.setInt(5, exposicao.getPiso());
            pstm.setString(6, exposicao.getSetor());
            pstm.executeUpdate();
            bd.desconectar();
        }catch (SQLException e){
            Logger.getLogger(ExposicaoControl.class.getName()).log(Level.SEVERE, null, e);
        }  
        
    }
    
    
    
    public List<ExposicaoBean> mostrarExposicaoNome(String nome){
        
        List<ExposicaoBean> exposicoes = new ArrayList();
        try{
            pstm = bd.conectar().prepareStatement(consultaNomeExposicao);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            ExposicaoBean exposicao;
            while(rs.next()){
                exposicao = new ExposicaoBean();
                exposicao.setCodigoExposicao(rs.getInt("CodigoExp"));
                exposicao.setNomeExposicao(rs.getString("NomeExp"));
                exposicao.setDescricaoExposicao(rs.getString("DescricaoExp"));
                exposicao.setDataInicioExposicao(rs.getString("DataInicioExp")); //
                exposicao.setDataFimExposicao(rs.getString("DataFimExp"));
                exposicao.setPiso(rs.getInt("PisoExp"));
                exposicao.setSetor(rs.getString("SetorExp"));  
                exposicoes.add(exposicao);
            }
            bd.desconectar();
        }catch(SQLException e){
            Logger.getLogger(ExposicaoControl.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return exposicoes;
            
    }
        
}
