/*
 * Interface que apresenta as funções que são implementadas pela classe PeristenciaEmpresaNG
 */
package jsageImport.modelo.ipersistencia;

import java.util.List;
import jsageImport.exception.JSageImportException;

/**
 * @author Gustavo Dias
 * Criação: 12/10/2016
 * Última modificação: 22/10/2016
 */
public interface IPersistenciaEmpresaNG {
    public abstract List pesquisarTodos() throws JSageImportException;
    public abstract List recuperarEmpresas() throws JSageImportException;
    public abstract List capturarInfoEmpresasComFun () throws JSageImportException;
    public abstract void ImportaEmpresas (int idEmpresa, String cnpj) throws JSageImportException;
    public abstract void ImportaTodasEmpresas(int idEmpresa, String cnpj) throws JSageImportException;
    public abstract List recuperarAgenciaNG () throws JSageImportException;
    public abstract List pesquisarCnpj(int idEmpresa, String cnpj) throws JSageImportException;
    public abstract List pesquisarEmpresaPorID(int idEmpresa) throws JSageImportException;
}
