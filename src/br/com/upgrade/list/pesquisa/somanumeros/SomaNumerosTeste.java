package br.com.upgrade.list.pesquisa.somanumeros;

public class SomaNumerosTeste {

    public static void main(String[] args) {

        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(16);
        numeros.adicionarNumero(32);

        System.out.println("Maior numero encontrado: " + numeros.encontrarMaiorNumero());
        System.out.println("Menor numero encontrado: " + numeros.encontrarMenorNumero());

        System.out.println("Soma dos números: " + numeros.calcularTotal());

        System.out.println(numeros);
    }
}
