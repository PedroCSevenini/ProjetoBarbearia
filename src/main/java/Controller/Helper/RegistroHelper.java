/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import BDO.PessoaBanco;
import BDO.UsuarioBanco;
import Model.Cliente;
import View.ViewRegistro;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author pedro
 */
public class RegistroHelper {
    private final ViewRegistro view;
    private final PessoaBanco bancoPessoa;
    private final UsuarioBanco bancoUsuario;

    public RegistroHelper(ViewRegistro view) {
        this.view = view;
        this.bancoPessoa = new PessoaBanco();
        this.bancoUsuario = new UsuarioBanco();
    }
    
    public String verificaCamposObrigatorios(){
        String nome = view.getjTextFieldNome().getText();
        String telefone = view.getjTextFieldTelefone().getText();
        String email = view.getjTextFieldEmail().getText();
        String dataNasc = view.getjTextFieldDataNasc().getText();
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = new String(view.getjPasswordFieldSenha().getPassword());

        // Verifica campo Nome
        if(nome.isEmpty()){
            return "Campo obrigatório faltando: Nome";
        }
        String regexNome = "^[A-Za-zÀ-ÖØ-ÿ]+(?: [A-Za-zÀ-ÖØ-ÿ]+)*$";
        if(!nome.matches(regexNome)){
            return "Nome inválido";
        }

        // Verifica campo Telefone
        if(telefone.isEmpty()){
            return "Campo obrigatório faltando: Telefone";
        }
        String regexTelefone = "^\\d{10,11}$"; // 10 ou 11 dígitos
        if(!telefone.matches(regexTelefone)){
            return "Telefone inválido (Somente números)";
        }

        // Verifica campo Email
        if(email.isEmpty()){
            return "Campo obrigatório faltando: Email";
        }
        String regexEmail = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if(!email.matches(regexEmail)){
            return "Email inválido";
        }

        // Verifica campo Data de Nascimento
        if(dataNasc.isEmpty()){
            return "Campo obrigatório faltando: Data de nascimento";
        }
        String regexDataNasc = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if(!dataNasc.matches(regexDataNasc)){
            return "Data de nascimento inválida (Formato: XX/XX/XXXX)";
        }

        // Verifica campo Usuário
        if(usuario.isEmpty()){
            return "Campo obrigatório faltando: Usuário";
        }
        String regexUsuario = "^[a-zA-Z0-9]+$";
        if(!usuario.matches(regexUsuario)){
            return "Usuário inválido (Apenas letras e números, sem espaços)";
        }
        // Verifica campo Senha
        if(senha.isEmpty()){
            return "Campo obrigatório faltando: Senha";
        }
        String regexSenha = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        if(!senha.matches(regexSenha)){
            return "Senha inválida (No mínimo 8 dígitos, apenas letras e números)";
        }
        return "Todos campos corretos";
    }
    
    public Cliente obtemModelo() {
        String nome = view.getjTextFieldNome().getText();
        String email = view.getjTextFieldEmail().getText();
        String telefone = view.getjTextFieldTelefone().getText();
        String dataNasc = view.getjTextFieldDataNasc().getText();
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = new String(view.getjPasswordFieldSenha().getPassword());
        int id = bancoPessoa.retornaProximoID();
        Cliente modelo = new Cliente(usuario, senha, id, nome, telefone, dataNasc, email);
        return modelo;
}

    public String registrar(Cliente modelo){
        // Verifica se telefone já está registrado
        if(bancoPessoa.buscaTelefone(modelo.getTelefone())){
            return "Telefone já registrado.";
        }
    
        // Verifica se email já está registrado
        if(bancoPessoa.buscaEmail(modelo.getEmail())){
            return "Email já registrado.";
        }
    
        // Verifica se usuário já está registrado
        if(bancoUsuario.buscaUsuario(modelo.getUsuario())){
            return "Usuário já registrado.";
        }
    
        // Se tudo estiver correto, insere o cliente no banco
        bancoUsuario.insereUsuario(modelo);
        bancoPessoa.inserePessoa(modelo);
        return "Registrado com sucesso";
    }
}
