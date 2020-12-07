
package awsales3.App.View;
public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeskPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        miProdutos = new javax.swing.JMenuItem();
        miPedidos = new javax.swing.JMenuItem();
        miAltUser1 = new javax.swing.JMenuItem();
        miAltUser = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeskPane.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout DeskPaneLayout = new javax.swing.GroupLayout(DeskPane);
        DeskPane.setLayout(DeskPaneLayout);
        DeskPaneLayout.setHorizontalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DeskPaneLayout.setVerticalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivos");

        miClientes.setText("Clientes");
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        jMenu1.add(miClientes);

        miProdutos.setText("Produtos");
        miProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(miProdutos);

        miPedidos.setText("Pedidos");
        miPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPedidosActionPerformed(evt);
            }
        });
        jMenu1.add(miPedidos);

        miAltUser1.setText("Transportadoras");
        miAltUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltUser1ActionPerformed(evt);
            }
        });
        jMenu1.add(miAltUser1);

        miAltUser.setText("Enderecos");
        miAltUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltUserActionPerformed(evt);
            }
        });
        jMenu1.add(miAltUser);

        miExit.setText("Sair");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatorios");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutosActionPerformed
     FrameProdutos frameProdutos = new FrameProdutos();
      DeskPane.add(frameProdutos);
      frameProdutos.show();
    }//GEN-LAST:event_miProdutosActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miExitActionPerformed

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
      FrameCadastroUsuario frameCadastroUsuario = new FrameCadastroUsuario();
      DeskPane.add(frameCadastroUsuario);
      frameCadastroUsuario.show();
    }//GEN-LAST:event_miClientesActionPerformed

    private void miPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPedidosActionPerformed
       FramePedido framePedido = new FramePedido();
       DeskPane.add(framePedido);
       framePedido.show();
    }//GEN-LAST:event_miPedidosActionPerformed

    private void miAltUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltUser1ActionPerformed
     FrameTransportadora frameTransportadora = new FrameTransportadora();
     DeskPane.add(frameTransportadora);
     frameTransportadora.show();
    }//GEN-LAST:event_miAltUser1ActionPerformed

    private void miAltUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltUserActionPerformed
      FrameEnderecos fe = new FrameEnderecos();
      DeskPane.add(fe);
      fe.show();
    }//GEN-LAST:event_miAltUserActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miAltUser;
    private javax.swing.JMenuItem miAltUser1;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miPedidos;
    private javax.swing.JMenuItem miProdutos;
    // End of variables declaration//GEN-END:variables
}
