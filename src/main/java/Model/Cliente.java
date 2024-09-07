/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.LocalTime;
/**
 *
 * @author pedro
 */
public class Cliente extends Usuario{
    private int nivelAcesso  = 1;
    private Horario horario = null;

  
    public Cliente(Horario horario, String usuario, String senha, int id, String nome, String cpf, Endereco endereco, String sexo, int nivelAcesso) {
        super(usuario, senha, id, nome, cpf, endereco, sexo, nivelAcesso);
    }
    
    public boolean agendarHorario(Date data, LocalTime horaInicio, Servico servico, Funcionario funcionario){
        if(horario != null){
            return false;
        }
        horario = Horario.adicionaHorarioListaGeral(servico, data, horaInicio, funcionario);
        return true;
    }
    
}
