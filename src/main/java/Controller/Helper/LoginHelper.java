package Controller.Helper;

import Model.Usuario;
import View.ViewLogin;


public class LoginHelper {
    private final ViewLogin view;

    public LoginHelper(ViewLogin view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordSenha().getText();
        
        return new Usuario(0, usuario, senha);
    }
    
    public void setarModelo(Usuario usuario){
        String userName = usuario.getUsuario();
        String userSenha = usuario.getSenha();
        
        view.getjTextFieldUsuario().setText(userName);
        view.getjTextFieldUsuario().setText(userSenha);
    }
    
    public void limparLogin(){
        view.getjPasswordSenha().setText("");
    }
    
    
}
