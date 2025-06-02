package set.ordenacao;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(5678, "Feijão", 8.99, 1);
        cadastro.adicionarProduto(1234, "Arroz", 6.99, 1);
        cadastro.adicionarProduto(91011, "Café", 39.99, 1);

        System.out.println(cadastro.exibirPorPreco());

        System.out.println(cadastro.exibirPorNome());
    }


}
