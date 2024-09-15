/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.Date;
import java.time.LocalTime;
/**
 *
 * @author pedro
 */
public class Cliente extends Usuario{
    private Horario horario = null;

    public Cliente(String usuario, String senha, int id, String nome, String telefone, String dataNasc, String email) {
        super(usuario, senha, id, nome, telefone, dataNasc, email, 1);
    }

    public Cliente(String usuario, String senha, int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        super(usuario, senha, id, nome, telefone, dataNasc, email, nivelAcesso);
    }

    public Cliente(int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        super(id, nome, telefone, dataNasc, email, nivelAcesso);
    }
    
    
    
    
    

  
    
    
    public boolean agendarHorario(Date data, LocalTime horaInicio, Servico servico, Funcionario funcionario){
        
        //horario = Horario.adicionaHorarioListaGeral(servico, data, horaInicio, funcionario);
        return true;
    }
    
}
