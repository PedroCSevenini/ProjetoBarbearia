/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.FuncionarioController;
import Model.Pessoa;
import Model.Servico;
import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
        jTextFieldTelefoneCliente = new javax.swing.JTextField();
        Scroll_Tabela_Confirmados = new javax.swing.JScrollPane();
        TabelaConfirmados = new javax.swing.JTable();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelNomeServico = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jButtonConfirmarEdicao = new javax.swing.JButton();
        jButtonCancelarEdicao = new javax.swing.JButton();
        jSelecionaData = new com.toedter.calendar.JDateChooser();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        jLabelAviso = new javax.swing.JLabel();

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
        TabelaConfirmados.setCellSelectionEnabled(false);
        TabelaConfirmados.setName(""); // NOI18N
        TabelaConfirmados.setPreferredSize(new java.awt.Dimension(0, 400));
        TabelaConfirmados.setRowSelectionAllowed(true);
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

        jLabelTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTelefone.setText("Telefone");

        jLabelNomeServico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNomeServico.setText("Serviço");

        jLabelData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelData.setText("Data");

        jLabelHorario.setText("Horário");

        jComboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicoActionPerformed(evt);
            }
        });

        jButtonConfirmarEdicao.setText("Confirmar");
        jButtonConfirmarEdicao.setEnabled(false);
        jButtonConfirmarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarEdicaoActionPerformed(evt);
            }
        });

        jButtonCancelarEdicao.setText("Cancelar");
        jButtonCancelarEdicao.setEnabled(false);
        jButtonCancelarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarEdicaoActionPerformed(evt);
            }
        });

        jSelecionaData.setToolTipText("");
        jSelecionaData.setDateFormatString("dd/MM/yyyy");
        jSelecionaData.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSelecionaDataPropertyChange(evt);
            }
        });

        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um horário" }));
        jComboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorarioActionPerformed(evt);
            }
        });

        jLabelAviso.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabelAviso.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Tela_FuncionarioLayout = new javax.swing.GroupLayout(Tela_Funcionario);
        Tela_Funcionario.setLayout(Tela_FuncionarioLayout);
        Tela_FuncionarioLayout.setHorizontalGroup(
            Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Scroll_Tabela_Confirmados, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTelefoneCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxServico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSelecionaData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jComboBoxHorario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAviso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tela_FuncionarioLayout.createSequentialGroup()
                        .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeCliente)
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelNomeServico)
                            .addComponent(jLabelData)
                            .addComponent(jLabelHorario))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addComponent(jButtonConfirmarEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Rejeitar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
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
                .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Scroll_Tabela_Confirmados, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Scroll_Tabela_Pendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Remover)
                                .addComponent(Editar)
                                .addComponent(jButtonConfirmarEdicao))
                            .addGroup(Tela_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Confirmar)
                                .addComponent(Rejeitar)
                                .addComponent(jButtonCancelarEdicao))))
                    .addGroup(Tela_FuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabelNomeCliente)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSelecionaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addContainerGap(35, Short.MAX_VALUE))
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
        Remover.setEnabled(false);
        Editar.setEnabled(false);
        Confirmar.setEnabled(false);
        Rejeitar.setEnabled(false);
        jButtonConfirmarEdicao.setEnabled(false);
        jButtonCancelarEdicao.setEnabled(true);
        jComboBoxServico.setEnabled(true);
        jSelecionaData.setEnabled(true);
               
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

    private void jButtonConfirmarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarEdicaoActionPerformed
        controller.editaHorario();
        atualizaTabela();
        
    }//GEN-LAST:event_jButtonConfirmarEdicaoActionPerformed

    private void jButtonCancelarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarEdicaoActionPerformed
        atualizaTabela();
    }//GEN-LAST:event_jButtonCancelarEdicaoActionPerformed

    private void jComboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicoActionPerformed
        Servico servicoSelecionado = (Servico) jComboBoxServico.getSelectedItem();
    
        if (servicoSelecionado != null && servicoSelecionado.getId() != 0 && jButtonCancelarEdicao.isEnabled()) {  
            jSelecionaData.setEnabled(true);
        }else{
            jSelecionaData.setEnabled(false);
            jSelecionaData.setDate(null);
            jComboBoxHorario.setEnabled(false);
            jComboBoxHorario.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxServicoActionPerformed

    private void jSelecionaDataPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSelecionaDataPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date dataSelecionada = (Date) evt.getNewValue();
            if (dataSelecionada == null) {
                return;
            }
            Calendar hoje = Calendar.getInstance();
            hoje.set(Calendar.HOUR_OF_DAY, 0);
            hoje.set(Calendar.MINUTE, 0);
            hoje.set(Calendar.SECOND, 0);
            hoje.set(Calendar.MILLISECOND, 0);
            hoje.add(Calendar.DAY_OF_YEAR, 1);
            if (dataSelecionada.before(hoje.getTime())){
                jComboBoxHorario.setEnabled(false);
                jComboBoxHorario.removeAllItems();
                mostrarAviso("Por favor, selecione uma data a partir de amanhã.");
                jSelecionaData.setDate(null);
            }else{
                jComboBoxHorario.setEnabled(true);
                controller.implementarHorariosDisponiveis();
                jLabelAviso.setText("");
            }
        }
    }//GEN-LAST:event_jSelecionaDataPropertyChange

    private void jComboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorarioActionPerformed
        String horarioSelecionado = (String) jComboBoxHorario.getSelectedItem();
    
        if (horarioSelecionado != null && !horarioSelecionado.equals("Selecione um horário")){
            jButtonConfirmarEdicao.setEnabled(true);
        } else {
            jButtonConfirmarEdicao.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxHorarioActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
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
        controller.setarComboBoxServico();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.atualizaTabela();
        this.setVisible(true);
        
        
        
    }
            
    public void atualizaTabela(){
        controller.limpaHorariosPassados();
        controller.adicionaCamposTabelaConfirmados();
        controller.adicionaCamposTabelaPendentes();
        TabelaPendentes.clearSelection();
        TabelaConfirmados.clearSelection();
        
        Remover.setEnabled(false);
        Editar.setEnabled(false);
        Confirmar.setEnabled(false);
        Rejeitar.setEnabled(false);
        jButtonConfirmarEdicao.setEnabled(false);
        jButtonCancelarEdicao.setEnabled(false);
        
        
        jTextFieldNomeCliente.setText("");
        jTextFieldTelefoneCliente.setText("");
        jComboBoxServico.setSelectedIndex(0);
        jComboBoxServico.setEnabled(false);
        jSelecionaData.setEnabled(false);
        
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
    private javax.swing.JButton jButtonCancelarEdicao;
    private javax.swing.JButton jButtonConfirmarEdicao;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private javax.swing.JComboBox<Servico> jComboBoxServico;
    private javax.swing.JLabel jLabelAviso;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelNomeServico;
    private javax.swing.JLabel jLabelTelefone;
    private com.toedter.calendar.JDateChooser jSelecionaData;
    private javax.swing.JTextField jTextFieldNomeCliente;
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

    public JComboBox<Servico> getjComboBoxServico() {
        return jComboBoxServico;
    }

    

    public JTextField getjTextFieldTelefoneCliente() {
        return jTextFieldTelefoneCliente;
    }

    public JButton getjButtonConfirmarEdicao() {
        return jButtonConfirmarEdicao;
    }

    public JLabel getjLabelAviso() {
        return jLabelAviso;
    }

    public JDateChooser getjSelecionaData() {
        return jSelecionaData;
    }

    public JComboBox<String> getjComboBoxHorario() {
        return jComboBoxHorario;
    }

    public void mostrarAviso(String aviso){
        this.getjLabelAviso().setText(aviso);
    }
    
    
}
