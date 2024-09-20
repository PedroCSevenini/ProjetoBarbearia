/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BDO.PessoaBanco;
import Controller.ClienteController;
import Model.Pessoa;
import java.awt.Color;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

/**
 *
 * @author pedro
 */
public class ViewCliente extends javax.swing.JFrame {
    private final ClienteController controller;
    private final Pessoa pessoa;
    /**
     * Creates new form NovoCliente
     */
    public ViewCliente() {
        initComponents();
        controller = new ClienteController(this);
        this.pessoa= null;
              
    }
    
    public ViewCliente(Pessoa pessoa){
        initComponents();
        controller = new ClienteController(this);
        this.pessoa = pessoa;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelBarraPrincipal = new javax.swing.JPanel();
        JPanelBtnInicio = new javax.swing.JPanel();
        jLabelIconInicio = new javax.swing.JLabel();
        jLabelTituloInicio = new javax.swing.JLabel();
        jPanelBtnAgendamento = new javax.swing.JPanel();
        jLabelIconCalendario = new javax.swing.JLabel();
        jLabelTituloAgendamento = new javax.swing.JLabel();
        jPanelBtnPerfil = new javax.swing.JPanel();
        jLabelIconPerfil = new javax.swing.JLabel();
        jLabelTituloPerfi = new javax.swing.JLabel();
        jPanelBtnSair = new javax.swing.JPanel();
        jLabelIconSair = new javax.swing.JLabel();
        jLabelTituloSair = new javax.swing.JLabel();
        jPanelBarraPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPaneAbas = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jScrollPaneAgendado = new javax.swing.JScrollPane();
        jTextAreaAgendado = new javax.swing.JTextArea();
        jPanelBtnNovoAgendamento = new javax.swing.JPanel();
        jLabelNovoAgendamento = new javax.swing.JLabel();
        jButtonNovoAgendamento = new javax.swing.JButton();
        jPanelAgendamento = new javax.swing.JPanel();
        jButtonDataHorario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButtonMarcar = new javax.swing.JButton();
        jComboBoxFuncionario = new javax.swing.JComboBox<>();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jPanelPerfil = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanelDataEHora = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraPrincipal.setBackground(new java.awt.Color(31, 31, 31));
        jPanelBarraPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelBtnInicio.setBackground(new java.awt.Color(78, 78, 78));
        JPanelBtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelBtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPanelBtnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPanelBtnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPanelBtnInicioMouseExited(evt);
            }
        });
        JPanelBtnInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/casa.png"))); // NOI18N
        JPanelBtnInicio.add(jLabelIconInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabelTituloInicio.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTituloInicio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTituloInicio.setForeground(new java.awt.Color(235, 235, 235));
        jLabelTituloInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloInicio.setText("Início");
        JPanelBtnInicio.add(jLabelTituloInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 50));

        jPanelBarraPrincipal.add(JPanelBtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 50));

        jPanelBtnAgendamento.setBackground(new java.awt.Color(78, 78, 78));
        jPanelBtnAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBtnAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBtnAgendamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBtnAgendamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBtnAgendamentoMouseExited(evt);
            }
        });
        jPanelBtnAgendamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/calendario.png"))); // NOI18N
        jPanelBtnAgendamento.add(jLabelIconCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabelTituloAgendamento.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTituloAgendamento.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTituloAgendamento.setForeground(new java.awt.Color(235, 235, 235));
        jLabelTituloAgendamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloAgendamento.setText("Agendamento");
        jPanelBtnAgendamento.add(jLabelTituloAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 50));

        jPanelBarraPrincipal.add(jPanelBtnAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 50));

        jPanelBtnPerfil.setBackground(new java.awt.Color(78, 78, 78));
        jPanelBtnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBtnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBtnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBtnPerfilMouseExited(evt);
            }
        });
        jPanelBtnPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/usuario.png"))); // NOI18N
        jPanelBtnPerfil.add(jLabelIconPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabelTituloPerfi.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTituloPerfi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTituloPerfi.setForeground(new java.awt.Color(235, 235, 235));
        jLabelTituloPerfi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloPerfi.setText("Perfil");
        jPanelBtnPerfil.add(jLabelTituloPerfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 60, 32));

        jPanelBarraPrincipal.add(jPanelBtnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 50));

        jPanelBtnSair.setBackground(new java.awt.Color(78, 78, 78));
        jPanelBtnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBtnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBtnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBtnSairMouseExited(evt);
            }
        });
        jPanelBtnSair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/abertura-da-porta-aberta.png"))); // NOI18N
        jPanelBtnSair.add(jLabelIconSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabelTituloSair.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTituloSair.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTituloSair.setForeground(new java.awt.Color(235, 235, 235));
        jLabelTituloSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloSair.setText("Sair");
        jPanelBtnSair.add(jLabelTituloSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 32));

        jPanelBarraPrincipal.add(jPanelBtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, 50));

        jPanelFundo.add(jPanelBarraPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 530));

        jPanelBarraPanel.setBackground(new java.awt.Color(120, 120, 120));
        jPanelBarraPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelBarraPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 235, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Início");
        jPanelBarraPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 90, -1));

        jPanelFundo.add(jPanelBarraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -10, 620, 100));

        jPanelInicio.setEnabled(false);
        jPanelInicio.setPreferredSize(new java.awt.Dimension(628, 445));

        jTextAreaAgendado.setEditable(false);
        jTextAreaAgendado.setColumns(20);
        jTextAreaAgendado.setRows(5);
        jTextAreaAgendado.setText("Não há horário marcado.");
        jScrollPaneAgendado.setViewportView(jTextAreaAgendado);

        jLabelNovoAgendamento.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelNovoAgendamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNovoAgendamento.setText("Novo Agendamento");

        jButtonNovoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnNovoAgendamentoLayout = new javax.swing.GroupLayout(jPanelBtnNovoAgendamento);
        jPanelBtnNovoAgendamento.setLayout(jPanelBtnNovoAgendamentoLayout);
        jPanelBtnNovoAgendamentoLayout.setHorizontalGroup(
            jPanelBtnNovoAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNovoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonNovoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelBtnNovoAgendamentoLayout.setVerticalGroup(
            jPanelBtnNovoAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnNovoAgendamentoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelNovoAgendamento)
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(jButtonNovoAgendamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneAgendado)
                    .addComponent(jPanelBtnNovoAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jScrollPaneAgendado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanelBtnNovoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPaneAbas.addTab("tab2", jPanelInicio);

        jButtonDataHorario.setText("Data e Horário");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButtonMarcar.setText("Marcar");
        jButtonMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarActionPerformed(evt);
            }
        });

        jComboBoxFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um funcionário" }));

        jComboBoxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um corte" }));

        javax.swing.GroupLayout jPanelAgendamentoLayout = new javax.swing.GroupLayout(jPanelAgendamento);
        jPanelAgendamento.setLayout(jPanelAgendamentoLayout);
        jPanelAgendamentoLayout.setHorizontalGroup(
            jPanelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgendamentoLayout.createSequentialGroup()
                .addGroup(jPanelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAgendamentoLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(jPanelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMarcar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAgendamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDataHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jComboBoxFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanelAgendamentoLayout.setVerticalGroup(
            jPanelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgendamentoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDataHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonMarcar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPaneAbas.addTab("tab1", jPanelAgendamento);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        javax.swing.GroupLayout jPanelPerfilLayout = new javax.swing.GroupLayout(jPanelPerfil);
        jPanelPerfil.setLayout(jPanelPerfilLayout);
        jPanelPerfilLayout.setHorizontalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPerfilLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPerfilLayout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPerfilLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
        );
        jPanelPerfilLayout.setVerticalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGap(18, 18, 18)
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jTabbedPaneAbas.addTab("tab3", jPanelPerfil);

        javax.swing.GroupLayout jPanelDataEHoraLayout = new javax.swing.GroupLayout(jPanelDataEHora);
        jPanelDataEHora.setLayout(jPanelDataEHoraLayout);
        jPanelDataEHoraLayout.setHorizontalGroup(
            jPanelDataEHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanelDataEHoraLayout.setVerticalGroup(
            jPanelDataEHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        jTabbedPaneAbas.addTab("tab4", jPanelDataEHora);

        jPanelFundo.add(jTabbedPaneAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 620, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoAgendamentoActionPerformed

    private void jButtonMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMarcarActionPerformed

    private void JPanelBtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelBtnInicioMouseClicked

        // TODO add your handling code here:
        jTabbedPaneAbas.setSelectedIndex(0);
        controller.mostrarHorario(pessoa != null ? pessoa.getId() : 0);
        
    }//GEN-LAST:event_JPanelBtnInicioMouseClicked

    private void jPanelBtnAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnAgendamentoMouseClicked
        // TODO add your handling code here:
        jTabbedPaneAbas.setSelectedIndex(1);
    }//GEN-LAST:event_jPanelBtnAgendamentoMouseClicked

    private void JPanelBtnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelBtnInicioMouseEntered
        // TODO add your handling code here:
        JPanelBtnInicio.setBackground(new Color(121,121,121));
    }//GEN-LAST:event_JPanelBtnInicioMouseEntered

    private void JPanelBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelBtnInicioMouseExited
        // TODO add your handling code here:
        JPanelBtnInicio.setBackground(new Color(78,78,78));
    }//GEN-LAST:event_JPanelBtnInicioMouseExited

    private void jPanelBtnAgendamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnAgendamentoMouseExited
        // TODO add your handling code here:
        jPanelBtnAgendamento.setBackground(new Color(78,78,78));
    }//GEN-LAST:event_jPanelBtnAgendamentoMouseExited

    private void jPanelBtnAgendamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnAgendamentoMouseEntered
        // TODO add your handling code here:
        jPanelBtnAgendamento.setBackground(new Color(121,121,121));
    }//GEN-LAST:event_jPanelBtnAgendamentoMouseEntered

    private void jPanelBtnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnPerfilMouseEntered
        // TODO add your handling code here:
        jPanelBtnPerfil.setBackground(new Color(121,121,121));
    }//GEN-LAST:event_jPanelBtnPerfilMouseEntered

    private void jPanelBtnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnPerfilMouseExited
        // TODO add your handling code here:
        jPanelBtnPerfil.setBackground(new Color(78,78,78));
    }//GEN-LAST:event_jPanelBtnPerfilMouseExited

    private void jPanelBtnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnSairMouseEntered
        // TODO add your handling code here:
        jPanelBtnSair.setBackground(new Color(121,121,121));
    }//GEN-LAST:event_jPanelBtnSairMouseEntered

    private void jPanelBtnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnSairMouseExited
        // TODO add your handling code here:
        jPanelBtnSair.setBackground(new Color(78,78,78));
    }//GEN-LAST:event_jPanelBtnSairMouseExited

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
                ViewCliente cliente = new ViewCliente();
                cliente.setarCliente();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBtnInicio;
    private javax.swing.JButton jButtonDataHorario;
    private javax.swing.JButton jButtonMarcar;
    private javax.swing.JButton jButtonNovoAgendamento;
    private javax.swing.JComboBox<String> jComboBoxFuncionario;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIconCalendario;
    private javax.swing.JLabel jLabelIconInicio;
    private javax.swing.JLabel jLabelIconPerfil;
    private javax.swing.JLabel jLabelIconSair;
    private javax.swing.JLabel jLabelNovoAgendamento;
    private javax.swing.JLabel jLabelTituloAgendamento;
    private javax.swing.JLabel jLabelTituloInicio;
    private javax.swing.JLabel jLabelTituloPerfi;
    private javax.swing.JLabel jLabelTituloSair;
    private javax.swing.JPanel jPanelAgendamento;
    private javax.swing.JPanel jPanelBarraPanel;
    private javax.swing.JPanel jPanelBarraPrincipal;
    private javax.swing.JPanel jPanelBtnAgendamento;
    private javax.swing.JPanel jPanelBtnNovoAgendamento;
    private javax.swing.JPanel jPanelBtnPerfil;
    private javax.swing.JPanel jPanelBtnSair;
    private javax.swing.JPanel jPanelDataEHora;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneAgendado;
    private javax.swing.JTabbedPane jTabbedPaneAbas;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextAreaAgendado;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    
    public void setarCliente(){
        this.setLocationRelativeTo(null);
        this.setSize(850, 530);
        this.setResizable(false);
        this.setVisible(true);
        controller.mostrarHorario(pessoa != null ? pessoa.getId() : 0);
        controller.setarComboBoxFuncionario();
        controller.setarComboBoxServico();
    }

    public JTextArea getjTextArea1() {
        return jTextAreaAgendado;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextAreaAgendado = jTextArea1;
    }

    public JComboBox<String> getjComboBoxFuncionario() {
        return jComboBoxFuncionario;
    }

    public void setjComboBoxFuncionario(JComboBox<String> jComboBoxFuncionario) {
        this.jComboBoxFuncionario = jComboBoxFuncionario;
    }

    public JComboBox<String> getjComboBoxServico() {
        return jComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
        this.jComboBoxServico = jComboBoxServico;
    }

    
    
    
}
