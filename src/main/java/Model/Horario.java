/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author pedro
 */
public class Horario {
    protected Servico servico;
    protected Date data;
    protected LocalTime horarioInicio;
    protected Funcionario funcionario;
    protected static List<Horario> todosHorarios  =  new ArrayList<>();

    private Horario(Servico servico, Date data, LocalTime horarioInicio, Funcionario funcionario) {
        this.servico = servico;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.funcionario = funcionario;
    }
    
    public static Horario adicionaHorarioListaGeral(Servico servico, Date data, LocalTime horarioInicio, Funcionario funcionario){
        Horario horario = new Horario(servico, data, horarioInicio, funcionario);
        todosHorarios.add(horario);
        return horario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    
}
