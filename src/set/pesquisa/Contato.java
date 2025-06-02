package set.pesquisa;

import java.util.Objects;

public class Contato {
    private final String nome;
    private long numero;

    public Contato(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero){
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString(){
        return "\nContato: " + nome + " Número: " + numero;
}

}
