/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Servico;
import java.time.DateTimeException;


public class Horario {
    private int id;
    private Servico servico;
    private DateTimeException horainicial;
    private Cliente cliente;

    public Horario(int id, Servico servico, DateTimeException horainicial, Cliente clinte) {
        this.id = id;
        this.servico = servico;
        this.horainicial = horainicial;
        this.cliente = cliente;
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

    public DateTimeException getHorainicial() {
        return horainicial;
    }

    public void setHorainicial(DateTimeException horainicial) {
        this.horainicial = horainicial;
    }

    public Cliente getClinte() {
        return cliente;
    }

    public void setClinte(Cliente clinte) {
        this.cliente = clinte;
    }
    
}
