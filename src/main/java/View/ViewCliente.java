package View;

import Controller.ClienteController;
import Model.Pessoa;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author geova
 */
public class ViewCliente extends javax.swing.JFrame {

    private JButton botaoAtual = null; // Armazena o botão atualmente clicado
    private final Pessoa pessoa;
    private final ClienteController controller;

    public ViewCliente(Pessoa pessoa) { //metodo do botão entrar
        initComponents();
        this.pessoa = pessoa;
        this.controller = new ClienteController(this);
        jPanelInicio.setVisible(true); // Torna o jPanel4 invisível inicialmente
        jPanelUsuario.setVisible(false);
        jPanelAgendamento.setVisible(false);
        jButtonInicio.setBackground(Color.YELLOW);

        botaoAtual = jButtonInicio; // Nenhum botão está selecionado inicialmente

    }

    public ViewCliente() { //metodo de teste
        initComponents();
        this.controller = new ClienteController(this);
        this.pessoa = null;
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
        jButtonInicio = new javax.swing.JButton();
        jButtonAgendamento = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelLogo = new javax.swing.JPanel();
        jPanelAbreBotao = new javax.swing.JPanel();
        jPanelAgendamento = new javax.swing.JPanel();
        jPanelBotoes = new javax.swing.JPanel();
        jPanelFuncionario2 = new javax.swing.JButton();
        jButtonFilial = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanelHorario1 = new javax.swing.JButton();
        jPanelServico = new javax.swing.JButton();
        jTextArea3 = new javax.swing.JTextArea();
        jButtonagendar1 = new javax.swing.JButton();
        jPanelDataHora = new javax.swing.JPanel();
        jPanel1Data1 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanelHora1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanelCortes = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonConfirmar = new javax.swing.JButton();
        jPanelFuncionario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelFilial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxFiliais = new javax.swing.JComboBox<>();
        jPanelUsuario = new javax.swing.JPanel();
        jPanelInicio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToggleButtonNovoAgendamento = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelDosBotaoLayout = new javax.swing.GroupLayout(jPanelDosBotao);
        jPanelDosBotao.setLayout(jPanelDosBotaoLayout);
        jPanelDosBotaoLayout.setHorizontalGroup(
            jPanelDosBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDosBotaoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanelDosBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDosBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        jPanelAbreBotao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAgendamento.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanelAgendamento.setLayout(new java.awt.CardLayout());

        jPanelFuncionario2.setText("Proficional");
        jPanelFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPanelFuncionario2ActionPerformed(evt);
            }
        });

        jButtonFilial.setText("Filial");
        jButtonFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilialActionPerformed(evt);
            }
        });

        jLabel10.setText("selecione os detalhes do seu Agendamento ");

        jPanelHorario1.setText("Horario");
        jPanelHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPanelHorario1ActionPerformed(evt);
            }
        });

        jPanelServico.setText("Serviços");
        jPanelServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPanelServicoActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Voce selecionou:\nFilial: X\nBarbeiro: X\nTipo: x\nHorario X\n");

        jButtonagendar1.setText("Agendar");

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelServico, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jButtonFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonagendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelServico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonagendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelAgendamento.add(jPanelBotoes, "card2");

        jPanelDataHora.setLayout(new java.awt.CardLayout());

        jButton10.setText("Horarios Disponiveis");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Selecione o dia ");

        javax.swing.GroupLayout jPanel1Data1Layout = new javax.swing.GroupLayout(jPanel1Data1);
        jPanel1Data1.setLayout(jPanel1Data1Layout);
        jPanel1Data1Layout.setHorizontalGroup(
            jPanel1Data1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Data1Layout.createSequentialGroup()
                .addGroup(jPanel1Data1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Data1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Data1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Data1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Data1Layout.setVerticalGroup(
            jPanel1Data1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Data1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDataHora.add(jPanel1Data1, "card3");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Horarios Disponiveis");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHora1Layout = new javax.swing.GroupLayout(jPanelHora1);
        jPanelHora1.setLayout(jPanelHora1Layout);
        jPanelHora1Layout.setHorizontalGroup(
            jPanelHora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHora1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanelHora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHora1Layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHora1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(113, 113, 113))))
        );
        jPanelHora1Layout.setVerticalGroup(
            jPanelHora1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHora1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDataHora.add(jPanelHora1, "card2");

        jPanelAgendamento.add(jPanelDataHora, "card3");

        jLabel9.setText("Selecione os Serviços");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCortesLayout = new javax.swing.GroupLayout(jPanelCortes);
        jPanelCortes.setLayout(jPanelCortesLayout);
        jPanelCortesLayout.setHorizontalGroup(
            jPanelCortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCortesLayout.createSequentialGroup()
                .addGroup(jPanelCortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCortesLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel9))
                    .addGroup(jPanelCortesLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanelCortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        jPanelCortesLayout.setVerticalGroup(
            jPanelCortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCortesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar)
                .addContainerGap())
        );

        jPanelAgendamento.add(jPanelCortes, "card4");

        jPanelFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Selecione um Proficional");
        jPanelFuncionario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 27, -1, -1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelFuncionario.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 92, -1, -1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanelFuncionario.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 92, -1, -1));

        jLabel3.setText("Geovanni");
        jPanelFuncionario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setText("Sevenini");
        jPanelFuncionario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jPanelAgendamento.add(jPanelFuncionario, "card5");

        jPanelFilial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Selecione uma das Filiais");
        jPanelFilial.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, -1));

        jComboBoxFiliais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barbaeria dfgdf" }));
        jPanelFilial.add(jComboBoxFiliais, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 93, 172, 64));

        jPanelAgendamento.add(jPanelFilial, "card6");

        jPanelAbreBotao.add(jPanelAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 390, -1));

        jPanelUsuario.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelAbreBotao.add(jPanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 390, -510));

        jPanelInicio.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Bem vindo a Barbearia X99");

        jLabel7.setText("Seus Agendamentos");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Não há horário marcado.");
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
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jToggleButtonNovoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanelAbreBotao.add(jPanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        jPanel4.add(jPanelAbreBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 390, 490));

        getContentPane().add(jPanel4, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void inicializarPaineis() {
        jPanelAgendamento.add(jPanelFilial);
        jPanelAgendamento.add(jPanelFuncionario2);
        jPanelAgendamento.add(jPanelServico);
        jPanelAgendamento.add(jPanelDataHora);
        jPanelAgendamento.add(jPanelCortes);

        // Define a visibilidade inicial dos painéis
        mostrarPainel("Inicio"); // Ou qualquer painel que você deseja exibir inicialmente
    }
    private void mostrarPainel(String painelParaMostrar) {
        // Oculta todos os painéis
        jPanelFilial.setVisible(false);
        jPanelFuncionario2.setVisible(false);
        jPanelServico.setVisible(false);
        jPanelDataHora.setVisible(false);
        jPanelCortes.setVisible(false);
        
        // Mostra o painel especificado
        switch (painelParaMostrar) {
            case "Filial":
                jPanelFilial.setVisible(true);
                break;
            case "Funcionario":
                jPanelFuncionario2.setVisible(true);
                break;
            case "Servico":
                jPanelServico.setVisible(true);
                break;
            case "DataHora":
                jPanelDataHora.setVisible(true);
                break;
            case "Cortes":
                jPanelCortes.setVisible(true);
                break;
            case "Inicio":
                // Caso de visibilidade inicial ou padrão
                break;
            default:
                // Caso nenhum painel seja especificado
                break;
        }
        
        jPanelAgendamento.revalidate();
        jPanelAgendamento.repaint();
    }
    private void resetarCoresDosBotoes() {
        jButtonInicio.setBackground(null); // Define a cor padrão
        jButtonAgendamento.setBackground(null); // Define a cor padrão
        jButtonPerfil.setBackground(null); // Define a cor padrão
    }

    

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        // TODO add your handling code here:
        // Restaura a cor do botão anteriormente clicado
        if (botaoAtual != null) {
            botaoAtual.setBackground(null);
        }
        controller.mostrarHorario(pessoa != null ? pessoa.getId() : 0);

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

        jPanelAgendamento.revalidate();
        jPanelAgendamento.repaint();
    }//GEN-LAST:event_jToggleButtonNovoAgendamentoActionPerformed

    private void jButtonFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilialActionPerformed
        // TODO add your handling code here:
        mostrarPainel("Filial");
    }//GEN-LAST:event_jButtonFilialActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jPanelHora1.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jPanelFuncionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPanelFuncionario2ActionPerformed
        // TODO add your handling code here:
        mostrarPainel("Funcionario");
    }//GEN-LAST:event_jPanelFuncionario2ActionPerformed

    private void jPanelServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPanelServicoActionPerformed
        // TODO add your handling code here:
        mostrarPainel("Servico");
    }//GEN-LAST:event_jPanelServicoActionPerformed

    private void jPanelHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPanelHorario1ActionPerformed
        // TODO add your handling code here:
        mostrarPainel("DataHora");
    }//GEN-LAST:event_jPanelHorario1ActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirmarActionPerformed


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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButtonAgendamento;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonFilial;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonagendar1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBoxFiliais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel1Data1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAbreBotao;
    private javax.swing.JPanel jPanelAgendamento;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelCortes;
    private javax.swing.JPanel jPanelDataHora;
    private javax.swing.JPanel jPanelDosBotao;
    private javax.swing.JPanel jPanelFilial;
    private javax.swing.JPanel jPanelFuncionario;
    private javax.swing.JButton jPanelFuncionario2;
    private javax.swing.JPanel jPanelHora1;
    private javax.swing.JButton jPanelHorario1;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JButton jPanelServico;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JToggleButton jToggleButtonNovoAgendamento;
    // End of variables declaration//GEN-END:variables
    public void setarCliente() {
        this.setLocationRelativeTo(null);
        //this.setSize(700, 610);
        this.setResizable(false);
        this.setVisible(true);
        controller.mostrarHorario(pessoa.getId());
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

}
