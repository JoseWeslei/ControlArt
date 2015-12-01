package control;

import dao.AcessoMySql;
import entity.EmprestimoBean;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class EmprestimoControl {  //extends JFrame implements ActionListener {
    
    PreparedStatement pstm;
    ResultSet rs;
    
    AcessoMySql bd = new AcessoMySql(); 
    
    String consultaEmprestimo = "SELECT * FROM emprestimo WHERE CodigoEmp = ?";
    
    String cadastraEmprestimo = "INSERT INTO emprestimo (TipoOperacaoEmp, DataOperacaoEmp, NomeMuseuEmp, "
            + " PagadorEmp, TipoTransporteEmp, TransporteEmp, PrecoEmp) VALUE (?,?,?,?,?,?,?)";
    
    String alteraEmprestimo = "UPDATE SET TipoOperacaoEmp = ?, DataOperacaoEmp = ?, NomeMuseuEmp = ?, "
            + "PagadorEmp = ?, TipoTransporteEmp = ?, TransporteEmp = ?,  PrecoEmp = ? WHERE CodigoEmp = ?  ";
    
    String excluiEmprestimo = "DELETE FROM emprestimo WHERE CodigoEmp = ?";
    
    public void cadastraEmprestimo(EmprestimoBean emprestimo){
        
        try {
            pstm = bd.conectar().prepareStatement(cadastraEmprestimo);
            pstm.setString(1, emprestimo.getTipoOperacao());
            pstm.setString(2, emprestimo.getDataOperacaoEmp());
            pstm.setString(3, emprestimo.getMuseuObra());
            pstm.setString(4, emprestimo.getTransportePagador());
            pstm.setString(5, emprestimo.getTransporteTipo());
            pstm.setString(6, emprestimo.getTransporteEmp());
            pstm.setDouble(7, emprestimo.getTransportePreco());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(EmprestimoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void alteraEmprestimo(EmprestimoBean emprestimo){
        
        try {
            pstm = bd.conectar().prepareStatement(alteraEmprestimo);
            pstm.setString(1, emprestimo.getTipoOperacao());
            pstm.setString(2, emprestimo.getDataOperacaoEmp());
            pstm.setString(3, emprestimo.getMuseuObra());
            pstm.setString(4, emprestimo.getTransportePagador());
            pstm.setString(5, emprestimo.getTransporteTipo());
            pstm.setString(6, emprestimo.getTransporteEmp());
            pstm.setDouble(7, emprestimo.getTransportePreco());
            pstm.setInt(8, emprestimo.getCodigoObra());
            pstm.executeUpdate();
            bd.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(EmprestimoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    /*
    ManterEmprestimo me = new ManterEmprestimo();
    EmprestimoBean emprestimoB = new EmprestimoBean();
    
        
    
    public void limpaTela(){
        
        emprestimoB.setCodigoObra(0);
        emprestimoB.setTituloObra("");
        emprestimoB.setAutorObra("");
        emprestimoB.setTipoOperacao("");
        emprestimoB.setMuseuObra("");
        emprestimoB.setDataDia(0);
        emprestimoB.setData_mes(0);
        emprestimoB.setData_ano(0);
        emprestimoB.setEmpresa_texto("");
        emprestimoB.setTransporte_tipo("");
        emprestimoB.setTransporte_preco(0);
        emprestimoB.setTransporte_pagador("");
        emprestimoB.setImagemObra("");
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    */
}