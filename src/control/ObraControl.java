/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.AcessoMySql;
import entity.ObraBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulocampanha
 */
public class ObraControl {
    
    //private Connection c;
    PreparedStatement pstm;
    ResultSet rs;
    
    AcessoMySql bd = new AcessoMySql(); 
    
    
    String consultaCodObra = "SELECT * FROM Obra WHERE CodigoObra LIKE ?";
    String consultaTituloObra = "SELECT * FROM Obra WHERE TituloObra LIKE ?";
    String consultaAutorObra = "SELECT * FROM Obra WHERE AutorObra LIKE ?";
    
    String cadastraObra = "INSERT INTO Obra (TituloObra, TipoDataObra, MesObra, AnoObra, SeculoObra, ImagemObra, "
            + "PisoObra, SetorObra, AlturaObra, LarguraObra, ProfundidadeObra, PesoObra, EmprestadaObra, "
            + "AutorObra, PertenceExp, ExposicaoObra, MuseuObra) "
            + "VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  
    String alteraObra = "UPDATE Obra SET TituloObra = ?, TipoDataObra = ?, MesObra = ?, AnoObra = ?, SeculoObra = ?, "
            + "ImagemObra = ?, PisoObra = ?, SetorObra = ?, AlturaObra = ?, LarguraObra = ?, ProfundidadeObra = ?, "
            + "PesoObra = ?, EmprestadaObra = ?, AutorObra = ?, PertenceExp = ?, "
            + "ExposicaoObra = ?, MuseuObra = ? WHERE CodigoObra = ?";
    
    String excluiObra = "DELETE FROM obra WHERE CodigoObra = ?";
    
