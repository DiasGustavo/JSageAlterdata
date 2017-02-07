/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.modelo.dominio;

import java.sql.Timestamp;

/**
 *
 * @author Jefferson Lucena
 */
public class FuncionarioAD {
    
   
  String cdchamada;//id do funcionario na tabela
  String nmfuncionario;
  String nmendereco;
  String nrendereco;
  String nmcomplemento;
  String nmbairro;
  String nmcidade;
  String cduf;
  String nrcep;
  String nrddd;
  String nrtelefone;
  String nrcelular;
  Timestamp dtnascimento;
  String tpestadocivil;
  String tpsexo;
  String nmnacionalidade;
  String nranochegada;
  String tpinstrucao;
  String tpinstrucaorais;
  Timestamp dtvctoexperiencia;
  Timestamp dtprorrogacaoexperiencia;
  Timestamp dtadmissao;
  Timestamp dttransferencia;
  String tpcausatransferencia;
  Timestamp dtdemissao;
  String tpcausademissao;
  String stavisoindenizado;
  String stterminocontrato;
  String tpvinculo;
  String dtvctoatestado;
  String iddepartamento;
  String idfuncao;
  double vlsalariobase;
  String tpformapgto;
  int nrminpordia;
  String stprimtrabcaged;
  String tpreintegracao;
  int nrlivroficharegistro;
  String tplivroficharegistro;
  int nrfolhalivroficharegistro;
  String dsobservacaorecibo;
  String idagencia;
  String nrcontacorrente;
  String idbanco;
  String cdcamaracompensacao;
  String tpcontribuicaosindical;
  String cdretencaoirrf;
  String tpfaixainss;
  String stadiantamento;
  double aladiantamento;
  double alvaletransporte;
  String idsindicatogrcs;
  String nridentidade;
  String morgaoexpedidor;
  Timestamp dtexpedicao;
  String tpidentifpispasep;
  String cdufexpedicao;
  String nrpispasep;
  Timestamp dtpis;
  String nrcpf;
  String nrctps;
  String nrseriectps;
  String cdufctps;
  Timestamp dtexpedicaoctps;
  String nrcertificadoreservista;
  String nrserie;
  String nrcategoriamilitar;
  String nrtituloeleitor;
  String nrzonaeleitoral;
  String nrsecaoeleitoral;
  String nrcarteirahabilitacao;
  Timestamp dtvctohabilitacao;
  String tphabilitacao;
  Timestamp dtvalcarteiraidentest;
  String tpvistoestrangeiro;
  Timestamp dtvalidadecarttrabest;
  String nrcontafgts;
  String cdufcontafgts;
  String stmudouenderecofgts;
  Timestamp dtopcaofgts;
  double vlsaldofgts;
  String dsobservacao;
  String idhorario;
  String dsfoto;
  String nmmae;
  String nmpai;
  double vllimitecredito;
  String nrcartaoponto;
  Timestamp dtavisoprevio;
  String stavisoprevio;
  String tpocorrencia;
  int tpcategoria;
  String tpcartaosalario;
  String nmagenciabkfolha;
  String nrcepagenciabkfolha;
  String cddocbkfolha;
  String nrbancobkfolha;
  String stfgtsmesanterior;
  String tpfuncaposentado;
  String tpcorraca;
  String stdeficiente;
  String streabilitado;
  String strestantecontrato;
  int qtdiastrabalhados;
  int qtdiassalariofamilia;
  int qtdiasfaltasproporcionais;
  int qtdiasfaltas;
  int qtfaltasperiodoaquisitivo;
  String usuarioswmail;
  String stsituacaolegal;
  String cdocupacaoprincipal;
  String cdnaturezaocupacao;
  String cdufnascimento;
  String nmmunnascimento;
  String idbancopis;
  String idagenciapis;
  String nrdecretonaturalizado;
  String qtavosperdidos;
  int qtdiastrabnaopagos;
  String stgerarais;
  Timestamp dtvenctoaprendizagem;
  String tranfpoutraemp;
  String dscausademissao;
  String stindalvara;
  String nmcurto;
  String tipobeneficioticket;
  String dtestabilidade;
  boolean stimprimeetiqueta;
  boolean stimprimefolhaponto;
  String nrcartaoticket;
  Timestamp dtentrada;
  String dsinformacoes;
  String tppagamentorais;
  double nrci;
  String tipodeficiencia;
  Timestamp dtinicialprocesso;
  Timestamp dtfinalprocesso;
  String nrprocesso;
  String nrvaraprocesso;
  int nranoprocesso;
  Timestamp dtalteracaocad;
  Timestamp dtultrescisao;
  String  cdmotivorct;
  String  tpcontrato;
  String  motivo_estabilidade;
  Timestamp prorrogacao_tempo_determindado;
  double alpensaofgts;
  short tipo_conta;
  short tipo_certidao_civil;
  Timestamp data_certidao_civil;
  String  termo_matricula_certidao_civil;
  short quantidade_dias_ferias;
  short tipo_identidade;
  String orgao_emissor_cnh;
  Timestamp data_expedicao_cnh;
  String tipo_logradouro;
  Timestamp data_chegada;
  boolean casado_com_brasileiro;
  boolean filho_com_brasileiro;
  Timestamp data_naturalizacao;
  int pais_nascimento_id;
  int pais_residencia_id;
  String municipio_nascimento_ibge_codigo;
  String municipio_residencia_ibge_codigo;
  short tipo_admissao;
  boolean admissao_especial_caged;
  boolean aviso_trabalhado_fixo_30_dias;
  String  uf_emissor_cnh;
  Timestamp data_primeira_cnh;
  short tipo_jornada_trabalho;
  short tipo_contratacao_temporaria;
  short tipo_provimento; 
  boolean deficiencia_fisica;
  boolean deficiencia_auditiva;
  boolean deficiencia_visual;
  boolean deficiencia_mental;
  boolean deficiencia_intelectual;
  short categoria_trabalhador_esocial;
  boolean nao_atualiza_salario;

