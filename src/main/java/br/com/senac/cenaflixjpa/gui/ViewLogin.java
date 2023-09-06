
package br.com.senac.cenaflixjpa.gui;

import Util.Criptografia;
import br.com.senac.cenaflixjpa.DAO.CadastroUsuarioDAO;
import javax.swing.JOptionPane;
import br.com.senac.cenaflixjpa.persistencia.Cadastro_Usuario;

public class ViewLogin extends javax.swing.JFrame {

    public ViewLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("CENAFLIX");

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogin.setText("Login:");

        txtLogin.setPreferredSize(new java.awt.Dimension(65, 27));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtSenha.setPreferredSize(new java.awt.Dimension(65, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha)
                            .addComponent(lblLogin))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblTitulo)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnLogin)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       Cadastro_Usuario usuario = new Cadastro_Usuario();

        // Atribuimos os valores Login e Senha baseado nos dados dos componentes JTextField
        usuario.setLogin_usuario(txtLogin.getText());
        usuario.setSenha_hash(Criptografia.getMD5(txtSenha.getText()));        

        // Exemplo de SQL Injection baseada em booleano
        usuario = CadastroUsuarioDAO.validarUsuarioSeguro(usuario);


        // "Reescrevemos" os valores do objeto baseado na resposta do método
        // Se nenhum registro for encontrado, teremos um usuário NULO           
        if (usuario != null) {
            // Dependendo do tipo de usuário, levamos a uma página diferente
            if( usuario.getPerfil().equalsIgnoreCase("Admin") ) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, Administrador " + usuario.getNome());
                dispose();
                ViewListagem telaListagem = new ViewListagem();
                telaListagem.setVisible(true);
                
            } else if (usuario.getPerfil().equalsIgnoreCase("Operador") ) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, Perfil: Operador " + usuario.getNome());
                dispose();
                ViewListagem telaListagem = new ViewListagem();
                telaListagem.setVisible(true);
                telaListagem.bloqueiaBtnExcluir();
                
                
            }else if (usuario.getPerfil().equalsIgnoreCase("Usuario") ) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, Perfil Usuário " + usuario.getNome());
                dispose();
                ViewListagem telaListagem = new ViewListagem();
                telaListagem.setVisible(true);
                telaListagem.bloqueiaBtnExcluir();
                telaListagem.bloqueiaBtnCadastrar();
            } 
            else {
                JOptionPane.showMessageDialog(null, "Ops, " + usuario.getNome() + "\nParece que você não tem permissão acessar o sistema :( ");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Erro de autenticação! Verifique se os dados estão corretos.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
