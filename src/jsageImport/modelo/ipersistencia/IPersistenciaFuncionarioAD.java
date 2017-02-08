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
    
    public abstract List pesquisarTodos(String cdEmpresa) throws JSageImportException;
    public abstract List recuperarFuncionarioPorId (String cdEmpresa, String cdFuncionario) throws JSageImportException;
    public abstract boolean TestaConexao (String server, String bd, String port, String user, String password) throws JSageImportException;
    public abstract String importaFuncionarios (int idFuncionario, int cdEmpresa, String cpf) throws JSageImportException;
    public abstract String exportarFuncionarios (String cdEmpresa, String cnpj, String cdFuncionario) throws JSageImportException;
    public abstract int SizeImport() throws JSageImportException;
    
}
