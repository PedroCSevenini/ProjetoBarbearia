
package Controller;


import BDO.PessoaBanco;
import BDO.UsuarioBanco;
import View.ViewLogin;
import Controller.Helper.LoginHelper;
import Model.Pessoa;
import Model.Usuario;
import View.ViewCliente;


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
        Usuario usuarioVerificado = UsuarioBanco.verificaUsuarioSenha(usuario);
        if(usuarioVerificado == null){
            view.exibeMensagem("Usuario ou senha inválidos.");
            helper.limparLogin();
        }else{
            Pessoa pessoa = PessoaBanco.procurarPessoaPorID(usuarioVerificado.getId());
            if(pessoa.getNivelAcesso() == 1){
                ViewCliente telaCliente = new ViewCliente(pessoa);
                telaCliente.setarCliente();
                view.dispose();
            }
             //Abre Proxima Tela
            
        }       
    }
    
}
