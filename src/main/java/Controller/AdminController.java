/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BDO.PessoaBanco;
import BDO.ServicoBanco;
import Model.Cliente;
import Model.Funcionario;
import Model.Pessoa;
import Model.Servico;
import View.ViewAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminController {

    private final ViewAdmin view;

    public AdminController(ViewAdmin view) {
        this.view = view;
    }

    public void adicionaCamposTabelaCortes() {
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
                    servico.getDuracao(),
                    servico.getDesc(),});
            }
            int tamanho = model.getRowCount() * 20;
            view.getjTableCortes().setPreferredSize(new java.awt.Dimension(view.getjTableCortes().getWidth(), tamanho));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void adicionaCamposFuncionarios() {
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
                        funcionario.getNivelAcesso(),
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

    public void adicionaCamposClientes() {
        DefaultTableModel model = (DefaultTableModel) view.getjTableClientes().getModel();

        model.setRowCount(0); // Limpa a tabela antes de adicionar os novos funcionários
        PessoaBanco bd = new PessoaBanco();

        try {
            List<Pessoa> FuncionarioAdmin = bd.retornaPessoas(); // Obtém todas as pessoas
            for (Pessoa funcionario : FuncionarioAdmin) {
                if (funcionario.getNivelAcesso() == 1) {
                    model.addRow(new Object[]{
                        funcionario.getId(),
                        funcionario.getNome(),
                        funcionario.getDataNasc(),
                        funcionario.getTelefone(),
                        funcionario.getNivelAcesso(),
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

    public void editarFuncionario() {
        int selectedRow = view.getjTableFuncionarios().getSelectedRow();
        if (selectedRow == -1) {
            // Nenhuma linha selecionada
            System.out.println("Por favor, selecione um funcionário para editar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) view.getjTableFuncionarios().getModel();
        int id = (int) model.getValueAt(selectedRow, 0);
        String nome = (String) model.getValueAt(selectedRow, 1);
        String dataNasc = (String) model.getValueAt(selectedRow, 2);
        String telefone = (String) model.getValueAt(selectedRow, 3);
        String email = (String) model.getValueAt(selectedRow, 5);

        // Criar um formulário ou diálogo para editar os valores
        String novoNome = JOptionPane.showInputDialog(view, "Editar Nome", nome);
        String novaDataNasc = JOptionPane.showInputDialog(view, "Editar Data de Nascimento", dataNasc);
        String novoTelefone = JOptionPane.showInputDialog(view, "Editar Telefone", telefone);
        String novoEmail = JOptionPane.showInputDialog(view, "Editar Email", email);

        // Atualizar os dados no modelo da tabela
        model.setValueAt(novoNome, selectedRow, 1);
        model.setValueAt(novaDataNasc, selectedRow, 2);
        model.setValueAt(novoTelefone, selectedRow, 3);
        model.setValueAt(novoEmail, selectedRow, 5);

        // Atualizar no arquivo CSV
        PessoaBanco banco = new PessoaBanco();
        Funcionario funcionarioEditado = banco.procuraFuncionarioPorID(id);
        if (funcionarioEditado != null) {
            funcionarioEditado.setNome(novoNome);
            funcionarioEditado.setDataNasc(novaDataNasc);
            funcionarioEditado.setTelefone(novoTelefone);
            funcionarioEditado.setEmail(novoEmail);
            banco.atualizaFuncionario(funcionarioEditado);  // Implementar esse método
        }
    }

    public void editarCliente() {
        int selectedRow = view.getjTableClientes().getSelectedRow();
        if (selectedRow == -1) {
            // Nenhuma linha selecionada
            System.out.println("Por favor, selecione um funcionário para editar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) view.getjTableClientes().getModel();
        int id = (int) model.getValueAt(selectedRow, 0);
        String nome = (String) model.getValueAt(selectedRow, 1);
        String dataNasc = (String) model.getValueAt(selectedRow, 2);
        String telefone = (String) model.getValueAt(selectedRow, 3);
        String email = (String) model.getValueAt(selectedRow, 5);

        // Criar um formulário ou diálogo para editar os valores
        String novoNome = JOptionPane.showInputDialog(view, "Editar Nome", nome);
        String novaDataNasc = JOptionPane.showInputDialog(view, "Editar Data de Nascimento", dataNasc);
        String novoTelefone = JOptionPane.showInputDialog(view, "Editar Telefone", telefone);
        String novoEmail = JOptionPane.showInputDialog(view, "Editar Email", email);

        // Atualizar os dados no modelo da tabela
        model.setValueAt(novoNome, selectedRow, 1);
        model.setValueAt(novaDataNasc, selectedRow, 2);
        model.setValueAt(novoTelefone, selectedRow, 3);
        model.setValueAt(novoEmail, selectedRow, 5);

        // Atualizar no arquivo CSV
        PessoaBanco banco = new PessoaBanco();
        Funcionario funcionarioEditado = banco.procuraFuncionarioPorID(id);
        if (funcionarioEditado != null) {
            funcionarioEditado.setNome(novoNome);
            funcionarioEditado.setDataNasc(novaDataNasc);
            funcionarioEditado.setTelefone(novoTelefone);
            funcionarioEditado.setEmail(novoEmail);
            banco.atualizaFuncionario(funcionarioEditado);  // Implementar esse método
        }
    }

    public void removerCliente() {
        int selectedRow = view.getjTableClientes().getSelectedRow();
        if (selectedRow == -1) {
            // Nenhuma linha selecionada
            JOptionPane.showMessageDialog(view, "Por favor, selecione um cliente para remover.");
            return;
        }

        // Obtém os dados do cliente selecionado
        DefaultTableModel model = (DefaultTableModel) view.getjTableClientes().getModel();
        int clienteId = (int) model.getValueAt(selectedRow, 0); // Supondo que o ID está na coluna 0
        String nomeCliente = (String) model.getValueAt(selectedRow, 1); // Supondo que o nome está na coluna 1

        // Confirmação da remoção
        int confirm = JOptionPane.showConfirmDialog(view, "Você tem certeza que deseja remover " + nomeCliente + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; // Se o usuário não confirmar, não remove
        }

        // Remove o cliente da tabela
        model.removeRow(selectedRow);

        // Atualiza o arquivo CSV
        PessoaBanco banco = new PessoaBanco();
        List<Pessoa> pessoas = banco.retornaClientes(); // Obtém todos os clientes
        // Remove o cliente da lista de clientes
        pessoas.removeIf(cliente -> cliente.getId() == clienteId);
        // Atualiza o arquivo CSV com a lista modificada
        banco.atualizaArquivoCSV(pessoas);
    }

}
