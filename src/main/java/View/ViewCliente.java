/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 *
 * @author geova
 */
public class ViewCliente extends javax.swing.JFrame {
    
   private JButton botaoAtual = null; // Armazena o botão atualmente clicado
    
    
    public ViewCliente() {
        initComponents();
        jPanelInicio.setVisible(true); // Torna o jPanel4 invisível inicialmente
        jPanelUsuario.setVisible(false);
        jPanelAgendamento.setVisible(false);
        jButtonInicio.setBackground(Color.YELLOW);
        botaoAtual = jButtonInicio; // Nenhum botão está selecionado inicialmente
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanelDosBotao = new javax.swing.JPanel();
        jPanelLogo = new javax.swing.JPanel();
        jButtonInicio = new javax.swing.JButton();
        jButtonAgendamento = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelAbreBotao = new javax.swing.JPanel();
        jPanelAgendamento = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelUsuario = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanelImgParfil = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanelInicio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToggleButtonNovoAgendamento = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        jButtonInicio.setText("Inicio");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });

        jButtonAgendamento.setText("Agendamento");
        jButtonAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendamentoActionPerformed(evt);
            }
        });

        jButtonPerfil.setText("Perfil Usuario");
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDosBotaoLayout = new javax.swing.GroupLayout(jPanelDosBotao);
        jPanelDosBotao.setLayout(jPanelDosBotaoLayout);
        jPanelDosBotaoLayout.setHorizontalGroup(
            jPanelDosBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDosBotaoLayout.createSequentialGroup()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelDosBotaoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanelDosBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonPerfil)
                    .addComponent(jButtonAgendamento)
                    .addComponent(jButtonInicio))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanelDosBotaoLayout.setVerticalGroup(
            jPanelDosBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDosBotaoLayout.createSequentialGroup()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonInicio)
                .addGap(40, 40, 40)
                .addComponent(jButtonAgendamento)
                .addGap(40, 40, 40)
                .addComponent(jButtonPerfil)
                .addGap(40, 40, 40)
                .addComponent(jButtonSair)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        jPanel4.add(jPanelDosBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 490));

        jPanelAbreBotao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanelAbreBotaoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanelAbreBotao.setLayout(new java.awt.BorderLayout());

        jPanelAgendamento.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setText("Agendamento");

        javax.swing.GroupLayout jPanelAgendamentoLayout = new javax.swing.GroupLayout(jPanelAgendamento);
        jPanelAgendamento.setLayout(jPanelAgendamentoLayout);
        jPanelAgendamentoLayout.setHorizontalGroup(
            jPanelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgendamentoLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel2)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanelAgendamentoLayout.setVerticalGroup(
            jPanelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgendamentoLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel2)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        jPanelAbreBotao.add(jPanelAgendamento, java.awt.BorderLayout.PAGE_END);

        jPanelUsuario.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabelNome.setText("Nome Completo");

        jTextFieldNome.setText("Geovanni Moreira Dias");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        jTextField1.setText("139.058.773-32");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Numero");

        jTextField2.setText("(32)98475-8730");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelImgParfilLayout = new javax.swing.GroupLayout(jPanelImgParfil);
        jPanelImgParfil.setLayout(jPanelImgParfilLayout);
        jPanelImgParfilLayout.setHorizontalGroup(
            jPanelImgParfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelImgParfilLayout.setVerticalGroup(
            jPanelImgParfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        jLabel5.setText("Senha");

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar Alteração");

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jPanelImgParfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addGap(105, 105, 105))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImgParfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelAbreBotao.add(jPanelUsuario, java.awt.BorderLayout.CENTER);

        jPanelInicio.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Bem vindo a Barbearia X99");

        jLabel7.setText("Seus Agendamentos");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Dia:\n\nHora:\n");
        jScrollPane1.setViewportView(jTextArea1);

        jToggleButtonNovoAgendamento.setText("Novo Agendamento");
        jToggleButtonNovoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonNovoAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel7))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButtonNovoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jToggleButtonNovoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanelAbreBotao.add(jPanelInicio, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanelAbreBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 390, 490));

        getContentPane().add(jPanel4, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        // TODO add your handling code here:
    // Restaura a cor do botão anteriormente clicado
    if (botaoAtual != null) {
        botaoAtual.setBackground(null);
    }

    resetarCoresDosBotoes(); // Reseta a cor de todos os botões

    jButtonInicio.setBackground(Color.YELLOW); // Define a cor do botão clicado
    botaoAtual = jButtonInicio;

    // Gerencia a visibilidade dos painéis
    jPanelAgendamento.setVisible(false);
    jPanelUsuario.setVisible(false);
    jPanelInicio.setVisible(true);
    
    jPanelAbreBotao.revalidate();
    jPanelAbreBotao.repaint(); 
    }//GEN-LAST:event_jButtonInicioActionPerformed
    
    private void jButtonAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendamentoActionPerformed
        // TODO add your handling code here:
    if (botaoAtual != null) {
        botaoAtual.setBackground(null);
    }

    resetarCoresDosBotoes(); // Reseta a cor de todos os botões

    jButtonAgendamento.setBackground(Color.BLACK); // Define a cor do botão clicado
    botaoAtual = jButtonAgendamento;

    // Gerencia a visibilidade dos painéis
    jPanelUsuario.setVisible(false);
    jPanelInicio.setVisible(false);
    jPanelAgendamento.setVisible(true);
    
    jPanelAbreBotao.revalidate();
    jPanelAbreBotao.repaint(); 

    }//GEN-LAST:event_jButtonAgendamentoActionPerformed

    private void jPanelAbreBotaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanelAbreBotaoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelAbreBotaoAncestorAdded

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        // TODO add your handling code here:
    if (botaoAtual != null) {
        botaoAtual.setBackground(null);
    }
    
    resetarCoresDosBotoes(); // Reseta a cor de todos os botões

    jButtonPerfil.setBackground(Color.BLUE); // Define a cor do botão clicado
    botaoAtual = jButtonPerfil;

    // Gerencia a visibilidade dos painéis
    jPanelUsuario.setVisible(true);
    jPanelInicio.setVisible(false);
    jPanelAgendamento.setVisible(false);
    
    jPanelAbreBotao.revalidate();
    jPanelAbreBotao.repaint();
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButtonNovoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonNovoAgendamentoActionPerformed
        // TODO add your handling code here:
        if (botaoAtual != null) {
        botaoAtual.setBackground(null);
    }
    resetarCoresDosBotoes(); // Reseta a cor de todos os botões

    jButtonAgendamento.setBackground(Color.BLACK); // Define a cor do botão clicado
    botaoAtual = jButtonAgendamento;

    // Gerencia a visibilidade dos painéis
    jPanelUsuario.setVisible(false);
    jPanelInicio.setVisible(false);
    jPanelAgendamento.setVisible(true);
    
    jPanelAbreBotao.revalidate();
    jPanelAbreBotao.repaint(); 
    }//GEN-LAST:event_jToggleButtonNovoAgendamentoActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
    private void resetarCoresDosBotoes() {
        jButtonInicio.setBackground(null); // Define a cor padrão
        jButtonAgendamento.setBackground(null); // Define a cor padrão
        jButtonPerfil.setBackground(null); // Define a cor padrão
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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgendamento;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAbreBotao;
    private javax.swing.JPanel jPanelAgendamento;
    private javax.swing.JPanel jPanelDosBotao;
    private javax.swing.JPanel jPanelImgParfil;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JToggleButton jToggleButtonNovoAgendamento;
    // End of variables declaration//GEN-END:variables
}
