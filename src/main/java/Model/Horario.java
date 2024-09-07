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
abstract public class Horario {
    protected Servico servico;
    protected Date data;
    protected Time horarioInicio;
    protected Funcionario funcionario;
    protected static List<Horario> todosHorarios  =  new ArrayList<>();

    public Horario(Servico servico, Date data, Time horarioInicio, Funcionario funcionario) {
        this.servico = servico;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.funcionario = funcionario;
    }
    
    
}
