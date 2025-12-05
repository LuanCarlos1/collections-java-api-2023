package br.com.upgrade.list.pesquisa.catalogolivros;

public class CatalogoLivrosTeste {

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Titulo1", "Autor1", 1990);
        catalogoLivros.adicionarLivro("Titulo1", "Autor2", 2000);
        catalogoLivros.adicionarLivro("Titulo3", "Autor1", 1995);
        catalogoLivros.adicionarLivro("Titulo4", "Autor4", 2002);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor1"));
        System.out.println(catalogoLivros.perquisarPorIntervaloAnos(2000, 2004));
        System.out.println(catalogoLivros.pesquisarPorTitulo("titulo3"));

    }
}