    public String getCdchamada() {
        return cdchamada;
    }

    public void setCdchamada(String cdchamada) {
        this.cdchamada = cdchamada;
    }

    public String getNmfuncionario() {
        return nmfuncionario;
    }

    public void setNmfuncionario(String nmfuncionario) {
        this.nmfuncionario = nmfuncionario;
    }

    public String getNmendereco() {
        return nmendereco;
    }

    public void setNmendereco(String nmendereco) {
        this.nmendereco = nmendereco;
    }

    public String getNrendereco() {
        return nrendereco;
    }

    public void setNrendereco(String nrendereco) {
        this.nrendereco = nrendereco;
    }

    public String getNmcomplemento() {
        return nmcomplemento;
    }

    public void setNmcomplemento(String nmcomplemento) {
        this.nmcomplemento = nmcomplemento;
    }

    public String getNmbairro() {
        return nmbairro;
    }

    public void setNmbairro(String nmbairro) {
        this.nmbairro = nmbairro;
    }

    public String getNmcidade() {
        return nmcidade;
    }

    public void setNmcidade(String nmcidade) {
        this.nmcidade = nmcidade;
    }

    public String getCduf() {
        return cduf;
    }

    public void setCduf(String cduf) {
        this.cduf = cduf;
    }

    public String getNrcep() {
        return nrcep;
    }

    public void setNrcep(String nrcep) {
        this.nrcep = nrcep;
    }

    public String getNrddd() {
        return nrddd;
    }

    public void setNrddd(String nrddd) {
        this.nrddd = nrddd;
    }

    public String getNrtelefone() {
        return nrtelefone;
    }

    public void setNrtelefone(String nrtelefone) {
        this.nrtelefone = nrtelefone;
    }

    public String getNrcelular() {
        return nrcelular;
    }

    public void setNrcelular(String nrcelular) {
        this.nrcelular = nrcelular;
    }

    public Timestamp getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Timestamp dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public String getTpestadocivil() {
        return tpestadocivil;
    }

    public void setTpestadocivil(String tpestadocivil) {
        this.tpestadocivil = tpestadocivil;
    }

    public String getTpsexo() {
        return tpsexo;
    }

    public void setTpsexo(String tpsexo) {
        this.tpsexo = tpsexo;
    }

    public String getNmnacionalidade() {
        return nmnacionalidade;
    }

    public void setNmnacionalidade(String nmnacionalidade) {
        this.nmnacionalidade = nmnacionalidade;
    }

    public String getNranochegada() {
        return nranochegada;
    }

    public void setNranochegada(String nranochegada) {
        this.nranochegada = nranochegada;
    }

    public String getTpinstrucao() {
        return tpinstrucao;
    }

    public void setTpinstrucao(String tpinstrucao) {
        this.tpinstrucao = tpinstrucao;
    }

    public String getTpinstrucaorais() {
        return tpinstrucaorais;
    }

    public void setTpinstrucaorais(String tpinstrucaorais) {
        this.tpinstrucaorais = tpinstrucaorais;
    }

    public Timestamp getDtvctoexperiencia() {
        return dtvctoexperiencia;
    }

    public void setDtvctoexperiencia(Timestamp dtvctoexperiencia) {
        this.dtvctoexperiencia = dtvctoexperiencia;
    }

    public Timestamp getDtprorrogacaoexperiencia() {
        return dtprorrogacaoexperiencia;
    }

    public void setDtprorrogacaoexperiencia(Timestamp dtprorrogacaoexperiencia) {
        this.dtprorrogacaoexperiencia = dtprorrogacaoexperiencia;
    }

    public Timestamp getDtadmissao() {
        return dtadmissao;
    }

    public void setDtadmissao(Timestamp dtadmissao) {
        this.dtadmissao = dtadmissao;
    }

    public Timestamp getDttransferencia() {
        return dttransferencia;
    }

    public void setDttransferencia(Timestamp dttransferencia) {
        this.dttransferencia = dttransferencia;
    }

    public String getTpcausatransferencia() {
        return tpcausatransferencia;
    }

    public void setTpcausatransferencia(String tpcausatransferencia) {
        this.tpcausatransferencia = tpcausatransferencia;
    }

    public Timestamp getDtdemissao() {
        return dtdemissao;
    }

    public void setDtdemissao(Timestamp dtdemissao) {
        this.dtdemissao = dtdemissao;
    }

    public String getTpcausademissao() {
        return tpcausademissao;
    }

    public void setTpcausademissao(String tpcausademissao) {
        this.tpcausademissao = tpcausademissao;
    }

