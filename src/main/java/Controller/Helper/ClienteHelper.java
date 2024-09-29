package Controller.Helper;

import BDO.HorarioBanco;
import BDO.PessoaBanco;
import Model.Horario;
import Model.Pessoa;
import View.ViewCliente;


public class ClienteHelper {
    private final ViewCliente view;

    public ClienteHelper(ViewCliente view) {
        this.view = view;
    }
    
    public void mostrarMensagemNoText(int id){
        PessoaBanco bd = new PessoaBanco();
        Horario horario = HorarioBanco.retornaHorarioDoCliente(bd.procuraClientePorID(id));
        if(horario != null){
            String line = "Dia: " + horario.getData() + "\nHorário: " + horario.getHorarioInicio()
                    + "\nFuncionário: " + horario.getFuncionario().getNome() + "\nPreço: R$" + horario.getServico().getPreco();
            if(horario.isMarcado()){
                line += "\nStatus: Marcado";
            }else{
                line += "\nStatus: Pendente";
            }
            view.getjTextArea1().setText(line);
            return;
        }
        String line =  "Não há horário marcado.";
        view.getjTextArea1().setText(line);
    }
    
    public void mostrarCamposPerfil(Pessoa pessoa){
        view.getjTextFieldNome().setText(pessoa.getNome());
        view.getjTextFieldEmail().setText(pessoa.getEmail());
        view.getjTextFieldTelefone().setText(pessoa.getTelefone());
        view.getjTextFieldDataNasc().setText(pessoa.getDataNasc());
    }
    
     
}
