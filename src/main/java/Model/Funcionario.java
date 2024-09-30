package Model;


public class Funcionario extends Usuario{
    private final int nivelAcesso = 2;

    public Funcionario(String usuario, String senha, int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        super(usuario, senha, id, nome, telefone, dataNasc, email, nivelAcesso);
    }

    public Funcionario(int id, String nome) {
        super(id, nome);
    }




    public Funcionario(int id, String nome, String telefone, String dataNasc, String email) {
        super(id, nome, telefone, dataNasc, email, 2);
    }
  
}
