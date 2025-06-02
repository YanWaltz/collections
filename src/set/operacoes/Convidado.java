package set.operacoes;

import java.util.Objects;

public class Convidado {
    //atributos
    private final String nome;
    private final int codigoConvite;

    //construtor
    public Convidado (String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + " Código do convite: " + codigoConvite;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public int getCodigoConvite(){
        return codigoConvite;
    }
}
