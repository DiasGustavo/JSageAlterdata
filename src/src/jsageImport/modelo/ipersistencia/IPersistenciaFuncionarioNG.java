/*
 * Interface dos metodos implementados pela classe PersistenciaFuncionarioNG
 */
package jsageImport.modelo.ipersistencia;

import java.util.List;
import jsageImport.exception.JSageImportException;

/**
 * @author Gustavo Dias
 * Criação: 06/06/2016
 * Última modificação: 06/06/2016
 */
public interface IPersistenciaFuncionarioNG {
    
    public abstract List pesquisarTodos() throws JSageImportException;
    public abstract List pesquisaId (int id) throws JSageImportException;
    public abstract List capturarInfoFuncionariosNG (int idEmpresa) throws JSageImportException;
    public abstract List capturarInfoDependente (int idPessoa) throws JSageImportException;
    public abstract List capturarInfoPai (int idPessoa) throws JSageImportException;
    public abstract List capturarInfoMae (int idPessoa) throws JSageImportException;
    public abstract List recuperarDadosFuncionais(int id) throws JSageImportException;
    public abstract boolean TestaConexao (String server, String bd, String port, String user, String password) throws JSageImportException;
    public abstract String importaFuncionarios (int idFuncionario, int cdEmpresa, String cpf) throws JSageImportException;
    public abstract int SizeImport() throws JSageImportException;
       
    
}
