/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author pedro
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
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
        view.getjTextFieldUsuario().setText("");
        view.getjPasswordSenha().setText("");
    }
    
    
}
