/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


abstract public class Pessoa {
    protected int id;
    protected String nome;
    protected String telefone;
    protected String dataNasc;
    protected String email;
    protected int nivelAcesso;

    public Pessoa(int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.email = email;
        this.nivelAcesso = nivelAcesso;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    @Override
    public String toString() {
        return this.getNome();
    }
    
}
