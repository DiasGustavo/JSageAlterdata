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
public class ControlerFuncionarioAD {
    public List pesquisarTodosFuncionarios(int cdEmpresa) throws JSageImportException {
        List listaFuncionarios;
        IGerenciadorPersistenciaAD gerenteP = new GerenciadorPersistenciaAD();
        IPersistenciaFuncionarioAD PFuncionario = gerenteP.getPersistenciaFuncionarioAD();
        listaFuncionarios = PFuncionario.pesquisarTodos(cdEmpresa);
        
        return listaFuncionarios;
    }
    
    public String exportarFuncionarios (int cdEmpresaSage, int cdEmpresa, String cnpj, String cdFuncionario) throws JSageImportException{
        String tag = "";
        IGerenciadorPersistenciaAD gerenteP = new GerenciadorPersistenciaAD();
        IPersistenciaFuncionarioAD PFuncionario = gerenteP.getPersistenciaFuncionarioAD();
        tag =PFuncionario.exportarFuncionarios(cdEmpresaSage, cdEmpresa, cnpj, cdFuncionario);
        return tag;
    }
}
