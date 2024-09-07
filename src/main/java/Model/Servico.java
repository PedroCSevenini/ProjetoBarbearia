/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pedro
 */
public class Servico {
    protected int id;
    private String nome;
    private double preco;
    private int duracao; // +1 para cada 15 min
    private String desc;

    public Servico(int id, String nome, double preco, int duracao, String desc) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
        this.desc = desc;
    }
    
    
}
