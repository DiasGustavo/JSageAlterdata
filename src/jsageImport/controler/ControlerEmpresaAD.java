/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.controler;

import java.util.List;
import jsageImport.exception.JSageImportException;
import jsageImport.modelo.ipersistencia.IPersistenciaEmpresaAD;
import jsageImport.persistencia.GerenciadorPersistenciaAD;
import jsageImport.persistencia.IGerenciadorPersistenciaAD;

/**
 *
 * @author Nyedja Lucena
 */
public class ControlerEmpresaAD {
    
    public List pesquisarEmpresas () throws JSageImportException{
        List listaEmp;
        IGerenciadorPersistenciaAD gerenteP = new GerenciadorPersistenciaAD();
        IPersistenciaEmpresaAD PEmpresas = gerenteP.getPersistenciaEmpresaAD();
        listaEmp = PEmpresas.pesquisarTodos();
        
        return listaEmp;
    }
     
     public boolean testarConexao (String server, String bd, String port, String user, String password) throws JSageImportException{
        IGerenciadorPersistenciaAD gerenteP = new GerenciadorPersistenciaAD();
        IPersistenciaEmpresaAD empresaAD = gerenteP.getPersistenciaEmpresaAD();
        boolean resultado = false;
        if (empresaAD.TestaConexao(server, bd, port, user, password)){
            resultado = true;
        }
        return resultado;
    }
}
