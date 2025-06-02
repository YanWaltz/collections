package map.pesquisa;

public class Produto {
    private final String nome;
    private final double preco;
    private final int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return " Produto: " + nome + " Preço: " + preco + " Quantidade: " + quantidade + "}";
    }
}
