package set.pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, long numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumero(String nome, long novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Yan", 21987654321L);
        agenda.adicionarContato("Marcelle", 21904062023L);
        agenda.adicionarContato("Sérgio Waltz", 212345678L);
        agenda.adicionarContato("Sérgio Lima", 218765432L);

        agenda.exibirContatos();

        agenda.atualizarNumero("Marcelle", 21905092024L);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Sérgio"));
    }
}
