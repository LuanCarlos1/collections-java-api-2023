package br.com.upgrade.list.pesquisa.catalogolivros;

public record Livro(String titulo, String autor, int anoPublicacao) {
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
