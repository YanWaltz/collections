package set.operacoes;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args){
        ConjuntoConvidados convidado = new ConjuntoConvidados();

        convidado.adicionarConvidado("Yan", 2006);
        convidado.adicionarConvidado("Lucas", 2020);
        convidado.adicionarConvidado("Felipe", 2000);
        convidado.adicionarConvidado("Junior", 2000);

        System.out.println("Existem " + convidado.contarConvidados() + " convidados");
        convidado.exibirConvidados();

        convidado.removerConvidadoPorCodigo(2020);
        System.out.println("Existem " + convidado.contarConvidados() + " convidados");
        convidado.exibirConvidados();


    }

}
