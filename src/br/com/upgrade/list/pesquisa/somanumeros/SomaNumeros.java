package br.com.upgrade.list.pesquisa.somanumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularTotal() {
        int total = 0;
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                total += numero;
            }
        }
        return total;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if(!numeros.isEmpty()) {
            for (int numero : numeros) {
                maiorNumero = Math.max(maiorNumero, numero);
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()) {
            for (int numero : numeros) {
                menorNumero = Math.min(menorNumero, numero);
            }
        }
        return menorNumero;
    }

    @Override
    public String toString() {
        return "Lista de Numeros: " + numeros;
    }
}
