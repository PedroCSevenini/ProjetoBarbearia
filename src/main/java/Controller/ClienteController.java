
package Controller;

import BDO.PessoaBanco;
import BDO.ServicoBanco;
import Controller.Helper.ClienteHelper;
import Model.Funcionario;
import Model.Pessoa;
import Model.Servico;
import View.ViewCliente;
import java.util.List;



/**
 *
 * @author pedro
 */
public class  ClienteController{
    private final ViewCliente view;
    private final ClienteHelper helper;
    //private  Horario;

    public ClienteController(ViewCliente view) {
        this.view = view;
        this.helper = new ClienteHelper(this.view);
    }
    
    public void mostrarHorario(int id){
        if(id != 0)
            helper.mostrarMensagemNoText(id);
    }
    
    public void setarComboBoxFuncionario(){
        PessoaBanco banco =  new PessoaBanco();
        List <Pessoa> funcionarios = banco.retornaFuncionarios();
        view.getjComboBoxFuncionario().addItem(new Funcionario(0, "Selecione um funcionário"));
        try {
            for(Pessoa funcionario : funcionarios){
                view.getjComboBoxFuncionario().addItem(funcionario);
            }
        }catch (NullPointerException e) {
            System.out.println("Não existem funcionários registrados.");
        }
        
    }
    
    public void setarComboBoxServico(){
        ServicoBanco banco =  new ServicoBanco();
        List <Servico> servicos = banco.retornaServicos();
        view.getjComboBoxServico().addItem(new Servico(0, "Selecione um serviço"));
        try {
            for(Servico servico : servicos){
                view.getjComboBoxServico().addItem(servico);
            }
        }catch (NullPointerException e) {
            System.out.println("Não existem serviços registrados.");
        }
    }
    
    
    
    public void atualizarPerfil(Pessoa pessoa){
        helper.mostrarCamposPerfil(pessoa);
    }
    
    public void implementarHorarioDisponiveis(){
        Pessoa funcionarioSelecionado = (Pessoa)view.getjComboBoxFuncionario().getSelectedItem();
        
        if(funcionarioSelecionado != null){
            int id = funcionarioSelecionado.getId();
            String data = view.getjSelecionaData().getDateFormatString();
            System.out.println(data);
        }
    }
    
}
