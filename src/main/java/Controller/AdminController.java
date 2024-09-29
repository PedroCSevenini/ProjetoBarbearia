package Controller;

import BDO.PessoaBanco;
import BDO.ServicoBanco;
import BDO.UsuarioBanco;
import Controller.Helper.Validador;
import Exception.*;
import Model.Cliente;
import Model.Funcionario;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;
import View.ViewAdmin;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminController {

    private final ViewAdmin view;

    public AdminController(ViewAdmin view) {
        this.view = view;
    }

    public void adicionaCamposTabelaServico() {
        DefaultTableModel model = (DefaultTableModel) view.getjTableCortes().getModel();

        model.setRowCount(0);
        ServicoBanco bd = new ServicoBanco();
        try {
            List<Servico> servicosAdmin = bd.retornaServicos();
            for (Servico servico : servicosAdmin) {

                model.addRow(new Object[]{
                    servico.getId(),
                    servico.getNome(),
                    servico.getPreco(),
                    servico.getDuracao()});
            }
            int tamanho = model.getRowCount() * 20;
            view.getjTableCortes().setPreferredSize(new java.awt.Dimension(view.getjTableCortes().getWidth(), tamanho));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void adicionaCamposTabaleaFuncionario() {
        DefaultTableModel model = (DefaultTableModel) view.getjTableFuncionarios().getModel();

        model.setRowCount(0);
        PessoaBanco bd = new PessoaBanco();

        try {
            List<Pessoa> FuncionarioAdmin = bd.retornaPessoas();
            for (Pessoa funcionario : FuncionarioAdmin) {
                if (funcionario.getNivelAcesso() == 2) {
                    model.addRow(new Object[]{
                        funcionario.getId(),
                        funcionario.getNome(),
                        funcionario.getDataNasc(),
                        funcionario.getTelefone(),
                        funcionario.getEmail(),});
                }
            }
            // Ajusta o tamanho da tabela de funcionários
            int tamanho = model.getRowCount() * 20;
            view.getjTableFuncionarios().setPreferredSize(new java.awt.Dimension(view.getjTableFuncionarios().getWidth(), tamanho));

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void adicionaCamposTabelaCliente() {
        DefaultTableModel model = (DefaultTableModel) view.getjTableClientes().getModel();

        model.setRowCount(0); // Limpa a tabela antes de adicionar os novos funcionários
        PessoaBanco bd = new PessoaBanco();

        try {
            List<Pessoa> ClienteAdmin = bd.retornaPessoas(); // Obtém todas as pessoas
            for (Pessoa cliente : ClienteAdmin) {
                if (cliente.getNivelAcesso() == 1) {
                    model.addRow(new Object[]{
                        cliente.getId(),
                        cliente.getNome(),
                        cliente.getDataNasc(),
                        cliente.getTelefone(),
                        cliente.getEmail(),});
                }
            }
            // Ajusta o tamanho da tabela de funcionários
            int tamanho = model.getRowCount() * 20;
            view.getjTableClientes().setPreferredSize(new java.awt.Dimension(view.getjTableClientes().getWidth(), tamanho));

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void atualizaLabelEditarCliente() {
        PessoaBanco bd = new PessoaBanco();
        int selectedRow = view.getjTableClientes().getSelectedRow();
        int idCliente = Integer.parseInt(view.getjTableClientes().getValueAt(selectedRow, 0).toString());
        Cliente clienteId = bd.procuraClientePorID(idCliente);
        view.getjTextFieldEditarClienteNome().setText(clienteId.getNome());
        view.getjTextFieldEditarClienteTelefone().setText(clienteId.getTelefone());
        
        view.getjTextFieldEditarClienteDataNasc().setText(clienteId.getDataNasc());
        view.getjTextFieldEditarClienteEmail().setText(clienteId.getEmail());
    }
    public void atualizaLabelEditarFuncionarios() {
        PessoaBanco bd = new PessoaBanco();
        int selectedRow = view.getjTableFuncionarios().getSelectedRow();
        int idFuncionarios = Integer.parseInt(view.getjTableFuncionarios().getValueAt(selectedRow, 0).toString());
        Funcionario pessoaId = bd.procuraFuncionarioPorID(idFuncionarios);
        System.out.println(pessoaId.getNome());
        System.out.println(pessoaId.getDataNasc());
        System.out.println(pessoaId.getDataNasc());
        view.getjTextFieldEditarFuncionariosNome().setText(pessoaId.getNome());
        view.getjTextFieldEditarFuncionariosTele().setText(pessoaId.getTelefone());
        
        view.getjTextFieldEditarFuncionariosData().setText(pessoaId.getDataNasc());
        view.getjTextFieldEditarFuncionariosEmail().setText(pessoaId.getEmail());
    }


    public void editarCliente() {
        PessoaBanco bdPessoa = new PessoaBanco();
        String nome = view.getjTextFieldEditarClienteNome().getText();
        String telefone = view.getjTextFieldEditarClienteTelefone().getText();
        String email = view.getjTextFieldEditarClienteEmail().getText();
        String dataNasc = view.getjTextFieldEditarClienteDataNasc().getText();

        try {
            Validador validador = new Validador();

            validador.validaNome(nome);
            validador.validaTelefone(telefone);
            validador.validaEmail(email);
            validador.validaDataNasc(dataNasc);

            int selectedRow = view.getjTableClientes().getSelectedRow();
            int idCliente = Integer.parseInt(view.getjTableClientes().getValueAt(selectedRow, 0).toString());

            bdPessoa.editarCliente(idCliente, nome, telefone, email, dataNasc);

            view.getjLabelEditarClienteAviso().setText("Cliente editado!");

        } catch (NomeException | TelefoneException | EmailException | DataNascException e) {

            view.getjLabelEditarClienteAviso().setText(e.getMessage());
        }
    }

    public void apagarCliente() {
        PessoaBanco bdPessoa = new PessoaBanco();
        try {
            int selectedRow = view.getjTableClientes().getSelectedRow();
            int idCliente = Integer.parseInt(view.getjTableClientes().getValueAt(selectedRow, 0).toString());
            Object[] options = {"Sim", "Cancelar"};
            int opcao = JOptionPane.showOptionDialog(
                    null,
                    "Deseja remover esse Cliente? \n Ao remover o serviço você irá remover todos horários relacionados a ele e seu usuário",
                    "Confirmação de Remoção",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    options,
                    options[0]
            );
            if (opcao == JOptionPane.YES_OPTION) {
                bdPessoa.removeCliente(idCliente);
                view.getjLabelAvisoClientes().setText("Cliente removido!");
                atualizaTabelas();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Nenhum valor selecionado!");
        }
    }

//TABELA SERVICO
    public void atualizaLabelEditarServico() {
        ServicoBanco bd = new ServicoBanco();
        int selectedRow = view.getjTableServico().getSelectedRow();
        int idServico = Integer.parseInt(view.getjTableServico().getValueAt(selectedRow, 0).toString());
        Servico servicoId = bd.procuraServicoPorID(idServico);
        view.getjTextFieldEditarServicoNome().setText(servicoId.getNome());
        view.getjTextFieldEditarServicoValor().setText(servicoId.getPreco());

    }


    public void adicionarNovoServico() {
        String nome = view.getjTextFieldNovoServicoNome().getText();
        String valor = view.getjTextFieldNovoServicoValor().getText();
        int duracao;

        try {
            duracao = Integer.parseInt(view.getjTextFieldNovoServicoDuracao().getText());
            if (duracao < 1 || duracao > 40) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            view.mostrarAvisoNovoServico("Duração deve ser um número inteiro entre 1 e 40.");
            return;
        }

        try {
            if (Validador.verificaNomeServico(nome) && Validador.verificaValorServico(valor)) {
                ServicoBanco banco = new ServicoBanco();
                if (banco.adicionarServico(nome, valor, duracao)) {
                    view.mostrarAvisoNovoServico("Serviço adicionado com sucesso!");
                    limparNovoServico(); // Limpa o formulário
                } else {
                    view.mostrarAvisoNovoServico("Erro ao adicionar o serviço...");
                }
            }
        } catch (NomeServicoException | ValorServicoException e) {
            view.mostrarAvisoNovoServico(e.getMessage());
        } catch (Exception e) {
            view.mostrarAvisoNovoServico("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }

    public void editarServico() {
        String nome = view.getjTextFieldEditarServicoNome().getText();
        String valor = view.getjTextFieldEditarServicoValor().getText();

        try {
            if (Validador.verificaNomeServico(nome) && Validador.verificaValorServico(valor)) {
                ServicoBanco banco = new ServicoBanco();

                int selectedRow = view.getjTableCortes().getSelectedRow();
                if (selectedRow == -1) {
                    view.mostrarAvisoEditarServico("Nenhum serviço selecionado.");
                    return;
                }

                int idServico = Integer.parseInt(view.getjTableCortes().getValueAt(selectedRow, 0).toString());
                if (banco.editarServico(idServico, nome, valor)) {
                    view.mostrarAvisoEditarServico("Serviço editado com sucesso!");
                } else {
                    view.mostrarAvisoEditarServico("Erro ao editar o serviço...");
                }
            }
        } catch (NomeServicoException | ValorServicoException e) {
            view.mostrarAvisoEditarServico(e.getMessage());
        } catch (NumberFormatException e) {
            view.mostrarAvisoEditarServico("Erro ao converter ID do serviço.");
        } catch (Exception e) {
            view.mostrarAvisoEditarServico("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }

    public void apagarServico() {
        ServicoBanco bdServico = new ServicoBanco();
        try {
            int selectedRow = view.getjTableCortes().getSelectedRow();
            int idServico = Integer.parseInt(view.getjTableCortes().getValueAt(selectedRow, 0).toString());
            Object[] options = {"Sim", "Cancelar"};
            int opcao = JOptionPane.showOptionDialog(
                    null,
                    "Deseja remover esse Serviço? Ao remover o serviço você irá remover todos horários relacionados a ele",
                    "Confirmação de Remoção",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    options,
                    options[0]
            );
            if (opcao == JOptionPane.YES_OPTION) {
                bdServico.removerServicoPorID(idServico);
                view.mostrarAvisoEditarServico("Serviço removido!");
                atualizaTabelas();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Nenhum valor selecionado!");
        }
    }

    public void limparNovoServico() {
        view.getjTextFieldNovoServicoNome().setText("");
        view.getjTextFieldNovoServicoValor().setText("");
        view.getjTextFieldNovoServicoDuracao().setText("");
    }
    //USUARIO

    public void atualizaLabelEditarUsuario(int idUsuario) {
        UsuarioBanco bd = new UsuarioBanco();
        Usuario usuarioId = bd.buscaUsuarioPorId(idUsuario);
        view.getjTextFieldEditarUsuario().setText(usuarioId.getUsuario());
        view.getjTextFieldEditarUsuarioSenha().setText(usuarioId.getSenha());

    }

    public void editarUsuario(JTable tabela) {
        UsuarioBanco bd = new UsuarioBanco();
        String usuario = view.getjTextFieldEditarUsuario().getText();
        String senha = view.getjTextFieldEditarUsuarioSenha().getText();
        

        try {
            Validador validador = new Validador();
            
            validador.validaUsuario(usuario);
            validador.validaSenha(senha);
            

            int selectedRow = tabela.getSelectedRow();
            int idUsuario = Integer.parseInt(tabela.getValueAt(selectedRow, 0).toString());

            bd.editaUsuarioPorId(idUsuario, usuario, senha);

            view.getjLabelEditarUsuarioAviso().setText("Usuário editado!");

        } catch (UsuarioException | SenhaException e) {

            view.getjLabelEditarUsuarioAviso().setText(e.getMessage());
        }

    }

    //Fim verificação Serviço
    public void voltarParaCortes() {
        resetarBotoesGerais();
        atualizaTabelas();
        view.getjTabbedPaneMenu().setSelectedIndex(1);
    }

    public void voltarParaClientes() {
        resetarBotoesGerais();
        atualizaTabelas();
        view.getjTabbedPaneMenu().setSelectedIndex(2);

    }
    public void voltarParaFuncionarios() {
        resetarBotoesGerais();
        atualizaTabelas();
        view.getjTabbedPaneMenu().setSelectedIndex(5);

    }

    public void resetarBotoesGerais() {
        view.getjButtonEditarServico().setEnabled(false);
        view.getjButtonRemoverServico().setEnabled(false);
        view.getjButtonEditarCliente().setEnabled(false);
        view.getjButtonRemoverCliente().setEnabled(false);
        view.getjButtonVerUsuario().setEnabled(false);
    }

    public void atualizaTabelas() {
        adicionaCamposTabelaServico();
        adicionaCamposTabelaCliente();
        adicionaCamposTabaleaFuncionario();
    }

}
