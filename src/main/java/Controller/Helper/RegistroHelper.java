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
        String senha = view.getjPasswordFieldSenha().getText();
        //Valida exceção nome
        if(!("".equals(nome))){
            String regexNome = "^[A-Za-zÀ-ÖØ-ÿ]+(?: [A-Za-zÀ-ÖØ-ÿ]+)*$";
            Pattern patternNome = Pattern.compile(regexNome);
            Matcher matcherNome = patternNome.matcher(nome);
            if(!matcherNome.matches()){
                return ("Nome inválido");
            }
        }else{
            return ("Campo obrigatório faltando: Nome");
        }
        //Valida exceção telefone
        if(!("".equals(telefone))){
            String regexTelefone = "^\\d{10,11}$"; // 10 ou 11 dígitos
            Pattern patternTelefone = Pattern.compile(regexTelefone);
            Matcher matcherTelefone = patternTelefone.matcher(telefone);
            if(!matcherTelefone.matches()){
                return ("Telefone inválido(Somente números)");
            }
        }else{
            return ("Campo obrigatório faltando: Telefone");
        }
        //Valida exceção email
        if(!("".equals(email))){
            String regexEmail = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
            Pattern patternEmail = Pattern.compile(regexEmail);
            Matcher matcherEmail = patternEmail.matcher(email);
            if(!matcherEmail.matches()){
                return ("Email inválido");
            }
        }else{
            return ("Campo obrigatório faltando: Email");
        }
        //Valida exceção data de nascimento
        if(!("".equals(dataNasc))){
            String regexDataNasc = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
            Pattern patternDataNasc = Pattern.compile(regexDataNasc);
            Matcher matcherDataNasc = patternDataNasc.matcher(dataNasc);
            if(!matcherDataNasc.matches()){
                return ("Data de nascimento inválida(Formato: XX/XX/XXXX)");
            }
        }else{
            return ("Campo obrigatório faltando: Data de nascimento");
        }
        //Valida exceção usuario
        if(!("".equals(usuario))){
            String regexUsuario = "^[a-zA-Z0-9]+$";
            Pattern patternUsuario = Pattern.compile(regexUsuario);
            Matcher matcherUsuario= patternUsuario.matcher(usuario);
            if(!matcherUsuario.matches()){
                return ("Usuário inválido(apenas letras e numeros sem espaços)");
            }
        }else{
            return ("Campo obrigatório faltando: Data de nascimento");
        }
        //Valida exceção senha
        if(!("".equals(senha))){
            String regexSenha = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
            Pattern patternSenha = Pattern.compile(regexSenha);
            Matcher matcherSenha= patternSenha.matcher(senha);
            if(!matcherSenha.matches()){
                return ("Senha inválida(no mínimo 8 dígitos, apenas letras e numeros)");
            }
        }else{
            return ("Campo obrigatório faltando: Senha");
        }
        return "Todos campos corretos";
    }
    
    public Cliente obtemModelo(){
        String nome = view.getjTextFieldNome().getText();
        String email = view.getjTextFieldEmail().getText();
        String telefone = view.getjTextFieldTelefone().getText();
        String dataNasc = view.getjTextFieldDataNasc().getText();
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        int id = bancoPessoa.retornaProximoID();
        Cliente modelo = new Cliente(usuario, senha, id, nome, telefone, dataNasc, email);
        return modelo;
        
    }
    
    public String registrar(Cliente modelo){
        if(bancoPessoa.buscaTelefone(modelo.getTelefone())){
            return "Telefone já registrado.";
        }
        if(bancoPessoa.buscaEmail(modelo.getEmail())){
            return "Email já registrado.";
        }
        if(bancoUsuario.buscaUsuario(modelo.getUsuario())){
            return "Usuário já registrado.";
        }
        bancoUsuario.insereUsuario(modelo);
        bancoPessoa.inserePessoa(modelo);
        return "Registrado com sucesso";
    }
}
