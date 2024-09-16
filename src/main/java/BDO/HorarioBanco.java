/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDO;

import Model.Cliente;
import Model.Funcionario;
import Model.Horario;
import Model.Pessoa;
import Model.Servico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class HorarioBanco {
    private static final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Horario.txt");
    
    public static List retornaHorarios(){
        List<Horario> horarios = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            if(line==null){
                return null;
            }
            while(line!=null){
                String [] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                Servico servico = ServicoBanco.procuraServicoPorID(Integer.parseInt(vet[1]));
                String data = vet[2];
                String horaInicio = vet[3];
                Funcionario funcionario = PessoaBanco.procuraFuncionarioPorID(Integer.parseInt(vet[4]));
                Cliente cliente = PessoaBanco.procuraClientePorID(Integer.parseInt(vet[5]));
                
                horarios.add(new Horario(id,servico,data,horaInicio,funcionario,cliente));
                line = br.readLine();
            } 
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return horarios;
    }
    
    public static Horario retornaHorarioDoCliente (Cliente cliente){
        
        List<Horario> horarios = retornaHorarios();
        
        if (horarios == null || horarios.isEmpty()) {
            return null;
        }
        for (Horario horario : horarios){
            
            if (horario.getCliente().equals(cliente)){
                return horario;
            }
        }
        return null;
    }
    
}
