package Model;

import java.time.LocalTime;
import java.util.Date;

public class Horario {
    protected int id;
    protected Servico servico;
    protected String data;
    protected String  horaInicio;
    protected Funcionario  funcionario;
    protected Cliente cliente;
    protected boolean marcado;
    

    public Horario(int id, Servico servico, String data, String horarioInicio, Funcionario funcionario, Cliente cliente) {
        this.id = id;
        this.servico = servico;
        this.data = data;
        this.horaInicio = horarioInicio;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.marcado = false;
    }

    public Horario(int id, Servico servico, String data, String horarioInicio, Funcionario funcionario, Cliente cliente, boolean marcado) {
        this.id = id;
        this.servico = servico;
        this.data = data;
        this.horaInicio = horarioInicio;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.marcado = marcado;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

   
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorarioInicio() {
        return horaInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horaInicio = horarioInicio;
    }

 
    
    
    
    

    
}