    public String getStavisoindenizado() {
        return stavisoindenizado;
    }

    public void setStavisoindenizado(String stavisoindenizado) {
        this.stavisoindenizado = stavisoindenizado;
    }

    public String getStterminocontrato() {
        return stterminocontrato;
    }

    public void setStterminocontrato(String stterminocontrato) {
        this.stterminocontrato = stterminocontrato;
    }

    public String getTpvinculo() {
        return tpvinculo;
    }

    public void setTpvinculo(String tpvinculo) {
        this.tpvinculo = tpvinculo;
    }

    public String getDtvctoatestado() {
        return dtvctoatestado;
    }

    public void setDtvctoatestado(String dtvctoatestado) {
        this.dtvctoatestado = dtvctoatestado;
    }

    public String getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(String iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getIdfuncao() {
        return idfuncao;
    }

    public void setIdfuncao(String idfuncao) {
        this.idfuncao = idfuncao;
    }

    public double getVlsalariobase() {
        return vlsalariobase;
    }

    public void setVlsalariobase(double vlsalariobase) {
        this.vlsalariobase = vlsalariobase;
    }

    public String getTpformapgto() {
        return tpformapgto;
    }

    public void setTpformapgto(String tpformapgto) {
        this.tpformapgto = tpformapgto;
    }

    public int getNrminpordia() {
        return nrminpordia;
    }

    public void setNrminpordia(int nrminpordia) {
        this.nrminpordia = nrminpordia;
    }

    public String getStprimtrabcaged() {
        return stprimtrabcaged;
    }

    public void setStprimtrabcaged(String stprimtrabcaged) {
        this.stprimtrabcaged = stprimtrabcaged;
    }

    public String getTpreintegracao() {
        return tpreintegracao;
    }

    public void setTpreintegracao(String tpreintegracao) {
        this.tpreintegracao = tpreintegracao;
    }

    public int getNrlivroficharegistro() {
        return nrlivroficharegistro;
    }

    public void setNrlivroficharegistro(int nrlivroficharegistro) {
        this.nrlivroficharegistro = nrlivroficharegistro;
    }

    public String getTplivroficharegistro() {
        return tplivroficharegistro;
    }

    public void setTplivroficharegistro(String tplivroficharegistro) {
        this.tplivroficharegistro = tplivroficharegistro;
    }

    public int getNrfolhalivroficharegistro() {
        return nrfolhalivroficharegistro;
    }

    public void setNrfolhalivroficharegistro(int nrfolhalivroficharegistro) {
        this.nrfolhalivroficharegistro = nrfolhalivroficharegistro;
    }

    public String getDsobservacaorecibo() {
        return dsobservacaorecibo;
    }

    public void setDsobservacaorecibo(String dsobservacaorecibo) {
        this.dsobservacaorecibo = dsobservacaorecibo;
    }

    public String getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(String idagencia) {
        this.idagencia = idagencia;
    }

    public String getNrcontacorrente() {
        return nrcontacorrente;
    }

    public void setNrcontacorrente(String nrcontacorrente) {
        this.nrcontacorrente = nrcontacorrente;
    }

    public String getIdbanco() {
        return idbanco;
    }

    public void setIdbanco(String idbanco) {
        this.idbanco = idbanco;
    }

    public String getCdcamaracompensacao() {
        return cdcamaracompensacao;
    }

    public void setCdcamaracompensacao(String cdcamaracompensacao) {
        this.cdcamaracompensacao = cdcamaracompensacao;
    }

    public String getTpcontribuicaosindical() {
        return tpcontribuicaosindical;
    }

    public void setTpcontribuicaosindical(String tpcontribuicaosindical) {
        this.tpcontribuicaosindical = tpcontribuicaosindical;
    }

    public String getCdretencaoirrf() {
        return cdretencaoirrf;
    }

    public void setCdretencaoirrf(String cdretencaoirrf) {
        this.cdretencaoirrf = cdretencaoirrf;
    }

    public String getTpfaixainss() {
        return tpfaixainss;
    }

    public void setTpfaixainss(String tpfaixainss) {
        this.tpfaixainss = tpfaixainss;
    }

    public String getStadiantamento() {
        return stadiantamento;
    }

    public void setStadiantamento(String stadiantamento) {
        this.stadiantamento = stadiantamento;
    }

    public double getAladiantamento() {
        return aladiantamento;
    }

    public void setAladiantamento(double aladiantamento) {
        this.aladiantamento = aladiantamento;
    }

    public double getAlvaletransporte() {
        return alvaletransporte;
    }

    public void setAlvaletransporte(double alvaletransporte) {
        this.alvaletransporte = alvaletransporte;
    }

    public String getIdsindicatogrcs() {
        return idsindicatogrcs;
    }

    public void setIdsindicatogrcs(String idsindicatogrcs) {
        this.idsindicatogrcs = idsindicatogrcs;
    }

    public String getNridentidade() {
        return nridentidade;
    }

    public void setNridentidade(String nridentidade) {
        this.nridentidade = nridentidade;
    }

    public String getMorgaoexpedidor() {
        return morgaoexpedidor;
    }

    public void setMorgaoexpedidor(String morgaoexpedidor) {
        this.morgaoexpedidor = morgaoexpedidor;
    }

    public Timestamp getDtexpedicao() {
        return dtexpedicao;
    }

    public void setDtexpedicao(Timestamp dtexpedicao) {
        this.dtexpedicao = dtexpedicao;
    }

    public String getTpidentifpispasep() {
        return tpidentifpispasep;
    }

    public void setTpidentifpispasep(String tpidentifpispasep) {
        this.tpidentifpispasep = tpidentifpispasep;
    }

    public String getCdufexpedicao() {
        return cdufexpedicao;
    }

    public void setCdufexpedicao(String cdufexpedicao) {
        this.cdufexpedicao = cdufexpedicao;
    }

    public String getNrpispasep() {
        return nrpispasep;
    }

    public void setNrpispasep(String nrpispasep) {
        this.nrpispasep = nrpispasep;
    }

    public Timestamp getDtpis() {
        return dtpis;
    }

    public void setDtpis(Timestamp dtpis) {
        this.dtpis = dtpis;
    }

    public String getNrcpf() {
        return nrcpf;
    }

    public void setNrcpf(String nrcpf) {
        this.nrcpf = nrcpf;
    }

    public String getNrctps() {
        return nrctps;
    }

    public void setNrctps(String nrctps) {
        this.nrctps = nrctps;
    }

    public String getNrseriectps() {
        return nrseriectps;
    }

    public void setNrseriectps(String nrseriectps) {
        this.nrseriectps = nrseriectps;
    }

    public String getCdufctps() {
        return cdufctps;
    }

    public void setCdufctps(String cdufctps) {
        this.cdufctps = cdufctps;
    }

    public Timestamp getDtexpedicaoctps() {
        return dtexpedicaoctps;
    }

    public void setDtexpedicaoctps(Timestamp dtexpedicaoctps) {
        this.dtexpedicaoctps = dtexpedicaoctps;
    }

    public String getNrcertificadoreservista() {
        return nrcertificadoreservista;
    }

    public void setNrcertificadoreservista(String nrcertificadoreservista) {
        this.nrcertificadoreservista = nrcertificadoreservista;
    }

    public String getNrserie() {
        return nrserie;
    }

    public void setNrserie(String nrserie) {
        this.nrserie = nrserie;
    }

    public String getNrcategoriamilitar() {
        return nrcategoriamilitar;
    }

    public void setNrcategoriamilitar(String nrcategoriamilitar) {
        this.nrcategoriamilitar = nrcategoriamilitar;
    }

    public String getNrtituloeleitor() {
        return nrtituloeleitor;
    }

    public void setNrtituloeleitor(String nrtituloeleitor) {
        this.nrtituloeleitor = nrtituloeleitor;
    }

    public String getNrzonaeleitoral() {
        return nrzonaeleitoral;
    }

    public void setNrzonaeleitoral(String nrzonaeleitoral) {
        this.nrzonaeleitoral = nrzonaeleitoral;
    }

    public String getNrsecaoeleitoral() {
        return nrsecaoeleitoral;
    }

    public void setNrsecaoeleitoral(String nrsecaoeleitoral) {
        this.nrsecaoeleitoral = nrsecaoeleitoral;
    }

    public String getNrcarteirahabilitacao() {
        return nrcarteirahabilitacao;
    }

    public void setNrcarteirahabilitacao(String nrcarteirahabilitacao) {
        this.nrcarteirahabilitacao = nrcarteirahabilitacao;
    }

    public Timestamp getDtvctohabilitacao() {
        return dtvctohabilitacao;
    }

    public void setDtvctohabilitacao(Timestamp dtvctohabilitacao) {
        this.dtvctohabilitacao = dtvctohabilitacao;
    }

    public String getTphabilitacao() {
        return tphabilitacao;
    }

    public void setTphabilitacao(String tphabilitacao) {
        this.tphabilitacao = tphabilitacao;
    }

    public Timestamp getDtvalcarteiraidentest() {
        return dtvalcarteiraidentest;
    }

    public void setDtvalcarteiraidentest(Timestamp dtvalcarteiraidentest) {
        this.dtvalcarteiraidentest = dtvalcarteiraidentest;
    }

    public String getTpvistoestrangeiro() {
        return tpvistoestrangeiro;
    }

    public void setTpvistoestrangeiro(String tpvistoestrangeiro) {
        this.tpvistoestrangeiro = tpvistoestrangeiro;
    }

    public Timestamp getDtvalidadecarttrabest() {
        return dtvalidadecarttrabest;
    }

    public void setDtvalidadecarttrabest(Timestamp dtvalidadecarttrabest) {
        this.dtvalidadecarttrabest = dtvalidadecarttrabest;
    }

    public String getNrcontafgts() {
        return nrcontafgts;
    }

    public void setNrcontafgts(String nrcontafgts) {
        this.nrcontafgts = nrcontafgts;
    }

    public String getCdufcontafgts() {
        return cdufcontafgts;
    }

    public void setCdufcontafgts(String cdufcontafgts) {
        this.cdufcontafgts = cdufcontafgts;
    }

    public short getQuantidade_dias_ferias() {
        return quantidade_dias_ferias;
    }

    public void setQuantidade_dias_ferias(short quantidade_dias_ferias) {
        this.quantidade_dias_ferias = quantidade_dias_ferias;
    }

    public short getTipo_identidade() {
        return tipo_identidade;
    }

    public void setTipo_identidade(short tipo_identidade) {
        this.tipo_identidade = tipo_identidade;
    }

    public String getStmudouenderecofgts() {
        return stmudouenderecofgts;
    }

    public void setStmudouenderecofgts(String stmudouenderecofgts) {
        this.stmudouenderecofgts = stmudouenderecofgts;
    }

    public Timestamp getDtopcaofgts() {
        return dtopcaofgts;
    }

    public void setDtopcaofgts(Timestamp dtopcaofgts) {
        this.dtopcaofgts = dtopcaofgts;
    }

    public double getVlsaldofgts() {
        return vlsaldofgts;
    }

    public void setVlsaldofgts(double vlsaldofgts) {
        this.vlsaldofgts = vlsaldofgts;
    }

    public String getDsobservacao() {
        return dsobservacao;
    }

    public void setDsobservacao(String dsobservacao) {
        this.dsobservacao = dsobservacao;
    }

    public String getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(String idhorario) {
        this.idhorario = idhorario;
    }

    public String getDsfoto() {
        return dsfoto;
    }

    public void setDsfoto(String dsfoto) {
        this.dsfoto = dsfoto;
    }

    public String getNmmae() {
        return nmmae;
    }

    public void setNmmae(String nmmae) {
        this.nmmae = nmmae;
    }

    public String getNmpai() {
        return nmpai;
    }

    public void setNmpai(String nmpai) {
        this.nmpai = nmpai;
    }

    public double getVllimitecredito() {
        return vllimitecredito;
    }

    public void setVllimitecredito(double vllimitecredito) {
        this.vllimitecredito = vllimitecredito;
    }

    public String getNrcartaoponto() {
        return nrcartaoponto;
    }

    public void setNrcartaoponto(String nrcartaoponto) {
        this.nrcartaoponto = nrcartaoponto;
    }

    public Timestamp getDtavisoprevio() {
        return dtavisoprevio;
    }

    public void setDtavisoprevio(Timestamp dtavisoprevio) {
        this.dtavisoprevio = dtavisoprevio;
    }

    public String getStavisoprevio() {
        return stavisoprevio;
    }

    public void setStavisoprevio(String stavisoprevio) {
        this.stavisoprevio = stavisoprevio;
    }

    public String getTpocorrencia() {
        return tpocorrencia;
    }

    public void setTpocorrencia(String tpocorrencia) {
        this.tpocorrencia = tpocorrencia;
    }

    public int getTpcategoria() {
        return tpcategoria;
    }

    public void setTpcategoria(int tpcategoria) {
        this.tpcategoria = tpcategoria;
    }

    public String getTpcartaosalario() {
        return tpcartaosalario;
    }

    public void setTpcartaosalario(String tpcartaosalario) {
        this.tpcartaosalario = tpcartaosalario;
    }

    public String getNmagenciabkfolha() {
        return nmagenciabkfolha;
    }

    public void setNmagenciabkfolha(String nmagenciabkfolha) {
        this.nmagenciabkfolha = nmagenciabkfolha;
    }

    public String getNrcepagenciabkfolha() {
        return nrcepagenciabkfolha;
    }

    public void setNrcepagenciabkfolha(String nrcepagenciabkfolha) {
        this.nrcepagenciabkfolha = nrcepagenciabkfolha;
    }

    public String getCddocbkfolha() {
        return cddocbkfolha;
    }

    public void setCddocbkfolha(String cddocbkfolha) {
        this.cddocbkfolha = cddocbkfolha;
    }

    public String getNrbancobkfolha() {
        return nrbancobkfolha;
    }

    public void setNrbancobkfolha(String nrbancobkfolha) {
        this.nrbancobkfolha = nrbancobkfolha;
    }

    public String getStfgtsmesanterior() {
        return stfgtsmesanterior;
    }

    public void setStfgtsmesanterior(String stfgtsmesanterior) {
        this.stfgtsmesanterior = stfgtsmesanterior;
    }

    public String getTpfuncaposentado() {
        return tpfuncaposentado;
    }

    public void setTpfuncaposentado(String tpfuncaposentado) {
        this.tpfuncaposentado = tpfuncaposentado;
    }

    public String getTpcorraca() {
        return tpcorraca;
    }

    public void setTpcorraca(String tpcorraca) {
        this.tpcorraca = tpcorraca;
    }

    public String getStdeficiente() {
        return stdeficiente;
    }

    public void setStdeficiente(String stdeficiente) {
        this.stdeficiente = stdeficiente;
    }

    public String getStreabilitado() {
        return streabilitado;
    }

    public void setStreabilitado(String streabilitado) {
        this.streabilitado = streabilitado;
    }

    public String getStrestantecontrato() {
        return strestantecontrato;
    }

    public void setStrestantecontrato(String strestantecontrato) {
        this.strestantecontrato = strestantecontrato;
    }

    public int getQtdiastrabalhados() {
        return qtdiastrabalhados;
    }

    public void setQtdiastrabalhados(int qtdiastrabalhados) {
        this.qtdiastrabalhados = qtdiastrabalhados;
    }

    public int getQtdiassalariofamilia() {
        return qtdiassalariofamilia;
    }

    public void setQtdiassalariofamilia(int qtdiassalariofamilia) {
        this.qtdiassalariofamilia = qtdiassalariofamilia;
    }

    public int getQtdiasfaltasproporcionais() {
        return qtdiasfaltasproporcionais;
    }

    public void setQtdiasfaltasproporcionais(int qtdiasfaltasproporcionais) {
        this.qtdiasfaltasproporcionais = qtdiasfaltasproporcionais;
    }

    public int getQtdiasfaltas() {
        return qtdiasfaltas;
    }

    public void setQtdiasfaltas(int qtdiasfaltas) {
        this.qtdiasfaltas = qtdiasfaltas;
    }

    public int getQtfaltasperiodoaquisitivo() {
        return qtfaltasperiodoaquisitivo;
    }

    public void setQtfaltasperiodoaquisitivo(int qtfaltasperiodoaquisitivo) {
        this.qtfaltasperiodoaquisitivo = qtfaltasperiodoaquisitivo;
    }

    public String getUsuarioswmail() {
        return usuarioswmail;
    }

    public void setUsuarioswmail(String usuarioswmail) {
        this.usuarioswmail = usuarioswmail;
    }

    public String getStsituacaolegal() {
        return stsituacaolegal;
    }

    public void setStsituacaolegal(String stsituacaolegal) {
        this.stsituacaolegal = stsituacaolegal;
    }

    public String getCdocupacaoprincipal() {
        return cdocupacaoprincipal;
    }

    public void setCdocupacaoprincipal(String cdocupacaoprincipal) {
        this.cdocupacaoprincipal = cdocupacaoprincipal;
    }

    public String getCdnaturezaocupacao() {
        return cdnaturezaocupacao;
    }

    public void setCdnaturezaocupacao(String cdnaturezaocupacao) {
        this.cdnaturezaocupacao = cdnaturezaocupacao;
    }

    public String getCdufnascimento() {
        return cdufnascimento;
    }

    public void setCdufnascimento(String cdufnascimento) {
        this.cdufnascimento = cdufnascimento;
    }

    public String getNmmunnascimento() {
        return nmmunnascimento;
    }

    public void setNmmunnascimento(String nmmunnascimento) {
        this.nmmunnascimento = nmmunnascimento;
    }

    public String getIdbancopis() {
        return idbancopis;
    }

    public void setIdbancopis(String idbancopis) {
        this.idbancopis = idbancopis;
    }

    public String getIdagenciapis() {
        return idagenciapis;
    }

    public void setIdagenciapis(String idagenciapis) {
        this.idagenciapis = idagenciapis;
    }

    public String getNrdecretonaturalizado() {
        return nrdecretonaturalizado;
    }

    public void setNrdecretonaturalizado(String nrdecretonaturalizado) {
        this.nrdecretonaturalizado = nrdecretonaturalizado;
    }

    public String getQtavosperdidos() {
        return qtavosperdidos;
    }

    public void setQtavosperdidos(String qtavosperdidos) {
        this.qtavosperdidos = qtavosperdidos;
    }

    public int getQtdiastrabnaopagos() {
        return qtdiastrabnaopagos;
    }

    public void setQtdiastrabnaopagos(int qtdiastrabnaopagos) {
        this.qtdiastrabnaopagos = qtdiastrabnaopagos;
    }

    public String getStgerarais() {
        return stgerarais;
    }

    public void setStgerarais(String stgerarais) {
        this.stgerarais = stgerarais;
    }

    public Timestamp getDtvenctoaprendizagem() {
        return dtvenctoaprendizagem;
    }

    public void setDtvenctoaprendizagem(Timestamp dtvenctoaprendizagem) {
        this.dtvenctoaprendizagem = dtvenctoaprendizagem;
    }

    public String getTranfpoutraemp() {
        return tranfpoutraemp;
    }

    public void setTranfpoutraemp(String tranfpoutraemp) {
        this.tranfpoutraemp = tranfpoutraemp;
    }

    public String getDscausademissao() {
        return dscausademissao;
    }

    public void setDscausademissao(String dscausademissao) {
        this.dscausademissao = dscausademissao;
    }

    public String getStindalvara() {
        return stindalvara;
    }

    public void setStindalvara(String stindalvara) {
        this.stindalvara = stindalvara;
    }

    public String getNmcurto() {
        return nmcurto;
    }

    public void setNmcurto(String nmcurto) {
        this.nmcurto = nmcurto;
    }

    public String getTipobeneficioticket() {
        return tipobeneficioticket;
    }

    public void setTipobeneficioticket(String tipobeneficioticket) {
        this.tipobeneficioticket = tipobeneficioticket;
    }

    public String getDtestabilidade() {
        return dtestabilidade;
    }

    public void setDtestabilidade(String dtestabilidade) {
        this.dtestabilidade = dtestabilidade;
    }

    public boolean isStimprimeetiqueta() {
        return stimprimeetiqueta;
    }

    public void setStimprimeetiqueta(boolean stimprimeetiqueta) {
        this.stimprimeetiqueta = stimprimeetiqueta;
    }

    public boolean isStimprimefolhaponto() {
        return stimprimefolhaponto;
    }

    public void setStimprimefolhaponto(boolean stimprimefolhaponto) {
        this.stimprimefolhaponto = stimprimefolhaponto;
    }

    public String getNrcartaoticket() {
        return nrcartaoticket;
    }

    public void setNrcartaoticket(String nrcartaoticket) {
        this.nrcartaoticket = nrcartaoticket;
    }

    public Timestamp getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Timestamp dtentrada) {
        this.dtentrada = dtentrada;
    }

