/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.modelo.ipersistencia;

import jsageImport.exception.JSageImportException;
import jsageImport.modelo.dominio.CargoFun;
import jsageImport.modelo.dominio.CentroCusto;
import jsageImport.modelo.dominio.ContaBancaria;
import jsageImport.modelo.dominio.ContadorPFisica;
import jsageImport.modelo.dominio.ContadorPJuridica;
import jsageImport.modelo.dominio.EmpresaFolha;
import jsageImport.modelo.dominio.EmpresaTributacao;
import jsageImport.modelo.dominio.PessoaJuridica;
import jsageImport.modelo.dominio.ResponsavelPJuridica;
import jsageImport.modelo.dominio.Sindicato;

/**
 *
 * @author Jeff-Info
 */
public interface IPersistenciaEmpresaSAGE {
    
    public void gravarEmpresaMatrizContabilizacao (int cd_empresa)throws JSageImportException;
    public void gravarEstabelecimentoParametro(PessoaJuridica pj) throws JSageImportException;
    public void gravarTomador (int cd_empresa) throws JSageImportException;
    public void gravarCSCDFCEquivalenteCaixa (int cd_empresa)throws JSageImportException;
    public void gravarCRDPermissaoGrupoEstabelecimento (int cd_empresa) throws JSageImportException;
    public void gravarCSCDRAPlano(int cd_empresa)throws JSageImportException;
    public void gravarCSCDFCEPlano (int cd_empresa)throws JSageImportException;
    public void gravarCRDSCPRODEC (int cd_empresa) throws JSageImportException;
    public void gravarTituloDRE (int cd_empresa)throws JSageImportException;
    public void gravarTipoDRE (int cd_empresa) throws JSageImportException;
    public void gravarCapaLote (int cd_empresa) throws JSageImportException;
    public void gravarCSCDMPLPLANO (int cd_empresa) throws JSageImportException;
    public void gravarEmpresaParametro (PessoaJuridica pj) throws JSageImportException;
    public void gravarBanco (int id, ContaBancaria conta, int cd_empresa)throws JSageImportException;
    public void gravarBancoGeral (int cd_empresa) throws JSageImportException;
    public void gravarCargo (CargoFun cargo, int cd_empresa ) throws JSageImportException;
    public void gravarCentroCusto (int id, CentroCusto centroCusto, int cd_empresa) throws JSageImportException;
    public void gravarSindicato (Sindicato sindicato) throws JSageImportException;
    public void gravarEstrutura (int cdEmpresa) throws JSageImportException;
    public void gravarContador (ContadorPFisica contador) throws JSageImportException;
    public void gravarContadorPJuridica (ContadorPJuridica contador) throws JSageImportException;
    public boolean pesquisarResponsavel (String nome) throws JSageImportException;
    public void gravarResponsavelPJuridica (ResponsavelPJuridica responsavel) throws JSageImportException;
    public void gravarParametroSindicato (int idSindicato) throws JSageImportException;
    
    
    public abstract void gravarEstabelecimento (int idResponsavelCaged, int idResponsavelSefip,PessoaJuridica pj, EmpresaTributacao empTrib, EmpresaTributacao empCnae, EmpresaFolha empFolha) throws JSageImportException;
    public abstract void gravarEmpresa (PessoaJuridica pj) throws JSageImportException;
   
    
}
