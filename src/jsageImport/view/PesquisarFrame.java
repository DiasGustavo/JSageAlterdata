/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.view;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jsageImport.controler.ControlerFuncionarioNG;
import jsageImport.exception.JSageImportException;
import jsageImport.modelo.dominio.FuncionarioSAGE;

/**
 *
 * @author Gustavo
 */
public class PesquisarFrame extends javax.swing.JInternalFrame {

    private List funcionarios;
    /**
     * Creates new form PesquisarFrame
     */
    public PesquisarFrame() {
        initComponents();
    }
    
    public void exibirFuncionarios () throws JSageImportException{
        ControlerFuncionarioNG control = new ControlerFuncionarioNG();
        // O metodo pesquisarTodos retorna um list
        this.funcionarios = control.pesquisarTodos();
        
        DefaultTableModel model = (DefaultTableModel)tFuncionarios.getModel();
        this.removerLinhasDaTabela(model);
        
        Iterator resultado = funcionarios.iterator();
        
        while (resultado.hasNext()){
            FuncionarioSAGE fun = (FuncionarioSAGE) resultado.next();
            String nome = fun.getNome();
            String endereco = fun.getEndreco();
            String email = fun.getEmail();
            int telefone = fun.getTelefone();
            
            Object[] linha = {nome, endereco, email, telefone };
            model.addRow(linha);
        }
        int total = funcionarios.size();
        jlResultado.setText(""+total);
    }
    
    public void removerLinhasDaTabela (DefaultTableModel model){
        while (model.getRowCount() > 0){
            int ultimaLinha = model.getRowCount() -1;
            model.removeRow(ultimaLinha);
        }
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
        jlStatus = new javax.swing.JLabel();
        jlResultado = new javax.swing.JLabel();
        jbImportar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta Banco");

        tFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Email", "Telefone"
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

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jlStatus.setText("Status:");

        jlResultado.setText("Quantidade");

        jbImportar.setText("Importar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbPesquisar)
                        .addGap(34, 34, 34)
                        .addComponent(jbImportar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStatus)
                    .addComponent(jlResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisar)
                    .addComponent(jbImportar))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        try {
            exibirFuncionarios();
        } catch (JSageImportException ex) {
            StringBuffer mensagem = new StringBuffer("Não foi possível realizar a consulta.");
            mensagem.append("\nMotivo: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_jbPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbImportar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JTable tFuncionarios;
    // End of variables declaration//GEN-END:variables
}
