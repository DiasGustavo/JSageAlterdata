/*
 * Form utilizado para configurar a string de conexão com os bancos de dados.
 */
package jsageImport.view;

import javax.swing.JOptionPane;
import jsageImport.controler.ControlerEmpresaAD;
import jsageImport.controler.ControlerFuncionarioSAGE;
import jsageImport.exception.JSageImportException;
import jsageImport.modelo.persistencia.JdbcConnection;
import jsageImport.modelo.persistencia.PropertiesJdbc;

/**
 * @author Gustavo Dias
 * Criação: 21/10/2016
 * Última modificação: 22/10/2016
 */
public class FrConfigServers extends javax.swing.JInternalFrame {

    public FrConfigServers() {
        initComponents();
        jlProgresso.setVisible(false);
        carregarConfig();        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpNG = new javax.swing.JPanel();
        jlIPServidorNG = new javax.swing.JLabel();
        jlPorta = new javax.swing.JLabel();
        jlUsuarioNG = new javax.swing.JLabel();
        jlSenhaNG = new javax.swing.JLabel();
        jtxIPServidorNG = new javax.swing.JTextField();
        jtxPortaNG = new javax.swing.JTextField();
        jtxUsuarioNG = new javax.swing.JTextField();
        jtxSenhaNG = new javax.swing.JPasswordField();
        jLBDAlterData = new javax.swing.JLabel();
        jTXBDAlterData = new javax.swing.JTextField();
        jpSAGE = new javax.swing.JPanel();
        jlServidorSAGE = new javax.swing.JLabel();
        jlBancoSAGE = new javax.swing.JLabel();
        jlPortaSAGE = new javax.swing.JLabel();
        jlUsuarioSAGE = new javax.swing.JLabel();
        jlSenhaSAGE = new javax.swing.JLabel();
        jtxIPServidorSAGE = new javax.swing.JTextField();
        jtxBancoSAGE = new javax.swing.JTextField();
        jtxPortaSAGE = new javax.swing.JTextField();
        jtxUsuarioSAGE = new javax.swing.JTextField();
        jtxSenhaSAGE = new javax.swing.JPasswordField();
        jbConfigServer = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlProgresso = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jpNG.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco AlterData"));

        jlIPServidorNG.setText("IP Servidor");

        jlPorta.setText("Porta");

        jlUsuarioNG.setText("Usuário");

        jlSenhaNG.setText("Senha");

        jLBDAlterData.setText("Banco");

        jTXBDAlterData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXBDAlterDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpNGLayout = new javax.swing.GroupLayout(jpNG);
        jpNG.setLayout(jpNGLayout);
        jpNGLayout.setHorizontalGroup(
            jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlUsuarioNG)
                    .addGroup(jpNGLayout.createSequentialGroup()
                        .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIPServidorNG)
                            .addComponent(jlPorta)
                            .addComponent(jlSenhaNG))
                        .addGap(11, 11, 11)
                        .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTXBDAlterData, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxIPServidorNG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxUsuarioNG, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxPortaNG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxSenhaNG, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLBDAlterData))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jpNGLayout.setVerticalGroup(
            jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNGLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIPServidorNG)
                    .addComponent(jtxIPServidorNG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBDAlterData)
                    .addComponent(jTXBDAlterData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxPortaNG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPorta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUsuarioNG)
                    .addComponent(jtxUsuarioNG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpNGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenhaNG)
                    .addComponent(jtxSenhaNG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jpSAGE.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco SAGE"));

        jlServidorSAGE.setText("IP Servidor");

        jlBancoSAGE.setText("Banco");

        jlPortaSAGE.setText("Porta");

        jlUsuarioSAGE.setText("Usuario");

        jlSenhaSAGE.setText("Senha");

        javax.swing.GroupLayout jpSAGELayout = new javax.swing.GroupLayout(jpSAGE);
        jpSAGE.setLayout(jpSAGELayout);
        jpSAGELayout.setHorizontalGroup(
            jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSAGELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSAGELayout.createSequentialGroup()
                        .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlBancoSAGE)
                            .addComponent(jlPortaSAGE))
                        .addGap(34, 34, 34)
                        .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxBancoSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxPortaSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpSAGELayout.createSequentialGroup()
                        .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUsuarioSAGE)
                            .addComponent(jlSenhaSAGE))
                        .addGap(27, 27, 27)
                        .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxUsuarioSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxSenhaSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpSAGELayout.createSequentialGroup()
                        .addComponent(jlServidorSAGE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxIPServidorSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jpSAGELayout.setVerticalGroup(
            jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSAGELayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlServidorSAGE)
                    .addComponent(jtxIPServidorSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBancoSAGE)
                    .addComponent(jtxBancoSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPortaSAGE)
                    .addComponent(jtxPortaSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxUsuarioSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsuarioSAGE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpSAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxSenhaSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSenhaSAGE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jbConfigServer.setText("Configurar Servidores");
        jbConfigServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfigServerActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlProgresso.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbConfigServer)
                                .addGap(45, 45, 45)
                                .addComponent(jbCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpNG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jpSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jlProgresso)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpNG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jlProgresso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfigServer)
                    .addComponent(jbCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbConfigServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfigServerActionPerformed
        
        try{
            if (jtxUsuarioNG.getText().isEmpty()|| jtxSenhaNG.getText().isEmpty() || jtxIPServidorNG.getText().isEmpty()||jtxPortaNG.getText().isEmpty()|| jtxUsuarioSAGE.getText().isEmpty()|| jtxBancoSAGE.getText().isEmpty()|| jtxSenhaSAGE.getText().isEmpty()|| jtxIPServidorSAGE.getText().isEmpty()|| jtxBancoSAGE.getText().isEmpty()){
                throw new JSageImportException ("Todos os campos devem ser preenchidos!");
            } else {
                if (this.TestaConfig()){
                    JOptionPane.showMessageDialog(null, "Servidores Configurados com Sucesso");   
                }                
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbConfigServerActionPerformed
    
    
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jTXBDAlterDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXBDAlterDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTXBDAlterDataActionPerformed

    private void criarConfigNG () throws JSageImportException{
        JdbcConnection jdbc = new JdbcConnection();
        PropertiesJdbc config = new PropertiesJdbc();
        jdbc.setUser(jtxUsuarioNG.getText());
        jdbc.setPass(jtxSenhaNG.getText());
        jdbc.setDatabase(jTXBDAlterData.getText());
        jdbc.setServer(jtxIPServidorNG.getText());
        jdbc.setPort(jtxPortaNG.getText());
        
        config.criarProperties(jdbc, "AD");
    }
    
    private void criarConfigSAGE () throws JSageImportException{
        JdbcConnection jdbc = new JdbcConnection();
        PropertiesJdbc config = new PropertiesJdbc();
        jdbc.setUser(jtxUsuarioSAGE.getText());
        jdbc.setDatabase(jtxBancoSAGE.getText());
        jdbc.setPass(jtxSenhaSAGE.getText());
        jdbc.setServer(jtxIPServidorSAGE.getText());
        jdbc.setPort(jtxPortaSAGE.getText());
        
        config.criarProperties(jdbc, "SAGE");
    }
    
    private void carregarConfig (){
        PropertiesJdbc jdbc = new PropertiesJdbc();
        
        try {
            //Campos referentes ao banco NG
            jtxIPServidorNG.setText(jdbc.lerServidor("AD"));
            jtxUsuarioNG.setText(jdbc.lerUsuario("AD"));
            jTXBDAlterData.setText(jdbc.lerDatabase("AD"));
            jtxSenhaNG.setText(jdbc.lerSenha("AD"));
            jtxPortaNG.setText(jdbc.lerPorta("AD"));
            //Campos referentes ao banco SAGE
            jtxIPServidorSAGE.setText(jdbc.lerServidor("SAGE"));
            jtxUsuarioSAGE.setText(jdbc.lerUsuario("SAGE"));
            jtxSenhaSAGE.setText(jdbc.lerSenha("SAGE"));
            jtxBancoSAGE.setText(jdbc.lerDatabase("SAGE"));
            jtxPortaSAGE.setText(jdbc.lerPorta("SAGE"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Falta configuração dos Bancos AlterData e SAGE.");
        } 
}
    private boolean TestaConfig () throws JSageImportException{
        ControlerEmpresaAD control = new ControlerEmpresaAD();
        ControlerFuncionarioSAGE controlSAGE = new ControlerFuncionarioSAGE();
        
        boolean flag = false;
        
        try{
        boolean testeConexaoNG = control.testarConexao(jtxIPServidorNG.getText(), jTXBDAlterData.getText(),jtxPortaNG.getText(), jtxUsuarioNG.getText(), jtxSenhaNG.getText());
        boolean testeConexaoSAGE = controlSAGE.testarConexao(jtxIPServidorSAGE.getText(), jtxBancoSAGE.getText(), jtxPortaSAGE.getText(), jtxUsuarioSAGE.getText(), jtxSenhaSAGE.getText());
        
                if (testeConexaoNG && testeConexaoSAGE){
                     this.criarConfigNG();
                     this.criarConfigSAGE();
                     flag = true;
                } else {
                    if ((testeConexaoNG == false) && (testeConexaoSAGE == false)){                        
                        throw new JSageImportException("Erro nos dados dos Bancos AlterData e SAGE!");
                    }
                    if (testeConexaoSAGE == false){
                        throw new JSageImportException("Erro nos dados do Banco SAGE!");
                    }
                    if (testeConexaoNG == false){
                        throw new JSageImportException("Erro nos dados do Banco AlterData!");
                    }
                    
                }
        } catch (Exception ex){
            throw new JSageImportException("Conexão com o SQL SERVER falhou!");
        }
        return flag;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBDAlterData;
    private javax.swing.JTextField jTXBDAlterData;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConfigServer;
    private javax.swing.JLabel jlBancoSAGE;
    private javax.swing.JLabel jlIPServidorNG;
    private javax.swing.JLabel jlPorta;
    private javax.swing.JLabel jlPortaSAGE;
    private javax.swing.JLabel jlProgresso;
    private javax.swing.JLabel jlSenhaNG;
    private javax.swing.JLabel jlSenhaSAGE;
    private javax.swing.JLabel jlServidorSAGE;
    private javax.swing.JLabel jlUsuarioNG;
    private javax.swing.JLabel jlUsuarioSAGE;
    private javax.swing.JPanel jpNG;
    private javax.swing.JPanel jpSAGE;
    private javax.swing.JTextField jtxBancoSAGE;
    private javax.swing.JTextField jtxIPServidorNG;
    private javax.swing.JTextField jtxIPServidorSAGE;
    private javax.swing.JTextField jtxPortaNG;
    private javax.swing.JTextField jtxPortaSAGE;
    private javax.swing.JPasswordField jtxSenhaNG;
    private javax.swing.JPasswordField jtxSenhaSAGE;
    private javax.swing.JTextField jtxUsuarioNG;
    private javax.swing.JTextField jtxUsuarioSAGE;
    // End of variables declaration//GEN-END:variables
}
