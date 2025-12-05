package br.com.upgrade.list.operacoesbasicas.carrinhodecompras;

public record Item(String nome, double preco, int quantidade) {

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
