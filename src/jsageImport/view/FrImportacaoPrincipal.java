/*
 * Form responsavel pela listagem das empresas com folha
 */
package jsageImport.view;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jsageImport.controler.ControlerEmpresaAD;
import jsageImport.controler.ControlerEmpresaNG;
import jsageImport.exception.JSageImportException;
import jsageImport.modelo.dominio.EmpresaAD;
import jsageImport.modelo.dominio.PessoaJuridica;

/**
 * @author Gustavo Dias
 * Criação: 21/10/2016
 * Última modificação: 24/10/2016
 * Modificador por: Gustavo Dias
 */
public class FrImportacaoPrincipal extends javax.swing.JInternalFrame {

    private List empresas;
    private String nomeEmpresa;
    private String cnpj;
    private int idEmpresa;
    /**
     * Creates new form PesquisarFrame
     */
    public FrImportacaoPrincipal() {
        initComponents();
        this.jbListarFuncionarios.setEnabled(false);
        this.jImportarEmpresas.setEnabled(false);
        this.jbListarFuncionarios.setEnabled(false);
        
    }
    
    public void exibirEmpresas () throws JSageImportException{
        ControlerEmpresaAD control = new ControlerEmpresaAD();
        // O metodo pesquisarTodos retorna um list
        this.empresas = control.pesquisarEmpresas();
        
        DefaultTableModel model = (DefaultTableModel)tFuncionarios.getModel();
        this.removerLinhasDaTabela(model);
        
        Iterator resultado = empresas.iterator();
        
        while (resultado.hasNext()){
            EmpresaAD empAD = (EmpresaAD) resultado.next();
            int id = empAD.getCdempresa();
            String nomeFantasia = empAD.getNmfantasia();
            String cnpj = empAD.getNrcgc();
            String nomeAbreviado = empAD.getNmempresa();
            
            Object[] linha = {id, nomeFantasia, cnpj, nomeAbreviado };
            model.addRow(linha);
        }
        int total = empresas.size();
        jlQRegistros.setText("Quantidade de Registros: "+ total);
        this.jbListarFuncionarios.setEnabled(true);
        //this.jImportarEmpresas.setEnabled(true);
    }
    
    public void removerLinhasDaTabela (DefaultTableModel model){
        while (model.getRowCount() > 0){
            int ultimaLinha = model.getRowCount() -1;
            model.removeRow(ultimaLinha);
        }
    }
    
    public EmpresaAD getEmpresa() throws JSageImportException {
        EmpresaAD pj = null;
        int linhaSelecionada = tFuncionarios.getSelectedRow();
        if (linhaSelecionada < 0) {
            throw new JSageImportException("Não foi selecionado nenhuma Empresa");
        }
        pj = (EmpresaAD) this.empresas.get(linhaSelecionada);
        this.nomeEmpresa = pj.getNmempresa();
        this.cnpj = pj.getNrcgc();
        this.idEmpresa = pj.getCdempresa();
        return pj;
    }
    
    public List getEmpresasSelecionadas() throws JSageImportException {
        ControlerEmpresaNG control = new ControlerEmpresaNG(); 
        List empresasSelecionadas = new ArrayList();
        PessoaJuridica pj = null;
        int [] linhasSelecionadas = tFuncionarios.getSelectedRows();
        if (linhasSelecionadas.length == 0) {
            throw new JSageImportException("Não foi selecionado nenhuma Empresa");
        }
        for (int i = 0; i < linhasSelecionadas.length; i++){
            pj = (PessoaJuridica) this.empresas.get(linhasSelecionadas[i]);
            empresasSelecionadas.add(pj);
        }
        return empresasSelecionadas;
    }
    
    public int pedirConfirmacao(String mensagem, String titulo, int tipo){
        int resposta = JOptionPane.showConfirmDialog(null, mensagem, titulo, tipo);
        return resposta;
    }
    
    public void exibirMensagem(String mensagem, String titulo, boolean isErro) {
        int tipo;
        if (isErro) {
            tipo = JOptionPane.ERROR_MESSAGE;
        } else {
            tipo = JOptionPane.INFORMATION_MESSAGE;
        }
        JOptionPane.showMessageDialog(null, mensagem, titulo, tipo);
    }
    public void importarDados () throws JSageImportException{
        ControlerEmpresaNG control = new ControlerEmpresaNG();        
        int empresa = this.idEmpresa;
        String cnpjEmpresa = this.cnpj;
        lStatus.setText("Status: Gravando Empresa");
        control.ImportarEmpresa(empresa,cnpjEmpresa);
        lStatus.setText("Status:");
    }
    
