

package Principal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Guilherme e João Antônio
 */
public class Form_cliente extends javax.swing.JFrame {
    /**
     * Creates new form Cliente
     */
    public Form_cliente() {
         initComponents();
         estadoBtn();
         ChecaNumeroConta();
         ConexaoBD c = new ConexaoBD();
         c.preencherTabela();
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gupotipo = new javax.swing.ButtonGroup();
        lblPesquisar = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_nroConta = new javax.swing.JLabel();
        txt_nroConta = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_sobrenome = new javax.swing.JLabel();
        txt_sobrenome = new javax.swing.JTextField();
        btn_aplicar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btn_sair = new javax.swing.JButton();
        lbl_saldo = new javax.swing.JLabel();
        lbl_Info = new javax.swing.JLabel();
        lbl_Info1 = new javax.swing.JLabel();
        txt_saldo = new javax.swing.JTextField();
        lbl_limite = new javax.swing.JLabel();
        txt_limite = new javax.swing.JTextField();
        lbl_cpf = new javax.swing.JLabel();
        txt_cpfcnpj = new javax.swing.JTextField();
        cb_corrente = new javax.swing.JCheckBox();
        cb_poupanca = new javax.swing.JCheckBox();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar e Alterar");
        setResizable(false);

        lblPesquisar.setText("PESQUISAR");

        lblNome.setText("Nome:");

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        txtPesquisar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtPesquisarInputMethodTextChanged(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyTyped(evt);
            }
        });

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCliente.setToolTipText("");
        jTableCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCliente);

        lbl_nroConta.setText("Numero da conta");

        lbl_nome.setText("Nome");

        lbl_sobrenome.setText("Sobrenome");

        btn_aplicar.setText("APLICAR");
        btn_aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicarActionPerformed(evt);
            }
        });

        btn_salvar.setText("SALVAR");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cadastrar.setText("CADASTAR");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_alterar.setText("ALTERAR");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_sair.setText("SAIR");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        lbl_saldo.setText("Saldo");

        lbl_Info.setText("INFORMAÇÕES DA CONTA");

        lbl_Info1.setText("INFORMAÇÕES DO CLIENTE");

        txt_saldo.setText("0");

        lbl_limite.setText("Limite");

        lbl_cpf.setText("CPF/CNPJ");

        cb_corrente.setText("Conta Corrente");

        cb_poupanca.setText("Poupança");

        btn_excluir.setText("EXCLUIR");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_sair)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_aplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancelar)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nroConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_saldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(lbl_limite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_limite, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lbl_sobrenome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_sobrenome))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(cb_corrente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_poupanca))
                                    .addComponent(lblPesquisar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_Info)
                                    .addComponent(lbl_Info1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Info1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sobrenome)
                    .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cpf)
                    .addComponent(txt_cpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_Info)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nroConta)
                    .addComponent(txt_nroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_saldo)
                    .addComponent(txt_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_limite)
                    .addComponent(txt_limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_corrente)
                    .addComponent(cb_poupanca))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar)
                    .addComponent(btn_alterar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salvar)
                    .addComponent(btn_aplicar)
                    .addComponent(btn_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sair)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        ConexaoBD c = new ConexaoBD();
        c.preencherTabela();
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        estadoCadastrar();
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        estadoAlterar();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        String vazio = txt_nroConta.getText(); 
        if(vazio.equals("0"))
        {
           estadoCancelarCadastro();
        } else {
           estadoCancelarAlteracao();
        }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicarActionPerformed
        ConexaoBD c = new ConexaoBD();
        c.updateCliente(txt_nome.getText(), txt_sobrenome.getText(), txt_cpfcnpj.getText(), Integer.parseInt(txt_nroConta.getText()));
        c.updateConta(Double.parseDouble(txt_limite.getText()),Integer.parseInt(txt_nroConta.getText()));
        c.preencherTabela();
        estadoBtn();
    }//GEN-LAST:event_btn_aplicarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
       ConexaoBD c = new ConexaoBD();
      
       
       if(cb_corrente.isSelected() && cb_poupanca.isSelected())
       {
        c.CadastraCliente(txt_nome.getText(), txt_sobrenome.getText(), txt_cpfcnpj.getText(), "3");
        c.CadastraConta("3", txt_limite.getText());
       }
       else if (cb_corrente.isSelected())
       {
        c.CadastraCliente(txt_nome.getText(), txt_sobrenome.getText(), txt_cpfcnpj.getText(), "1");
        c.CadastraConta("1", txt_limite.getText());
       }
       else if(cb_poupanca.isSelected())
       {
        c.CadastraCliente(txt_nome.getText(), txt_sobrenome.getText(), txt_cpfcnpj.getText(), "2");
        c.CadastraConta("2", txt_limite.getText());
       }
       
       txt_nome.setText(null);
       txt_sobrenome.setText(null);
       txt_cpfcnpj.setText(null);
       txt_nroConta.setText("0");
       txt_saldo.setText(null);
       txt_limite.setText(null);
       
       JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso!");
       
       c.preencherTabela();
       
       estadoBtn();

    }//GEN-LAST:event_btn_salvarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        int linhaSelecionada = jTableCliente.getSelectedRow();
        
        txt_nome.setText(jTableCliente.getValueAt(linhaSelecionada, 1).toString());
        txt_sobrenome.setText(jTableCliente.getValueAt(linhaSelecionada,2).toString());
        txt_cpfcnpj.setText(jTableCliente.getValueAt(linhaSelecionada, 3).toString());
        txt_nroConta.setText(jTableCliente.getValueAt(linhaSelecionada, 4).toString());
        txt_saldo.setText(jTableCliente.getValueAt(linhaSelecionada, 5).toString());
        txt_limite.setText(jTableCliente.getValueAt(linhaSelecionada, 6).toString());
        btn_alterar.setEnabled(true);
        btn_excluir.setEnabled(true);
        
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        ConexaoBD c = new ConexaoBD();
        c.preencherTabela();
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void txtPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyTyped
        ConexaoBD c = new ConexaoBD();
        c.preencherTabela();
    }//GEN-LAST:event_txtPesquisarKeyTyped

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
       ConexaoBD c = new ConexaoBD();
       c.preencherTabela();
       
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void txtPesquisarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPesquisarInputMethodTextChanged
    
    }//GEN-LAST:event_txtPesquisarInputMethodTextChanged

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        ConexaoBD c = new ConexaoBD();
        c.DeletaConta(Integer.parseInt(txt_nroConta.getText()));
        c.DeletaCliente(Integer.parseInt(txt_nroConta.getText()));
        c.preencherTabela();
    }//GEN-LAST:event_btn_excluirActionPerformed



   
 
  
    public void estadoBtn(){
        txt_nroConta.setText("0");
        txt_nroConta.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_salvar.setEnabled(false);
        txt_nome.setEnabled(false);
        txt_sobrenome.setEnabled(false);
        btn_aplicar.setEnabled(false);
        txt_cpfcnpj.setEnabled(false);
        txt_saldo.setEnabled(false);
        txt_limite.setEnabled(false);
        cb_corrente.setEnabled(false);
        cb_poupanca.setEnabled(false);
        btn_cadastrar.setEnabled(true);
        btn_excluir.setEnabled(false);
        
    }
    
    public void estadoCadastrar(){
        txt_nroConta.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(true);
        btn_salvar.setEnabled(true);
        txt_nome.setEnabled(true);
        txt_sobrenome.setEnabled(true);
        btn_cadastrar.setEnabled(false);
        btn_aplicar.setEnabled(false);
        txt_cpfcnpj.setEnabled(false);
        txt_saldo.setEnabled(false);
        txt_limite.setEnabled(true);
        cb_corrente.setEnabled(true);
        cb_poupanca.setEnabled(true);
        txt_cpfcnpj.setEnabled(true);
        txt_nome.setText(null);
        txt_sobrenome.setText(null);
        txt_cpfcnpj.setText(null);
        txt_nroConta.setText("0");
        txt_saldo.setText(null);
        txt_limite.setText(null);
        btn_excluir.setEnabled(false);
        
    }
    
    public void estadoCancelarCadastro(){
        txt_nroConta.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_salvar.setEnabled(false);
        txt_nome.setText("");
        txt_nome.setEnabled(false);
        txt_sobrenome.setText("");
        txt_sobrenome.setEnabled(false);
        btn_cadastrar.setEnabled(true);
        btn_aplicar.setEnabled(false);
        txt_cpfcnpj.setEnabled(false);
        txt_saldo.setEnabled(false);
        txt_limite.setEnabled(false);
        cb_corrente.setEnabled(false);
        cb_poupanca.setEnabled(false);
        txt_cpfcnpj.setEnabled(false);
        btn_excluir.setEnabled(false);
    }
    
    public void estadoCancelarAlteracao(){
        txt_nroConta.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_salvar.setEnabled(false);
        txt_nome.setEnabled(false);
        txt_sobrenome.setEnabled(false);
        btn_cadastrar.setEnabled(true);
        btn_aplicar.setEnabled(false);
        txt_cpfcnpj.setEnabled(false);
        txt_saldo.setEnabled(false);
        txt_limite.setEnabled(false);
        cb_corrente.setEnabled(false);
        cb_poupanca.setEnabled(false);
        txt_cpfcnpj.setEnabled(false);
        btn_excluir.setEnabled(false);
    }
    
    public void estadoAlterar(){
        
        txt_nroConta.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_cancelar.setEnabled(true);
        btn_salvar.setEnabled(false);
        txt_nome.setEnabled(true);
        txt_sobrenome.setEnabled(true);
        btn_cadastrar.setEnabled(false);
        btn_aplicar.setEnabled(true);
        txt_cpfcnpj.setEnabled(false);
        txt_saldo.setEnabled(false);
        txt_limite.setEnabled(true);
        cb_corrente.setEnabled(false);
        cb_poupanca.setEnabled(false);
        txt_cpfcnpj.setEnabled(true);
        btn_excluir.setEnabled(true);
    }
    
    public void ChecaNumeroConta(){
        String vazio = txt_nroConta.getText(); 
        if(vazio.equals("0"))
        {
            btn_alterar.setEnabled(false);
        } else {
            btn_alterar.setEnabled(true);
        }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Form_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Form_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_aplicar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JCheckBox cb_corrente;
    private javax.swing.JCheckBox cb_poupanca;
    private javax.swing.ButtonGroup gupotipo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    static javax.swing.JTable jTableCliente;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Info1;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_limite;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nroConta;
    private javax.swing.JLabel lbl_saldo;
    private javax.swing.JLabel lbl_sobrenome;
    static javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txt_cpfcnpj;
    private javax.swing.JTextField txt_limite;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nroConta;
    private javax.swing.JTextField txt_saldo;
    private javax.swing.JTextField txt_sobrenome;
    // End of variables declaration//GEN-END:variables
}
