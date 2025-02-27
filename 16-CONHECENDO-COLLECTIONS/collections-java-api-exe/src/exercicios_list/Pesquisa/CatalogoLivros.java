package exercicios_list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;
    private int indice;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        this.livros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        if (!this.livros.isEmpty()) {
            for (Livro livro : this.livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(livro);
                }
            }
        }

        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorInervalorDeAno(int anoInicio, int anoFim) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        if (!this.livros.isEmpty()) {
            for (Livro livro : this.livros) {
                if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim) {
                    livrosEncontrados.add(livro);
                }
            }
        }

        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = null;

        if (!this.livros.isEmpty()) {
            for (Livro livro : this.livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = livro;
                    break;
                }
            }
        }

        return livroEncontrado;
    }

}