    public void importarTodasEmpresas (int idEmpresa, String cnpj)throws JSageImportException{
        ControlerEmpresaNG control = new ControlerEmpresaNG();
        control.ImportaTodasEmpresas(idEmpresa,cnpj);
    }
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation(15 + (d.width - this.getSize().width) / 5, 15 + (d.height -
        this.getSize().height) / 5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tFuncionarios = new javax.swing.JTable();
        jbPesquisar = new javax.swing.JButton();
        jlQRegistros = new javax.swing.JLabel();
        jbListarFuncionarios = new javax.swing.JButton();
        jImportarEmpresas = new javax.swing.JButton();
        lStatus = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Consulta Empresas no Banco AlterData");

        tFuncionarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Fantasia", "CNPJ", "Nome Abreviado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tFuncionarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tFuncionarios);

        jbPesquisar.setMnemonic('p');
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jlQRegistros.setText("Quantidade de Registros:");

        jbListarFuncionarios.setMnemonic('l');
        jbListarFuncionarios.setText("Listar Funcionários");
        jbListarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarFuncionariosActionPerformed(evt);
            }
        });

        jImportarEmpresas.setMnemonic('e');
        jImportarEmpresas.setText("Importar Empresas");
        jImportarEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImportarEmpresasActionPerformed(evt);
            }
        });

        lStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lStatus.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lStatus)
                    .addComponent(jlQRegistros)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbPesquisar)
                        .addGap(29, 29, 29)
                        .addComponent(jImportarEmpresas)
                        .addGap(36, 36, 36)
                        .addComponent(jbListarFuncionarios))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlQRegistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisar)
                    .addComponent(jbListarFuncionarios)
                    .addComponent(jImportarEmpresas))
                .addGap(18, 18, 18)
                .addComponent(lStatus)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        try {
            exibirEmpresas();
        } catch (JSageImportException ex) {
            StringBuffer mensagem = new StringBuffer("Não foi possível realizar a consulta.");
            mensagem.append("\nMotivo: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbListarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarFuncionariosActionPerformed
        EmpresaAD pj = null;
        FrImportacaoFuncionarioProgresso pjFun = new FrImportacaoFuncionarioProgresso();
        try {
            pj = this.getEmpresa();
            //faz parte da janela de funcionários da empresa selecionada
            pjFun.setIdPj(pj.getCdempresa());
            pjFun.setNomeEmpresa(this.nomeEmpresa);
            pjFun.setCnpj(this.cnpj);
            //importarDados();            
            pjFun.exibirFuncionarios();
            this.getParent().add(pjFun);
            pjFun.setVisible(true);
            
        }catch (JSageImportException ex){
            //this.exibirMensagem(ex.getMessage(), "Mensagem de Erro", true);
        } 
    }//GEN-LAST:event_jbListarFuncionariosActionPerformed

    private void jImportarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImportarEmpresasActionPerformed
        PessoaJuridica pj = null;
        try {
            TelaCarregando telaCarregando = new TelaCarregando();
            List listaEmpresasSelecionadas = getEmpresasSelecionadas();
            lStatus.setText("Status: Gravando Empresas Selecionadas");
            telaCarregando.setVisible(true);
            for (int i = 0; i < listaEmpresasSelecionadas.size(); i++){
                pj = (PessoaJuridica)listaEmpresasSelecionadas.get(i);
                importarTodasEmpresas(pj.getIdPessoa(), pj.getCnpjFormatado());
            }
            telaCarregando.setVisible(false);
            lStatus.setText("Status:");
            JOptionPane.showMessageDialog(null, "Empresas Selecionadas gravadas com sucesso!");
        } catch (JSageImportException ex){
            JOptionPane.showMessageDialog(null, "Erro ao gravar as empresas selecionadas!");
        }
    }//GEN-LAST:event_jImportarEmpresasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jImportarEmpresas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbListarFuncionarios;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JLabel jlQRegistros;
    private javax.swing.JLabel lStatus;
    private javax.swing.JTable tFuncionarios;
    // End of variables declaration//GEN-END:variables
}