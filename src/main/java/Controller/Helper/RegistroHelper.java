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
    
    public boolean verificaCamposObrigatorios(){
        
        if("".equals(view.getjPasswordFieldSenha().getText()) 
                || "".equals(view.getjTextFieldCpf().getText()) || "".equals((String)view.getjComboBoxSexo().getSelectedItem())
                || "".equals(view.getjTextFieldNome().getText()) || "".equals(view.getjTextFieldUsuario().getText())  
        || "".equals(view.getjTextFieldEstado().getText()) || "".equals(view.getjTextFieldCidade().getText())
        || "".equals(view.getjTextFieldBairro().getText()) || "".equals(view.getjTextFieldRua().getText())
        || "".equals(view.getjTextFieldNumero().getText()) || "".equals(view.getjTextFieldComplemento().getText())){      
            return false;    
        }else{          
            return true;
        }
        
    }
    
    public Cliente obtemModelo(){
        String nome = view.getjTextFieldNome().getText();
        String cpf = view.getjTextFieldCpf().getText();
        String sexo = (String)view.getjComboBoxSexo().getSelectedItem();
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        String estado = view.getjTextFieldEstado().getText();
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
