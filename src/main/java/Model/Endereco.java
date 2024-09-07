/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pedro
 */
public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;

    public Endereco(String estado, String cidade, String bairro, String rua, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    
    
}

