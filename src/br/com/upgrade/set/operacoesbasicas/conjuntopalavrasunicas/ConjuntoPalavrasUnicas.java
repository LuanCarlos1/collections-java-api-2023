package br.com.upgrade.set.operacoesbasicas.conjuntopalavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private final Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        conjuntoPalavras.removeIf(s -> s.equalsIgnoreCase(palavra));
    }

    public void verificarPalavra(String palavra) {
        if (!conjuntoPalavras.isEmpty()) {
            if (conjuntoPalavras.contains(palavra)) {
                System.out.println("Palavra encontrada: " + palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavras);
    }
}
