package exercicios_set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new HashSet<Produto>();
    }

    public void adicionarProduto(long cod, String nome, Double preco, Integer quantidade) {
        Produto produto = new Produto(cod, nome, preco, quantidade);
        this.produtos.add(produto);
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosOrdenados = new TreeSet<>(this.produtos);
        return produtosOrdenados;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosOrdenados = new TreeSet<>(new ComparadorPorPreco());
        produtosOrdenados.addAll(this.produtos);
        return produtosOrdenados;
    }

}
