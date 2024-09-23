/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BDO.HorarioBanco;
import Controller.FuncionarioController;
import Model.Horario;
import Model.Pessoa;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geova
 */
public class ViewFuncionario extends javax.swing.JFrame {
    private final Pessoa funcionario;
    private final FuncionarioController controller;
    /**
     * Creates new form Painel_principal_Funcionario
     */
    public ViewFuncionario() {
        initComponents();
        this.funcionario = null;
        this.controller = new FuncionarioController(this);
        initTableListenersConfirmados();
      
        initTableListenersPendentes();
    }

    
    
    public ViewFuncionario(Pessoa funcionario) {
        initComponents();
        this.funcionario = funcionario;
        this.controller = new FuncionarioController(this);
        initTableListenersConfirmados();
        initTableListenersPendentes();
     
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela_Funcionario = new javax.swing.JPanel();
        Rejeitar = new javax.swing.JButton();
        Confirmar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Scroll_Tabela_Pendentes = new javax.swing.JScrollPane();
        TabelaPendentes = new javax.swing.JTable();
        Confirmados = new javax.swing.JLabel();
        A_Confirmar = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldServiço = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldHorario = new javax.swing.JTextField();
        Scroll_Tabela_Confirmados = new javax.swing.JScrollPane();
        TabelaConfirmados = new javax.swing.JTable();
        jLabelCliente = new javax.swing.JLabel();
        jLabelCliente1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tela_Funcionario.setBackground(new java.awt.Color(255, 255, 255));

        Rejeitar.setText("Rejeitar");
        Rejeitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejeitarActionPerformed(evt);
            }
        });

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        TabelaPendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Serviço", "Data", "Horário", "Cliente", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPendentes.setColumnSelectionAllowed(true);
        TabelaPendentes.setPreferredSize(new java.awt.Dimension(0, 80));
        TabelaPendentes.getTableHeader().setReorderingAllowed(false);
        Scroll_Tabela_Pendentes.setViewportView(TabelaPendentes);
        TabelaPendentes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TabelaPendentes.getColumnModel().getColumnCount() > 0) {
            TabelaPendentes.getColumnModel().getColumn(0).setResizable(false);
            TabelaPendentes.getColumnModel().getColumn(0).setPreferredWidth(30);
            TabelaPendentes.getColumnModel().getColumn(1).setResizable(false);
            TabelaPendentes.getColumnModel().getColumn(1).setPreferredWidth(60);
            TabelaPendentes.getColumnModel().getColumn(2).setResizable(false);
            TabelaPendentes.getColumnModel().getColumn(2).setPreferredWidth(80);
            TabelaPendentes.getColumnModel().getColumn(3).setResizable(false);
            TabelaPendentes.getColumnModel().getColumn(4).setResizable(false);
            TabelaPendentes.getColumnModel().getColumn(5).setResizable(false);
            TabelaPendentes.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        Confirmados.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Confirmados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Confirmados.setText("Confirmados");

        A_Confirmar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        A_Confirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Confirmar.setText("Pendentes");

        jTextFieldCliente.setEditable(false);
        jTextFieldCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteActionPerformed(evt);
            }
        });

        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        TabelaConfirmados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Serviço", "Data", "Horário", "Cliente", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaConfirmados.setPreferredSize(new java.awt.Dimension(0, 80));
        TabelaConfirmados.getTableHeader().setReorderingAllowed(false);
        TabelaConfirmados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaConfirmadosMouseClicked(evt);
            }
        });
        Scroll_Tabela_Confirmados.setViewportView(TabelaConfirmados);
        TabelaConfirmados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TabelaConfirmados.getColumnModel().getColumnCount() > 0) {
            TabelaConfirmados.getColumnModel().getColumn(0).setResizable(false);
            TabelaConfirmados.getColumnModel().getColumn(0).setPreferredWidth(30);
            TabelaConfirmados.getColumnModel().getColumn(1).setResizable(false);
            TabelaConfirmados.getColumnModel().getColumn(1).setPreferredWidth(60);
            TabelaConfirmados.getColumnModel().getColumn(2).setResizable(false);
            TabelaConfirmados.getColumnModel().getColumn(2).setPreferredWidth(80);
            TabelaConfirmados.getColumnModel().getColumn(3).setResizable(false);
            TabelaConfirmados.getColumnModel().getColumn(4).setResizable(false);
            TabelaConfirmados.getColumnModel().getColumn(5).setResizable(false);
            TabelaConfirmados.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jLabelCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCliente.setText("Nome");

        jLabelCliente1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCliente1.setText("Serviço");

        javax.swing.GroupLayout Tela_FuncionarioLayout = new javax.swing.GroupLayout(Tela_Funcionario);
        Tela_Funcionario.setLayout(Tela_FuncionarioLayout);
        Tela_FuncionarioLayout.setHorizontalGroup(
            Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(Scroll_Tabela_Confirmados, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addComponent(jTextFieldData)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldServiço, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCliente1)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCliente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Rejeitar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addComponent(Scroll_Tabela_Pendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(Confirmados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(A_Confirmar)
                .addGap(142, 142, 142))
        );
        Tela_FuncionarioLayout.setVerticalGroup(
            Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmados)
                    .addComponent(A_Confirmar))
                .addGap(8, 8, 8)
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scroll_Tabela_Confirmados, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Scroll_Tabela_Pendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabelCliente1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldServiço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Remover)
                        .addComponent(Editar))
                    .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Confirmar)
                        .addComponent(Rejeitar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void RejeitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejeitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RejeitarActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void TabelaConfirmadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaConfirmadosMouseClicked

    }//GEN-LAST:event_TabelaConfirmadosMouseClicked

    public JTextField getjTextFieldCliente() {
        return jTextFieldCliente;
    }

    public void setjTextFieldCliente(JTextField jTextFieldCliente) {
        this.jTextFieldCliente = jTextFieldCliente;
    }

    public JTextField getjTextFieldData() {
        return jTextFieldData;
    }

    public void setjTextFieldData(JTextField jTextFieldData) {
        this.jTextFieldData = jTextFieldData;
    }

    public JTextField getjTextFieldHorario() {
        return jTextFieldHorario;
    }

    public void setjTextFieldHorario(JTextField jTextFieldHorario) {
        this.jTextFieldHorario = jTextFieldHorario;
    }

    public JTextField getjTextFieldServiço() {
        return jTextFieldServiço;
    }

    public void setjTextFieldServiço(JTextField jTextFieldServiço) {
        this.jTextFieldServiço = jTextFieldServiço;
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
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewFuncionario view = new ViewFuncionario();
                view.setarFuncionario();         
                
            }
        });
    }
    
    public void setarFuncionario(){
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.atualizaTabela();
        this.setVisible(true);
        
        
    }
            
    public void atualizaTabela(){
        controller.adicionaCamposTabelaConfirmados(funcionario != null ? funcionario.getId() : 0);
        controller.adicionaCamposTabelaPendentes(funcionario != null ? funcionario.getId() : 0);
    }
    
    private void initTableListenersConfirmados() {
        TabelaConfirmados.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {        
            if (!event.getValueIsAdjusting()) {
                int selectedRow = TabelaConfirmados.getSelectedRow();
                if (selectedRow >= 0) {
                    jTextFieldCliente.setText(TabelaConfirmados.getValueAt(selectedRow, 4).toString());
                    jTextFieldData.setText(TabelaConfirmados.getValueAt(selectedRow, 2).toString());
                    jTextFieldHorario.setText(TabelaConfirmados.getValueAt(selectedRow, 3).toString());
                    jTextFieldServiço.setText(TabelaConfirmados.getValueAt(selectedRow, 1).toString());
                }
            }
        });
        
    }
    
    private void initTableListenersPendentes() {
    // Obtenha o modelo de seleção de linhas da tabela
        TabelaPendentes.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            // Verifica se a seleção ainda está sendo alterada
            if (!event.getValueIsAdjusting()) {
                int selectedRow = TabelaPendentes.getSelectedRow();
                
                // Verifica se uma linha foi selecionada
                if (selectedRow >= 0) {
                    jTextFieldCliente.setText(TabelaPendentes.getValueAt(selectedRow, 4).toString());
                    jTextFieldData.setText(TabelaPendentes.getValueAt(selectedRow, 2).toString());
                    jTextFieldHorario.setText(TabelaPendentes.getValueAt(selectedRow, 3).toString());
                    jTextFieldServiço.setText(TabelaPendentes.getValueAt(selectedRow, 1).toString());
                }
            }
        });
        
    }
            
            
            
            
            
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A_Confirmar;
    private javax.swing.JLabel Confirmados;
    private javax.swing.JButton Confirmar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Rejeitar;
    private javax.swing.JButton Remover;
    private javax.swing.JScrollPane Scroll_Tabela_Confirmados;
    private javax.swing.JScrollPane Scroll_Tabela_Pendentes;
    private javax.swing.JTable TabelaConfirmados;
    private javax.swing.JTable TabelaPendentes;
    private javax.swing.JPanel Tela_Funcionario;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldHorario;
    private javax.swing.JTextField jTextFieldServiço;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelaConfirmados() {
        return TabelaConfirmados;
    }

    public void setTabelaConfirmados(JTable TabelaConfirmados) {
        this.TabelaConfirmados = TabelaConfirmados;
    }

    public JTable getTabelaPendentes() {
        return TabelaPendentes;
    }

    public void setTabelaPendentes(JTable TabelaPendentes) {
        this.TabelaPendentes = TabelaPendentes;
    }

    
    
}
