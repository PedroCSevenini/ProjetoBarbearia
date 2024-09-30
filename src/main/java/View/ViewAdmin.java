/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AdminController;
import Model.Pessoa;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;

public class ViewAdmin extends javax.swing.JFrame {

    private final AdminController controller;
    private Pessoa admin;
    private JTable tabelaVerUsuario;
    private Color colorDefaultInicio;
    private Color colorDefaultCortes;
    private Color colorDefaultPessoas ;
    private Color colorDefaultFuncionarios ;

    public ViewAdmin(Pessoa admin) {
        this.admin = admin;
        initComponents();
        this.controller = new AdminController(this);
        initTableListenersCortes();
        initTableListenersClientes();
        this.tabelaVerUsuario = null;
        initTableListenersFuncionarios();
        colorDefaultInicio = new Color(121,121,121);
        JPanelBtnInicio.setBackground(colorDefaultInicio);
        colorDefaultCortes = new Color(78,78,78);
        colorDefaultPessoas = new Color(78,78,78);
        colorDefaultFuncionarios = new Color(78,78,78);
        
    }

    public ViewAdmin() {
        initComponents();
        this.controller = new AdminController(this);
        this.admin = null;
        initTableListenersCortes();
        initTableListenersClientes();
        this.tabelaVerUsuario = null;
        initTableListenersFuncionarios();
        colorDefaultInicio = new Color(121,121,121);
        JPanelBtnInicio.setBackground(colorDefaultInicio);
        colorDefaultCortes = new Color(78,78,78);
        colorDefaultPessoas = new Color(78,78,78);
        colorDefaultFuncionarios = new Color(78,78,78);
    }

    public JTable getjTableClientes() {
        return jTableClientes;
    }

    public void setjTableClientes(JTable jTableClientes) {
        this.jTableClientes = jTableClientes;
    }

    public JTable getjTableCortes() {
        return jTableServico;
    }

    public void setjTableCortes(JTable jTableCortes) {
        this.jTableServico = jTableCortes;
    }

    public JTable getjTableFuncionarios() {
        return jTableFuncionarios;
    }

    public void setjTableFuncionarios(JTable jTableFuncionarios) {
        this.jTableFuncionarios = jTableFuncionarios;
    }

    public JTextField getjTextFieldDataNascimento() {
        return jTextFieldFunNovaDataNascimento;
    }

    public void setjTextFieldDataNascimento(JTextField jTextFieldDataNascimento) {
        this.jTextFieldFunNovaDataNascimento = jTextFieldDataNascimento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelBarraPrincipal = new javax.swing.JPanel();
        JPanelBtnInicio = new javax.swing.JPanel();
        jLabelIconInicio = new javax.swing.JLabel();
        jLabelTituloInicio = new javax.swing.JLabel();
        jPanelBtnCortes = new javax.swing.JPanel();
        jLabelIconCalendario = new javax.swing.JLabel();
        jLabelTituloServicosPainel = new javax.swing.JLabel();
        jPanelBtnClientes = new javax.swing.JPanel();
        jLabelIconPerfil = new javax.swing.JLabel();
        jLabelTituloPerfi = new javax.swing.JLabel();
        jPanelBtnSair = new javax.swing.JPanel();
        jLabelIconSair = new javax.swing.JLabel();
        jLabelTituloSair = new javax.swing.JLabel();
        jPanelBtnFuncionarios = new javax.swing.JPanel();
        jLabelTituloPerfi2 = new javax.swing.JLabel();
        jLabelIconPerfil1 = new javax.swing.JLabel();
        jPanelBarraPanel = new javax.swing.JPanel();
        jLabelTituloPrincipal = new javax.swing.JLabel();
        jTabbedEdiFun = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelCortes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServico = new javax.swing.JTable();
        jButtonEditarServico = new javax.swing.JButton();
        jButtonNovoServicoAba = new javax.swing.JButton();
        jButtonRemoverServico = new javax.swing.JButton();
        jPanelClientes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonRemoverCliente = new javax.swing.JButton();
        jButtonEditarCliente = new javax.swing.JButton();
        jButtonVerUsuarioCliente = new javax.swing.JButton();
        jLabelAvisoClientes = new javax.swing.JLabel();
        jPanelAdicionaFuncionario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFunNovoNome = new javax.swing.JTextField();
        jTextFieldFunNovaDataNascimento = new javax.swing.JTextField();
        jTextFieldFunNovoTelefone = new javax.swing.JTextField();
        jTextFieldFunNovoEmail = new javax.swing.JTextField();
        jButtonAdcNovoFun = new javax.swing.JButton();
        jLabelAvisoNovoFuncionario = new javax.swing.JLabel();
        jLabelEditarUsuario2 = new javax.swing.JLabel();
        jTextFieldFunNovaSenha = new javax.swing.JTextField();
        jLabelEditarUsuario3 = new javax.swing.JLabel();
        jTextFieldFunNovoUsuario = new javax.swing.JTextField();
        jButtonAdcNovoVoltar = new javax.swing.JButton();
        jPanelAdicionaCorte = new javax.swing.JPanel();
        jLabelNovoServicoNome = new javax.swing.JLabel();
        jTextFieldNovoServicoNome = new javax.swing.JTextField();
        jLabelNovoServicoValor = new javax.swing.JLabel();
        jTextFieldNovoServicoValor = new javax.swing.JTextField();
        jLabelNovoServicoDuracao = new javax.swing.JLabel();
        jTextFieldNovoServicoDuracao = new javax.swing.JTextField();
        jButtonNovoServico = new javax.swing.JButton();
        jButtonNovoServicoVoltar = new javax.swing.JButton();
        jLabelAvisoNovoServico = new javax.swing.JLabel();
        jPanelFuncionarios = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jButtonEditarFun = new javax.swing.JButton();
        jButtonRemoverFun = new javax.swing.JButton();
        jButtonNovoFun = new javax.swing.JButton();
        jButtonUsuarioFun = new javax.swing.JButton();
        jLabelAvisoFuncionario = new javax.swing.JLabel();
        jPanelEditarServicos = new javax.swing.JPanel();
        jTextFieldEditarServicoNome = new javax.swing.JTextField();
        jTextFieldEditarServicoValor = new javax.swing.JTextField();
        jLabelEditarServicoValor = new javax.swing.JLabel();
        jLabelEditarServicoNome = new javax.swing.JLabel();
        jButtonConfirmarEditarServico = new javax.swing.JButton();
        jButtonCancelarEditarServico = new javax.swing.JButton();
        jLabelAvisoEditarServico = new javax.swing.JLabel();
        jPanelEditarClientes = new javax.swing.JPanel();
        jLabelEditarClienteNome = new javax.swing.JLabel();
        jTextFieldEditarClienteNome = new javax.swing.JTextField();
        jLabelEditarClienteTelefone = new javax.swing.JLabel();
        jTextFieldEditarClienteTelefone = new javax.swing.JTextField();
        jLabelEditarClienteDataNasc = new javax.swing.JLabel();
        jTextFieldEditarClienteDataNasc = new javax.swing.JTextField();
        jLabelEditarClienteEmail = new javax.swing.JLabel();
        jTextFieldEditarClienteEmail = new javax.swing.JTextField();
        jButtonEditarClienteConfirmar = new javax.swing.JButton();
        jButtonEditarClienteVoltar = new javax.swing.JButton();
        jLabelEditarClienteAviso = new javax.swing.JLabel();
        jPanelEditarUsuario = new javax.swing.JPanel();
        jLabelEditarUsuario = new javax.swing.JLabel();
        jTextFieldEditarUsuario = new javax.swing.JTextField();
        jLabelEditarUsuarioSenha = new javax.swing.JLabel();
        jButtonEditarUsuarioConfirmar = new javax.swing.JButton();
        jButtonEditarUsuarioVoltar = new javax.swing.JButton();
        jTextFieldEditarUsuarioSenha = new javax.swing.JPasswordField();
        jLabelEditarUsuarioAviso = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelEditarUsuario1 = new javax.swing.JLabel();
        jTextFieldEditarUsuario1 = new javax.swing.JTextField();
        jLabelEditarUsuarioSenha1 = new javax.swing.JLabel();
        jTextFieldEditarUsuarioSenha1 = new javax.swing.JPasswordField();
        jButtonEditarUsuarioConfirmar1 = new javax.swing.JButton();
        jButtonEditarUsuarioVoltar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelEditarClienteNome1 = new javax.swing.JLabel();
        jTextFieldEditarFuncionariosNome = new javax.swing.JTextField();
        jLabelEditarClienteTelefone1 = new javax.swing.JLabel();
        jTextFieldEditarFuncionariosData = new javax.swing.JTextField();
        jLabelEditarClienteDataNasc1 = new javax.swing.JLabel();
        jTextFieldEditarFuncionariosEmail = new javax.swing.JTextField();
        jLabelEditarClienteEmail1 = new javax.swing.JLabel();
        jTextFieldEditarFuncionariosTele = new javax.swing.JTextField();
        jButtonEditarFuncionariosConfirmar = new javax.swing.JButton();
        jButtonEditarFuncionariosVoltar = new javax.swing.JButton();
        jLabelEditarFuncionarioAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraPrincipal.setBackground(new java.awt.Color(31, 31, 31));
        jPanelBarraPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelBtnInicio.setBackground(new java.awt.Color(78, 78, 78));
        JPanelBtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelBtnInicio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JPanelBtnInicioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
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
        JPanelBtnInicio.add(jLabelTituloInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 50));

