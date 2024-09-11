/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author pedro
 */
public class HorarioBanco {
    private final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Horario.txt");
    
    /*public List retornaHorarios(){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            while(line!=null){
                String [] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                int id_servico = Integer.parseInt(vet[1]);
                //Date data = (TIPO DATE)
                //Hora horaInicio = (TIPO HORA)
                int id_funcionario = Integer.parseInt(vet[4]);
                int id_cliente = Integer.parseInt(vet[5]);
                
                
            }
            
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }*/
    
    
    
}
