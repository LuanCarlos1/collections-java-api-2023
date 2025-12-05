package br.com.upgrade.list.operacoesbasicas.listatarefas;

public class TarefaTeste {

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Lavar a louça!");
        listaTarefas.adicionarTarefa("Estudar!");
        listaTarefas.adicionarTarefa("Leitura da palavra!");
        listaTarefas.adicionarTarefa("Organizar materiais!");

        System.out.println("Total Tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Organizar materiais!");

        System.out.println("Total Tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        System.out.println(listaTarefas.obterDescricoesTarefas());
    }
}
