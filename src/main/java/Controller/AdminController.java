
package Controller;

import BDO.HorarioBanco;
import BDO.PessoaBanco;
import BDO.ServicoBanco;
import Exception.NomeServicoException;
import Exception.ServicoException;
import Exception.ValorServicoException;
import Model.Funcionario;
import Model.Pessoa;
import Model.Servico;
import View.ViewAdmin;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
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

    public void adicionaCamposTabelaCliente() {
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

//    public void removerCliente() {
//        int selectedRow = view.getjTableClientes().getSelectedRow();
//        if (selectedRow == -1) {
//            // Nenhuma linha selecionada
//            JOptionPane.showMessageDialog(view, "Por favor, selecione um cliente para remover.");
//            return;
//        }
//
//        // Obtém os dados do cliente selecionado
//        DefaultTableModel model = (DefaultTableModel) view.getjTableClientes().getModel();
//        int clienteId = (int) model.getValueAt(selectedRow, 0); // Supondo que o ID está na coluna 0
//        String nomeCliente = (String) model.getValueAt(selectedRow, 1); // Supondo que o nome está na coluna 1
//
//        // Confirmação da remoção
//        int confirm = JOptionPane.showConfirmDialog(view, "Você tem certeza que deseja remover " + nomeCliente + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
//        if (confirm != JOptionPane.YES_OPTION) {
//            return; // Se o usuário não confirmar, não remove
//        }
//
//        // Remove o cliente da tabela
//        model.removeRow(selectedRow);
//
//        // Atualiza o arquivo CSV
//        PessoaBanco banco = new PessoaBanco();
//        List<Pessoa> pessoas = banco.retornaClientes(); // Obtém todos os clientes
//        // Remove o cliente da lista de clientes
//        pessoas.removeIf(cliente -> cliente.getId() == clienteId);
//        // Atualiza o arquivo CSV com a lista modificada
//        banco.atualizaArquivoCSV(pessoas);
//    }

    public void atualizaLabelEditarServico() {
        ServicoBanco bd = new ServicoBanco();
        int selectedRow = view.getjTableServico().getSelectedRow();
        int idServico = Integer.parseInt(view.getjTableServico().getValueAt(selectedRow, 0).toString());
        Servico servicoId = bd.procuraServicoPorID(idServico);
        view.getjTextFieldEditarServicoNome().setText(servicoId.getNome());
        view.getjTextFieldEditarServicoValor().setText(servicoId.getPreco());

    }
    
    public void adicionarNovoServico (){
        
        String nome = view.getjTextFieldNovoServicoNome().getText();
        String valor = view.getjTextFieldNovoServicoValor().getText();
        int duracao;
        try {
            duracao = Integer.parseInt(view.getjTextFieldNovoServicoDuracao().getText());
            if(!(duracao >= 1 && duracao<=40)){
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            view.mostrarAvisoNovoServico("Duração deve ser um número inteiro de 1 a 40");
            return;
        }
        try {
            if (verificaNomeServico(nome) && verificaValorServico(valor)) {
                ServicoBanco banco = new ServicoBanco();
                
                if (banco.adicionarServico(nome, valor, duracao)) {
                    view.mostrarAvisoNovoServico("Serviço Adicionado!");
                    limparNovoServico();
                } else {
                    view.mostrarAvisoNovoServico("Erro ao adicionar serviço...");
                }
            }
        } catch (ServicoException e) {
            view.mostrarAvisoNovoServico(e.getMessage());
        }
    }

    public void editarServico() {
        String nome = view.getjTextFieldEditarServicoNome().getText();
        String valor = view.getjTextFieldEditarServicoValor().getText();

        try {
            if (verificaNomeServico(nome) && verificaValorServico(valor)) {
                ServicoBanco banco = new ServicoBanco();

                int selectedRow = view.getjTableCortes().getSelectedRow();
                int idServico = Integer.parseInt(view.getjTableCortes().getValueAt(selectedRow, 0).toString());

                if (banco.editarServico(idServico, nome, valor)) {
                    view.mostrarAvisoEditarServico("Serviço editado!");
                } else {
                    view.mostrarAvisoEditarServico("Erro ao editar serviço...");
                }
            }
        } catch (ServicoException e) {
            view.mostrarAvisoEditarServico(e.getMessage());
        }
    }
    
    public void apagarServico(){
        ServicoBanco bdServico = new ServicoBanco();
        try{
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
        }catch(HeadlessException | NumberFormatException e){
            System.out.println("Nenhum valor selecionado!");
        }
    }
    
    public void limparNovoServico(){
        view.getjTextFieldNovoServicoNome().setText("");
        view.getjTextFieldNovoServicoValor().setText("");
        view.getjTextFieldNovoServicoDuracao().setText("");
    }

    //Verificação Servico
    public boolean verificaNomeServico(String nome) throws NomeServicoException {
        if (nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ\\s]+$")) {
            return true;
        }
        throw new NomeServicoException("Nome inválido");
    }

    public boolean verificaValorServico(String valor) throws ValorServicoException {
        if (valor.matches("^\\d{1,3}(?:\\.\\d{3})*,\\d{2}$")) {
            return true;
        }
        throw new ValorServicoException("Valor inválido");
    }

    //Fim verificação Serviço
    public void voltarParaCortes() {
        resetarBotoesGerais();
        atualizaTabelas();
        view.getjTabbedPaneMenu().setSelectedIndex(1);

    }

    public void resetarBotoesGerais() {
        view.getjButtonEditarServico().setEnabled(false);
        view.getjButtonRemoverServico().setEnabled(false);
    }

    public void atualizaTabelas() {
        adicionaCamposTabelaServico();
        adicionaCamposTabelaCliente();
        adicionaCamposTabaleaFuncionario();
    }

}
