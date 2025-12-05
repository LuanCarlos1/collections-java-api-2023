package br.com.upgrade.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        carrinho.removeIf(item -> item.nome().equalsIgnoreCase(nome));
    }

    public double totalCarrinho() {
        double totalCarrinho = 0d;
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                totalCarrinho += item.preco() * item.quantidade();
            }
        }
        return totalCarrinho;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }
}
