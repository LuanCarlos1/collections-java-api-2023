package br.com.upgrade.set.operacoesbasicas.conjuntoconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private final Set<Convidado> listaConvidados;

    public ConjuntoConvidados() {
        listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado) {
        listaConvidados.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidado(int codigoConvite) {
        listaConvidados.removeIf(convidado -> convidado.codigoConvite() == codigoConvite);
    }

    public int contarConvidados() {
        return listaConvidados.size();
    }

    public void exibirConvidados() {
        System.out.println(listaConvidados);
    }
}
