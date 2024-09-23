/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BDO.HorarioBanco;
import Model.Horario;
import View.ViewFuncionario;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class FuncionarioController {
    private final ViewFuncionario view;

    public FuncionarioController(ViewFuncionario view) {
        this.view = view;
    }
    
    public void adicionaCamposTabelaConfirmados(int idFuncionario){
        DefaultTableModel model = (DefaultTableModel) view.getTabelaConfirmados().getModel();
        model.setRowCount(0);
        HorarioBanco bd = new HorarioBanco();
        List<Horario> horariosFuncionario = bd.retornaHorariosMarcadosFuncionario(idFuncionario);
        for(Horario horario : horariosFuncionario){
            if(horario.isMarcado() == true){
                model.addRow(new Object[]{
                    horario.getId(),
                    horario.getServico().getNome(),
                    horario.getData(),
                    horario.getHorarioInicio(),
                    horario.getCliente(),
                    horario.getServico().getPreco()        
                });
            }
        }
    }
    
    public void adicionaCamposTabelaPendentes(int idFuncionario){
        DefaultTableModel model = (DefaultTableModel) view.getTabelaPendentes().getModel();
        System.out.println("Oi1");
        model.setRowCount(0);
        HorarioBanco bd = new HorarioBanco();
        List<Horario> horariosFuncionario = bd.retornaHorariosPendentesFuncionario(idFuncionario);
        System.out.println(idFuncionario);
        for(Horario horario : horariosFuncionario){
            System.out.println(horario.isMarcado());
            if(horario.isMarcado() == false){
                System.out.println("Oi3");
                model.addRow(new Object[]{
                    horario.getId(),
                    horario.getServico().getNome(),
                    horario.getData(),
                    horario.getHorarioInicio(),
                    horario.getCliente(),
                    horario.getServico().getPreco()        
                });
            }
        }
    }
    
   
}
