package View;

import Controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Color;


public class LoginView extends JFrame {

    private final LoginController controller;
    

    public LoginView() {
        initComponents();
        controller = new LoginController(this);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistrar = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonEntrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsuario.setBackground(new Color(0,0,0,0));
        jTextFieldUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTextFieldUsuario.setForeground(new Color(255, 255, 255));
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.setCaretColor(new Color(255, 255, 255));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 400, 40));

        jPasswordSenha.setBackground(new Color(0,0,0,0));
        jPasswordSenha.setForeground(new Color(255,255,255));
        jPasswordSenha.setBorder(null);
        jPasswordSenha.setCaretColor(new Color(255,255,255));
        jPasswordSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 390, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/FundoViewLogin.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setPreferredSize(new java.awt.Dimension(780, 580));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
       
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        Registro registro = new Registro();
        registro.setarRegistro();
        this.dispose();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        
        controller.entrar();
        
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jPasswordSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
               
                LoginView login = new LoginView();
                login.setarLogin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
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
    public void exibeMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public void setarLogin(){
        this.setLocationRelativeTo(null);
        this.setSize(700, 610);
        this.setResizable(false);
        this.setVisible(true);
    }
}
