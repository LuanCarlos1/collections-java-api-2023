package br.com.upgrade.list.operacoesbasicas.carrinhodecompras;

public class CarrinhoDeComprasTeste {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Notebook" , 1500, 1);
        carrinho.adicionarItem("Carregador" , 200, 2);
        carrinho.adicionarItem("Mouse" , 150, 1);
        carrinho.adicionarItem("Teclado" , 200, 1);
        carrinho.adicionarItem("Mochila" , 300, 3);

        System.out.println(carrinho.totalCarrinho());
        carrinho.exibirItens();

        carrinho.removerItem("mochila");

        System.out.println(carrinho.totalCarrinho());
        carrinho.exibirItens();
    }
}
