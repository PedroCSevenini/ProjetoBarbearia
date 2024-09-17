
package Controller.Helper;

import BDO.HorarioBanco;
import BDO.PessoaBanco;
import Model.Horario;
import View.ViewCliente;


/**
 *
 * @author pedro
 */
public class ClienteHelper {
    private final ViewCliente view;

    public ClienteHelper(ViewCliente view) {
        this.view = view;
    }
    
    public void mostrarMensagemNoText(int id){
        Horario horario = HorarioBanco.retornaHorarioDoCliente(PessoaBanco.procuraClientePorID(id));
        if(horario != null){
            String line = "Dia: " + horario.getData() + "\nHorário: " + horario.getHorarioInicio()
                    + "\nFuncionário: " + horario.getFuncionario().getNome() + "\nPreço: R$" + horario.getServico().getPreco();
            view.getjTextArea1().setText(line);
            return;
        }
        String line =  "Não há horário marcado.";
        view.getjTextArea1().setText(line);
    }
}
