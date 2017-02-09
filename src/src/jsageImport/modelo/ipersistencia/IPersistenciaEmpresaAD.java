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
 * @author Gustavo
 */
public interface IPersistenciaEmpresaAD {
    
    public List pesquisarTodos() throws JSageImportException;
     public boolean TestaConexao(String server, String bd, String port, String user, String password) throws JSageImportException;
    
}
