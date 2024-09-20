
package BDO;

import Model.Cliente;
import Model.Funcionario;
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
    private static final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Pessoa.txt");
    
    public List retornaPessoas(){
        List<Pessoa> pessoas = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            if(line == null){
                return pessoas;
            }
            while(line != null){
                String [] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String email = vet[2];
                String telefone = vet[3];
                String dataNasc = vet[4];
                int nivelAcesso = Integer.parseInt(vet[5]);
                pessoas.add(new Cliente(id, nome, telefone, dataNasc, email, nivelAcesso));
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return pessoas;
    }
    
    public static List retornaClientes(){
        List<Cliente> clientes = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            if(line == null){
                return clientes;
            }
            while(line != null){
                String [] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String email = vet[2];
                String telefone = vet[3];
                String dataNasc = vet[4];
                int nivelAcesso = Integer.parseInt(vet[5]);
                if(nivelAcesso == 1){
                    clientes.add(new Cliente(id, nome, telefone, dataNasc, email, nivelAcesso));
                }
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return clientes;
    }
    
    public List retornaFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            if(line == null){
                return funcionarios;
            }
            while(line != null){
                String [] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String email = vet[2];
                String telefone = vet[3];
                String dataNasc = vet[4];
                int nivelAcesso = Integer.parseInt(vet[5]);
                if(nivelAcesso == 2){
                    funcionarios.add(new Funcionario(id, nome, telefone, dataNasc, email, nivelAcesso));
                }
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return funcionarios;
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
    
    public boolean buscaTelefone(String telefone) {
        List<Pessoa> pessoas = retornaPessoas();
        if (pessoas == null || pessoas.isEmpty()) {
            return false;
        }
        for (Pessoa pessoa : pessoas){
            if (pessoa.getTelefone().equals(telefone)){
                return true;
            }
        }
        return false;
    }
    
    public void inserePessoa(Pessoa novo){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            String newLine = novo.getId() + "," + novo.getNome() + "," + novo.getEmail() + "," +
            novo.getTelefone() + ","+ novo.getDataNasc()+  "," + novo.getNivelAcesso();
            bw.write(newLine);
            bw.newLine();  
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public boolean buscaEmail(String email) {
        List<Pessoa> pessoas = retornaPessoas();
        if (pessoas == null || pessoas.isEmpty()) {
            return false;
        }
        for (Pessoa pessoa : pessoas){
            if (pessoa.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
    
    public Pessoa procurarPessoaPorID(int id){
        List<Pessoa> pessoas = retornaPessoas();
        if (pessoas == null || pessoas.isEmpty()) {
            return null;
        }
        for (Pessoa pessoa : pessoas){
            if (pessoa.getId() == id){
                return pessoa;
                
            }
        }
        return null;
    }
    
    public Funcionario procuraFuncionarioPorID(int id){
        List<Funcionario> funcionarios = retornaFuncionarios();
        if (funcionarios == null || funcionarios.isEmpty()) {
            return null;
        }
        for (Funcionario funcionario : funcionarios){
            if (funcionario.getId() == id){
                return funcionario;
            }
        }
        return null;
    }
    
    public static Cliente procuraClientePorID(int id){
        List<Cliente> clientes = retornaClientes();
        if (clientes == null || clientes.isEmpty()) {
            return null;
        }
        for (Cliente cliente : clientes){
            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }
    
    
}