    public void cadastrarObra(ObraBean obra){
        
        try {
            pstm = bd.conectar().prepareStatement(cadastraObra);
            pstm.setString(1, obra.getTituloObra());
            pstm.setString(2, obra.getTipoDataObra());
            pstm.setString(3, obra.getMesObra());
            pstm.setInt(4, obra.getAnoObra());
            pstm.setString(5, obra.getSeculoObra());
            pstm.setString(6, obra.getImagemObra());
            pstm.setInt(7, obra.getPisoObra());
            pstm.setString(8, obra.getSetorObra());
            pstm.setDouble(9, obra.getAlturaObra());
            pstm.setDouble(10, obra.getLarguraObra());
            pstm.setDouble(11, obra.getProfundidadeObra());
            pstm.setDouble(12, obra.getPesoObra());
            pstm.setBoolean(13, obra.getEmprestadaObra());
            pstm.setString(14, obra.getAutorObra());
            pstm.setString(15, obra.getPertenceExp());
            pstm.setString(16, obra.getExposicaoObra());
            pstm.setString(17, obra.getMuseuObra());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ObraControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void alterarObra(ObraBean obra){
        
        try {
            pstm = bd.conectar().prepareStatement(alteraObra);
            pstm.setString(1, obra.getTituloObra());
            pstm.setString(2, obra.getTipoDataObra());
            pstm.setString(3, obra.getMesObra());
            pstm.setInt(4, obra.getAnoObra());
            pstm.setString(5, obra.getSeculoObra());
            pstm.setString(6, obra.getImagemObra());
            pstm.setInt(7, obra.getPisoObra());
            pstm.setString(8, obra.getSetorObra());
            pstm.setDouble(9, obra.getAlturaObra());
            pstm.setDouble(10, obra.getLarguraObra());
            pstm.setDouble(11, obra.getProfundidadeObra());
            pstm.setDouble(12, obra.getPesoObra());
            pstm.setBoolean(13, obra.getEmprestadaObra());
            pstm.setString(14, obra.getAutorObra());
            pstm.setString(15, obra.getPertenceExp());
            pstm.setString(16, obra.getExposicaoObra());
            pstm.setString(17, obra.getMuseuObra());
            pstm.setInt(18, obra.getCodigoObra());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ObraControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void excluirObra(ObraBean obra){
        
        try {
            pstm = bd.conectar().prepareStatement(excluiObra);
            pstm.setInt(1, obra.getCodigoObra());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ObraControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ObraBean> mostrarObraCod(Integer codigo){
        List<ObraBean> obras = new ArrayList();
        try {
            pstm = bd.conectar().prepareStatement(consultaCodObra);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
            ObraBean obra;
            while(rs.next()){
                obra = new ObraBean();
                obra.setCodigoObra(rs.getInt("CodigoObra"));
                obra.setTituloObra(rs.getString("TituloObra"));
                obra.setTipoDataObra(rs.getString("TipoDataObra"));
                obra.setMesObra(rs.getString("MesObra"));
                obra.setAnoObra(rs.getInt("AnoObra"));
                obra.setSeculoObra(rs.getString("SeculoObra"));
                obra.setImagemObra(rs.getString("ImagemObra"));
                obra.setPisoObra(rs.getInt("PisoObra"));
                obra.setSetorObra(rs.getString("SetorObra"));
                obra.setAlturaObra(rs.getDouble("AlturaObra"));
                obra.setLarguraObra(rs.getDouble("LarguraObra"));
                obra.setProfundidadeObra(rs.getDouble("ProfundidadeObra"));
                obra.setPesoObra(rs.getDouble("PesoObra"));
                obra.setEmprestadaObra(rs.getBoolean("EmprestadaObra"));
                //obra.setCodigoAutor(rs.getInt("Autor_CodigoAutor"));
                obra.setAutorObra(rs.getString("AutorObra"));
                obra.setPertenceExp(rs.getString("PertenceExp"));
                //obra.setCodigoExp(rs.getInt("Exposicao_CodigoExp"));
                obra.setExposicaoObra(rs.getString("ExposicaoObra"));
                obra.setMuseuObra(rs.getString("MuseuObra"));
                obras.add(obra);
            }
            bd.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ObraControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obras;
    }
    
    public List<ObraBean> mostrarObraPesquisa(String pesquisa, String campo){
        List<ObraBean> obras = new ArrayList();
        try {
            if(campo.equals("titulo"))
                pstm = bd.conectar().prepareStatement(consultaTituloObra);
            else
                pstm = bd.conectar().prepareStatement(consultaAutorObra);
            pstm.setString(1, "%"+pesquisa+"%");
            rs = pstm.executeQuery();
            ObraBean obra;
            while(rs.next()){
                obra = new ObraBean();
                obra.setCodigoObra(rs.getInt("CodigoObra"));
                obra.setTituloObra(rs.getString("TituloObra"));
                obra.setTipoDataObra(rs.getString("TipoDataObra"));
                obra.setMesObra(rs.getString("MesObra"));
                obra.setAnoObra(rs.getInt("AnoObra"));
                obra.setSeculoObra(rs.getString("SeculoObra"));
                obra.setImagemObra(rs.getString("ImagemObra"));
                obra.setPisoObra(rs.getInt("PisoObra"));
                obra.setSetorObra(rs.getString("SetorObra"));
                obra.setAlturaObra(rs.getDouble("AlturaObra"));
                obra.setLarguraObra(rs.getDouble("LarguraObra"));
                obra.setProfundidadeObra(rs.getDouble("ProfundidadeObra"));
                obra.setPesoObra(rs.getDouble("PesoObra"));
                obra.setEmprestadaObra(rs.getBoolean("EmprestadaObra"));
                obra.setAutorObra(rs.getString("AutorObra"));
                obra.setPertenceExp(rs.getString("PertenceExp"));
                obra.setExposicaoObra(rs.getString("ExposicaoObra"));
                obra.setMuseuObra(rs.getString("MuseuObra"));
                obras.add(obra);
            }
            bd.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ObraControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obras;
    }
}
