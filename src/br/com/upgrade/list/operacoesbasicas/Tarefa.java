package br.com.upgrade.list.operacoesbasicas;

public record Tarefa(String descricao) {

    @Override
    public String toString() {
        return "Tarefa: " +
                "Descricao ='" + descricao + '\'';
    }
}