    public String getDsinformacoes() {
        return dsinformacoes;
    }

    public void setDsinformacoes(String dsinformacoes) {
        this.dsinformacoes = dsinformacoes;
    }

    public String getTppagamentorais() {
        return tppagamentorais;
    }

    public void setTppagamentorais(String tppagamentorais) {
        this.tppagamentorais = tppagamentorais;
    }

    public double getNrci() {
        return nrci;
    }

    public void setNrci(double nrci) {
        this.nrci = nrci;
    }

    public String getTipodeficiencia() {
        return tipodeficiencia;
    }

    public void setTipodeficiencia(String tipodeficiencia) {
        this.tipodeficiencia = tipodeficiencia;
    }

    public Timestamp getDtinicialprocesso() {
        return dtinicialprocesso;
    }

    public void setDtinicialprocesso(Timestamp dtinicialprocesso) {
        this.dtinicialprocesso = dtinicialprocesso;
    }

    public Timestamp getDtfinalprocesso() {
        return dtfinalprocesso;
    }

    public void setDtfinalprocesso(Timestamp dtfinalprocesso) {
        this.dtfinalprocesso = dtfinalprocesso;
    }

    public String getNrprocesso() {
        return nrprocesso;
    }

    public void setNrprocesso(String nrprocesso) {
        this.nrprocesso = nrprocesso;
    }

