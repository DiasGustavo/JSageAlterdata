/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.modelo.ipersistencia;

import java.util.List;
import jsageImport.exception.JSageImportException;

/**
 *
 * @author Jefferson Lucena
 */
public interface IPersistenciaFuncionarioAD {
    
    public abstract List pesquisarTodos() throws JSageImportException;
    public abstract List pesquisaId (int id) throws JSageImportException;
   
    public abstract boolean TestaConexao (String server, String bd, String port, String user, String password) throws JSageImportException;
    public abstract String importaFuncionarios (int idFuncionario, int cdEmpresa, String cpf) throws JSageImportException;
    public abstract int SizeImport() throws JSageImportException;
    
}
