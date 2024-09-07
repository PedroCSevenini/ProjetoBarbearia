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
public class Cliente extends Pessoa{
    private int nivelAcesso  = 1;
    private List<Horario> horarios  = new ArrayList<>();

    public Cliente(int id, String nome, String cpf, Endereco endereco, String usuario, String senha, String sexo) {
        super(id, nome, cpf, endereco, usuario, senha, sexo);
    }
    
    public boolean agendarHorario(Date data, Time hora, Servico servico, Funcionario funcionario){
        
        return true;
    }
           
}
