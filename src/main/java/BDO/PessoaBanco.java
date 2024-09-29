package BDO;

import Model.Cliente;
import Model.Funcionario;
import Model.Horario;
import Model.Pessoa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PessoaBanco {

    private static final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Pessoa.txt");

    public List retornaPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            if (line == null) {
                return pessoas;
            }
            while (line != null) {
                String[] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String email = vet[2]; 
                String telefone = vet[3];
                String dataNasc = vet[4];
                int nivelAcesso = Integer.parseInt(vet[5]);
                pessoas.add(new Cliente(id, nome, telefone, dataNasc, email, nivelAcesso));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return pessoas;
    }

    public void atualizaFuncionario(Funcionario funcionarioEditado) {
        List<Pessoa> todasPessoas = retornaPessoas();

        for (int i = 0; i < todasPessoas.size(); i++) {
            if (todasPessoas.get(i).getId() == funcionarioEditado.getId()) {
                todasPessoas.set(i, funcionarioEditado);
                break;
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
            for (Pessoa pessoa : todasPessoas) {
                String linha = pessoa.getId() + "," + pessoa.getNome() + "," + pessoa.getEmail() + ","
                        + pessoa.getTelefone() + "," + pessoa.getDataNasc() + "," + pessoa.getNivelAcesso();
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao atualizar arquivo: " + e.getMessage());
        }
    }

    public static List retornaClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            if (line == null) {
                return clientes;
            }
            while (line != null) {
                String[] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String email = vet[2];
                String telefone = vet[3];              
                String dataNasc = vet[4];
                int nivelAcesso = Integer.parseInt(vet[5]);
                if (nivelAcesso == 1) {
                    clientes.add(new Cliente(id, nome, telefone, dataNasc, email, nivelAcesso));
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return clientes;
    }

    public List retornaFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            if (line == null) {
                return funcionarios;
            }
            while (line != null) {
                String[] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String nome = vet[1];
                String email = vet[2];
                String telefone = vet[3];
                String dataNasc = vet[4];
                int nivelAcesso = Integer.parseInt(vet[5]);
                if (nivelAcesso == 2) {
                    funcionarios.add(new Funcionario(id, nome, telefone, dataNasc, email, nivelAcesso));
                }
                line = br.readLine();
            }
        } catch (IOException e) {
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
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getTelefone().equals(telefone)) {
                return true;
            }
        }
        return false;
    }

    public void inserePessoa(Pessoa novo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String newLine = novo.getId() + "," + novo.getNome() + "," + novo.getEmail() + ","
                    + novo.getTelefone() + "," + novo.getDataNasc() + "," + novo.getNivelAcesso();
            bw.write(newLine);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public boolean buscaEmail(String email) {
        List<Pessoa> pessoas = retornaPessoas();
        if (pessoas == null || pessoas.isEmpty()) {
            return false;
        }
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public Pessoa procurarPessoaPorID(int id) {
        List<Pessoa> pessoas = retornaPessoas();
        if (pessoas == null || pessoas.isEmpty()) {
            return null;
        }
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;

            }
        }
        return null;
    }

    public Funcionario procuraFuncionarioPorID(int id) {
        List<Funcionario> funcionarios = retornaFuncionarios();
        if (funcionarios == null || funcionarios.isEmpty()) {
            return null;
        }
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    public Cliente procuraClientePorID(int id) {
        List<Cliente> clientes = retornaClientes();
        if (clientes == null || clientes.isEmpty()) {
            return null;
        }
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

//    public void atualizaArquivoCSV(List<Pessoa> pessoas){
//        
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
//            
//            for (Pessoa pessoa : pessoas) {
//                String linha = pessoa.getId() + "," + pessoa.getNome() + "," + pessoa.getEmail() + ","
//                        + pessoa.getTelefone() + "," + pessoa.getDataNasc() + "," + pessoa.getNivelAcesso();
//                bw.write(linha);
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            System.out.println("Erro ao atualizar arquivo: " + e.getMessage());
//        }
//    }
    public boolean editarCliente(int idCliente, String nome, String telefone, String email, String dataNasc) {
        List<Cliente> clientes = retornaClientes();

        boolean clienteEditado = false;
        if (clientes == null || clientes.isEmpty()) {
            return false;
        }

        // Encontra o cliente pelo ID e atualiza as informações
        for (Cliente c : clientes) {
            if (c.getId() == idCliente) {
                c.setNome(nome);
                c.setTelefone(telefone);
                c.setEmail(email);
                c.setDataNasc(dataNasc);
                clienteEditado = true;
                break;
            }
        }

        // Se o cliente foi editado, reescreve o arquivo
        if (clienteEditado) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                pw.println("id,nome,email,telefone,dataNasc,nivelAcesso");
                for (Cliente c : clientes) {
                    pw.println(c.getId() + ","
                            + c.getNome() + ","
                            + c.getEmail()+ ","
                            + c.getTelefone() + ","
                            + c.getDataNasc() + ","
                            + c.getNivelAcesso());
                }
                return true;
            } catch (IOException e) {
                System.out.println("Erro ao editar o cliente: " + e.getMessage());
                return false;
            }
        }
        return false;
    }

    public boolean removeCliente(int idCliente) {
        List<Cliente> clientes = retornaClientes();
        boolean clienteRemovido = false;
        HorarioBanco bdHorario = new HorarioBanco();
        UsuarioBanco bdUsuario = new UsuarioBanco();

        // Se não houver clientes, retorna false
        if (clientes == null || clientes.isEmpty()) {
            return false;
        }

        // Encontra o cliente pelo ID e o remove
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == idCliente) {
                // Aqui você pode chamar a função para remover os horários marcados desse cliente
                bdHorario.removerHorariosPorClienteId(idCliente);
                bdUsuario.removeUsuarioPorId(idCliente);
                clientes.remove(i);
                clienteRemovido = true;
                break;
            }
        }

        // Se o cliente foi removido, reescreve o arquivo
        if (clienteRemovido) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
                // Escreve o cabeçalho novamente
                pw.println("id,nome,email,telefone,dataNasc,nivelAcesso");
                for (Cliente c : clientes) {
                    pw.println(c.getId() + ","
                            + c.getNome() + ","
                            + c.getEmail() + ","
                            + c.getTelefone() + ","
                            + c.getDataNasc() + ","
                            + c.getNivelAcesso());
                }
                return true;
            } catch (IOException e) {
                System.out.println("Erro ao remover o cliente: " + e.getMessage());
                return false;
            }
        }
        return false;
    }
}