        jPanelBarraPrincipal.add(JPanelBtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 50));

        jPanelBtnCortes.setBackground(new java.awt.Color(78, 78, 78));
        jPanelBtnCortes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBtnCortes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBtnCortesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBtnCortesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBtnCortesMouseExited(evt);
            }
        });
        jPanelBtnCortes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/calendario.png"))); // NOI18N
        jPanelBtnCortes.add(jLabelIconCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabelTituloServicosPainel.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTituloServicosPainel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTituloServicosPainel.setForeground(new java.awt.Color(235, 235, 235));
        jLabelTituloServicosPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloServicosPainel.setText("Serviços");
        jPanelBtnCortes.add(jLabelTituloServicosPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 110, 50));

        jPanelBarraPrincipal.add(jPanelBtnCortes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 50));

        jPanelBtnClientes.setBackground(new java.awt.Color(78, 78, 78));
        jPanelBtnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBtnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBtnClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBtnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBtnClientesMouseExited(evt);
            }
        });
        jPanelBtnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/usuario.png"))); // NOI18N
        jPanelBtnClientes.add(jLabelIconPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabelTituloPerfi.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTituloPerfi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTituloPerfi.setForeground(new java.awt.Color(235, 235, 235));
        jLabelTituloPerfi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloPerfi.setText("Clientes");
        jPanelBtnClientes.add(jLabelTituloPerfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 70, 50));

        jPanelBarraPrincipal.add(jPanelBtnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 50));

        jPanelBtnSair.setBackground(new java.awt.Color(78, 78, 78));
        jPanelBtnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBtnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBtnSairMouseClicked(evt);
            }
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
        jPanelBtnSair.add(jLabelTituloSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 32));

        jPanelBarraPrincipal.add(jPanelBtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 230, 50));

        jPanelBtnFuncionarios.setBackground(new java.awt.Color(78, 78, 78));
        jPanelBtnFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelBtnFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBtnFuncionariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBtnFuncionariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBtnFuncionariosMouseExited(evt);
            }
        });

        jLabelTituloPerfi2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTituloPerfi2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabelTituloPerfi2.setForeground(new java.awt.Color(235, 235, 235));
        jLabelTituloPerfi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloPerfi2.setText("Funcionários");

        jLabelIconPerfil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPerfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanelBtnFuncionariosLayout = new javax.swing.GroupLayout(jPanelBtnFuncionarios);
        jPanelBtnFuncionarios.setLayout(jPanelBtnFuncionariosLayout);
        jPanelBtnFuncionariosLayout.setHorizontalGroup(
            jPanelBtnFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnFuncionariosLayout.createSequentialGroup()
                .addComponent(jLabelIconPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloPerfi2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanelBtnFuncionariosLayout.setVerticalGroup(
            jPanelBtnFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnFuncionariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelBtnFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTituloPerfi2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIconPerfil1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        jPanelBarraPrincipal.add(jPanelBtnFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 50));

        jPanelFundo.add(jPanelBarraPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 530));

        jPanelBarraPanel.setBackground(new java.awt.Color(120, 120, 120));
        jPanelBarraPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelBarraPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloPrincipal.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabelTituloPrincipal.setForeground(new java.awt.Color(235, 235, 235));
        jLabelTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloPrincipal.setText("Início");
        jPanelBarraPanel.add(jLabelTituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 90));

        jPanelFundo.add(jPanelBarraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 620, 90));

        jTabbedEdiFun.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedEdiFunAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanelInicio.setEnabled(false);
        jPanelInicio.setPreferredSize(new java.awt.Dimension(628, 445));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bem-vindo, Admin");

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
        );

        jTabbedEdiFun.addTab("Inicio", jPanelInicio);

        jPanelCortes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanelCortesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTableServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PREÇO", "DURAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableServico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableServico.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableServico);
        if (jTableServico.getColumnModel().getColumnCount() > 0) {
            jTableServico.getColumnModel().getColumn(0).setMinWidth(30);
            jTableServico.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableServico.getColumnModel().getColumn(1).setMaxWidth(100);
            jTableServico.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableServico.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTableServico.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jButtonEditarServico.setText("Editar");
        jButtonEditarServico.setEnabled(false);
        jButtonEditarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarServicoActionPerformed(evt);
            }
        });

        jButtonNovoServicoAba.setText("Novo");
        jButtonNovoServicoAba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoServicoAbaActionPerformed(evt);
            }
        });

        jButtonRemoverServico.setText("Remover");
        jButtonRemoverServico.setEnabled(false);
        jButtonRemoverServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCortesLayout = new javax.swing.GroupLayout(jPanelCortes);
        jPanelCortes.setLayout(jPanelCortesLayout);
        jPanelCortesLayout.setHorizontalGroup(
            jPanelCortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCortesLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(jPanelCortesLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButtonNovoServicoAba, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButtonEditarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jButtonRemoverServico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanelCortesLayout.setVerticalGroup(
            jPanelCortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCortesLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanelCortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoServicoAba, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemoverServico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jTabbedEdiFun.addTab("Cortes", jPanelCortes);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "Data de Nascimento", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTableClientes);
        if (jTableClientes.getColumnModel().getColumnCount() > 0) {
            jTableClientes.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableClientes.getColumnModel().getColumn(1).setMaxWidth(150);
            jTableClientes.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableClientes.getColumnModel().getColumn(3).setMaxWidth(120);
            jTableClientes.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jButtonRemoverCliente.setText("Remover ");
        jButtonRemoverCliente.setEnabled(false);
        jButtonRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverClienteActionPerformed(evt);
            }
        });

        jButtonEditarCliente.setText("Editar");
        jButtonEditarCliente.setEnabled(false);
        jButtonEditarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarClienteMouseClicked(evt);
            }
        });
        jButtonEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClienteActionPerformed(evt);
            }
        });

        jButtonVerUsuarioCliente.setText("Usuário");
        jButtonVerUsuarioCliente.setEnabled(false);
        jButtonVerUsuarioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerUsuarioClienteActionPerformed(evt);
            }
        });

        jLabelAvisoClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAvisoClientes.setForeground(new java.awt.Color(255, 0, 51));
        jLabelAvisoClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButtonEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonVerUsuarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonRemoverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabelAvisoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarCliente)
                    .addComponent(jButtonRemoverCliente)
                    .addComponent(jButtonVerUsuarioCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAvisoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedEdiFun.addTab("Clientes", jPanelClientes);

        jLabel6.setText("Nome");

        jLabel7.setText("Data Nascimento");

        jLabel8.setText("Telefone");

        jLabel9.setText("Email");

        jTextFieldFunNovoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFunNovoTelefoneActionPerformed(evt);
            }
        });

        jTextFieldFunNovoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFunNovoEmailActionPerformed(evt);
            }
        });

        jButtonAdcNovoFun.setText("Adicionar");
        jButtonAdcNovoFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdcNovoFunActionPerformed(evt);
            }
        });

        jLabelAvisoNovoFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAvisoNovoFuncionario.setForeground(new java.awt.Color(255, 0, 51));
        jLabelAvisoNovoFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelEditarUsuario2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarUsuario2.setText("Usuário");

        jTextFieldFunNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFunNovaSenhaActionPerformed(evt);
            }
        });

        jLabelEditarUsuario3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarUsuario3.setText("Senha");

        jTextFieldFunNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFunNovoUsuarioActionPerformed(evt);
            }
        });

        jButtonAdcNovoVoltar.setText("Voltar");
        jButtonAdcNovoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdcNovoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdicionaFuncionarioLayout = new javax.swing.GroupLayout(jPanelAdicionaFuncionario);
        jPanelAdicionaFuncionario.setLayout(jPanelAdicionaFuncionarioLayout);
        jPanelAdicionaFuncionarioLayout.setHorizontalGroup(
            jPanelAdicionaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionaFuncionarioLayout.createSequentialGroup()
                .addGroup(jPanelAdicionaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdicionaFuncionarioLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(jPanelAdicionaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEditarUsuario3)
                            .addGroup(jPanelAdicionaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelAdicionaFuncionarioLayout.createSequentialGroup()
                                    .addComponent(jButtonAdcNovoFun)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAdcNovoVoltar))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelEditarUsuario2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldFunNovoEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(jTextFieldFunNovoTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldFunNovaDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldFunNovoNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldFunNovaSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldFunNovoUsuario, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanelAdicionaFuncionarioLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabelAvisoNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanelAdicionaFuncionarioLayout.setVerticalGroup(
            jPanelAdicionaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionaFuncionarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFunNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFunNovaDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFunNovoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFunNovoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEditarUsuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFunNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEditarUsuario3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFunNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAvisoNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdcNovoFun)
                    .addComponent(jButtonAdcNovoVoltar))
                .addContainerGap())
        );

        jTabbedEdiFun.addTab("Adi Fun", jPanelAdicionaFuncionario);

        jLabelNovoServicoNome.setText("Nome ");

        jLabelNovoServicoValor.setText("Valor");

        jLabelNovoServicoDuracao.setText("Tempo (1 = 15 minutos)");

        jButtonNovoServico.setText("Novo Corte");
        jButtonNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoServicoActionPerformed(evt);
            }
        });

        jButtonNovoServicoVoltar.setText("Cancelar");
        jButtonNovoServicoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoServicoVoltarActionPerformed(evt);
            }
        });

        jLabelAvisoNovoServico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAvisoNovoServico.setForeground(new java.awt.Color(255, 0, 51));
        jLabelAvisoNovoServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelAdicionaCorteLayout = new javax.swing.GroupLayout(jPanelAdicionaCorte);
        jPanelAdicionaCorte.setLayout(jPanelAdicionaCorteLayout);
        jPanelAdicionaCorteLayout.setHorizontalGroup(
            jPanelAdicionaCorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionaCorteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAdicionaCorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNovoServicoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNovoServicoDuracao)
                    .addComponent(jLabelNovoServicoValor)
                    .addComponent(jLabelNovoServicoNome)
                    .addGroup(jPanelAdicionaCorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldNovoServicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNovoServicoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAdicionaCorteLayout.createSequentialGroup()
                        .addComponent(jButtonNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNovoServicoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(183, 183, 183))
            .addGroup(jPanelAdicionaCorteLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabelAvisoNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanelAdicionaCorteLayout.setVerticalGroup(
            jPanelAdicionaCorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionaCorteLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabelNovoServicoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNovoServicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNovoServicoValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNovoServicoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNovoServicoDuracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNovoServicoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabelAvisoNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdicionaCorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoServico)
                    .addComponent(jButtonNovoServicoVoltar))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedEdiFun.addTab("Adi Corte", jPanelAdicionaCorte);

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane5.setViewportView(jTableFuncionarios);
        if (jTableFuncionarios.getColumnModel().getColumnCount() > 0) {
            jTableFuncionarios.getColumnModel().getColumn(0).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(1).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(2).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(3).setResizable(false);
            jTableFuncionarios.getColumnModel().getColumn(4).setResizable(false);
        }

        jButtonEditarFun.setText("Editar");
        jButtonEditarFun.setEnabled(false);
        jButtonEditarFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarFunMouseClicked(evt);
            }
        });
        jButtonEditarFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFunActionPerformed(evt);
            }
        });

        jButtonRemoverFun.setText("Remover");
        jButtonRemoverFun.setEnabled(false);
        jButtonRemoverFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverFunActionPerformed(evt);
            }
        });

        jButtonNovoFun.setText("Novo");
        jButtonNovoFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoFunActionPerformed(evt);
            }
        });

        jButtonUsuarioFun.setText("Usuário");
        jButtonUsuarioFun.setEnabled(false);
        jButtonUsuarioFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioFunActionPerformed(evt);
            }
        });

        jLabelAvisoFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAvisoFuncionario.setForeground(new java.awt.Color(255, 0, 51));
        jLabelAvisoFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelFuncionariosLayout = new javax.swing.GroupLayout(jPanelFuncionarios);
        jPanelFuncionarios.setLayout(jPanelFuncionariosLayout);
        jPanelFuncionariosLayout.setHorizontalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionariosLayout.createSequentialGroup()
                        .addComponent(jButtonEditarFun, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemoverFun, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNovoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUsuarioFun, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAvisoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanelFuncionariosLayout.setVerticalGroup(
            jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionariosLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelAvisoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarFun)
                    .addComponent(jButtonRemoverFun)
                    .addComponent(jButtonUsuarioFun)
                    .addComponent(jButtonNovoFun))
                .addContainerGap())
        );

        jTabbedEdiFun.addTab("Funcionarios", jPanelFuncionarios);

        jTextFieldEditarServicoNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldEditarServicoValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarServicoValor.setText("Valor: (xx,xx)");

        jLabelEditarServicoNome.setText("Nome");

        jButtonConfirmarEditarServico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonConfirmarEditarServico.setText("Confirmar");
        jButtonConfirmarEditarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarEditarServicoActionPerformed(evt);
            }
        });

        jButtonCancelarEditarServico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonCancelarEditarServico.setText("Voltar");
        jButtonCancelarEditarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarEditarServicoActionPerformed(evt);
            }
        });

        jLabelAvisoEditarServico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAvisoEditarServico.setForeground(new java.awt.Color(255, 0, 51));
        jLabelAvisoEditarServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelEditarServicosLayout = new javax.swing.GroupLayout(jPanelEditarServicos);
        jPanelEditarServicos.setLayout(jPanelEditarServicosLayout);
        jPanelEditarServicosLayout.setHorizontalGroup(
            jPanelEditarServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarServicosLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanelEditarServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarServicosLayout.createSequentialGroup()
                        .addGroup(jPanelEditarServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEditarServicoNome)
                            .addComponent(jLabelEditarServicoValor)
                            .addComponent(jTextFieldEditarServicoValor, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jTextFieldEditarServicoNome)
                            .addGroup(jPanelEditarServicosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButtonConfirmarEditarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelarEditarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarServicosLayout.createSequentialGroup()
                        .addComponent(jLabelAvisoEditarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanelEditarServicosLayout.setVerticalGroup(
            jPanelEditarServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarServicosLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabelEditarServicoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEditarServicoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEditarServicoValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEditarServicoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAvisoEditarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelEditarServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarEditarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarEditarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedEdiFun.addTab("Editar Cortes", jPanelEditarServicos);

        jLabelEditarClienteNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteNome.setText("Nome");

        jTextFieldEditarClienteNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarClienteTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteTelefone.setText("Telefone");

        jTextFieldEditarClienteTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarClienteDataNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteDataNasc.setText("Data de Nascimento");

        jTextFieldEditarClienteDataNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarClienteEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteEmail.setText("Email");

        jTextFieldEditarClienteEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButtonEditarClienteConfirmar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEditarClienteConfirmar.setText("Confirmar");
        jButtonEditarClienteConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClienteConfirmarActionPerformed(evt);
            }
        });

        jButtonEditarClienteVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEditarClienteVoltar.setText("Voltar");
        jButtonEditarClienteVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClienteVoltarActionPerformed(evt);
            }
        });

        jLabelEditarClienteAviso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteAviso.setForeground(new java.awt.Color(255, 0, 51));
        jLabelEditarClienteAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelEditarClientesLayout = new javax.swing.GroupLayout(jPanelEditarClientes);
        jPanelEditarClientes.setLayout(jPanelEditarClientesLayout);
        jPanelEditarClientesLayout.setHorizontalGroup(
            jPanelEditarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEditarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEditarClienteEmail)
                    .addComponent(jTextFieldEditarClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarClienteDataNasc)
                    .addComponent(jTextFieldEditarClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarClienteTelefone)
                    .addComponent(jTextFieldEditarClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarClienteNome)
                    .addComponent(jTextFieldEditarClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEditarClientesLayout.createSequentialGroup()
                        .addComponent(jButtonEditarClienteConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarClienteVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(191, 191, 191))
            .addGroup(jPanelEditarClientesLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabelEditarClienteAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanelEditarClientesLayout.setVerticalGroup(
            jPanelEditarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarClientesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelEditarClienteNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEditarClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEditarClienteTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEditarClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEditarClienteDataNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEditarClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEditarClienteEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEditarClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEditarClienteAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanelEditarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarClienteConfirmar)
                    .addComponent(jButtonEditarClienteVoltar))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedEdiFun.addTab("Edi Clie", jPanelEditarClientes);

        jLabelEditarUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarUsuario.setText("Usuário");

        jTextFieldEditarUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarUsuarioSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarUsuarioSenha.setText("Senha");

        jButtonEditarUsuarioConfirmar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEditarUsuarioConfirmar.setText("Confirmar");
        jButtonEditarUsuarioConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarUsuarioConfirmarActionPerformed(evt);
            }
        });

        jButtonEditarUsuarioVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEditarUsuarioVoltar.setText("Voltar");
        jButtonEditarUsuarioVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarUsuarioVoltarActionPerformed(evt);
            }
        });

        jLabelEditarUsuarioAviso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarUsuarioAviso.setForeground(new java.awt.Color(255, 0, 51));
        jLabelEditarUsuarioAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelEditarUsuarioLayout = new javax.swing.GroupLayout(jPanelEditarUsuario);
        jPanelEditarUsuario.setLayout(jPanelEditarUsuarioLayout);
        jPanelEditarUsuarioLayout.setHorizontalGroup(
            jPanelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarUsuarioLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(jPanelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldEditarUsuarioSenha)
                    .addComponent(jLabelEditarUsuarioSenha)
                    .addComponent(jLabelEditarUsuario)
                    .addGroup(jPanelEditarUsuarioLayout.createSequentialGroup()
                        .addComponent(jButtonEditarUsuarioConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarUsuarioVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldEditarUsuario))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(jPanelEditarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEditarUsuarioAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEditarUsuarioLayout.setVerticalGroup(
            jPanelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarUsuarioLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabelEditarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEditarUsuarioSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldEditarUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEditarUsuarioAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarUsuarioConfirmar)
                    .addComponent(jButtonEditarUsuarioVoltar))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedEdiFun.addTab("tab9", jPanelEditarUsuario);

        jLabelEditarUsuario1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarUsuario1.setText("Usuário");

        jTextFieldEditarUsuario1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarUsuarioSenha1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarUsuarioSenha1.setText("Senha");

        jButtonEditarUsuarioConfirmar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEditarUsuarioConfirmar1.setText("Confirmar");
        jButtonEditarUsuarioConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarUsuarioConfirmar1ActionPerformed(evt);
            }
        });

        jButtonEditarUsuarioVoltar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEditarUsuarioVoltar1.setText("Voltar");
        jButtonEditarUsuarioVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarUsuarioVoltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEditarUsuarioConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditarUsuarioVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelEditarUsuarioSenha1)
                        .addComponent(jLabelEditarUsuario1)
                        .addComponent(jTextFieldEditarUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addComponent(jTextFieldEditarUsuarioSenha1)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabelEditarUsuario1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEditarUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEditarUsuarioSenha1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEditarUsuarioSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarUsuarioConfirmar1)
                    .addComponent(jButtonEditarUsuarioVoltar1))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedEdiFun.addTab("tab10", jPanel1);

        jLabelEditarClienteNome1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteNome1.setText("Nome");

        jTextFieldEditarFuncionariosNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarClienteTelefone1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteTelefone1.setText("Telefone");

        jTextFieldEditarFuncionariosData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarClienteDataNasc1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteDataNasc1.setText("Data de Nascimento");

        jTextFieldEditarFuncionariosEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelEditarClienteEmail1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarClienteEmail1.setText("Email");

        jTextFieldEditarFuncionariosTele.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButtonEditarFuncionariosConfirmar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEditarFuncionariosConfirmar.setText("Confirmar");
        jButtonEditarFuncionariosConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFuncionariosConfirmarActionPerformed(evt);
            }
        });

        jButtonEditarFuncionariosVoltar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEditarFuncionariosVoltar.setText("Voltar");
        jButtonEditarFuncionariosVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFuncionariosVoltarActionPerformed(evt);
            }
        });

        jLabelEditarFuncionarioAviso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditarFuncionarioAviso.setForeground(new java.awt.Color(255, 0, 51));
        jLabelEditarFuncionarioAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEditarClienteDataNasc1)
                    .addComponent(jTextFieldEditarFuncionariosNome, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarClienteNome1)
                    .addComponent(jTextFieldEditarFuncionariosData, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarClienteTelefone1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonEditarFuncionariosConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarFuncionariosVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldEditarFuncionariosTele, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditarFuncionariosEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditarClienteEmail1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jLabelEditarFuncionarioAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabelEditarClienteNome1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEditarFuncionariosNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEditarClienteTelefone1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEditarFuncionariosTele, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEditarClienteDataNasc1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEditarFuncionariosData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEditarClienteEmail1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEditarFuncionariosEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEditarFuncionarioAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarFuncionariosConfirmar)
                    .addComponent(jButtonEditarFuncionariosVoltar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedEdiFun.addTab("EdiFun", jPanel2);

        jPanelFundo.add(jTabbedEdiFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 620, 510));

        getContentPane().add(jPanelFundo, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPanelBtnInicioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JPanelBtnInicioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JPanelBtnInicioAncestorAdded

    private void JPanelBtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelBtnInicioMouseClicked

        // TODO add your handling code here:
        jTabbedEdiFun.setSelectedIndex(0);
        colorDefaultInicio = new Color(121, 121, 121);
        colorDefaultCortes = new Color(78, 78, 78);
        colorDefaultPessoas = new Color(78, 78, 78);
        colorDefaultFuncionarios = new Color(78, 78, 78);
        JPanelBtnInicio.setBackground(colorDefaultInicio);
        jPanelBtnCortes.setBackground(colorDefaultCortes);
        jPanelBtnClientes.setBackground(colorDefaultPessoas);
        jPanelBtnFuncionarios.setBackground(colorDefaultFuncionarios);
        jLabelTituloPrincipal.setText("Início");


    }//GEN-LAST:event_JPanelBtnInicioMouseClicked

    private void JPanelBtnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelBtnInicioMouseEntered
        // TODO add your handling code here:
        JPanelBtnInicio.setBackground(new Color(121, 121, 121));
    }//GEN-LAST:event_JPanelBtnInicioMouseEntered

    private void JPanelBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelBtnInicioMouseExited

        JPanelBtnInicio.setBackground(colorDefaultInicio);
    }//GEN-LAST:event_JPanelBtnInicioMouseExited

    private void jPanelBtnCortesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnCortesMouseClicked
        // TODO add your handling code here:

        jTabbedEdiFun.setSelectedIndex(1);
        colorDefaultInicio = new Color(78, 78, 78);
        colorDefaultCortes = new Color(121, 121, 121);
        colorDefaultPessoas = new Color(78, 78, 78);
        colorDefaultFuncionarios = new Color(78, 78, 78);
        JPanelBtnInicio.setBackground(colorDefaultInicio);
        jPanelBtnCortes.setBackground(colorDefaultCortes);
        jPanelBtnClientes.setBackground(colorDefaultPessoas);
        jPanelBtnFuncionarios.setBackground(colorDefaultFuncionarios);
        jLabelTituloPrincipal.setText("Serviços");
        controller.atualizaTabelas();

    }//GEN-LAST:event_jPanelBtnCortesMouseClicked

    private void jPanelBtnCortesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnCortesMouseEntered
        // TODO add your handling code here:
        jPanelBtnCortes.setBackground(new Color(121, 121, 121));
    }//GEN-LAST:event_jPanelBtnCortesMouseEntered

    private void jPanelBtnCortesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnCortesMouseExited
        // TODO add your handling code here:
        jPanelBtnCortes.setBackground(colorDefaultCortes);
    }//GEN-LAST:event_jPanelBtnCortesMouseExited

    private void jPanelBtnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnClientesMouseClicked

        jTabbedEdiFun.setSelectedIndex(2);
        colorDefaultInicio = new Color(78, 78, 78);
        colorDefaultCortes = new Color(78, 78, 78);
        colorDefaultPessoas = new Color(121, 121, 121);
        colorDefaultFuncionarios = new Color(78, 78, 78);
        JPanelBtnInicio.setBackground(colorDefaultInicio);
        jPanelBtnCortes.setBackground(colorDefaultCortes);
        jPanelBtnClientes.setBackground(colorDefaultPessoas);
        jPanelBtnFuncionarios.setBackground(colorDefaultFuncionarios);
        jLabelTituloPrincipal.setText("Clientes");

    }//GEN-LAST:event_jPanelBtnClientesMouseClicked

    private void jPanelBtnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnClientesMouseEntered
        // TODO add your handling code here:
        jPanelBtnClientes.setBackground(new Color(121, 121, 121));
    }//GEN-LAST:event_jPanelBtnClientesMouseEntered

    private void jPanelBtnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnClientesMouseExited
        // TODO add your handling code here:
        jPanelBtnClientes.setBackground(colorDefaultPessoas);
    }//GEN-LAST:event_jPanelBtnClientesMouseExited

    private void jPanelBtnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnSairMouseEntered
        // TODO add your handling code here:
        jPanelBtnSair.setBackground(new Color(121, 121, 121));
    }//GEN-LAST:event_jPanelBtnSairMouseEntered

    private void jPanelBtnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnSairMouseExited
        // TODO add your handling code here:
        jPanelBtnSair.setBackground(new Color(78, 78, 78));
    }//GEN-LAST:event_jPanelBtnSairMouseExited

    private void jPanelBtnFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnFuncionariosMouseClicked
        // TODO add your handling code here:
        jTabbedEdiFun.setSelectedIndex(5);
        colorDefaultInicio = new Color(78, 78, 78);
        colorDefaultCortes = new Color(78, 78, 78);
        colorDefaultPessoas = new Color(78, 78, 78);
        colorDefaultFuncionarios = new Color(121, 121, 121);
        JPanelBtnInicio.setBackground(colorDefaultInicio);
        jPanelBtnCortes.setBackground(colorDefaultCortes);
        jPanelBtnClientes.setBackground(colorDefaultPessoas);
        jPanelBtnFuncionarios.setBackground(colorDefaultFuncionarios);
        jLabelTituloPrincipal.setText("Funcionários");
    }//GEN-LAST:event_jPanelBtnFuncionariosMouseClicked

    private void jTabbedEdiFunAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedEdiFunAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedEdiFunAncestorAdded

    private void jTextFieldFunNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFunNovoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFunNovoUsuarioActionPerformed

    private void jTextFieldFunNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFunNovaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFunNovaSenhaActionPerformed

    private void jButtonAdcNovoFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdcNovoFunActionPerformed
        // TODO add your handling code here:
        controller.adicionarNovoFuncionario();

    }//GEN-LAST:event_jButtonAdcNovoFunActionPerformed

    private void jTextFieldFunNovoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFunNovoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFunNovoEmailActionPerformed

    private void jTextFieldFunNovoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFunNovoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFunNovoTelefoneActionPerformed

    private void jButtonEditarFuncionariosVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFuncionariosVoltarActionPerformed
        // TODO add your handling code here:
        controller.voltarParaFuncionarios();
    }//GEN-LAST:event_jButtonEditarFuncionariosVoltarActionPerformed

    private void jButtonEditarFuncionariosConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFuncionariosConfirmarActionPerformed
        // TODO add your handling code here:
        controller.editarFuncionario();
    }//GEN-LAST:event_jButtonEditarFuncionariosConfirmarActionPerformed

    private void jButtonEditarUsuarioVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarUsuarioVoltar1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonEditarUsuarioVoltar1ActionPerformed

    private void jButtonEditarUsuarioConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarUsuarioConfirmar1ActionPerformed
        // TODO add your handling code here:
        controller.editarUsuario(tabelaVerUsuario);
    }//GEN-LAST:event_jButtonEditarUsuarioConfirmar1ActionPerformed

    private void jButtonEditarUsuarioVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarUsuarioVoltarActionPerformed
        controller.voltarParaFuncionarios();
    }//GEN-LAST:event_jButtonEditarUsuarioVoltarActionPerformed

    private void jButtonEditarUsuarioConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarUsuarioConfirmarActionPerformed
        controller.editarUsuario(tabelaVerUsuario);
    }//GEN-LAST:event_jButtonEditarUsuarioConfirmarActionPerformed

    private void jButtonEditarClienteVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClienteVoltarActionPerformed
        controller.voltarParaClientes();
    }//GEN-LAST:event_jButtonEditarClienteVoltarActionPerformed

    private void jButtonEditarClienteConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClienteConfirmarActionPerformed
        controller.editarCliente();
    }//GEN-LAST:event_jButtonEditarClienteConfirmarActionPerformed

    private void jButtonCancelarEditarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarEditarServicoActionPerformed
        controller.voltarParaCortes();
    }//GEN-LAST:event_jButtonCancelarEditarServicoActionPerformed

    private void jButtonConfirmarEditarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarEditarServicoActionPerformed
        controller.editarServico();
    }//GEN-LAST:event_jButtonConfirmarEditarServicoActionPerformed

    private void jButtonUsuarioFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioFunActionPerformed
        // TODO add your handling code here:
        jTabbedEdiFun.setSelectedIndex(8);
        tabelaVerUsuario = jTableFuncionarios;
        controller.atualizaLabelEditarUsuario(Integer.parseInt(jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 0).toString()));
    }//GEN-LAST:event_jButtonUsuarioFunActionPerformed

    private void jButtonNovoFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoFunActionPerformed
        // TODO add your handling code here:
        jTabbedEdiFun.setSelectedIndex(3);
    }//GEN-LAST:event_jButtonNovoFunActionPerformed

    private void jButtonRemoverFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverFunActionPerformed
        // TODO add your handling code here:
        controller.apagarFuncionario();
    }//GEN-LAST:event_jButtonRemoverFunActionPerformed

    private void jButtonEditarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFunActionPerformed
        // TODO add your handling code here:
        jTabbedEdiFun.setSelectedIndex(10);
        controller.atualizaLabelEditarFuncionarios();
    }//GEN-LAST:event_jButtonEditarFunActionPerformed

    private void jButtonEditarFunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarFunMouseClicked

        //controller.editarFuncionario();
    }//GEN-LAST:event_jButtonEditarFunMouseClicked

    private void jButtonNovoServicoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoServicoVoltarActionPerformed
        controller.voltarParaCortes();
        controller.limparNovoServico();
    }//GEN-LAST:event_jButtonNovoServicoVoltarActionPerformed

    private void jButtonNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoServicoActionPerformed
        controller.adicionarNovoServico();
    }//GEN-LAST:event_jButtonNovoServicoActionPerformed

    private void jButtonVerUsuarioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerUsuarioClienteActionPerformed
        jTabbedEdiFun.setSelectedIndex(8);
        tabelaVerUsuario = jTableClientes;
        controller.atualizaLabelEditarUsuario(Integer.parseInt(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 0).toString()));

    }//GEN-LAST:event_jButtonVerUsuarioClienteActionPerformed

    private void jButtonEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClienteActionPerformed
        jTabbedEdiFun.setSelectedIndex(7);
        controller.atualizaLabelEditarCliente();
    }//GEN-LAST:event_jButtonEditarClienteActionPerformed

    private void jButtonEditarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarClienteMouseClicked

        //controller.editarCliente();
    }//GEN-LAST:event_jButtonEditarClienteMouseClicked

    private void jButtonRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverClienteActionPerformed
        controller.apagarCliente();
    }//GEN-LAST:event_jButtonRemoverClienteActionPerformed

    private void jPanelCortesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanelCortesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelCortesAncestorAdded

    private void jButtonRemoverServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverServicoActionPerformed
        controller.apagarServico();
    }//GEN-LAST:event_jButtonRemoverServicoActionPerformed

    private void jButtonNovoServicoAbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoServicoAbaActionPerformed
        jTabbedEdiFun.setSelectedIndex(4);
        controller.limparNovoServico();
    }//GEN-LAST:event_jButtonNovoServicoAbaActionPerformed

    private void jButtonEditarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarServicoActionPerformed
        // TODO add your handling code here:
        jTabbedEdiFun.setSelectedIndex(6);
        controller.atualizaLabelEditarServico();
        mostrarAvisoEditarServico("");
    }//GEN-LAST:event_jButtonEditarServicoActionPerformed

    private void jButtonAdcNovoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdcNovoVoltarActionPerformed
        // TODO add your handling code here:
        controller.voltarParaFuncionarios();
    }//GEN-LAST:event_jButtonAdcNovoVoltarActionPerformed

    private void jPanelBtnFuncionariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnFuncionariosMouseEntered
        // TODO add your handling code here:
        jPanelBtnFuncionarios.setBackground(new Color(121, 121, 121));
    }//GEN-LAST:event_jPanelBtnFuncionariosMouseEntered

    private void jPanelBtnFuncionariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnFuncionariosMouseExited
        // TODO add your handling code here:
        jPanelBtnFuncionarios.setBackground(colorDefaultFuncionarios);
    }//GEN-LAST:event_jPanelBtnFuncionariosMouseExited

    private void jPanelBtnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBtnSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanelBtnSairMouseClicked

    public JLabel getjLabelAvisoFuncionario() {
        return jLabelAvisoFuncionario;
    }



    public JTextField getjTextFieldFunNovaSenha() {
        return jTextFieldFunNovaSenha;
    }

    public JTextField getjTextFieldFunNovoUsuario() {
        return jTextFieldFunNovoUsuario;
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
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewAdmin view = new ViewAdmin();
                view.setarAdmin();
                view.atualizaTabela();

            }
        });

    }

    public void setarAdmin() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.atualizaTabela();
        this.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBtnInicio;
    private javax.swing.JButton jButtonAdcNovoFun;
    private javax.swing.JButton jButtonAdcNovoVoltar;
    private javax.swing.JButton jButtonCancelarEditarServico;
    private javax.swing.JButton jButtonConfirmarEditarServico;
    private javax.swing.JButton jButtonEditarCliente;
    private javax.swing.JButton jButtonEditarClienteConfirmar;
    private javax.swing.JButton jButtonEditarClienteVoltar;
    private javax.swing.JButton jButtonEditarFun;
    private javax.swing.JButton jButtonEditarFuncionariosConfirmar;
    private javax.swing.JButton jButtonEditarFuncionariosVoltar;
    private javax.swing.JButton jButtonEditarServico;
    private javax.swing.JButton jButtonEditarUsuarioConfirmar;
    private javax.swing.JButton jButtonEditarUsuarioConfirmar1;
    private javax.swing.JButton jButtonEditarUsuarioVoltar;
    private javax.swing.JButton jButtonEditarUsuarioVoltar1;
    private javax.swing.JButton jButtonNovoFun;
    private javax.swing.JButton jButtonNovoServico;
    private javax.swing.JButton jButtonNovoServicoAba;
    private javax.swing.JButton jButtonNovoServicoVoltar;
    private javax.swing.JButton jButtonRemoverCliente;
    private javax.swing.JButton jButtonRemoverFun;
    private javax.swing.JButton jButtonRemoverServico;
    private javax.swing.JButton jButtonUsuarioFun;
    private javax.swing.JButton jButtonVerUsuarioCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAvisoClientes;
    private javax.swing.JLabel jLabelAvisoEditarServico;
    private javax.swing.JLabel jLabelAvisoFuncionario;
    private javax.swing.JLabel jLabelAvisoNovoFuncionario;
    private javax.swing.JLabel jLabelAvisoNovoServico;
    private javax.swing.JLabel jLabelEditarClienteAviso;
    private javax.swing.JLabel jLabelEditarClienteDataNasc;
    private javax.swing.JLabel jLabelEditarClienteDataNasc1;
    private javax.swing.JLabel jLabelEditarClienteEmail;
    private javax.swing.JLabel jLabelEditarClienteEmail1;
    private javax.swing.JLabel jLabelEditarClienteNome;
    private javax.swing.JLabel jLabelEditarClienteNome1;
    private javax.swing.JLabel jLabelEditarClienteTelefone;
    private javax.swing.JLabel jLabelEditarClienteTelefone1;
    private javax.swing.JLabel jLabelEditarFuncionarioAviso;
    private javax.swing.JLabel jLabelEditarServicoNome;
    private javax.swing.JLabel jLabelEditarServicoValor;
    private javax.swing.JLabel jLabelEditarUsuario;
    private javax.swing.JLabel jLabelEditarUsuario1;
    private javax.swing.JLabel jLabelEditarUsuario2;
    private javax.swing.JLabel jLabelEditarUsuario3;
    private javax.swing.JLabel jLabelEditarUsuarioAviso;
    private javax.swing.JLabel jLabelEditarUsuarioSenha;
    private javax.swing.JLabel jLabelEditarUsuarioSenha1;
    private javax.swing.JLabel jLabelIconCalendario;
    private javax.swing.JLabel jLabelIconInicio;
    private javax.swing.JLabel jLabelIconPerfil;
    private javax.swing.JLabel jLabelIconPerfil1;
    private javax.swing.JLabel jLabelIconSair;
    private javax.swing.JLabel jLabelNovoServicoDuracao;
    private javax.swing.JLabel jLabelNovoServicoNome;
    private javax.swing.JLabel jLabelNovoServicoValor;
    private javax.swing.JLabel jLabelTituloInicio;
    private javax.swing.JLabel jLabelTituloPerfi;
    private javax.swing.JLabel jLabelTituloPerfi2;
    private javax.swing.JLabel jLabelTituloPrincipal;
    private javax.swing.JLabel jLabelTituloSair;
    private javax.swing.JLabel jLabelTituloServicosPainel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAdicionaCorte;
    private javax.swing.JPanel jPanelAdicionaFuncionario;
    private javax.swing.JPanel jPanelBarraPanel;
    private javax.swing.JPanel jPanelBarraPrincipal;
    private javax.swing.JPanel jPanelBtnClientes;
    private javax.swing.JPanel jPanelBtnCortes;
    private javax.swing.JPanel jPanelBtnFuncionarios;
    private javax.swing.JPanel jPanelBtnSair;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelCortes;
    private javax.swing.JPanel jPanelEditarClientes;
    private javax.swing.JPanel jPanelEditarServicos;
    private javax.swing.JPanel jPanelEditarUsuario;
    private javax.swing.JPanel jPanelFuncionarios;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedEdiFun;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTable jTableServico;
    private javax.swing.JTextField jTextFieldEditarClienteDataNasc;
    private javax.swing.JTextField jTextFieldEditarClienteEmail;
    private javax.swing.JTextField jTextFieldEditarClienteNome;
    private javax.swing.JTextField jTextFieldEditarClienteTelefone;
    private javax.swing.JTextField jTextFieldEditarFuncionariosData;
    private javax.swing.JTextField jTextFieldEditarFuncionariosEmail;
    private javax.swing.JTextField jTextFieldEditarFuncionariosNome;
    private javax.swing.JTextField jTextFieldEditarFuncionariosTele;
    private javax.swing.JTextField jTextFieldEditarServicoNome;
    private javax.swing.JTextField jTextFieldEditarServicoValor;
    private javax.swing.JTextField jTextFieldEditarUsuario;
    private javax.swing.JTextField jTextFieldEditarUsuario1;
    private javax.swing.JPasswordField jTextFieldEditarUsuarioSenha;
    private javax.swing.JPasswordField jTextFieldEditarUsuarioSenha1;
    private javax.swing.JTextField jTextFieldFunNovaDataNascimento;
    private javax.swing.JTextField jTextFieldFunNovaSenha;
    private javax.swing.JTextField jTextFieldFunNovoEmail;
    private javax.swing.JTextField jTextFieldFunNovoNome;
    private javax.swing.JTextField jTextFieldFunNovoTelefone;
    private javax.swing.JTextField jTextFieldFunNovoUsuario;
    private javax.swing.JTextField jTextFieldNovoServicoDuracao;
    private javax.swing.JTextField jTextFieldNovoServicoNome;
    private javax.swing.JTextField jTextFieldNovoServicoValor;
    // End of variables declaration//GEN-END:variables

    public void atualizaTabela() {
        controller.adicionaCamposTabelaServico();
        controller.adicionaCamposTabaleaFuncionario();
        controller.adicionaCamposTabelaCliente();
    }

