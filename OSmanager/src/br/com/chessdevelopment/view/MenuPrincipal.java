package br.com.chessdevelopment.view;

import static br.com.chessdevelopment.view.TelaUsuario.txtNomeUser;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        
        initComponents();
        
        URL iconeJframe = getClass().getResource("/br/com/chessdevelopment/imagens/chess.png");
        Image IconeTitulo = Toolkit.getDefaultToolkit().getImage(iconeJframe);
        this.setIconImage(IconeTitulo);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpDesktop = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jmbMenu = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuCadCliente = new javax.swing.JMenuItem();
        jMenuCadUser = new javax.swing.JMenuItem();
        jMenuCadOs = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuRelServicos = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuAjudaManual = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OS manager - Menu Principal");
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 860));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jdpDesktop.setPreferredSize(new java.awt.Dimension(801, 585));

        javax.swing.GroupLayout jdpDesktopLayout = new javax.swing.GroupLayout(jdpDesktop);
        jdpDesktop.setLayout(jdpDesktopLayout);
        jdpDesktopLayout.setHorizontalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        jdpDesktopLayout.setVerticalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/osmanagerLogoTransp.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Usuário");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Data");

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUsuario.setText("User");

        lblData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblData.setText("Date");

        jMenuCadastro.setMnemonic('c');
        jMenuCadastro.setText("Cadastros");

        jMenuCadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuCadCliente.setText("Cliente");
        jMenuCadastro.add(jMenuCadCliente);

        jMenuCadUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuCadUser.setText("Usuário");
        jMenuCadUser.setEnabled(false);
        jMenuCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadUserActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuCadUser);

        jMenuCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuCadOs.setText("Ordem de Serviço");
        jMenuCadastro.add(jMenuCadOs);

        jmbMenu.add(jMenuCadastro);

        jMenuRelatorio.setMnemonic('r');
        jMenuRelatorio.setText("Relatórios");

        jMenuRelServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuRelServicos.setText("Serviços");
        jMenuRelServicos.setEnabled(false);
        jMenuRelatorio.add(jMenuRelServicos);

        jmbMenu.add(jMenuRelatorio);

        jMenuAjuda.setMnemonic('a');
        jMenuAjuda.setText("Ajuda");

        jMenuAjudaManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuAjudaManual.setText("Manual");
        jMenuAjuda.add(jMenuAjudaManual);

        jmbMenu.add(jMenuAjuda);

        jMenuOpcoes.setMnemonic('o');
        jMenuOpcoes.setText("Opções");

        jMenuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuSobre.setText("Sobre");
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuSobre);

        jMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuSair);

        jmbMenu.add(jMenuOpcoes);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdpDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lblUsuario)
                    .addComponent(lblData))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1018, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        Date data = new Date();
        DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(dataFormatada.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
        
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_jMenuSobreActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        
        //no showCorfimDialog os parametros sao: null para o tamanho padrao, mensagem, titulo, opções de botões
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        
        if (sair == JOptionPane.YES_OPTION) {
        
            System.exit(0);
            
        }
        
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadUserActionPerformed
        
        TelaUsuario cadUser = new TelaUsuario();
        cadUser.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() { public void run() { txtNomeUser.requestFocus(); } });
        jdpDesktop.add(cadUser);
        
    }//GEN-LAST:event_jMenuCadUserActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuItem jMenuAjudaManual;
    private javax.swing.JMenuItem jMenuCadCliente;
    private javax.swing.JMenuItem jMenuCadOs;
    public static javax.swing.JMenuItem jMenuCadUser;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuOpcoes;
    public static javax.swing.JMenuItem jMenuRelServicos;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jMenuSobre;
    private javax.swing.JDesktopPane jdpDesktop;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
