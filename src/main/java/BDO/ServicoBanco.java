/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDO;

import static BDO.PessoaBanco.retornaFuncionarios;
import Model.Cliente;
import Model.Funcionario;
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
public class ServicoBanco{
    private static final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Servico.txt");
    
    public static List retornaServicos(){
        List<Servico> servicos = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            if(line == null){
                return servicos;
            }
            while(line != null){
                String [] vet = line.split(";");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String preco = vet[2];
                int duracao = Integer.parseInt(vet[3]);
                String desc = vet[4];
                servicos.add(new Servico(id, nome, preco, duracao, desc));
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return servicos;
    }
    
    public static Servico procuraServicoPorID(int id){
        List<Servico> servicos = retornaServicos();
        if (servicos == null || servicos.isEmpty()) {
            return null;
        }
        for (Servico servico : servicos){
            if (servico.getId() == id){
                return servico;
            }
        }
        return null;
    }
    
}
