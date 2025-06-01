package list.operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private final List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
       List<Tarefa> tarefasParaRemover = new ArrayList<>();
       for(Tarefa t : tarefaList){
           if(t.getDescricao().equalsIgnoreCase(descricao)){
               tarefasParaRemover.add(t);
           }
       }
       tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotal(){
        return tarefaList.size();
    }

    public void obterDescricao(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa yan = new ListaTarefa();

        System.out.println(yan.obterNumeroTotal());
        yan.adicionarTarefa("i dont know");
        yan.adicionarTarefa("i dont know");
        yan.adicionarTarefa("yeah, i know");
        System.out.println(yan.obterNumeroTotal());
        yan.obterDescricao();



    }

}
