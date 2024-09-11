/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Funcionario extends Pessoa{
    private final int nivelAcesso = 2;

    public Funcionario(int id, String nome, String cpf, Endereco endereco, String sexo, int nivelAcesso) {
        super(id, nome, cpf, endereco, sexo, nivelAcesso);
    }

    
    
    
   
}
