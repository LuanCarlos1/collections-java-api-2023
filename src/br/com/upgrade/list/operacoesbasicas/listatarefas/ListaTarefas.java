package br.com.upgrade.list.operacoesbasicas.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<Tarefa> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        listaTarefas.removeIf(tarefa -> tarefa.descricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public List<Tarefa> obterDescricoesTarefas() {
        return listaTarefas;
    }
}
