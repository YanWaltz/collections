package map.pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long codigo, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorEstoqueTotal(){
        double valorEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
           for(Produto p : estoqueProdutosMap.values()){
            valorEstoque += p.getQuantidade()*p.getPreco();
            }
        }
        return valorEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProdutos(1234, "Azeite", 999, 5);
        estoque.adicionarProdutos(4967, "Cartela Ovos", 20, 20);
        estoque.adicionarProdutos(7891, "Miojo", 3.49, 10);
        estoque.adicionarProdutos(8432, "Café", 40, 15);

        estoque.exibirProdutos();
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.calcularValorEstoqueTotal());
    }

}
