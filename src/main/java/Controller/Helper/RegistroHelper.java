/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import BDO.PessoaBanco;
import BDO.UsuarioBanco;
import Model.Cliente;
import Model.Endereco;
import View.Registro;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author pedro
 */
public class RegistroHelper {
    private final Registro view;
    private final PessoaBanco bancoPessoa;
    private final UsuarioBanco bancoUsuario;

    public RegistroHelper(Registro view) {
        this.view = view;
        this.bancoPessoa = new PessoaBanco();
        this.bancoUsuario = new UsuarioBanco();
    }
    
    public String verificaCamposObrigatorios(){
        String nome = view.getjTextFieldNome().getText();
        String cpf = view.getjTextFieldCpf().getText();
        String estado = (String)(view.getjComboBoxEstado().getSelectedItem());
        String cidade = view.getjTextFieldCidade().getText();
        String bairro = view.getjTextFieldBairro().getText();
        String rua = view.getjTextFieldRua().getText();
        String numero = view.getjTextFieldNumero().getText();
        String complemento = view.getjTextFieldComplemento().getText();
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
        //Valida exceção cpf
        if(!("".equals(cpf))){
            String regexCpf = "^\\d{11}$";
            Pattern patternCpf = Pattern.compile(regexCpf);
            Matcher matcherCpf = patternCpf.matcher(cpf);
            if(!matcherCpf.matches()){
                return ("CPF inválido(Somente números)");
            }
        }else{
            return ("Campo obrigatório faltando: CPF");
        }
        //Valida exceção estado
        if(!(" ".equals(estado))){  
        }else{
            return ("Campo obrigatório faltando: Estado");
        }
        //Valida exceção cidade
        if(!("".equals(cidade))){
            String regexCidade = "^[A-Za-zÀ-ÖØ-ÿ]+(?: [A-Za-zÀ-ÖØ-ÿ]+)*$";
            Pattern patternCidade = Pattern.compile(regexCidade);
            Matcher matcherCidade = patternCidade.matcher(cidade);
            if(!matcherCidade.matches()){
                return ("Cidade inválida");
            }
        }else{
            return ("Campo obrigatório faltando: Cidade");
        }
        //Valida exceção bairro
        if(!("".equals(bairro))){
            String regexBairro = "^[A-Za-zÀ-ÖØ-ÿ]+(?: [A-Za-zÀ-ÖØ-ÿ]+)*$";
            Pattern patternBairro = Pattern.compile(regexBairro);
            Matcher matcherBairro = patternBairro.matcher(bairro);
            if(!matcherBairro.matches()){
                return ("Bairro inválido");
            }
        }else{
            return ("Campo obrigatório faltando: Bairro");
        }
        //Valida exceção rua
        if(!("".equals(rua))){
            String regexRua = "^[A-Za-zÀ-ÖØ-ÿ]+(?: [A-Za-zÀ-ÖØ-ÿ]+)*$";
            Pattern patternRua = Pattern.compile(regexRua);
            Matcher matcherRua = patternRua.matcher(rua);
            if(!matcherRua.matches()){
                return ("Rua inválida");
            }
        }else{
            return ("Campo obrigatório faltando: Rua");
        }
        //Valida exceção numero
        if(!("".equals(numero))){
            String regexNumero= "^\\d+$";
            Pattern patternNumero = Pattern.compile(regexNumero);
            Matcher matcherNumero = patternNumero.matcher(numero);
            if(!matcherNumero.matches()){
                return ("Número inválido");
            }
        }else{
            return ("Campo obrigatório faltando: Número");
        }
        //Valida exceção complemento
        if(!("".equals(complemento))){
            String regexComplemento = "^[A-Za-z0-9]+(?: [A-Za-z0-9]+)*$";
            Pattern patternComplemento = Pattern.compile(regexComplemento);
            Matcher matcherComplemento = patternComplemento.matcher(complemento);
            if(!matcherComplemento.matches()){
                return ("Complemento inválido");
            }
        }else{
            return ("Campo obrigatório faltando: Complemento");
        }
        //Valida exceção usuario
        if(!("".equals(usuario))){
            String regexUsuario = "^[A-Za-z0-9]+$";
            Pattern patternUsuario = Pattern.compile(regexUsuario);
            Matcher matcherUsuario = patternUsuario.matcher(usuario);
            if(!matcherUsuario.matches()){
                return ("Usuário inválido(Apenas letras e números)");
            }
        }else{
            return ("Campo obrigatório faltando: Usuário");
        }
        //Valida exceção senha
        if(!("".equals(senha))){
            String regexSenha = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
            Pattern patternSenha = Pattern.compile(regexSenha);
            Matcher matcherSenha = patternSenha.matcher(senha);
            if(!matcherSenha.matches()){
                return ("Senha inválida(8 digitos, somente letras e números)");
            }
        }else{
            return ("Campo obrigatório faltando: Senha");
        }
        return "Todos campos corretos";
    }
    
    public Cliente obtemModelo(){
        String nome = view.getjTextFieldNome().getText();
        String cpf = view.getjTextFieldCpf().getText();
        String sexo = (String)view.getjComboBoxSexo().getSelectedItem();
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        String estado = (String)view.getjComboBoxEstado().getSelectedItem();
        String cidade = view.getjTextFieldCidade().getText();
        String bairro = view.getjTextFieldBairro().getText();
        String rua = view.getjTextFieldRua().getText();
        int numero = Integer.parseInt(view.getjTextFieldNumero().getText());
        String complemento = view.getjTextFieldComplemento().getText();
        Endereco endereco = new Endereco(estado,cidade,bairro,rua,numero,complemento);
        int id = bancoPessoa.retornaProximoID();
        Cliente modelo = new Cliente(usuario, senha, id, nome, cpf, endereco, sexo);
        return modelo;
        
    }
    
    public boolean registrar(Cliente modelo){
        if(bancoPessoa.buscaCpf(modelo.getCpf())){
            return false;
        }
        if(bancoUsuario.buscaUsuario(modelo.getUsuario())){
            return false;
        }
        bancoUsuario.insereUsuario(modelo);
        bancoPessoa.inserePessoa(modelo);
        return true;
    }
}
