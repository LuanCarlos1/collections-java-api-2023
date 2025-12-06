package br.com.upgrade.set.pesquisa.agendacontatos;

public class Contato implements Comparable<Contato>{

    private final String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Contato contato) {
        return nome.compareTo(contato.getNome());
    }
}