//    public void atualizaTabela(){
//        controller.adicionaCamposTabelaCortes();
//    }
//    
//    private void initTableListenersConfirmados() {
//        TabelaConfirmados.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {        
//            if (!event.getValueIsAdjusting()) {
//                int selectedRow = TabelaConfirmados.getSelectedRow();
//                
//                if (selectedRow >= 0) {
//                    Remover.setEnabled(true);
//                    Editar.setEnabled(true);
//                    Confirmar.setEnabled(false);
//                    Rejeitar.setEnabled(false);
//                    TabelaPendentes.clearSelection();
//                    controller.atualizaCamposConfirmados();
//                    
//                }
//            }
//        });
    public JTable getjTableServico() {
        return jTableServico;

    }

    public JTextField getjTextFieldEditarServicoNome() {
        return jTextFieldEditarServicoNome;
    }

    public JLabel getjLabelAvisoEditarServico() {
        return jLabelAvisoEditarServico;
    }

    public JTextField getjTextFieldFunNovaDataNascimento() {
        return jTextFieldFunNovaDataNascimento;
    }

    public JTextField getjTextFieldFunNovoTelefone() {
        return jTextFieldFunNovoTelefone;
    }

    public JTextField getjTextFieldFunNovoEmail() {
        return jTextFieldFunNovoEmail;
    }

    public JTextField getjTextFieldFunNovoNome() {
        return jTextFieldFunNovoNome;
    }

    public JLabel getjLabelAvisoNovoFuncionario() {
        return jLabelAvisoNovoFuncionario;
    }

    public JLabel getjLabelEditarUsuarioAviso() {
        return jLabelEditarUsuarioAviso;
    }

    
    public JTextField getjTextFieldNovoServicoDuracao() {
        return jTextFieldNovoServicoDuracao;
    }

    public JLabel getjLabelAvisoClientes() {
        return jLabelAvisoClientes;
    }

    public JLabel getjLabelEditarClienteAviso() {
        return jLabelEditarClienteAviso;
    }

    public JLabel getjLabelEditarFuncionarioAviso() {
        return jLabelEditarFuncionarioAviso;
    }

    public JTextField getjTextFieldNovoServicoNome() {
        return jTextFieldNovoServicoNome;
    }

    public JTextField getjTextFieldNovoServicoValor() {
        return jTextFieldNovoServicoValor;
    }

    public JTextField getjTextFieldEditarServicoValor() {
        return jTextFieldEditarServicoValor;
    }

    public JTextField getjTextFieldEditarUsuario() {
        return jTextFieldEditarUsuario;
    }

    public JTextField getjTextFieldEditarUsuarioSenha() {
        return jTextFieldEditarUsuarioSenha;
    }

    public JTextField getjTextFieldEditarClienteDataNasc() {
        return jTextFieldEditarClienteDataNasc;
    }

    public JTextField getjTextFieldEditarClienteEmail() {
        return jTextFieldEditarClienteEmail;
    }

    public JTextField getjTextFieldEditarClienteNome() {
        return jTextFieldEditarClienteNome;
    }

    public JTextField getjTextFieldEditarClienteTelefone() {
        return jTextFieldEditarClienteTelefone;
    }

    public JButton getjButtonEditarServico() {
        return jButtonEditarServico;
    }

    public JButton getjButtonRemoverServico() {
        return jButtonRemoverServico;
    }

    public JTabbedPane getjTabbedPaneMenu() {
        return jTabbedEdiFun;
    }

    public void mostrarAvisoEditarServico(String mensagem) {
        jLabelAvisoEditarServico.setText(mensagem);
    }

    public void mostrarAvisoNovoServico(String mensagem) {
        jLabelAvisoNovoServico.setText(mensagem);
    }

    public JButton getjButtonEditarCliente() {
        return jButtonEditarCliente;
    }

    public JButton getjButtonEditarClienteConfirmar() {
        return jButtonEditarClienteConfirmar;
    }

    public JButton getjButtonEditarClienteVoltar() {
        return jButtonEditarClienteVoltar;
    }

    public JButton getjButtonRemoverCliente() {
        return jButtonRemoverCliente;
    }

    public JTextField getjTextFieldEditarFuncionariosData() {
        return jTextFieldEditarFuncionariosData;
    }

    public JTextField getjTextFieldEditarFuncionariosEmail() {
        return jTextFieldEditarFuncionariosEmail;
    }

    public JTextField getjTextFieldEditarFuncionariosNome() {
        return jTextFieldEditarFuncionariosNome;
    }

    public JTextField getjTextFieldEditarFuncionariosTele() {
        return jTextFieldEditarFuncionariosTele;
    }

 

    public JButton getjButtonVerUsuario() {
        return jButtonVerUsuarioCliente;
    }
    

    private void initTableListenersCortes() {
        jTableServico.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = jTableServico.getSelectedRow();
                jButtonEditarServico.setEnabled(false);
                jButtonRemoverServico.setEnabled(false);
                
                if (selectedRow >= 0) {
                    jButtonEditarServico.setEnabled(true);
                    jButtonRemoverServico.setEnabled(true);
                    
                }
            }
        });
    }

    private void initTableListenersClientes() {
        jTableClientes.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = jTableClientes.getSelectedRow();
                jButtonEditarCliente.setEnabled(false);
                jButtonRemoverCliente.setEnabled(false);
                jButtonVerUsuarioCliente.setEnabled(false);
                if (selectedRow >= 0) {
                    jButtonEditarCliente.setEnabled(true);
                    jButtonRemoverCliente.setEnabled(true);
                    jButtonVerUsuarioCliente.setEnabled(true);
                }
            }
        });
    }
    private void initTableListenersFuncionarios() {
        jTableFuncionarios.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            if (!event.getValueIsAdjusting()) {
                int selectedRow = jTableFuncionarios.getSelectedRow();
                jButtonEditarFun.setEnabled(false);
                jButtonRemoverFun.setEnabled(false);
                jButtonUsuarioFun.setEnabled(false);
                if (selectedRow >= 0) {
                    jButtonEditarFun.setEnabled(true);
                    jButtonRemoverFun.setEnabled(true);
                    jButtonUsuarioFun.setEnabled(true);
                }
            }
        });
    }
}
