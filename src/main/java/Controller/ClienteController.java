
package Controller;

import BDO.HorarioBanco;
import BDO.PessoaBanco;
import BDO.ServicoBanco;
import Controller.Helper.ClienteHelper;
import Model.Cliente;
import Model.Funcionario;
import Model.Pessoa;
import Model.Servico;
import View.ViewCliente;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        if(id != 0){
            helper.mostrarMensagemNoText(id);
        }
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
    
    public void implementarHorarioDisponiveis() {
        HorarioBanco bd = new HorarioBanco();
        Pessoa funcionarioSelecionado = (Pessoa) view.getjComboBoxFuncionario().getSelectedItem();
        Servico servicoSelecionado = (Servico) view.getjComboBoxServico().getSelectedItem();

        // Verifica se o funcionário e o serviço estão selecionados
        if (funcionarioSelecionado == null || servicoSelecionado == null) {
            // Mensagem para o usuário sobre seleção inválida
            view.getjLabelAviso().setText("Por favor, selecione um funcionário e um serviço.");
            return;
        }

        int id = funcionarioSelecionado.getId();

        
        Date dataSelecionada = view.getjSelecionaData().getDate();
        if (dataSelecionada == null) {
            view.getjLabelAviso().setText("Por favor, selecione uma data válida.");
            return; 
        }
       
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(dataSelecionada);

       
        List<String> horariosDisponiveis = bd.consultarHorariosDisponiveisFuncionario(dataFormatada, id, servicoSelecionado);

       
        view.getjComboBoxHorarios().removeAllItems();
        view.getjComboBoxHorarios().addItem("Selecione um horário");

        if (horariosDisponiveis.isEmpty()){
            view.getjLabelAviso().setVisible(true);
        } else {
            for (String horario : horariosDisponiveis) {
                view.getjComboBoxHorarios().addItem(horario);
            }
        }
    }
    
    public void marcarHorario(){
        HorarioBanco bdHorario = new HorarioBanco();
        ServicoBanco bdServico = new ServicoBanco();
        PessoaBanco bdPessoa = new PessoaBanco();
        if(!bdHorario.verificaHorarioPorId(view.getPessoa().getId())){
            Servico servico = (Servico)(view.getjComboBoxServico().getSelectedItem());
            Date dataSelecionada = view.getjSelecionaData().getDate();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String data = formato.format(dataSelecionada);
            if(view.getjComboBoxHorarios().getSelectedIndex() == 0){
                view.mostrarAviso("Selecione um horário.");
                return;
            }
            String horario = (String)view.getjComboBoxHorarios().getSelectedItem();
            
                
            Funcionario funcionario = (Funcionario) view.getjComboBoxFuncionario().getSelectedItem();
            Cliente cliente = PessoaBanco.procuraClientePorID(view.getPessoa().getId());
            boolean marcado = false;
            if(bdHorario.adicionarHorario(servico, data, horario, funcionario, cliente, marcado)){
                view.mostrarAviso("Horário marcado!");
            }else{
                view.mostrarAviso("Erro ao adicionar horário...");
            }
        }else{
            view.mostrarAviso("Já possui um horário marcado ou pendente...");
        }
    }
}
