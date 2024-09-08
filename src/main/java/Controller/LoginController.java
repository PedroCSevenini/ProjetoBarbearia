/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import BDO.UsuarioBanco;
import View.Login;
import Controller.Helper.LoginHelper; // NÃO SEI PORQUE ISSO FUNCIONA, NÃO FAZ SENTIDO NENHUM
import Model.Usuario;


/**
 *
 * @author pedro
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrar(){
        //Buscar Usuario direto da área Login
        Usuario usuario = helper.obterModelo();
        //Verifica compatibilidade usúario e senha
        UsuarioBanco bancoUsuario = new UsuarioBanco();
        Usuario usuarioVerificado = bancoUsuario.verificaUsuarioSenha(usuario);
        if(usuarioVerificado == null){
            view.exibeMensagem("Usuario ou senha inválidos.");
        }else{
            
        }       
    }
    
}
