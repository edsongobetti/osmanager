package br.com.chessdevelopment.view;

import java.sql.*;
import br.com.chessdevelopment.dao.ConnectionDB;
import br.com.chessdevelopment.dao.UsuarioDao;
import br.com.chessdevelopment.model.UsuarioModel;

public class TelaUsuario extends javax.swing.JInternalFrame {
    
    Connection conector = ConnectionDB.conexao();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaUsuario() {
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroupStatus = new javax.swing.ButtonGroup();
        lblIdUser = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        lblNomeUser = new javax.swing.JLabel();
        lblLoginUser = new javax.swing.JLabel();
        lblSenhaUser = new javax.swing.JLabel();
        lblNivelUser = new javax.swing.JLabel();
        jPanelStatusUser = new javax.swing.JPanel();
        rbtUserAtivo = new javax.swing.JRadioButton();
        rbtUserInativo = new javax.swing.JRadioButton();
        txtNomeUser = new javax.swing.JTextField();
        txtLoginUser = new javax.swing.JTextField();
        txtSenhaUser = new javax.swing.JTextField();
        cbxNivelUser = new javax.swing.JComboBox();
        btnAddUser = new javax.swing.JButton();
        btnConsultUser = new javax.swing.JButton();
        btnAlteraUser = new javax.swing.JButton();
        btnExcluiUser = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("OS Manager - Cadastro de Usuário");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setPreferredSize(new java.awt.Dimension(801, 598));

        lblIdUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblIdUser.setText("ID:");

        txtIdUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIdUser.setEnabled(false);

        lblNomeUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomeUser.setText("Nome:");

        lblLoginUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLoginUser.setText("Login:");

        lblSenhaUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSenhaUser.setText("Senha:");

        lblNivelUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNivelUser.setText("Nivel:");

        jPanelStatusUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        jPanelStatusUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        radioGroupStatus.add(rbtUserAtivo);
        rbtUserAtivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtUserAtivo.setSelected(true);
        rbtUserAtivo.setText("Ativo");

        radioGroupStatus.add(rbtUserInativo);
        rbtUserInativo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtUserInativo.setText("Inativo");

        javax.swing.GroupLayout jPanelStatusUserLayout = new javax.swing.GroupLayout(jPanelStatusUser);
        jPanelStatusUser.setLayout(jPanelStatusUserLayout);
        jPanelStatusUserLayout.setHorizontalGroup(
            jPanelStatusUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtUserAtivo)
                .addGap(51, 51, 51)
                .addComponent(rbtUserInativo)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelStatusUserLayout.setVerticalGroup(
            jPanelStatusUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbtUserAtivo)
                .addComponent(rbtUserInativo))
        );

        txtNomeUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtLoginUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtSenhaUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cbxNivelUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxNivelUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Colaborador" }));

        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/create.png"))); // NOI18N
        btnAddUser.setToolTipText("Adicionar Usuário");
        btnAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddUser.setPreferredSize(new java.awt.Dimension(70, 70));

        btnConsultUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/read.png"))); // NOI18N
        btnConsultUser.setToolTipText("Consultar Usuário");
        btnConsultUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultUser.setPreferredSize(new java.awt.Dimension(70, 70));
        btnConsultUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultUserActionPerformed(evt);
            }
        });

        btnAlteraUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/update.png"))); // NOI18N
        btnAlteraUser.setToolTipText("Alterar Usuário");
        btnAlteraUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlteraUser.setPreferredSize(new java.awt.Dimension(70, 70));

        btnExcluiUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/chessdevelopment/imagens/delete.png"))); // NOI18N
        btnExcluiUser.setToolTipText("Excluir Usuário");
        btnExcluiUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluiUser.setPreferredSize(new java.awt.Dimension(70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIdUser)
                            .addComponent(lblNomeUser)
                            .addComponent(lblLoginUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeUser)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelStatusUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(lblNivelUser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbxNivelUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblSenhaUser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnConsultUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnAlteraUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnExcluiUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIdUser))
                    .addComponent(jPanelStatusUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeUser)
                    .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginUser))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaUser)
                    .addComponent(txtSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivelUser)
                    .addComponent(cbxNivelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlteraUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluiUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        setBounds(0, 0, 801, 598);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultUserActionPerformed
        
        conector = ConnectionDB.conexao();
        
        UsuarioDao pesquisaUsuario = new UsuarioDao();
        UsuarioModel modeloUsuario;
        
        modeloUsuario = pesquisaUsuario.consultaUsuario(txtNomeUser.getText()); 
        
        
        //txtIdUser.setText(String.valueOf(modeloUsuario.getIdUser()));
        txtIdUser.setText(Integer.toString(modeloUsuario.getIdUser()));
        txtNomeUser.setText(modeloUsuario.getNomeUser());
        txtLoginUser.setText(modeloUsuario.getLoginUser());
        txtSenhaUser.setText(modeloUsuario.getSenhaUser());
        
        if (modeloUsuario.getNivelUser().equals("Administrador")) {
            
            cbxNivelUser.setSelectedIndex(0);
            
        }else {
            
            cbxNivelUser.setSelectedIndex(1);
            
        }
        
        if (modeloUsuario.getStatusUser() == 'A') {
            
            rbtUserAtivo.setSelected(true);
            
        }else {
            
            rbtUserInativo.setSelected(true);
            
        }
              
    }//GEN-LAST:event_btnConsultUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnAlteraUser;
    private javax.swing.JButton btnConsultUser;
    private javax.swing.JButton btnExcluiUser;
    private javax.swing.JComboBox cbxNivelUser;
    private javax.swing.JPanel jPanelStatusUser;
    private javax.swing.JLabel lblIdUser;
    private javax.swing.JLabel lblLoginUser;
    private javax.swing.JLabel lblNivelUser;
    private javax.swing.JLabel lblNomeUser;
    private javax.swing.JLabel lblSenhaUser;
    private javax.swing.ButtonGroup radioGroupStatus;
    private javax.swing.JRadioButton rbtUserAtivo;
    private javax.swing.JRadioButton rbtUserInativo;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtLoginUser;
    public static javax.swing.JTextField txtNomeUser;
    private javax.swing.JTextField txtSenhaUser;
    // End of variables declaration//GEN-END:variables
}