package br.com.upgrade.set.pesquisa.agendacontatos;

import java.util.Set;
import java.util.TreeSet;

public class AgendaContatos {

    private final Set<Contato> agendaContatos;

    public AgendaContatos() {
        agendaContatos = new TreeSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new TreeSet<>();
        if (!agendaContatos.isEmpty()) {
            for (Contato contato : agendaContatos) {
                if (contato.getNome().contains(nome)) {
                    contatosPorNome.add(contato);
                }
            }
        } else {
            System.out.println("Agenda vazia!");
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        if (!agendaContatos.isEmpty()) {
            for (Contato contato : agendaContatos) {
                if (contato.getNome().trim().equalsIgnoreCase(nome)) {
                    contato.setNumero(numero);
                    contatoAtualizado = contato;
                }
            }
        } else {
            System.out.println("Agenda vazia!");
        }
        return contatoAtualizado;
    }
}
