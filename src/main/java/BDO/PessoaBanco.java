/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDO;

import Model.Cliente;
import Model.Endereco;
import Model.Pessoa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class PessoaBanco {
    private final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Pessoa.txt");
    
    public List retornaPessoas(){
        List<Pessoa> pessoas = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            if(line == null){
                return null;
            }
            while(line != null){
                String [] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String cpf = vet[2];
                String estado = vet[3];
                String cidade = vet[4];
                String bairro = vet[5];
                String rua = vet[6];
                int numero = Integer.parseInt(vet[7]);
                String complemento = vet[8];
                String sexo = vet[9];
                int nivelAcesso = Integer.parseInt(vet[10]);
                Endereco endereco = new Endereco(estado,cidade,bairro,rua,numero,complemento);
                pessoas.add(new Cliente(id, nome, cpf, endereco, sexo, nivelAcesso));
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return pessoas;
    }
    
    public int retornaProximoID() {
        List<Pessoa> pessoas = retornaPessoas();
        if (pessoas == null || pessoas.isEmpty()) {
            return 1;
        }

        Pessoa ultimaPessoa = null;
        for (int i = 0; i < pessoas.size(); i++) {
            ultimaPessoa = pessoas.get(i);
        }

        return (ultimaPessoa == null ? 1 : ultimaPessoa.getId() + 1);
        }
    
    public boolean buscaCpf(String cpf) {
        List<Pessoa> pessoas = retornaPessoas();
        if (pessoas == null || pessoas.isEmpty()) {
            return false;
        }
        for (Pessoa pessoa : pessoas){
            if (pessoa.getCpf().equals(cpf)){
            return true;
            }
        }
        return false;
    }
    
    public void inserePessoa(Pessoa novo){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            String newLine = novo.getId() + "," + novo.getNome() + "," + novo.getCpf() + "," +
            novo.getEndereco().getEstado() + "," + novo.getEndereco().getCidade() + "," + novo.getEndereco().getBairro() + "," + novo.getEndereco().getRua() +
            "," + novo.getEndereco().getNumero() + "," + novo.getEndereco().getComplemento() + "," + novo.getSexo() + "," + novo.getNivelAcesso();
            bw.write(newLine);
            bw.newLine();  
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
