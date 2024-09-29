package BDO;

import Model.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class UsuarioBanco {

    private static final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Usuario.txt");

    public UsuarioBanco() {
    }

    public static List retornaUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            if (line == null) {
                return null;
            }
            while (line != null) {
                String[] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String username = vet[1];
                String senha = vet[2];
                usuarios.add(new Usuario(id, username, senha));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return usuarios;
    }

    public static Usuario verificaUsuarioSenha(Usuario usuario) {
        List<Usuario> usuarios = retornaUsuarios();
        if (usuarios == null || usuarios.isEmpty()) {
            return null;
        }
        for (Usuario usuarioLista : usuarios) {
            if (usuarioLista.getUsuario().equals(usuario.getUsuario()) && usuarioLista.getSenha().equals(usuario.getSenha())) {
                return usuarioLista;
            }
        }
        return null;
    }

    public boolean buscaUsuario(String usuario) {
        List<Usuario> usuarios = retornaUsuarios();
        if (usuarios == null || usuarios.isEmpty()) {
            return false;
        }

        for (Usuario user : usuarios) {
            if (user.getUsuario().equals(usuario)) {
                return true;
            }
        }
        return false;
    }

    public void insereUsuario(Usuario novo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String newLine = novo.getId() + "," + novo.getUsuario() + "," + novo.getSenha();
            bw.write(newLine);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Usuario buscaUsuarioPorId(int id) {
        List<Usuario> usuarios = retornaUsuarios();
        if (usuarios == null || usuarios.isEmpty()) {
            return null;  // Caso não haja usuários ou o arquivo esteja vazio.
        }

        for (Usuario user : usuarios) {
            if (user.getId() == id) {
                return user;  // Retorna o usuário correspondente ao id.
            }
        }
        return null;  // Retorna null se nenhum usuário com o id fornecido for encontrado.
    }

    public boolean removeUsuarioPorId(int id) {
        List<Usuario> usuarios = retornaUsuarios();
        if (usuarios == null || usuarios.isEmpty()) {
            return false;  // Não há usuários para remover.
        }

        boolean usuarioRemovido = false;
        int tamanhoAnterior = usuarios.size(); // Guarda o tamanho original da lista

        // Remove o usuário com o ID especificado
        usuarios.removeIf(user -> user.getId() == id);

        // Se o usuário foi removido, atualiza o arquivo
        if (usuarios.size() < tamanhoAnterior) {
            usuarioRemovido = true;
            try (PrintWriter pw = new PrintWriter(new FileWriter(path, false))) {
                pw.println("id,usuario,senha");  // Cabeçalho adequado ao conteúdo do arquivo.
                for (Usuario user : usuarios) {
                    String newLine = user.getId() + "," + user.getUsuario() + "," + user.getSenha();
                    pw.println(newLine);  // Escreve diretamente a nova linha no arquivo.
                }
            } catch (IOException e) {
                System.out.println("Erro ao remover usuário: " + e.getMessage());
                return false;  // Retorna false se ocorrer um erro na gravação do arquivo.
            }
        }

        return usuarioRemovido;  // Retorna true se o usuário foi removido.
    }

    public boolean editaUsuarioPorId(int id, String novoUsuario, String novaSenha) {
        List<Usuario> usuarios = retornaUsuarios();
        if (usuarios == null || usuarios.isEmpty()) {
            return false;  // Não há usuários para editar.
        }

        boolean usuarioEditado = false;

        // Percorre a lista de usuários para encontrar o ID correspondente
        for (Usuario user : usuarios) {
            if (user.getId() == id) {
                user.setUsuario(novoUsuario);  // Atualiza o nome de usuário
                user.setSenha(novaSenha);      // Atualiza a senha
                usuarioEditado = true;
                break;  // Sai do loop após encontrar e atualizar o usuário
            }
        }

        if (usuarioEditado) {
            // Se o usuário foi editado, atualiza o arquivo
            try (PrintWriter pw = new PrintWriter(new FileWriter(path, false))) {
                pw.println("id,usuario,senha");  // Cabeçalho do arquivo
                for (Usuario user : usuarios) {
                    String newLine = user.getId() + "," + user.getUsuario() + "," + user.getSenha();
                    pw.println(newLine);  // Escreve a nova lista de usuários no arquivo
                }
            } catch (IOException e) {
                System.out.println("Erro ao editar usuário: " + e.getMessage());
                return false;  // Retorna false se ocorrer um erro na gravação do arquivo.
            }
        }

        return usuarioEditado;  // Retorna true se o usuário foi editado com sucesso.
    }
}
