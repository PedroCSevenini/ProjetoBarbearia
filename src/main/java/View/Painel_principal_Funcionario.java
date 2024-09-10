/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.CardLayout;

/**
 *
 * @author geova
 */
public class Painel_principal_Funcionario extends javax.swing.JFrame {

    /**
     * Creates new form Painel_principal_Funcionario
     */
    public Painel_principal_Funcionario() {
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

        Tela_Principal = new javax.swing.JPanel();
        Tela_Funcionario = new javax.swing.JPanel();
        Rejeitar = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Scroll_Tabela_Confirmados = new javax.swing.JScrollPane();
        Tabela_Confirmados = new javax.swing.JTable();
        Scroll_Tabela_AConfirmar = new javax.swing.JScrollPane();
        Tabela_a_Confirmar = new javax.swing.JTable();
        Confirmados = new javax.swing.JLabel();
        A_Confirmar = new javax.swing.JLabel();
        Tela_Cortes = new javax.swing.JPanel();
        Barra_menu = new javax.swing.JMenuBar();
        Telas = new javax.swing.JMenu();
        Clientes1 = new javax.swing.JMenuItem();
        Cortes1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tela_Principal.setLayout(new java.awt.CardLayout());

        Tela_Funcionario.setBackground(new java.awt.Color(255, 255, 255));
        Tela_Funcionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rejeitar.setText("Rejeitar");
        Rejeitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejeitarActionPerformed(evt);
            }
        });
        Tela_Funcionario.add(Rejeitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 120, -1));

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        Tela_Funcionario.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 120, -1));

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        Tela_Funcionario.add(Remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 120, -1));

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        Tela_Funcionario.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 120, -1));

        Tabela_Confirmados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabela_Confirmados.setPreferredSize(new java.awt.Dimension(0, 80));
        Scroll_Tabela_Confirmados.setViewportView(Tabela_Confirmados);

        Tela_Funcionario.add(Scroll_Tabela_Confirmados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 330));

        Tabela_a_Confirmar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Scroll_Tabela_AConfirmar.setViewportView(Tabela_a_Confirmar);

        Tela_Funcionario.add(Scroll_Tabela_AConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 250, 330));

        Confirmados.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Confirmados.setText("Confirmados");
        Tela_Funcionario.add(Confirmados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 22, -1, -1));

        A_Confirmar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        A_Confirmar.setText("A Confirmar");
        Tela_Funcionario.add(A_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 22, -1, -1));

        Tela_Principal.add(Tela_Funcionario, "Tela_Clientes");

        Tela_Cortes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Tela_CortesLayout = new javax.swing.GroupLayout(Tela_Cortes);
        Tela_Cortes.setLayout(Tela_CortesLayout);
        Tela_CortesLayout.setHorizontalGroup(
            Tela_CortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        Tela_CortesLayout.setVerticalGroup(
            Tela_CortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        Tela_Principal.add(Tela_Cortes, "Tela_Cortes");

        Telas.setText("Telas");

        Clientes1.setText("Clientes");
        Clientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clientes1ActionPerformed(evt);
            }
        });
        Telas.add(Clientes1);

        Cortes1.setText("Cortes");
        Cortes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cortes1ActionPerformed(evt);
            }
        });
        Telas.add(Cortes1);

        Barra_menu.add(Telas);

        setJMenuBar(Barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Clientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clientes1ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) Tela_Principal.getLayout();
        cl.show(Tela_Principal, "Tela_Clientes");
    }//GEN-LAST:event_Clientes1ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_EditarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void RejeitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejeitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RejeitarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverActionPerformed

    private void Cortes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cortes1ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) Tela_Principal.getLayout();
        cl.show(Tela_Principal, "Tela_Cortes");
    }//GEN-LAST:event_Cortes1ActionPerformed

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
            java.util.logging.Logger.getLogger(Painel_principal_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel_principal_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel_principal_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel_principal_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel_principal_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A_Confirmar;
    private javax.swing.JMenuBar Barra_menu;
    private javax.swing.JMenuItem Clientes1;
    private javax.swing.JLabel Confirmados;
    private javax.swing.JButton Confirmar;
    private javax.swing.JMenuItem Cortes1;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Rejeitar;
    private javax.swing.JButton Remover;
    private javax.swing.JScrollPane Scroll_Tabela_AConfirmar;
    private javax.swing.JScrollPane Scroll_Tabela_Confirmados;
    private javax.swing.JTable Tabela_Confirmados;
    private javax.swing.JTable Tabela_a_Confirmar;
    private javax.swing.JPanel Tela_Cortes;
    private javax.swing.JPanel Tela_Funcionario;
    private javax.swing.JPanel Tela_Principal;
    private javax.swing.JMenu Telas;
    // End of variables declaration//GEN-END:variables
}
