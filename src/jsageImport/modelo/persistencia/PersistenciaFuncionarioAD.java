/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jsageImport.controler.ControlerEmpresaSAGE;
import jsageImport.controler.ControlerFuncionarioSAGE;
import jsageImport.exception.JSageImportException;
import jsageImport.log.LogSage;
import jsageImport.modelo.dominio.FuncionarioAD;
import jsageImport.modelo.ipersistencia.IPersistenciaFuncionarioAD;

/**
 *
 * @author Jefferson Lucena
 */
public class PersistenciaFuncionarioAD implements IPersistenciaFuncionarioAD{
    
    PropertiesJdbc jdbc = new PropertiesJdbc();
    private TratamentoDados trataDados = new TratamentoDados();
    private LogSage logarq = new LogSage();
    //string SQL da consultas das empresas no banco AlterData
    
    private static final String SQL_PESQUISARTODOS = "SELECT * FROM $table where dtdemissao is null";
    
    private static final String SQL_PESQUISARFUNCIONARIO_ID = "SELECT * FROM $table where cdchamada = ?";
    
    // string SQL para pesquisa dos funcionarios ALterData
    
    private static final String SQL_PESQUISAR_FUNCIONARIO = "";
    
   
    
    //url para conexão com o bando AD
    //jdbc:sqlserver://servidor:porta;databaseName=banco;user=usuario;password=senha;"
    
    private final String urlAD = "jdbc:postgresql://"+jdbc.lerServidor("AD")+":"+jdbc.lerPorta("AD")+"/"+jdbc.lerDatabase("AD"); 
    private final String usuarioAD =jdbc.lerUsuario("AD");
    private final String senhaAD =jdbc.lerSenha("AD");
        

    @Override
    public List pesquisarTodos(int cdEmpresa) throws JSageImportException {
        
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Long nextID = null;
        try {
            con = GerenciadorConexao.getConnectionPostgresUrl(urlAD, usuarioAD, senhaAD);
            String idEmpresa = "wdp.f" + trataDados.preencherStringEsquerda(cdEmpresa, "0");
            
            String consulta = SQL_PESQUISARTODOS.replace("$table", idEmpresa);
            stmt = con.prepareStatement(consulta);  
            
            rs = stmt.executeQuery();
            List listaFuncionarios = new ArrayList();
            while (rs.next()) {
                //nextID = rs.getLong(senhaAD)
                FuncionarioAD fun = criarFuncionarioAD(rs);
                listaFuncionarios.add(fun);
            }
            return listaFuncionarios;
        } catch (SQLException exc) {
            StringBuffer mensagem = new StringBuffer("Não foi possível realizar a consulta.");
            mensagem.append("\nMotivo: " + exc.getMessage());
            throw new JSageImportException(mensagem.toString());
        } finally {
            GerenciadorConexao.closeConexao(con, stmt, rs);
        }
    }
     
    @Override
    public List recuperarFuncionarioPorId (int cdEmpresa, String cdFuncionario) throws JSageImportException{
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List listaFuncionarios = new ArrayList();
        try {                   
            con = GerenciadorConexao.getConnectionPostgresUrl(urlAD, usuarioAD, senhaAD);
            String idFuncionario = "wdp.f" + trataDados.preencherStringEsquerda(cdEmpresa, "0");
            String consulta = SQL_PESQUISARFUNCIONARIO_ID.replace("$table", idFuncionario );
            stmt = con.prepareStatement(consulta);  
            
                    
            stmt.setString(1, cdFuncionario);
            rs = stmt.executeQuery();
            while(rs.next())
            { 
                FuncionarioAD fun = criarFuncionarioAD (rs); 
                listaFuncionarios.add(fun);                
            }
            
        }catch (SQLException ex) { 
            System.out.println("Não foi possível gerar a consulta por id.\n Motivo" + ex);
        } finally{
            GerenciadorConexao.closeConexao(con, stmt,rs);
        }
        return listaFuncionarios;
    }

