
package Controller;


import BDO.UsuarioBanco;
import View.ViewLogin;
import Controller.Helper.LoginHelper;
import Model.Usuario;


public class LoginController {
    
    private final ViewLogin view;
    private final LoginHelper helper;
    
    public LoginController(ViewLogin view) {
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
            helper.limparLogin();
        }else{
             //Abre Proxima Tela
        }       
    }
    
}
