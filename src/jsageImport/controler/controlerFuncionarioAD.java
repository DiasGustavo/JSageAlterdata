/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.controler;

import java.util.List;
import jsageImport.exception.JSageImportException;
import jsageImport.modelo.ipersistencia.IPersistenciaFuncionarioAD;
import jsageImport.persistencia.GerenciadorPersistenciaAD;
import jsageImport.persistencia.IGerenciadorPersistenciaAD;

/**
 *
 * @author Gustavo
 */
public class controlerFuncionarioAD {
    public List pesquisarTodosFuncionarios(String cdEmpresa) throws JSageImportException {
        List listaFuncionarios;
        IGerenciadorPersistenciaAD gerenteP = new GerenciadorPersistenciaAD();
        IPersistenciaFuncionarioAD PFuncionario = gerenteP.getPersistenciaFuncionarioAD();
        listaFuncionarios = PFuncionario.pesquisarTodos(cdEmpresa);
        
        return listaFuncionarios;
    }
}