    @Override
    public boolean TestaConexao(String server, String bd, String port, String user, String password) throws JSageImportException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String importaFuncionarios(int idFuncionario, int cdEmpresa, String cpf) throws JSageImportException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String exportarFuncionarios (int cdEmpresa, String cnpj, String cdFuncionario) throws JSageImportException{
        String funcionario = "";
        String log = "";
        ControlerFuncionarioSAGE controlFunSage = new ControlerFuncionarioSAGE();
        ControlerEmpresaSAGE controleEmpSage = new ControlerEmpresaSAGE();
        
        if(!(cnpj.isEmpty())){
            List listaIds = controlFunSage.pesquisarCNPJ(cnpj);
            log = "Existentes no SAGE: " +cdEmpresa + " --- " + cdFuncionario;
            logarq.LogTxt(log, "PersisntenciaAD", "emp"+cdEmpresa);
            List listaIdEstabelecimentos = controlFunSage.pesquisarIdEstablecimentoPorCNPJ(cnpj);
             
            if (listaIds.size()>0 && listaIdEstabelecimentos.size()>0){
                List listaFuncionario = recuperarFuncionarioPorId(cdEmpresa, cdFuncionario);
                FuncionarioAD funcionarioAD = (FuncionarioAD) listaFuncionario.get(0);
                int idEmpresa = (int) listaIds.get(0);
                
                List listaFuncionariosSage = controlFunSage.pesquisaFuncionarioPorCpf(idEmpresa, funcionarioAD.getNrcpf());
                //controleEmpSage.gravarCargo(funcionario, idEmpresa);
                controleEmpSage.gravarBancoGeral(idEmpresa);
                if (listaFuncionariosSage.isEmpty()){
                    controlFunSage.gravarFuncionario(idEmpresa, funcionario, dadosFuncionais);
                    controlFunSage.gravarDocumentos(cdFuncionario, idEmpresa, dadosFuncionais);
                    controlFunSage.gravarLotacao(cdFuncionario, idEmpresa, (int) listaIdEstabelecimentos.get(0), funcionario);
                    controlFunSage.gravarColaborador(idEmpresa, cdFuncionario, funcionario);
                    controlFunSage.gravarFuncao(cdFuncionario, idEmpresa, funcionario);
                    controlFunSage.gravarFunEspecifico(cdFuncionario, idEmpresa);
                    controlFunSage.gravarSalario(cdFuncionario, idEmpresa, funcionario);
                    controlFunSage.gravarFerias(cdFuncionario, idEmpresa, funcionario);
                    controlFunSage.gravarControleESocial(cdFuncionario, idEmpresa);
                    controlFunSage.gravarControleCamposESocial(idEmpresa, cdFuncionario);
                    controlFunSage.gravarDadosFuncionais(idEmpresa, cdFuncionario, dadosFuncionais, funcionario);
                }
                
            }else{
                
                throw new JSageImportException("Empresa não cadastrada no SAGE realize o cadatro da mesmo primeiro \n depois importe os seu funcionários..","Aviso");
            }
        }else{
            throw new JSageImportException("Cnpj não capturado.");
        }
        funcionario = "código: " + cdFuncionario;
        
        return funcionario;
        
    }
    
       
    @Override
    public int SizeImport() throws JSageImportException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private FuncionarioAD criarFuncionarioAD(ResultSet rs) throws JSageImportException {
        FuncionarioAD fun = new FuncionarioAD();
        
        try {
            fun.setCdchamada(rs.getString("cdchamada"));
            fun.setNmfuncionario(rs.getString("nmfuncionario"));
            fun.setNmendereco(rs.getString("nmendereco"));
            fun.setNrendereco(rs.getString("nrendereco"));
            fun.setNmcomplemento(rs.getString("nmcomplemento"));
            fun.setNmbairro(rs.getString("nmbairro"));
            fun.setNmcidade(rs.getString("nmcidade"));
            fun.setCduf(rs.getString("cduf"));
            fun.setNrcep(rs.getString("nrcep"));
            fun.setNrddd(rs.getString("nrddd"));
            fun.setNrtelefone(rs.getString("nrtelefone"));
            fun.setDtnascimento(rs.getTimestamp("dtnascimento"));
            fun.setTpestadocivil(rs.getString("tpestadocivil"));
            fun.setTpsexo(rs.getString("tpsexo"));
            fun.setNmnacionalidade(rs.getString("nmnacionalidade"));
            fun.setNranochegada(rs.getString("nranochegada"));
            fun.setTpinstrucao(rs.getString("tpinstrucao"));
            fun.setTpinstrucaorais(rs.getString("tpinstrucaorais"));
            fun.setDtvctoexperiencia(rs.getTimestamp("dtvctoexperiencia"));
            fun.setDtprorrogacaoexperiencia(rs.getTimestamp("dtprorrogacaoexperiencia"));
            fun.setDtadmissao(rs.getTimestamp("dtadmissao"));
            fun.setDtdemissao(rs.getTimestamp("dtdemissao"));
            fun.setTpcausademissao(rs.getString("tpcausademissao"));
            fun.setStavisoindenizado(rs.getString("stavisoindenizado"));
            fun.setStterminocontrato(rs.getString("stterminocontrato"));
            fun.setTpvinculo(rs.getString("tpvinculo"));
            fun.setDtvctoatestado(rs.getString("dtvctoatestado"));
            fun.setIddepartamento(rs.getString("iddepartamento"));
            fun.setIdfuncao(rs.getString("idfuncao"));
            fun.setVlsalariobase(rs.getDouble("vlsalariobase"));
            fun.setTpformapgto(rs.getString("tpformapgto"));
            fun.setNrminpordia(rs.getInt("nrminpordia"));
            fun.setStprimtrabcaged(rs.getString("stprimtrabcaged"));
            fun.setTplivroficharegistro(rs.getString("tplivroficharegistro"));
            fun.setNrfolhalivroficharegistro(rs.getInt("nrfolhalivroficharegistro"));
            fun.setIdagencia(rs.getString("idagencia"));
            fun.setNrcontacorrente(rs.getString("nrcontacorrente"));
            fun.setIdbanco(rs.getString("idbanco"));
            fun.setCdcamaracompensacao(rs.getString("cdcamaracompensacao"));
            fun.setTpcontribuicaosindical(rs.getString("tpcontribuicaosindical"));
            fun.setCdretencaoirrf(rs.getString("cdretencaoirrf"));
            fun.setTpfaixainss(rs.getString("tpfaixainss"));
            fun.setStadiantamento(rs.getString("stadiantamento"));
            fun.setAladiantamento(rs.getShort("aladiantamento"));
            fun.setAlvaletransporte(rs.getDouble("alvaletransporte"));
            fun.setIdsindicatogrcs(rs.getString("idsindicatogrcs"));
            fun.setNridentidade(rs.getString("nridentidade"));
            fun.setNmorgaoexpedidor(rs.getString("nmorgaoexpedidor"));
            fun.setDtexpedicao(rs.getTimestamp("dtexpedicao"));
            fun.setTpidentifpispasep(rs.getString("tpidentifpispasep"));
            fun.setCdufexpedicao(rs.getString("cdufexpedicao"));
            fun.setNrpispasep(rs.getString("nrpispasep"));
            fun.setDtpis(rs.getTimestamp("dtpis"));
            fun.setNrcpf(rs.getString("nrcpf"));
            fun.setNrctps(rs.getString("nrctps"));
            fun.setNrseriectps(rs.getString("nrseriectps"));
            fun.setCdufctps(rs.getString("cdufctps"));
            fun.setDtexpedicaoctps(rs.getTimestamp("dtexpedicaoctps"));
            fun.setNrcertificadoreservista(rs.getString("nrcertificadoreservista"));
            fun.setNrserie(rs.getString("nrserie"));
            fun.setNrtituloeleitor(rs.getString("nrtituloeleitor"));
            fun.setNrzonaeleitoral(rs.getString("nrzonaeleitoral"));
            fun.setNrsecaoeleitoral(rs.getString("nrsecaoeleitoral"));
            fun.setNrcarteirahabilitacao(rs.getString("nrcarteirahabilitacao"));
            fun.setDtvctohabilitacao(rs.getTimestamp("dtvctohabilitacao"));
            fun.setTphabilitacao(rs.getString("tphabilitacao"));
            fun.setDtvalcarteiraidentest(rs.getTimestamp("dtvalcarteiraidentest"));
            fun.setNrcontafgts(rs.getString("nrcontafgts"));
            fun.setCdufcontafgts(rs.getString("cdufcontafgts"));
            fun.setStmudouenderecofgts(rs.getString("stmudouenderecofgts"));
            fun.setDtopcaofgts(rs.getTimestamp("dtopcaofgts"));
            fun.setDsobservacao(rs.getString("dsobservacao"));
            fun.setIdhorario(rs.getString("idhorario"));
            fun.setNmmae(rs.getString("nmmae"));
            fun.setNmpai(rs.getString("nmpai"));
            fun.setDtavisoprevio(rs.getTimestamp("dtavisoprevio"));
            fun.setStavisoprevio(rs.getString("stavisoprevio"));
            fun.setTpcategoria(rs.getInt("tpcategoria"));
            fun.setTpfuncaposentado(rs.getString("tpfuncaposentado"));
            fun.setTpcorraca(rs.getString("tpcorraca"));
            fun.setStdeficiente(rs.getString("stdeficiente"));
            fun.setStreabilitado(rs.getString("streabilitado"));
            fun.setQtdiastrabalhados(rs.getInt("qtdiastrabalhados"));
            fun.setQtdiassalariofamilia(rs.getInt("qtdiassalariofamilia"));
            fun.setQtdiasfaltasproporcionais(rs.getInt("qtdiasfaltasproporcionais"));
            fun.setQtdiasfaltas(rs.getInt("qtdiasfaltas"));
            fun.setQtfaltasperiodoaquisitivo(rs.getInt("qtfaltasperiodoaquisitivo"));
            fun.setCdocupacaoprincipal(rs.getString("cdocupacaoprincipal"));
            fun.setCdnaturezaocupacao(rs.getString("cdnaturezaocupacao"));
            fun.setCdufnascimento(rs.getString("cdufnascimento"));
            fun.setNmmunnascimento(rs.getString("nmmunnascimento"));
            fun.setIdbancopis(rs.getString("idbancopis"));
            fun.setIdagenciapis(rs.getString("idagenciapis"));
            fun.setNrdecretonaturalizado(rs.getString("nrdecretonaturalizado"));
            fun.setQtdiastrabnaopagos(rs.getInt("qtdiastrabnaopagos"));
            fun.setStgerarais(rs.getString("stgerarais"));
            fun.setDtvenctoaprendizagem(rs.getTimestamp("dtvenctoaprendizagem"));
            fun.setDscausademissao(rs.getString("dscausademissao"));
            fun.setStindalvara(rs.getString("stindalvara"));
            fun.setNmcurto(rs.getString("nmcurto"));
            fun.setTipobeneficioticket(rs.getString("tipobeneficioticket"));
            fun.setDtentrada(rs.getTimestamp("dtentrada"));
            fun.setTppagamentorais(rs.getString("tppagamentorais"));
            fun.setNrci(rs.getDouble("nrci"));
            fun.setTipodeficiencia(rs.getString("tipodeficiencia"));
            fun.setDtalteracaocad(rs.getTimestamp("dtalteracaocad"));
            fun.setDtultrescisao(rs.getTimestamp("dtultrescisao"));
            fun.setTpcontrato(rs.getString("tpcontrato"));
            fun.setTipo_conta(rs.getShort("tipo_conta"));
            fun.setTipo_certidao_civil(rs.getShort("tipo_certidao_civil"));
            fun.setData_certidao_civil(rs.getTimestamp("data_certidao_civil"));
            fun.setQuantidade_dias_ferias(rs.getShort("quantidade_dias_ferias"));
            fun.setTipo_identidade(rs.getShort("tipo_identidade"));
            fun.setOrgao_emissor_cnh(rs.getString("orgao_emissor_cnh"));
            fun.setData_expedicao_cnh(rs.getTimestamp("data_expedicao_cnh"));
            fun.setTipo_logradouro(rs.getString("tipo_logradouro"));
            fun.setTipo_admissao(rs.getShort("tipo_admissao"));
            fun.setAdmissao_especial_caged(rs.getBoolean("admissao_especial_caged"));
            fun.setAviso_trabalhado_fixo_30_dias(rs.getBoolean("aviso_trabalhado_fixo_30_dias"));
            fun.setUf_emissor_cnh(rs.getString("uf_emissor_cnh"));
            fun.setTipo_jornada_trabalho(rs.getShort("tipo_jornada_trabalho"));
            fun.setTipo_contratacao_temporaria(rs.getShort("tipo_contratacao_temporaria"));
            fun.setTipo_provimento(rs.getShort("tipo_provimento"));
            fun.setDeficiencia_fisica(rs.getBoolean("deficiencia_fisica"));
            fun.setDeficiencia_auditiva(rs.getBoolean("deficiencia_auditiva"));
            fun.setDeficiencia_visual(rs.getBoolean("deficiencia_auditiva"));
            fun.setDeficiencia_mental(rs.getBoolean("deficiencia_mental"));
            fun.setDeficiencia_intelectual(rs.getBoolean("deficiencia_intelectual"));
            fun.setCategoria_trabalhador_esocial(rs.getShort("categoria_trabalhador_esocial"));
            fun.setNao_atualiza_salario(rs.getBoolean("nao_atualiza_salario"));
   
            
        } catch (SQLException ex) {
            StringBuffer mensagem = new StringBuffer("Não foi possível obter os dados do funcionário .");
            mensagem.append("\nMotivo: " + ex.getMessage());
            throw new JSageImportException(mensagem.toString());
        }
        return fun;
        }
    }
    
    
  

