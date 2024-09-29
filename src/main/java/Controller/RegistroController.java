package Controller;

import Controller.Helper.RegistroHelper;
import Exception.RegistroException;
import Model.Cliente;
import View.ViewLogin;
import View.ViewRegistro;

public class RegistroController {

    private final ViewRegistro view;
    private RegistroHelper helper;

    public RegistroController(ViewRegistro view) {
        this.view = view;
        this.helper = new RegistroHelper(view);
}

    public void registrar() {
        if (helper.verificaCamposObrigatorios()) {
            Cliente modelo = helper.obtemModelo();
            try {
                String mensagem = helper.registrar(modelo);
                view.exibeMensagem(mensagem);
                if (mensagem.equals("Registrado com sucesso")) {
                    ViewLogin login = new ViewLogin();
                    login.setarLogin();
                    view.dispose();
                }
            } catch (RegistroException e) {
                view.exibeMensagem(e.getMessage());
            }
        }
    }
}
