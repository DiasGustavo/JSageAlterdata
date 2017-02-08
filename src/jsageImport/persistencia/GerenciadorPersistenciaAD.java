/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.persistencia;

import jsageImport.modelo.ipersistencia.IPersistenciaEmpresaAD;
import jsageImport.modelo.ipersistencia.IPersistenciaFuncionarioAD;
import jsageImport.modelo.persistencia.PersistenciaEmpresaAD;
import jsageImport.modelo.persistencia.PersistenciaFuncionarioAD;

/**
 *
 * @author Jefferson Lucena
 */
public class GerenciadorPersistenciaAD implements IGerenciadorPersistenciaAD{

    @Override
    public IPersistenciaFuncionarioAD getPersistenciaFuncionarioAD() {
        return new PersistenciaFuncionarioAD();
    }
    
    @Override
    public IPersistenciaEmpresaAD getPersistenciaEmpresaAD() {
        return new PersistenciaEmpresaAD();
    }
    

}
