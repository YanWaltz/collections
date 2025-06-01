package set.operacoes;

public class Convidado {
    //atributos
    private final String nome;
    private final int codigoConvite;

    //construtor
    public Convidado (String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //getters
    public String getNome(){
        return nome;
    }
    public int getCodigoConvite(){
        return codigoConvite;
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + " Código do convite: " + codigoConvite;
    }
}
