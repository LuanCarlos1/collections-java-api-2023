package br.com.upgrade.set.operacoesbasicas.conjuntoconvidados;

public record Convidado(String nome, int codigoConvite) {

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
