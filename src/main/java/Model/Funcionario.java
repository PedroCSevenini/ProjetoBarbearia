package Model;


public class Funcionario extends Pessoa{
    private final int nivelAcesso = 2;


    public Funcionario(int id) {
        super(id);
    }

    public Funcionario(int id, String nome, String telefone, String dataNasc, String email, int nivelAcesso) {
        super(id, nome, telefone, dataNasc, email, nivelAcesso);
    }

    public Funcionario(int id, String nome) {
        super(id, nome);
    }

    
    
    
    
   
}
