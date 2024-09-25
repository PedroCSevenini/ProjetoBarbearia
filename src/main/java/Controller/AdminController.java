/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BDO.PessoaBanco;
import BDO.ServicoBanco;
import Model.Funcionario;
import Model.Pessoa;
import Model.Servico;
import View.ViewAdmin;
import java.util.List;
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

    public void adicionaCamposFuncionarios(){
        DefaultTableModel model = (DefaultTableModel) view.getjTableFuncionarios().getModel();

        model.setRowCount(0); 
        PessoaBanco bd = new PessoaBanco();

        try {
            List<Pessoa> FuncionarioAdmin = bd.retornaPessoas(); 
            for (Pessoa funcionario : FuncionarioAdmin){
                if (funcionario.getNivelAcesso() == 2){
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

        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public void adicionaCamposClientes(){
        DefaultTableModel model = (DefaultTableModel) view.getjTableClientes().getModel();

        model.setRowCount(0); // Limpa a tabela antes de adicionar os novos funcionários
        PessoaBanco bd = new PessoaBanco();

        try {
            List<Pessoa> FuncionarioAdmin = bd.retornaPessoas(); // Obtém todas as pessoas
            for (Pessoa funcionario : FuncionarioAdmin){
                if (funcionario.getNivelAcesso() == 1){
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
}
