package ordenacao;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoPessoa{

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Yan", 18, 1.81);
        ordenacaoPessoa.adicionarPessoa("Marcelle", 18, 1.73);
        ordenacaoPessoa.adicionarPessoa("Lucas", 9, 1.39);
        ordenacaoPessoa.adicionarPessoa("Rose", 64, 1.72);
        ordenacaoPessoa.adicionarPessoa("Sérgio", 37, 1.83);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

    }
}
