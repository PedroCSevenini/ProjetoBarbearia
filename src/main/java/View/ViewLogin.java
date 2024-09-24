package View;

import Controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;


public class ViewLogin extends JFrame {

    private final LoginController controller;
    

    public ViewLogin() {
        initComponents();
        controller = new LoginController(this);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelTextoCadastro = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelCadastre = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordSenha = new javax.swing.JPasswordField();
        jLabelFundo = new javax.swing.JLabel();
        jTextFieldUsuario1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon("src/main/java/View/imagens/barba-16px.png").getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsuario.setText("Usuário: ");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 30));

        jLabelSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 90, 40));

        jLabelTextoCadastro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTextoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextoCadastro.setText("Ainda não tem uma conta?");
        getContentPane().add(jLabelTextoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 190, 20));

        jButtonRegistrar.setBackground(new Color(0,0,0,0));
        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButtonRegistrar.setForeground(new Color(255,255,255));
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 90, 20));

        jLabelCadastre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelCadastre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCadastre.setText("<html><u>Cadastre-se</u></html>");
        getContentPane().add(jLabelCadastre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, 20));

        jButtonEntrar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEntrar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseExited(evt);
            }
        });
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 420, 50));

        jTextFieldUsuario.setBackground(new Color(0,0,0,0));
        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldUsuario.setForeground(new Color(0,0,0));
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.setCaretColor(new Color(0, 0, 0));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 226, 380, 30));

        jPasswordSenha.setBackground(new Color(0,0,0,0));
        jPasswordSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPasswordSenha.setForeground(new Color(0,0,0));
        jPasswordSenha.setBorder(null);
        jPasswordSenha.setCaretColor(new Color(0,0,0));
        jPasswordSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 323, 380, 30));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/FundoViewLogin.png"))); // NOI18N
        jLabelFundo.setAlignmentX(0.5F);
        jLabelFundo.setPreferredSize(new java.awt.Dimension(780, 580));
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 580));

        jTextFieldUsuario1.setBackground(new Color(0,0,0,0));
        jTextFieldUsuario1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTextFieldUsuario1.setForeground(new Color(255, 255, 255));
        jTextFieldUsuario1.setBorder(null);
        jTextFieldUsuario1.setCaretColor(new Color(255, 255, 255));
        jTextFieldUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 380, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
       
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        ViewRegistro registro = new ViewRegistro();
        registro.setarRegistro();
        this.dispose();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        
        controller.entrar();
        
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jPasswordSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordSenhaActionPerformed

    private void jButtonEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseEntered
           // TODO add your handling code here:
        
        jButtonEntrar.setBackground(Color.WHITE);
        jButtonEntrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonEntrarMouseEntered

    private void jButtonEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseExited
        // TODO add your handling code here:
        jButtonEntrar.setBackground(Color.BLACK);
        jButtonEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonEntrarMouseExited

    private void jTextFieldUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuario1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
               
                ViewLogin login = new ViewLogin();
                login.setarLogin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelCadastre;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTextoCadastro;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldUsuario1;
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
