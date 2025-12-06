package br.com.upgrade.set.operacoesbasicas.conjuntoconvidados;

public class ConjuntoConvidadosTeste {

    public static void main(String[] args) {

        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();

        listaConvidados.adicionarConvidado("Luan", 123);
        listaConvidados.adicionarConvidado("Luan", 123);
        listaConvidados.adicionarConvidado("Isa", 4321);
        listaConvidados.adicionarConvidado("Bigo", 3241);
        listaConvidados.adicionarConvidado("Up", 324);

        System.out.println(listaConvidados.contarConvidados());
        listaConvidados.exibirConvidados();

        listaConvidados.removerConvidado(324);
        System.out.println(listaConvidados.contarConvidados());
        listaConvidados.exibirConvidados();

    }
}
