/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import bean.Usuario;

/**
 *
 * @author Neto-PC
 */
public class MeuPrincipal extends javax.swing.JFrame {
    Usuario userON;
    /**
     * Creates new form MeuPrincipal
     */
    public MeuPrincipal() {
        initialize();
    }
    
    public MeuPrincipal(Usuario userON) {
        initialize();
        
        this.userON = userON;
        if(this.userON.getNivelAcesso() == 5){
            menuUsuario.setVisible(true);
        }
    }
    
    private void initialize(){
        initComponents();
        setLocationRelativeTo(null);
        menuUsuario.setVisible(false);
        
        //está desativado porque no momento não possui serventia
        //btnExcluirUsuario.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarMenu = new javax.swing.JButton();
        btnConsultarMenu = new javax.swing.JButton();
        btnSairMenu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        btnCadastrarUsuario = new javax.swing.JMenuItem();
        btnConsultarUsuario = new javax.swing.JMenuItem();
        btnExcluirUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnCadastrarPatri = new javax.swing.JMenuItem();
        btnConsultarPatri = new javax.swing.JMenuItem();
        btnBaixaPatri = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnPatriRelat = new javax.swing.JMenuItem();
        btnBaixaPatriRelat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Patrimônio");
        setSize(new java.awt.Dimension(615, 0));

        btnCadastrarMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnCadastrarMenu.setText("Cadastrar");
        btnCadastrarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMenuActionPerformed(evt);
            }
        });

        btnConsultarMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnConsultarMenu.setText("Consultar");
        btnConsultarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMenuActionPerformed(evt);
            }
        });

        btnSairMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSairMenu.setForeground(new java.awt.Color(255, 0, 0));
        btnSairMenu.setText("Sair");
        btnSairMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairMenuActionPerformed(evt);
            }
        });

        menuUsuario.setText("Usuário");

        btnCadastrarUsuario.setText("Cadastrar");
        btnCadastrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarUsuarioMouseClicked(evt);
            }
        });
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(btnCadastrarUsuario);

        btnConsultarUsuario.setText("Consultar");
        btnConsultarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarUsuarioMouseClicked(evt);
            }
        });
        btnConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(btnConsultarUsuario);

        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(btnExcluirUsuario);

        jMenuBar1.add(menuUsuario);

        jMenu2.setText("Patrimônio");

        btnCadastrarPatri.setText("Cadastrar");
        btnCadastrarPatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPatriActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadastrarPatri);

        btnConsultarPatri.setText("Consultar");
        btnConsultarPatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPatriActionPerformed(evt);
            }
        });
        jMenu2.add(btnConsultarPatri);

        btnBaixaPatri.setText("Dar Baixa");
        btnBaixaPatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixaPatriActionPerformed(evt);
            }
        });
        jMenu2.add(btnBaixaPatri);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        btnPatriRelat.setText("Patrimônio");
        btnPatriRelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatriRelatActionPerformed(evt);
            }
        });
        jMenu3.add(btnPatriRelat);

        btnBaixaPatriRelat.setText("Baixa Patrimonial");
        btnBaixaPatriRelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixaPatriRelatActionPerformed(evt);
            }
        });
        jMenu3.add(btnBaixaPatriRelat);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSairMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnCadastrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btnConsultarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnSairMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairMenuActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairMenuActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        ConsultarUser cvu = new ConsultarUser();
        cvu.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        cvu.setVisible(true);
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnCadastrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioMouseClicked
         
        
    }//GEN-LAST:event_btnCadastrarUsuarioMouseClicked

    private void btnConsultarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarUsuarioMouseClicked
        
    }//GEN-LAST:event_btnConsultarUsuarioMouseClicked

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        CadastrarUser cvu = new CadastrarUser();
        cvu.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        cvu.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarUsuarioActionPerformed
        
        
        ConsultarUser cvu = new ConsultarUser();
        cvu.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        cvu.setVisible(true);
    }//GEN-LAST:event_btnConsultarUsuarioActionPerformed

    private void btnCadastrarPatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPatriActionPerformed
        CadastrarPatri cd = new CadastrarPatri();
        cd.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        cd.setVisible(true);
    }//GEN-LAST:event_btnCadastrarPatriActionPerformed

    private void btnConsultarPatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPatriActionPerformed
        ConsultarPatri cd = new ConsultarPatri();
        cd.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        cd.setVisible(true);
    }//GEN-LAST:event_btnConsultarPatriActionPerformed

    private void btnBaixaPatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixaPatriActionPerformed
        ConsultarPatri cd = new ConsultarPatri();
        cd.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        cd.setVisible(true);
    }//GEN-LAST:event_btnBaixaPatriActionPerformed

    private void btnCadastrarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMenuActionPerformed
        CadastrarPatri cd = new CadastrarPatri();
        cd.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        cd.setVisible(true);
    }//GEN-LAST:event_btnCadastrarMenuActionPerformed

    private void btnConsultarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMenuActionPerformed
        ConsultarPatri cd = new ConsultarPatri();
        cd.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        cd.setVisible(true);
    }//GEN-LAST:event_btnConsultarMenuActionPerformed

    private void btnPatriRelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatriRelatActionPerformed
        RelatorioPatrimonio rp = new RelatorioPatrimonio();
        rp.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        rp.setVisible(true);
    }//GEN-LAST:event_btnPatriRelatActionPerformed

    private void btnBaixaPatriRelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixaPatriRelatActionPerformed
        BaixaPatrimonial rp = new BaixaPatrimonial();
        rp.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        rp.setVisible(true);
    }//GEN-LAST:event_btnBaixaPatriRelatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBaixaPatri;
    private javax.swing.JMenuItem btnBaixaPatriRelat;
    private javax.swing.JButton btnCadastrarMenu;
    private javax.swing.JMenuItem btnCadastrarPatri;
    private javax.swing.JMenuItem btnCadastrarUsuario;
    private javax.swing.JButton btnConsultarMenu;
    private javax.swing.JMenuItem btnConsultarPatri;
    private javax.swing.JMenuItem btnConsultarUsuario;
    private javax.swing.JMenuItem btnExcluirUsuario;
    private javax.swing.JMenuItem btnPatriRelat;
    private javax.swing.JButton btnSairMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuUsuario;
    // End of variables declaration//GEN-END:variables
}
