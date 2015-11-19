package Principal;

public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
        ConexaoBD c = new ConexaoBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel logo = new javax.swing.JLabel();
        Barra_Menu = new javax.swing.JMenuBar();
        javax.swing.JMenu Arquivo = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem1 = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenu();
        presquisaCli1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        conectaBD = new javax.swing.JMenuItem();
        desconectaBD = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.JMenu Ajuda = new javax.swing.JMenu();
        javax.swing.JMenuItem sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Admin");
        setResizable(false);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankAdmin.jpg"))); // NOI18N
        logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        logo.setAlignmentY(0.0F);
        logo.setFocusable(false);
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logo.setMaximumSize(new java.awt.Dimension(100, 100));
        logo.setMinimumSize(new java.awt.Dimension(100, 100));
        logo.setPreferredSize(new java.awt.Dimension(479, 312));

        Arquivo.setText("Arquivo");

        exitMenuItem1.setText("Exit");
        exitMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem1ActionPerformed(evt);
            }
        });
        Arquivo.add(exitMenuItem1);

        Barra_Menu.add(Arquivo);

        Cliente.setText("Cliente");

        presquisaCli1.setText("Novo");
        presquisaCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presquisaCli1ActionPerformed(evt);
            }
        });
        Cliente.add(presquisaCli1);

        Barra_Menu.add(Cliente);

        jMenu2.setText("Contas");

        jMenuItem1.setText("Depositar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Sacar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        Barra_Menu.add(jMenu2);

        jMenu1.setText("Database");

        conectaBD.setText("Conectar");
        conectaBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectaBDActionPerformed(evt);
            }
        });
        jMenu1.add(conectaBD);

        desconectaBD.setText("Desconectar");
        desconectaBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconectaBDActionPerformed(evt);
            }
        });
        jMenu1.add(desconectaBD);

        jMenuItem3.setText("Backup Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Backup Conta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Restore Cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Restore Conta");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        Barra_Menu.add(jMenu1);

        Ajuda.setText("Ajuda");

        sobre.setText("Sobre...");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        Ajuda.add(sobre);

        Barra_Menu.add(Ajuda);

        setJMenuBar(Barra_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_exitMenuItem1ActionPerformed

    private void presquisaCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presquisaCli1ActionPerformed
        Form_cliente cli = new Form_cliente();
        cli.setVisible(true);
    }//GEN-LAST:event_presquisaCli1ActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        Form_sobre f = new Form_sobre();
        f.setVisible(true);
    }//GEN-LAST:event_sobreActionPerformed

    private void conectaBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectaBDActionPerformed
        ConexaoBD c = new ConexaoBD();
        c.connect();
    }//GEN-LAST:event_conectaBDActionPerformed

    private void desconectaBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconectaBDActionPerformed
        ConexaoBD c = new ConexaoBD();
        c.disconnect();
    }//GEN-LAST:event_desconectaBDActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Form_deposito f = new Form_deposito();
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Form_saque f = new Form_saque();
        f.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConexaoBD c = new ConexaoBD();
        c.backupClientes();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       ConexaoBD c = new ConexaoBD();
       c.backupContas();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      ConexaoBD c = new ConexaoBD();
      c.importaCliente();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      ConexaoBD c = new ConexaoBD();
      c.importaContas();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JMenu Cliente;
    private javax.swing.JMenuItem conectaBD;
    private javax.swing.JMenuItem desconectaBD;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem presquisaCli1;
    // End of variables declaration//GEN-END:variables
}
