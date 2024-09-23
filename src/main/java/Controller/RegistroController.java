
package Controller;

import Controller.Helper.RegistroHelper;
import Model.Cliente;
import View.ViewLogin;
import View.ViewRegistro;
import javax.swing.JOptionPane;


public class RegistroController {
    private final ViewRegistro view;
    private RegistroHelper helper;

    public RegistroController(ViewRegistro view) {
        this.view = view;
        this.helper = new RegistroHelper(view);
    }
    
    
    public void registrar(){
        if(helper.verificaCamposObrigatorios()){
            Cliente modelo = helper.obtemModelo();
            String line = helper.registrar(modelo);
            if(line.equals("Registrado com sucesso")){
                view.exibeMensagem("Registrado com sucesso!");
                ViewLogin login = new ViewLogin();
                login.setarLogin();
                view.dispose();
            }else{
                view.exibeMensagem(line);
            }
        }
    }
}