    public String getNrvaraprocesso() {
        return nrvaraprocesso;
    }

    public void setNrvaraprocesso(String nrvaraprocesso) {
        this.nrvaraprocesso = nrvaraprocesso;
    }

    public int getNranoprocesso() {
        return nranoprocesso;
    }

    public void setNranoprocesso(int nranoprocesso) {
        this.nranoprocesso = nranoprocesso;
    }

    public Timestamp getDtalteracaocad() {
        return dtalteracaocad;
    }

    public void setDtalteracaocad(Timestamp dtalteracaocad) {
        this.dtalteracaocad = dtalteracaocad;
    }

    public Timestamp getDtultrescisao() {
        return dtultrescisao;
    }

    public void setDtultrescisao(Timestamp dtultrescisao) {
        this.dtultrescisao = dtultrescisao;
    }

    public String getCdmotivorct() {
        return cdmotivorct;
    }

    public void setCdmotivorct(String cdmotivorct) {
        this.cdmotivorct = cdmotivorct;
    }

    public String getTpcontrato() {
        return tpcontrato;
    }

    public void setTpcontrato(String tpcontrato) {
        this.tpcontrato = tpcontrato;
    }

    public String getMotivo_estabilidade() {
        return motivo_estabilidade;
    }

    public void setMotivo_estabilidade(String motivo_estabilidade) {
        this.motivo_estabilidade = motivo_estabilidade;
    }

