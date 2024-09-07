/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pedro
 */
abstract public class Pessoa {
    protected int id;
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    protected String usuario;
    protected String senha;
    protected String sexo;

    public Pessoa(int id, String nome, String cpf, Endereco endereco, String usuario, String senha, String sexo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.usuario = usuario;
        this.senha = senha;
        this.sexo = sexo;
    }
    
    
    
    
}
