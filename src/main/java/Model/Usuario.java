package Model;


public class Usuario extends Pessoa{
    protected String usuario;
    protected String senha;

    public Usuario(String usuario, String senha, int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        super(id, nome, telefone, dataNasc, email, nivelAcesso);
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        super(id, nome, telefone, dataNasc, email, nivelAcesso);
    }

    public Usuario(int id) {
        super(id);
    }

    public Usuario(int id, String nome) {
        super(id, nome);
    }
    
    
    public Usuario(int id, String usuario, String senha) {
        super(id);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    
    
    
    
    
}
