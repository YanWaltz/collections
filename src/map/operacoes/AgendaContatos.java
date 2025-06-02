package map.operacoes;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
        }

     public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
           numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
     }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Yan", 1234567891);
        agenda.adicionarContato("Yan", 123333333);
        agenda.adicionarContato("Rose", 14534567);
        agenda.adicionarContato("Vitor", 5555);
        agenda.adicionarContato("Marcelle", 17777);
        agenda.adicionarContato("Gabriel", 14522267);

        agenda.removerContato("Rose");

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Yan"));
        System.out.println(agenda.pesquisarPorNome("Gabriel"));
        agenda.removerContato("Vitor");
        agenda.removerContato("Gabriel");
        agenda.exibirContatos();
    }

}
