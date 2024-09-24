/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BDO.HorarioBanco;
import Model.Horario;
import View.ViewFuncionario;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
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
        //view.getTabelaConfirmados().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
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
        int tamanho = model.getRowCount()*20;
        view.getTabelaConfirmados().setPreferredSize(new java.awt.Dimension(view.getTabelaConfirmados().getWidth(), tamanho));
        
        
    }
    
    public void adicionaCamposTabelaPendentes(int idFuncionario){
        DefaultTableModel model = (DefaultTableModel) view.getTabelaPendentes().getModel();
        model.setRowCount(0);
        HorarioBanco bd = new HorarioBanco();
        List<Horario> horariosFuncionario = bd.retornaHorariosPendentesFuncionario(idFuncionario);
        for(Horario horario : horariosFuncionario){
            if(horario.isMarcado() == false){
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
        int tamanho = model.getRowCount()*20;
        view.getTabelaPendentes().setPreferredSize(new java.awt.Dimension(view.getTabelaPendentes().getWidth(), tamanho));
    }
    
    public void removerHorarioSelecionado(){
        HorarioBanco bd = new HorarioBanco();
        try{
            int selectedRow = view.getTabelaConfirmados().getSelectedRow();
            int idHorario = Integer.parseInt(view.getTabelaConfirmados().getValueAt(selectedRow, 0).toString());
            Object[] options = {"Sim", "Cancelar"};
            int opcao = JOptionPane.showOptionDialog(
                    null, 
                    "Deseja remover esse horário?", 
                    "Confirmação de Remoção",      
                    JOptionPane.YES_NO_OPTION,     
                    JOptionPane.WARNING_MESSAGE,   
                    null,                          
                    options,                       
                    options[0]                     
            );
            if (opcao == JOptionPane.YES_OPTION) {
                bd.removeHorarioPorID(idHorario);
            }  
        }catch(HeadlessException | NumberFormatException e){
            System.out.println("Nenhum valor selecionado!");
        }
        
        
        
    }
    
   
}
