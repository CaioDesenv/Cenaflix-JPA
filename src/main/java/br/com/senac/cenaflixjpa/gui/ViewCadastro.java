
package br.com.senac.cenaflixjpa.gui;

import br.com.senac.cenaflixjpa.DAO.PodcastDAO;
import br.com.senac.cenaflixjpa.DAO.CadastroUsuarioDAO;
import br.com.senac.cenaflixjpa.persistencia.Cadastro_Podcast;
import br.com.senac.cenaflixjpa.persistencia.Cadastro_Usuario;
import javax.swing.JOptionPane;

public class ViewCadastro extends javax.swing.JFrame {
    Cadastro_Usuario usuario;
    public ViewCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblProdutor = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        lblNomeEpisodio = new javax.swing.JLabel();
        txtNomeEpisodio = new javax.swing.JTextField();
        lblN_episodio = new javax.swing.JLabel();
        lblDuracao = new javax.swing.JLabel();
        lblUrlRepositorio = new javax.swing.JLabel();
        txtUrlRepositorio = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        txtN_Episodio = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("CENAFLIX");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSubtitulo.setText("CADASTRAR PODCAST");

        lblProdutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProdutor.setText("Produtor");

        lblNomeEpisodio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeEpisodio.setText("Nome do Episódio");

        lblN_episodio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblN_episodio.setText("N° do Episódio");

        lblDuracao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDuracao.setText("Duração");

        lblUrlRepositorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUrlRepositorio.setText("URL do repositório");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblTitulo))
                    .addComponent(lblUrlRepositorio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProdutor)
                            .addComponent(lblNomeEpisodio)
                            .addComponent(txtNomeEpisodio)
                            .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDuracao)
                            .addComponent(lblN_episodio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtN_Episodio)
                                .addGap(36, 36, 36))
                            .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblSubtitulo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnVoltar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar))
                        .addComponent(txtUrlRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdutor)
                    .addComponent(lblDuracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeEpisodio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUrlRepositorio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblN_episodio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtN_Episodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUrlRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVoltar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Cadastro_Podcast novoPodcast = new Cadastro_Podcast();
      try{
          
          novoPodcast.setProdutor(txtProdutor.getText());
         
          novoPodcast.setNome_episodio(txtNomeEpisodio.getText());
          
          novoPodcast.setN_episodio(Integer.parseInt(txtDuracao.getText()));
          
          novoPodcast.setDuracao_episodio(Integer.parseInt(txtN_Episodio.getText()));
          
          novoPodcast.setUrl_episodio(txtUrlRepositorio.getText());
         
          PodcastDAO podcastDAO = new PodcastDAO();
          podcastDAO.cadastrar(novoPodcast);
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
      }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblN_episodio;
    private javax.swing.JLabel lblNomeEpisodio;
    private javax.swing.JLabel lblProdutor;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUrlRepositorio;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtN_Episodio;
    private javax.swing.JTextField txtNomeEpisodio;
    private javax.swing.JTextField txtProdutor;
    private javax.swing.JTextField txtUrlRepositorio;
    // End of variables declaration//GEN-END:variables
    public void bloqueiaBtnCadastrar(){
            btnCadastrar.setEnabled(false);
    }
}
