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

    public Funcionario(int id, String nome, String cpf, Endereco endereco, String usuario, String senha, String sexo) {
        super(id, nome, cpf, endereco, usuario, senha, sexo);
    }
    
    public List visualizarAgendamento(){
        List<Horario> horarios = new ArrayList<>();
        for (Horario horario : Horario.todosHorarios) {
            if(horario.getFuncionario().getId() == id){
                horarios.add(horario);
            }
        }
        if(horarios.get(0) != null){
            return horarios;
        }
        return null;
    }
    
   
}
