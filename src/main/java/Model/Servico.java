package Model;

public class Servico {
    protected int id;
    private String nome;
    private String preco;
    private int duracao; // +1 para cada 15 min

    public Servico(int id, String nome, String preco, int duracao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public Servico(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    @Override
    public String toString(){
        return preco != null ? nome + "(R$" + preco + ")" : nome;
    }
    
}
