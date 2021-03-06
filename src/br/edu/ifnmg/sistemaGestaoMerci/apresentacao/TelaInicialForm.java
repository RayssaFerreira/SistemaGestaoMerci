/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sistemaGestaoMerci.apresentacao;

import br.edu.ifnmg.sistemaGestaoMerci.entidade.Usuario;
import br.edu.ifnmg.sistemaGestaoMerci.excecao.CampoObrigatorioException;
import br.edu.ifnmg.sistemaGestaoMerci.excecao.LoginInvalidoException;
import br.edu.ifnmg.sistemaGestaoMerci.excecao.UsuarioLoginExistenteException;
import br.edu.ifnmg.sistemaGestaoMerci.negocio.UsuarioBO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rayssa
 */
public class TelaInicialForm extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialForm
     */
    Usuario usuario;

    public TelaInicialForm() {
        initComponents();
        this.desabilitarCampos();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInicial = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLogoff = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnAlterarSenha = new javax.swing.JButton();
        btnConfirmarSenha = new javax.swing.JButton();
        lblConfirmar = new javax.swing.JLabel();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        barraMenu = new javax.swing.JMenuBar();
        mnuCadastroGestao = new javax.swing.JMenu();
        mnuUsuario = new javax.swing.JMenu();
        itmUsuarioInserir = new javax.swing.JMenuItem();
        itmUsuarioConsultar = new javax.swing.JMenuItem();
        mnuFornecedores = new javax.swing.JMenuItem();
        mnuMercadorias = new javax.swing.JMenuItem();
        mnuPedidoCompra = new javax.swing.JMenuItem();
        mnuEstoque = new javax.swing.JMenuItem();
        mnuAbrirCaixa = new javax.swing.JMenuItem();
        mnuFecharCaixa = new javax.swing.JMenuItem();
        mnuRelatorio = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();
        mnuVendas = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento Gestão");
        setExtendedState(6);

        painelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        lblLogin.setText("Login*:");

        lblSenha.setText("Senha*:");

        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/1467405001_Login_out.png"))); // NOI18N
        btnLogoff.setText("Logoff");
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/1467404971_Login_in.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/1467405127_refresh.png"))); // NOI18N
        btnAlterarSenha.setText("Alterar Senha");
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        btnConfirmarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/1467405175_check-mark-80px.png"))); // NOI18N
        btnConfirmarSenha.setText("Confirmar Senha");
        btnConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarSenhaActionPerformed(evt);
            }
        });

        lblConfirmar.setText("Confirmar Senha:");

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha)
                            .addComponent(lblLogin)
                            .addComponent(lblConfirmar))
                        .addGap(18, 18, 18)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin)
                            .addComponent(txtSenha)
                            .addComponent(txtConfirmarSenha)))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(btnLogoff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmarSenha)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmar)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogoff)
                    .addComponent(btnLogin)
                    .addComponent(btnAlterarSenha)
                    .addComponent(btnConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mnuCadastroGestao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/computer.png"))); // NOI18N
        mnuCadastroGestao.setText("Gestao");

        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/group.png"))); // NOI18N
        mnuUsuario.setText("Usuário");

        itmUsuarioInserir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        itmUsuarioInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/group_add.png"))); // NOI18N
        itmUsuarioInserir.setText("Inserir");
        itmUsuarioInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUsuarioInserirActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmUsuarioInserir);

        itmUsuarioConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        itmUsuarioConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/icon-folha.png"))); // NOI18N
        itmUsuarioConsultar.setText("Listagem");
        itmUsuarioConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUsuarioConsultarActionPerformed(evt);
            }
        });
        mnuUsuario.add(itmUsuarioConsultar);

        mnuCadastroGestao.add(mnuUsuario);

        mnuFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        mnuFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/contas16x16.png"))); // NOI18N
        mnuFornecedores.setText("Fornecedores");
        mnuCadastroGestao.add(mnuFornecedores);

        mnuMercadorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnuMercadorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/lorry.png"))); // NOI18N
        mnuMercadorias.setText("Mercadorias");
        mnuCadastroGestao.add(mnuMercadorias);

        mnuPedidoCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        mnuPedidoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/cart.png"))); // NOI18N
        mnuPedidoCompra.setText("Pedido Compra");
        mnuCadastroGestao.add(mnuPedidoCompra);

        mnuEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        mnuEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/database_lightning.png"))); // NOI18N
        mnuEstoque.setText("Estoque");
        mnuCadastroGestao.add(mnuEstoque);

        mnuAbrirCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnuAbrirCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/key.png"))); // NOI18N
        mnuAbrirCaixa.setText("Abrir Caixa");
        mnuCadastroGestao.add(mnuAbrirCaixa);

        mnuFecharCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuFecharCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/key.png"))); // NOI18N
        mnuFecharCaixa.setText("Fechar Caixa");
        mnuFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFecharCaixaActionPerformed(evt);
            }
        });
        mnuCadastroGestao.add(mnuFecharCaixa);

        mnuRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        mnuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/page_white_acrobat.png"))); // NOI18N
        mnuRelatorio.setText("Relatórios");
        mnuCadastroGestao.add(mnuRelatorio);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/door_in.png"))); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuCadastroGestao.add(mnuSair);

        barraMenu.add(mnuCadastroGestao);

        mnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/money.png"))); // NOI18N
        mnuVendas.setText("Vendas");
        barraMenu.add(mnuVendas);

        mnuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifnmg/sistemaGestaoMerci/apresentacao/imagens/help.png"))); // NOI18N
        mnuAjuda.setText("Ajuda");
        barraMenu.add(mnuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmUsuarioInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUsuarioInserirActionPerformed

        CadastroDeUsuarioForm cadastroUsuario = new CadastroDeUsuarioForm();
        cadastroUsuario.setVisible(true);
    }//GEN-LAST:event_itmUsuarioInserirActionPerformed

    private void itmUsuarioConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUsuarioConsultarActionPerformed
        // TODO add your handling code here:
        ListagemUsuarioForm listarUsuario = null;
        try {
            listarUsuario = new ListagemUsuarioForm();
        } catch (SQLException ex) {
            Logger.getLogger(TelaInicialForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        listarUsuario.setVisible(true);
    }//GEN-LAST:event_itmUsuarioConsultarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:          
        this.autenticarUsuario();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        // TODO add your handling code here:
        this.mostrarCamposAlterarSenha();
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void btnConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarSenhaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnConfirmarSenhaActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        // TODO add your handling code here:
        if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja Sair do Sistema?", "ATENÇÃO ", javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuSairActionPerformed

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
        // TODO add your handling code here:
        TelaInicialForm telaInicial = new TelaInicialForm();
        telaInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoffActionPerformed

    private void mnuFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFecharCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuFecharCaixaActionPerformed
    private void autenticarUsuario() {
        String login = txtLogin.getText().trim();
        String senha = txtSenha.getText().trim();
        usuario = new Usuario();
        usuario.setLogin(login);
        usuario.setSenha(senha);
        try {
            UsuarioBO usuarioBO = new UsuarioBO();
            usuarioBO.loginUsuario(usuario);
            try {
                usuario = usuarioBO.pesquisarLoginCadastrado(usuario);
            } catch (SQLException ex) {
                Logger.getLogger(TelaInicialForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.abilitarCamposLogoff();
  
        } catch (CampoObrigatorioException e) {
            JOptionPane.showMessageDialog(this, "Preencha Todos os Campos!", "Login de Usuário!", JOptionPane.ERROR_MESSAGE);
        } catch (LoginInvalidoException e) {
            JOptionPane.showMessageDialog(this, "Login Inválido! Usuário Não Cadastrado no Sistema", "Login Usuário!", JOptionPane.ERROR_MESSAGE);
            this.limparCamposTela();
        } catch (UsuarioLoginExistenteException e) {
            JOptionPane.showMessageDialog(this, "Já possue um Usuário cadastrado com esse Loign no sistema!", "Cadastro Usuário", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void desabilitarCampos() {
        btnLogoff.setEnabled(false);
        btnConfirmarSenha.setEnabled(false);
        btnAlterarSenha.setEnabled(false);
        txtConfirmarSenha.setEnabled(false);
        lblConfirmar.setEnabled(false);
        mnuVendas.setEnabled(false);
        mnuCadastroGestao.setEnabled(true);
        mnuUsuario.setEnabled(false);
        mnuEstoque.setEnabled(false);
        mnuAbrirCaixa.setEnabled(false);
        mnuFecharCaixa.setEnabled(false);
        mnuRelatorio.setEnabled(false);
        mnuSair.setEnabled(true);
        mnuAjuda.setEnabled(true);
        
    }

    private void abilitarCamposLogoff() {
        btnLogoff.setEnabled(true);
        btnAlterarSenha.setEnabled(true);
        btnLogin.setEnabled(false);
        lblLogin.setEnabled(false);
        txtLogin.setEnabled(false);
        lblSenha.setEnabled(false);
        txtSenha.setEnabled(false);
        lblConfirmar.setEnabled(false);
        mnuVendas.setEnabled(false);
        if (usuario.getGrupo().equals("GERENTE")) {
            mnuUsuario.setEnabled(true);
            mnuAbrirCaixa.setEnabled(true);
            mnuFecharCaixa.setEnabled(true);
            mnuFornecedores.setEnabled(false);
            mnuMercadorias.setEnabled(false);
            mnuPedidoCompra.setEnabled(false);
            mnuRelatorio.setEnabled(false);
        } else if (usuario.getGrupo().equals("GESTOR DE COMPRAS")) {
            mnuFornecedores.setEnabled(true);
            mnuMercadorias.setEnabled(true);
            mnuPedidoCompra.setEnabled(true);
            mnuRelatorio.setEnabled(true);
            mnuFecharCaixa.setEnabled(false);
        } else if (usuario.getGrupo().equals("GESTOR DE ESTOQUE")) {
            mnuEstoque.setEnabled(true);
            mnuFornecedores.setEnabled(false);
            mnuMercadorias.setEnabled(false);
            mnuPedidoCompra.setEnabled(false);
            mnuFecharCaixa.setEnabled(false);
            mnuRelatorio.setEnabled(false);
        } else if (usuario.getGrupo().equals("CAIXEIRO")) {
            mnuVendas.setEnabled(true);
            mnuEstoque.setEnabled(false);
            mnuFornecedores.setEnabled(false);
            mnuMercadorias.setEnabled(false);
            mnuPedidoCompra.setEnabled(false);
            mnuFecharCaixa.setEnabled(false);
            mnuRelatorio.setEnabled(false);
        }
    }

    private void mostrarCamposAlterarSenha() {
        btnLogoff.setEnabled(true);
        btnConfirmarSenha.setEnabled(true);
        btnAlterarSenha.setEnabled(false);
        txtConfirmarSenha.setEnabled(true);
        lblConfirmar.setEnabled(true);
        txtSenha.setEnabled(true);
        lblSenha.setEnabled(true);
        mnuVendas.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(TelaInicialForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnConfirmarSenha;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JMenuItem itmUsuarioConsultar;
    private javax.swing.JMenuItem itmUsuarioInserir;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JMenuItem mnuAbrirCaixa;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuCadastroGestao;
    private javax.swing.JMenuItem mnuEstoque;
    private javax.swing.JMenuItem mnuFecharCaixa;
    private javax.swing.JMenuItem mnuFornecedores;
    private javax.swing.JMenuItem mnuMercadorias;
    private javax.swing.JMenuItem mnuPedidoCompra;
    private javax.swing.JMenuItem mnuRelatorio;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenu mnuUsuario;
    private javax.swing.JMenu mnuVendas;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void limparCamposTela() {
        this.txtLogin.setText("");
        this.txtSenha.setText("");
    }

}
