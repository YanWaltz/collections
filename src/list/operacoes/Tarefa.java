package list.operacoes;

public class Tarefa {

    private final String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public String toString(){
        return descricao;
    }

}
