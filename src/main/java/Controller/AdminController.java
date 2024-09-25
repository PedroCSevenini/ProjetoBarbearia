/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BDO.ServicoBanco;
import Model.Servico;
import View.ViewAdmin;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AdminController {
    private final ViewAdmin view;

    public AdminController(ViewAdmin view) {
        this.view = view;
    }
    public void adicionaCamposTabelaCortes(){
        DefaultTableModel model = (DefaultTableModel) view.getjTableCortes().getModel();
        
        model.setRowCount(0);
        ServicoBanco bd = new ServicoBanco();
        try{
            List<Servico> servicosAdmin = bd.retornaServicos();
            for(Servico servico : servicosAdmin){
                
                    model.addRow(new Object[]{
                        servico.getId(),
                        servico.getNome(),
                        servico.getPreco(),
                        servico.getDuracao(),
                        servico.getDesc(),
                        
                    });
            }
            int tamanho = model.getRowCount()*20;
            view.getjTableCortes().setPreferredSize(new java.awt.Dimension(view.getjTableCortes().getWidth(), tamanho));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
}
