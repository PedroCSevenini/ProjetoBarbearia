/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.FuncionarioController;
import Model.Pessoa;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;


public class ViewFuncionario extends javax.swing.JFrame {
    private final Pessoa funcionario;
    private final FuncionarioController controller;
    public ViewFuncionario() {
        initComponents();
        this.funcionario = null;
        this.controller = new FuncionarioController(this);
        initTableListenersConfirmados();  
        initTableListenersPendentes();
        Remover.setEnabled(false);
        Editar.setEnabled(false);
        Confirmar.setEnabled(false);
        Rejeitar.setEnabled(false);
    }

    

    
    public ViewFuncionario(Pessoa funcionario) {
        initComponents();
        this.funcionario = funcionario;
        this.controller = new FuncionarioController(this);
        initTableListenersConfirmados();
        initTableListenersPendentes();
        Remover.setEnabled(false);
        Editar.setEnabled(false);
        Confirmar.setEnabled(false);
        Rejeitar.setEnabled(false);
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
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jTextFieldNomeServico = new javax.swing.JTextField();
        jTextFieldTelefoneCliente = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        Scroll_Tabela_Confirmados = new javax.swing.JScrollPane();
        TabelaConfirmados = new javax.swing.JTable();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabelNomeServico = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();

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

        TabelaPendentes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        TabelaPendentes.setPreferredSize(new java.awt.Dimension(0, 80));
        TabelaPendentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaPendentes.getTableHeader().setReorderingAllowed(false);
        Scroll_Tabela_Pendentes.setViewportView(TabelaPendentes);
        TabelaPendentes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
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

        jTextFieldNomeCliente.setEditable(false);
        jTextFieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeClienteActionPerformed(evt);
            }
        });

        jTextFieldNomeServico.setEditable(false);

        jTextFieldTelefoneCliente.setEditable(false);
        jTextFieldTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneClienteActionPerformed(evt);
            }
        });

        Scroll_Tabela_Confirmados.setColumnHeaderView(null);

        TabelaConfirmados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        TabelaConfirmados.setColumnSelectionAllowed(true);
        TabelaConfirmados.setName(""); // NOI18N
        TabelaConfirmados.setPreferredSize(new java.awt.Dimension(0, 400));
        TabelaConfirmados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaConfirmados.getTableHeader().setReorderingAllowed(false);
        TabelaConfirmados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaConfirmadosMouseClicked(evt);
            }
        });
        Scroll_Tabela_Confirmados.setViewportView(TabelaConfirmados);
        TabelaConfirmados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
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

        jLabelNomeCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNomeCliente.setText("Nome");

        jLabelNomeServico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNomeServico.setText("Serviço");

        jLabelTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTelefone.setText("Telefone");

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
                    .addComponent(jTextFieldNomeServico, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNomeServico)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jLabelNomeCliente)
                            .addComponent(jLabelTelefone)
                            .addComponent(jTextFieldTelefoneCliente)
                            .addComponent(jTextFieldData))
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
                        .addComponent(jLabelNomeCliente)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabelNomeServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void jTextFieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeClienteActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        
    }//GEN-LAST:event_EditarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        controller.removerHorarioSelecionado();
        atualizaTabela();
    }//GEN-LAST:event_RemoverActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        controller.confirmarHorarioSelecionado();
        atualizaTabela();
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void RejeitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejeitarActionPerformed
        controller.removerHorarioSelecionadoPendentes();
        atualizaTabela();
    }//GEN-LAST:event_RejeitarActionPerformed

    private void jTextFieldTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneClienteActionPerformed
        
    }//GEN-LAST:event_jTextFieldTelefoneClienteActionPerformed

    private void TabelaConfirmadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaConfirmadosMouseClicked

    }//GEN-LAST:event_TabelaConfirmadosMouseClicked

    public static void main(String args[]) {
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
        controller.adicionaCamposTabelaConfirmados();
        controller.adicionaCamposTabelaPendentes();
    }
    
    private void initTableListenersConfirmados() {
        TabelaConfirmados.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {        
            if (!event.getValueIsAdjusting()) {
                int selectedRow = TabelaConfirmados.getSelectedRow();
                
                if (selectedRow >= 0) {
                    Remover.setEnabled(true);
                    Editar.setEnabled(true);
                    Confirmar.setEnabled(false);
                    Rejeitar.setEnabled(false);
                    TabelaPendentes.clearSelection();
                    controller.atualizaCamposConfirmados();
                    
                }
            }
        });
        
    }
    
    private void initTableListenersPendentes() {
        TabelaPendentes.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = TabelaPendentes.getSelectedRow();
                if (selectedRow >= 0) {
                    Remover.setEnabled(false);
                    Editar.setEnabled(false);
                    Confirmar.setEnabled(true);
                    Rejeitar.setEnabled(true);
                    TabelaConfirmados.clearSelection();
                    controller.atualizaCamposPendentes();
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
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelNomeServico;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNomeServico;
    private javax.swing.JTextField jTextFieldTelefoneCliente;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelaConfirmados() {
        return TabelaConfirmados;
    }

    public JTable getTabelaPendentes() {
        return TabelaPendentes;
    }
    
   
    public Pessoa getFuncionario() {
        return funcionario;
    }

    public JTextField getjTextFieldNomeCliente() {
        return jTextFieldNomeCliente;
    }

    public JTextField getjTextFieldNomeServico() {
        return jTextFieldNomeServico;
    }

    public JTextField getjTextFieldTelefoneCliente() {
        return jTextFieldTelefoneCliente;
    }

    
    
    
    
}
