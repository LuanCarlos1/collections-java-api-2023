package br.com.upgrade.list.ordenacao.ordenacaopessoas;

import java.util.Comparator;

public record Pessoa(String nome, int idade, double altura) implements Comparable<Pessoa> {

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.idade());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    static class ComparatorPorAltura implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa pessoa1, Pessoa pessoa2) {
            return Double.compare(pessoa1.altura, pessoa2.altura);
        }
    }
}
