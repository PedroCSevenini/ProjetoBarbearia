/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
            String line = "Dia: " + horario.getData() + "\nHorário: " + horario.getHorarioInicio();
            view.getjTextArea1().setText(line);
            return;
        }
        String line =  "Não há horário marcado.";
        view.getjTextArea1().setText(line);
    }
}
