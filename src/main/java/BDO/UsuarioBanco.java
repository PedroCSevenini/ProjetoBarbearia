/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDO;

import Model.Usuario;
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
public class UsuarioBanco {
    private final File path = new File(System.getProperty("user.dir") + "/src/main/java/BDO/Arquivo/Usuario.txt");

    public UsuarioBanco() {
    }
    
    
    
    public List retornaUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            line = br.readLine();
            while(line != null){
                String [] vet = line.split(",");
                int id = Integer.parseInt(vet[0]);
                String username = vet[1];
                String senha = vet[2];
                usuarios.add(new Usuario(id, username, senha));
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return usuarios;
    }
    
    public Usuario verificaUsuarioSenha(Usuario usuario){
        List<Usuario> usuarios = retornaUsuarios();
        for(Usuario usuarioLista: usuarios){
            if(usuarioLista.getUsuario().equals(usuario.getUsuario()) && usuarioLista.getSenha().equals(usuario.getSenha())){
                return usuarioLista;
            }
        }
        return null;
    }
}
