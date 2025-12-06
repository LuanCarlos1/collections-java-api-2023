package br.com.upgrade.set.operacoesbasicas.conjuntopalavrasunicas;

public class ConjuntoPalavrasUnicasTeste {

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("Upgrade");
        conjuntoPalavras.adicionarPalavra("Castor");
        conjuntoPalavras.adicionarPalavra("Geladeira");
        conjuntoPalavras.adicionarPalavra("Bane");
        conjuntoPalavras.adicionarPalavra("Queixada");

        conjuntoPalavras.verificarPalavra("Castor");
        conjuntoPalavras.verificarPalavra("Up");

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.removerPalavra("Bane");

        conjuntoPalavras.exibirPalavrasUnicas();
    }
}
