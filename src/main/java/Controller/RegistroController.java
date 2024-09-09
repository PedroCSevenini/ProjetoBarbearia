/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.RegistroHelper;
import View.Registro;

/**
 *
 * @author pedro
 */
public class RegistroController {
    private final Registro view;
    private final RegistroHelper helper;

    public RegistroController(Registro view) {
        this.view = view;
        this.helper = new RegistroHelper(view);
    }
    
    
    public void registrar(){
        //helper.verificaCamposObrigatorios();
    }
}
