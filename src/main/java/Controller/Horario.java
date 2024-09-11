/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Servico;
import java.time.DateTimeException;


public class Horario {
    private int id;
    private Servico servico;
    private DateTimeException horainicial;
    private Clinte clinte;

    public Horario(int id, Servico servico, DateTimeException horainicial, Clinte clinte) {
        this.id = id;
        this.servico = servico;
        this.horainicial = horainicial;
        this.clinte = clinte;
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

    public Clinte getClinte() {
        return clinte;
    }

    public void setClinte(Clinte clinte) {
        this.clinte = clinte;
    }
    
}
