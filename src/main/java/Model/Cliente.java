package Model;


import java.util.Date;
import java.time.LocalTime;
import java.util.Objects;

public class Cliente extends Usuario{

    public Cliente(String usuario, String senha, int id, String nome, String telefone, String dataNasc, String email) {
        super(usuario, senha, id, nome, telefone, dataNasc, email, 1);
    }

    public Cliente(String usuario, String senha, int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        super(usuario, senha, id, nome, telefone, dataNasc, email, nivelAcesso);
    }

    public Cliente(int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        super(id, nome, telefone, dataNasc, email, nivelAcesso);
    }
    
    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Cliente cliente = (Cliente) obj;
    return this.getId() == cliente.getId();  // ou qualquer outra condição que faça sentido
}

    @Override
    public int hashCode() {
        return Objects.hash(getId());  // Utilize os mesmos atributos que estão sendo usados no equals
    }
    
    

  
    
   
    
}
