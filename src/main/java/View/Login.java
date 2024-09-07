/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginController;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author pedro
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
        controller = new LoginController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelLoginPrincipal = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelFundoOpaco = new javax.swing.JLabel();
        jLabelLoginFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuario.setText("Senha");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 70, 30));

        jLabelSenha.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSenha.setText("Usuário");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 70, -1));

        jLabelLoginPrincipal.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabelLoginPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginPrincipal.setText("LOGIN");
        getContentPane().add(jLabelLoginPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 130, 50));

        jTextFieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, -1));
        getContentPane().add(jPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 150, -1));

        jButtonEntrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 80, -1));

        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jLabelFundoOpaco.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFundoOpaco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFundoOpaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/FundoTransparenteLogin.png"))); // NOI18N
        getContentPane().add(jLabelFundoOpaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, 290));

        jLabelLoginFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/FundoLogin.png"))); // NOI18N
        getContentPane().add(jLabelLoginFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        // Executa depois de clique no botão entrar
        controller.entrar();
        
    }//GEN-LAST:event_jButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        // Centraliza o JFrame na tela
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
               
                Login login = new Login();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelFundoOpaco;
    private javax.swing.JLabel jLabelLoginFundo;
    private javax.swing.JLabel jLabelLoginPrincipal;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    public JPasswordField getjPasswordSenha() {
        return jPasswordSenha;
    }

    public void setjPasswordSenha(JPasswordField jPasswordSenha) {
        this.jPasswordSenha = jPasswordSenha;
    }

    public JTextField getjTextFieldUsuario() {
        return jTextFieldUsuario;
    }

    public void setjTextFieldUsuario(JTextField jTextFieldUsuario) {
        this.jTextFieldUsuario = jTextFieldUsuario;
    }
}
