
package Controller;

import Controller.Helper.RegistroHelper;
import Model.Cliente;
import View.ViewLogin;
import View.Registro;
import javax.swing.JOptionPane;


public class RegistroController {
    private final Registro view;
    private RegistroHelper helper;

    public RegistroController(Registro view) {
        this.view = view;
        this.helper = new RegistroHelper(view);
    }
    
    
    public void registrar(){
        if(helper.verificaCamposObrigatorios().equals("Todos campos corretos")){
            Cliente modelo = helper.obtemModelo();
            if(helper.registrar(modelo)){
                view.exibeMensagem("Registrado com sucesso!");
                ViewLogin login = new ViewLogin();
                login.setarLogin();
                view.dispose();
            }else{
                view.exibeMensagem("Usuário ou CPF já existente...");
            }
        }
        else{
            view.exibeMensagem(helper.verificaCamposObrigatorios());        
        }
    }
}
