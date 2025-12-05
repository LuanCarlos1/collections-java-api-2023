package br.com.upgrade.list.pesquisa.catalogolivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private final List<Livro> cataligoLivros;

    public CatalogoLivros() {
        cataligoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        cataligoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!cataligoLivros.isEmpty()) {
            for (Livro livro : cataligoLivros) {
                if (livro.autor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> perquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!cataligoLivros.isEmpty()) {
            for (Livro livro : cataligoLivros) {
                if (livro.anoPublicacao() >= anoInicial && livro.anoPublicacao() <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!cataligoLivros.isEmpty()) {
            for (Livro livro : cataligoLivros) {
                if (livro.titulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
