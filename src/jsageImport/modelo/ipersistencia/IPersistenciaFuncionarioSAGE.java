/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.modelo.ipersistencia;

import java.util.List;
import jsageImport.exception.JSageImportException;
import jsageImport.modelo.dominio.DadosFuncionaisNG;
import jsageImport.modelo.dominio.DadosFuncionario;
import jsageImport.modelo.dominio.DependenteNG;
import jsageImport.modelo.dominio.FeriasNG;
import jsageImport.modelo.dominio.FuncionarioAD;
import jsageImport.modelo.dominio.MovimentacaoNG;
import jsageImport.modelo.dominio.PlanoSaudeNG;

/**
 *
 * @author Gustavo
 */
public interface IPersistenciaFuncionarioSAGE {
    
    public abstract List pesquisaCNPJ(String cnpj) throws JSageImportException;
    public abstract List pesquisaIDCNPJ(int id, String cnpj) throws JSageImportException;
    public abstract List pesquisaIdDependente (int cdFuncionario, int idDependente) throws JSageImportException;
    public abstract List pesquisaFuncionario(int idPessoa, int cdEmpresa, String cpf) throws JSageImportException;
    public abstract List pesquisaFuncionarioNome( int cdEmpresa, String cpf) throws JSageImportException;
    
    public abstract void gravarFuncionario (int cdEmpresa, FuncionarioAD funAD, DadosFuncionaisNG fun) throws JSageImportException;
    public abstract void gravarDocumentos (int cdFuncionario, int cdEmpresa, DadosFuncionario pf) throws JSageImportException;
    public abstract void gravarLotacao (int cdFuncionario, int cdEmpresa, DadosFuncionaisNG df) throws JSageImportException;
    public abstract void gravarColaborador (int cdEmpresa, int cdFuncionario, DadosFuncionario df) throws JSageImportException;
    public abstract void gravarFuncao (int cdFuncionario, int cdEmpresa, DadosFuncionaisNG df) throws JSageImportException;
    public abstract void gravarSalario (int cdFuncionario, int cdEmpresa, DadosFuncionaisNG df) throws JSageImportException;
    public abstract void gravarDependentes (int cdFuncionario, int cdEmpresa, DependenteNG dep) throws JSageImportException;
    public abstract void gravarDadosFuncionais (int cdEmpresa, int cdFuncionario, DadosFuncionaisNG df, DadosFuncionario fun) throws JSageImportException;
    public abstract void gravarFerias (int cdFuncionario,int cdEmpresa, FeriasNG ferias) throws JSageImportException;
    public abstract void gravarControleESocial (int cdEmpresa, int cdFuncionario) throws JSageImportException;
    public abstract void gravarControleCamposESocial (int cdEmpresa, int cdFuncionario) throws JSageImportException;
    public abstract void gravarFunEspecifico (int cdFuncionario, int cdEmpresa) throws JSageImportException;
    public void gravarMovEvento (MovimentacaoNG movimentacao, int cdEmpresa, int cdFuncionario) throws JSageImportException;
    public void gravarProcBase (MovimentacaoNG movimentacao, int cdEmpresa, int cdFuncionario, DadosFuncionaisNG dadosFuncionais) throws JSageImportException;
    public void gravarProcEvento (MovimentacaoNG movimentacao, int cdEmpresa, int cdFuncionario) throws JSageImportException;
    public void gravarProcImposto (MovimentacaoNG movimentacao, int cdEmpresa, int cdFuncionario) throws JSageImportException;
    public abstract void gravarPlanoSaude (PlanoSaudeNG plano) throws JSageImportException;
    public abstract void gravarPlanoSaudeGeral (PlanoSaudeNG plano, int cdEmpresa) throws JSageImportException;
    public abstract void gravarPlanoSaudeFuncionario (MovimentacaoNG movimento, int cdEmpresa, int cdFuncionario) throws JSageImportException;
    public abstract void gravarPlanoSaudeMovFuncionario (MovimentacaoNG movimento, int cdEmpresa, int cdFuncionario) throws JSageImportException;
    public abstract void gravarPlanoSaudeProcFuncionario (MovimentacaoNG movimento, int cdEmpresa, int cdFuncionario) throws JSageImportException;
    public boolean testaConexaoSAGE (String server, String bd, String port, String user, String password) throws JSageImportException;
}
