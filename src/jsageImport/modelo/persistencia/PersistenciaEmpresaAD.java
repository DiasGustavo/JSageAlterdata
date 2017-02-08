/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jsageImport.exception.JSageImportException;
import jsageImport.modelo.dominio.EmpresaAD;
import jsageImport.modelo.ipersistencia.IPersistenciaEmpresaAD;

/**
 *
 * @author Gustavo
 */
public class PersistenciaEmpresaAD implements IPersistenciaEmpresaAD{
    
     PropertiesJdbc jdbc = new PropertiesJdbc();
    
    //string SQL da consultas das empresas no banco AlterData
    
    private static final String SQL_PESQUISARTODOS = "SELECT * FROM wphd.empresa order by cdempresa asc";
    
    private static final String SQL_PESQUISAREMPRESA_ID = "";
    
    // string SQL para pesquisa dos funcionarios ALterData
    
    private static final String SQL_PESQUISAR_FUNCIONARIO = "";
    
    //url para conexão com o bando AD
    //jdbc:sqlserver://servidor:porta;databaseName=banco;user=usuario;password=senha;"
    
    private final String urlAD = "jdbc:postgresql://"+jdbc.lerServidor("AD")+":"+jdbc.lerPorta("AD")+"/"+jdbc.lerDatabase("AD");
    
    private final String usuarioAD = jdbc.lerUsuario("AD");
    
    private final String senhaAD = jdbc.lerSenha("AD"); 
    
    
    @Override
    public List pesquisarTodos() throws JSageImportException {
        
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = GerenciadorConexao.getConnectionPostgresUrl(urlAD,usuarioAD,senhaAD);
            stmt = con.prepareStatement(SQL_PESQUISARTODOS);
            rs = stmt.executeQuery();
            List listaFuncionarios = new ArrayList();
            while (rs.next()) {
                EmpresaAD fun = criarEmpresaAD(rs);
                listaFuncionarios.add(fun);
            }
            return listaFuncionarios;
        } catch (SQLException exc) {
            StringBuffer mensagem = new StringBuffer("Não foi possível realizar a consulta.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JSageImportException(mensagem.toString());
        } finally {
            GerenciadorConexao.closeConexao(con, stmt, rs);
        }
    }

    private EmpresaAD criarEmpresaAD(ResultSet rs) throws JSageImportException {
        EmpresaAD emp = new EmpresaAD();

        try {
            emp.setCdempresa(rs.getInt("cdempresa"));
            emp.setNmnomecompleto(rs.getString("nmempresa"));
            emp.setNmfantasia(rs.getString("nmfantasia"));
            emp.setNrcgc(rs.getString("nrcgc"));
            emp.setNmempresa(rs.getString("nmempresa"));

        } catch (SQLException ex) {
            StringBuffer mensagem = new StringBuffer("Não foi possível obter os dados da empresa .");
            mensagem.append("\nMotivo: " + ex.getMessage());
            throw new JSageImportException(mensagem.toString());
        }
        return emp;
    }
    
     public boolean TestaConexao(String server, String bd, String port, String user, String password) throws JSageImportException {
        Connection con = null;
        boolean flag = false;
        con = GerenciadorConexao.getConnectionPostGresql(server, bd, port, user, password);
        if (con != null){
            flag = true;
        }        
        return flag;
    } 
}

    
    

