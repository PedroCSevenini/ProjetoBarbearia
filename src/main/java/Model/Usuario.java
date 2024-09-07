/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pedro
 */
public class Usuario extends Pessoa{
    protected String usuario;
    protected String senha;

    public Usuario(String usuario, String senha, int id, String nome, String cpf, Endereco endereco, String sexo, int nivelAcesso) {
        super(id, nome, cpf, endereco, sexo, nivelAcesso);
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Usuario(int id, String usuario, String senha) {
        super(id);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    
    
    
    
    
}