    public Timestamp getProrrogacao_tempo_determindado() {
        return prorrogacao_tempo_determindado;
    }

    public void setProrrogacao_tempo_determindado(Timestamp prorrogacao_tempo_determindado) {
        this.prorrogacao_tempo_determindado = prorrogacao_tempo_determindado;
    }

    public double getAlpensaofgts() {
        return alpensaofgts;
    }

    public void setAlpensaofgts(double alpensaofgts) {
        this.alpensaofgts = alpensaofgts;
    }

    public short getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(short tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public short getTipo_certidao_civil() {
        return tipo_certidao_civil;
    }

    public void setTipo_certidao_civil(short tipo_certidao_civil) {
        this.tipo_certidao_civil = tipo_certidao_civil;
    }

    public Timestamp getData_certidao_civil() {
        return data_certidao_civil;
    }

    public void setData_certidao_civil(Timestamp data_certidao_civil) {
        this.data_certidao_civil = data_certidao_civil;
    }

    public String getTermo_matricula_certidao_civil() {
        return termo_matricula_certidao_civil;
    }

    public void setTermo_matricula_certidao_civil(String termo_matricula_certidao_civil) {
        this.termo_matricula_certidao_civil = termo_matricula_certidao_civil;
    }

   
    public String getOrgao_emissor_cnh() {
        return orgao_emissor_cnh;
    }

    public void setOrgao_emissor_cnh(String orgao_emissor_cnh) {
        this.orgao_emissor_cnh = orgao_emissor_cnh;
    }

    public Timestamp getData_expedicao_cnh() {
        return data_expedicao_cnh;
    }

    public void setData_expedicao_cnh(Timestamp data_expedicao_cnh) {
        this.data_expedicao_cnh = data_expedicao_cnh;
    }

    public String getTipo_logradouro() {
        return tipo_logradouro;
    }

    public void setTipo_logradouro(String tipo_logradouro) {
        this.tipo_logradouro = tipo_logradouro;
    }

    public Timestamp getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(Timestamp data_chegada) {
        this.data_chegada = data_chegada;
    }

    public boolean isCasado_com_brasileiro() {
        return casado_com_brasileiro;
    }

    public void setCasado_com_brasileiro(boolean casado_com_brasileiro) {
        this.casado_com_brasileiro = casado_com_brasileiro;
    }

    public boolean isFilho_com_brasileiro() {
        return filho_com_brasileiro;
    }

    public void setFilho_com_brasileiro(boolean filho_com_brasileiro) {
        this.filho_com_brasileiro = filho_com_brasileiro;
    }

    public Timestamp getData_naturalizacao() {
        return data_naturalizacao;
    }

    public void setData_naturalizacao(Timestamp data_naturalizacao) {
        this.data_naturalizacao = data_naturalizacao;
    }

    public int getPais_nascimento_id() {
        return pais_nascimento_id;
    }

    public void setPais_nascimento_id(int pais_nascimento_id) {
        this.pais_nascimento_id = pais_nascimento_id;
    }

    public int getPais_residencia_id() {
        return pais_residencia_id;
    }

    public void setPais_residencia_id(int pais_residencia_id) {
        this.pais_residencia_id = pais_residencia_id;
    }

    public String getMunicipio_nascimento_ibge_codigo() {
        return municipio_nascimento_ibge_codigo;
    }

    public void setMunicipio_nascimento_ibge_codigo(String municipio_nascimento_ibge_codigo) {
        this.municipio_nascimento_ibge_codigo = municipio_nascimento_ibge_codigo;
    }

    public String getMunicipio_residencia_ibge_codigo() {
        return municipio_residencia_ibge_codigo;
    }

    public void setMunicipio_residencia_ibge_codigo(String municipio_residencia_ibge_codigo) {
        this.municipio_residencia_ibge_codigo = municipio_residencia_ibge_codigo;
    }

    public short getTipo_admissao() {
        return tipo_admissao;
    }

    public void setTipo_admissao(short tipo_admissao) {
        this.tipo_admissao = tipo_admissao;
    }

    public boolean isAdmissao_especial_caged() {
        return admissao_especial_caged;
    }

    public void setAdmissao_especial_caged(boolean admissao_especial_caged) {
        this.admissao_especial_caged = admissao_especial_caged;
    }

    public boolean isAviso_trabalhado_fixo_30_dias() {
        return aviso_trabalhado_fixo_30_dias;
    }

    public void setAviso_trabalhado_fixo_30_dias(boolean aviso_trabalhado_fixo_30_dias) {
        this.aviso_trabalhado_fixo_30_dias = aviso_trabalhado_fixo_30_dias;
    }

    public String getUf_emissor_cnh() {
        return uf_emissor_cnh;
    }

    public void setUf_emissor_cnh(String uf_emissor_cnh) {
        this.uf_emissor_cnh = uf_emissor_cnh;
    }

    public Timestamp getData_primeira_cnh() {
        return data_primeira_cnh;
    }

    public void setData_primeira_cnh(Timestamp data_primeira_cnh) {
        this.data_primeira_cnh = data_primeira_cnh;
    }

    public short getTipo_jornada_trabalho() {
        return tipo_jornada_trabalho;
    }

    public void setTipo_jornada_trabalho(short tipo_jornada_trabalho) {
        this.tipo_jornada_trabalho = tipo_jornada_trabalho;
    }

    public short getTipo_contratacao_temporaria() {
        return tipo_contratacao_temporaria;
    }

    public void setTipo_contratacao_temporaria(short tipo_contratacao_temporaria) {
        this.tipo_contratacao_temporaria = tipo_contratacao_temporaria;
    }

    public short getTipo_provimento() {
        return tipo_provimento;
    }

    public void setTipo_provimento(short tipo_provimento) {
        this.tipo_provimento = tipo_provimento;
    }

    public boolean isDeficiencia_fisica() {
        return deficiencia_fisica;
    }

    public void setDeficiencia_fisica(boolean deficiencia_fisica) {
        this.deficiencia_fisica = deficiencia_fisica;
    }

    public boolean isDeficiencia_auditiva() {
        return deficiencia_auditiva;
    }

    public void setDeficiencia_auditiva(boolean deficiencia_auditiva) {
        this.deficiencia_auditiva = deficiencia_auditiva;
    }

    public boolean isDeficiencia_visual() {
        return deficiencia_visual;
    }

    public void setDeficiencia_visual(boolean deficiencia_visual) {
        this.deficiencia_visual = deficiencia_visual;
    }

    public boolean isDeficiencia_mental() {
        return deficiencia_mental;
    }

    public void setDeficiencia_mental(boolean deficiencia_mental) {
        this.deficiencia_mental = deficiencia_mental;
    }

    public boolean isDeficiencia_intelectual() {
        return deficiencia_intelectual;
    }

    public void setDeficiencia_intelectual(boolean deficiencia_intelectual) {
        this.deficiencia_intelectual = deficiencia_intelectual;
    }

    public short getCategoria_trabalhador_esocial() {
        return categoria_trabalhador_esocial;
    }

    public void setCategoria_trabalhador_esocial(short categoria_trabalhador_esocial) {
        this.categoria_trabalhador_esocial = categoria_trabalhador_esocial;
    }

    public boolean isNao_atualiza_salario() {
        return nao_atualiza_salario;
    }

    public void setNao_atualiza_salario(boolean nao_atualiza_salario) {
        this.nao_atualiza_salario = nao_atualiza_salario;
    }
    
}
