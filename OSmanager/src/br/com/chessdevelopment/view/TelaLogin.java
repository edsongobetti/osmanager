package br.com.chessdevelopment.view;

import br.com.chessdevelopment.dao.ConnectionDB;
import br.com.chessdevelopment.dao.UsuarioDao;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaLogin extends javax.swing.JFrame {

    Connection conector = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String login = null;
    
    public TelaLogin() {
        
        initComponents();
        
        conector = ConnectionDB.conexao();
        
        URL iconeJframe = getClass().getResource("/br/com/chessdevelopment/imagens/chess.png");
        Image IconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeJframe);
        this.setIconImage(IconeTitulo);
        
        if (conector != null) {
            lblDbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/dbOn.png")));
        }else {
            lblDbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/dbOff.png")));
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTxtUsuario = new javax.swing.JLabel();
        lblTxtSenha = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblDbStatus = new javax.swing.JLabel();
        lblLogotipoChess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OS Manager - Login");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        lblTxtUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTxtUsuario.setText("Usuário:");

        lblTxtSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTxtSenha.setText("Senha:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenhaKeyTyped(evt);
            }
        });

        lblDbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/dbOff.png"))); // NOI18N

        lblLogotipoChess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/logo_chess_trans.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogotipoChess)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTxtSenha)
                                    .addComponent(lblTxtUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDbStatus)
                                .addGap(109, 109, 109)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogotipoChess)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxtUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxtSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDbStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(410, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        UsuarioDao loginUsuario = new UsuarioDao();
        
        try {
            
            login = loginUsuario.logarUsuario(txtUsuario.getText(), txtSenha.getText());
            
        } catch (SQLException ex) {
            
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        UsuarioDao retornoUsuario = new UsuarioDao();
        String usuarioRetornado = retornoUsuario.retornoUser(txtUsuario.getText(), txtSenha.getText());
        
        if(login.equals("adminUser")) {
            
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.jMenuCadUser.setEnabled(true);
            menuPrincipal.jMenuRelServicos.setEnabled(true);
            menuPrincipal.lblUsuario.setText(usuarioRetornado);
            menuPrincipal.lblUsuario.setForeground(Color.red);
            menuPrincipal.setVisible(true);            
            this.dispose();
            
            try {
                
                conector.close();
                
            } catch (SQLException ex) {
                
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
        }else if(login.equals("colaboradorUser")) {
            
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.lblUsuario.setText(usuarioRetornado);
            menuPrincipal.setVisible(true);
            this.dispose();
            
            try {
                
                conector.close();
                
            } catch (SQLException ex) {
                
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
        }else if(login.equals("userInativo")) {
            
            JOptionPane.showMessageDialog(null, "Usuário INATIVO, impossível conectar, por favor, verifique.");
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.grabFocus();
            
        }else if (login.equals("Desconectado")) {
            
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos, por favor, verifique!");
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.grabFocus();
    
        }else {
            
            JOptionPane.showMessageDialog(null, login);
            txtUsuario.setText("");
            txtSenha.setText("");
            txtUsuario.grabFocus();
            
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        
        int numeroCaracteres = 12;
        
        if (txtUsuario.getText().length()>=numeroCaracteres) {
            
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo permite no máximo 12 caracteres.");
            
        }
        
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped
        
        int numeroCaracteres = 12;
        
        if (txtSenha.getText().length()>=numeroCaracteres) {
            
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo permite no máximo 12 caracteres.");
            
        }
        
    }//GEN-LAST:event_txtSenhaKeyTyped

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblDbStatus;
    private javax.swing.JLabel lblLogotipoChess;
    private javax.swing.JLabel lblTxtSenha;
    private javax.swing.JLabel lblTxtUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
