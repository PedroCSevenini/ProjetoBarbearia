/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.Date;
import java.time.LocalTime;
import java.util.Objects;
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
    
    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Cliente cliente = (Cliente) obj;
    return this.getId() == cliente.getId();  // ou qualquer outra condição que faça sentido
}

    @Override
    public int hashCode() {
        return Objects.hash(getId());  // Utilize os mesmos atributos que estão sendo usados no equals
    }
    
    

  
    
    
    public boolean agendarHorario(Date data, LocalTime horaInicio, Servico servico, Funcionario funcionario){
        
        //horario = Horario.adicionaHorarioListaGeral(servico, data, horaInicio, funcionario);
        return true;
    }
    
}
