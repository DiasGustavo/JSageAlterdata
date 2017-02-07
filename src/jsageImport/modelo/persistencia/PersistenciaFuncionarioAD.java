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
import jsageImport.modelo.dominio.DadosFuncionario;
import jsageImport.modelo.dominio.FuncionarioAD;
import jsageImport.modelo.ipersistencia.IPersistenciaFuncionarioAD;

/**
 *
 * @author Jefferson Lucena
 */
public class PersistenciaFuncionarioAD implements IPersistenciaFuncionarioAD{
    
    PropertiesJdbc jdbc = new PropertiesJdbc();
    
    //string SQL da consultas das empresas no banco AlterData
    
    private static final String SQL_PESQUISARTODOS = "";
    
    private static final String SQL_PESQUISAREMPRESA_ID = "";
    
    // string SQL para pesquisa dos funcionarios ALterData
    
    private static final String SQL_PESQUISAR_FUNCIONARIO = "";
    
    //url para conexão com o bando AD
    //jdbc:sqlserver://servidor:porta;databaseName=banco;user=usuario;password=senha;"
    
    private final String urlAD = "jdbc:sqlserver://"+jdbc.lerServidor("AD")+":"+jdbc.lerPorta("AD")+";databaseName=ad;user="+jdbc.lerUsuario("AD")+";password="+jdbc.lerSenha("AD")+";"; 
    
    
    

    @Override
    public List pesquisarTodos() throws JSageImportException {
        
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = GerenciadorConexao.getConnectionPostgresql(urlAD);
            stmt = con.prepareStatement(SQL_PESQUISARTODOS);
            rs = stmt.executeQuery();
            List listaFuncionarios = new ArrayList();
            while (rs.next()) {
                FuncionarioAD fun = criarFuncionarioAD(rs);
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

    @Override
    public List pesquisaId(int id) throws JSageImportException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean TestaConexao(String server, String bd, String port, String user, String password) throws JSageImportException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String importaFuncionarios(int idFuncionario, int cdEmpresa, String cpf) throws JSageImportException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int SizeImport() throws JSageImportException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private FuncionarioAD criarFuncionarioAD(ResultSet rs) throws JSageImportException {
        FuncionarioAD fun = new FuncionarioAD();
        
        try {
            fun.setCdchamada(rs.getString("cdchamada"));
            
            
        } catch (SQLException ex) {
            StringBuffer mensagem = new StringBuffer("Não foi possível obter os dados do funcionário .");
            mensagem.append("\nMotivo: " + ex.getMessage());
            throw new JSageImportException(mensagem.toString());
        }
        return fun;
        }
    }
    
    
  

