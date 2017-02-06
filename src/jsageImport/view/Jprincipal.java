/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsageImport.view;

import javax.swing.JFrame;

/**
 *
 * @author Gustavo
 */
public class Jprincipal extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form Jprincipal
     */
    public Jprincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenu = new javax.swing.JMenuBar();
        jsubMenuArquivo = new javax.swing.JMenu();
        itemMenuSair = new javax.swing.JMenuItem();
        jsubMenuFerramenta = new javax.swing.JMenu();
        itemMenuConexao = new javax.swing.JMenuItem();
        itemMenuImportacao = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jSubMenuAjuda = new javax.swing.JMenuItem();
        jSubMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sage Import");
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jsubMenuArquivo.setMnemonic('s');
        jsubMenuArquivo.setText("Sistema");

        itemMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuSair.setText("Sair");
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        jsubMenuArquivo.add(itemMenuSair);

        jMenu.add(jsubMenuArquivo);

        jsubMenuFerramenta.setMnemonic('f');
        jsubMenuFerramenta.setText("Ferramenta");

        itemMenuConexao.setMnemonic('d');
        itemMenuConexao.setText("Configurar Servidores");
        itemMenuConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuConexaoActionPerformed(evt);
            }
        });
        jsubMenuFerramenta.add(itemMenuConexao);

        itemMenuImportacao.setMnemonic('i');
        itemMenuImportacao.setText("Importação");
        itemMenuImportacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuImportacaoActionPerformed(evt);
            }
        });
        jsubMenuFerramenta.add(itemMenuImportacao);

        jMenu.add(jsubMenuFerramenta);

        jMenuAjuda.setText("Ajuda");

        jSubMenuAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jSubMenuAjuda.setText("Manual");
        jSubMenuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMenuAjudaActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jSubMenuAjuda);

        jSubMenuSobre.setMnemonic('o');
        jSubMenuSobre.setText("Sobre");
        jSubMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMenuSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jSubMenuSobre);

        jMenu.add(jMenuAjuda);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuConexaoActionPerformed
        FrConfigServers conect = new FrConfigServers();
            jDesktopPane.add(conect);
            conect.setVisible(true);
              
    }//GEN-LAST:event_itemMenuConexaoActionPerformed

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemMenuSairActionPerformed

    private void itemMenuImportacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuImportacaoActionPerformed
        FrImportacaoPrincipal imp = new FrImportacaoPrincipal();
        jDesktopPane.add(imp);
        
        imp.setVisible(true);
        imp.setPosicao();        
        
    }//GEN-LAST:event_itemMenuImportacaoActionPerformed

    private void jSubMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMenuSobreActionPerformed
         Sobre sobre = new Sobre();
    }//GEN-LAST:event_jSubMenuSobreActionPerformed

    private void jSubMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMenuAjudaActionPerformed
        Ajuda ajuda = new Ajuda();
        ajuda.abrirManual();
    }//GEN-LAST:event_jSubMenuAjudaActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Jprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuConexao;
    private javax.swing.JMenuItem itemMenuImportacao;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuItem jSubMenuAjuda;
    private javax.swing.JMenuItem jSubMenuSobre;
    private javax.swing.JMenu jsubMenuArquivo;
    private javax.swing.JMenu jsubMenuFerramenta;
    // End of variables declaration//GEN-END:variables
}
