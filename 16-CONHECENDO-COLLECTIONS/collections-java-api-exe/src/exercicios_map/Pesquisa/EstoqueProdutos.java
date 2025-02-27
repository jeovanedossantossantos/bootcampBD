package exercicios_map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void addProduto(long cod, String name,
            int quantity,
            double value) {

        this.estoque.put(cod, new Produto(name, value, quantity));

    }

    public void exibir() {
        System.out.println(this.estoque);
    }

    public double calculateEstoque() {
        double valorTotal = 0;

        if (!this.estoque.isEmpty()) {
            for (Produto p : this.estoque.values()) {

                valorTotal += p.getValue() * p.getQuantity();

            }
        }

        return valorTotal;
    }

    public Produto obterProdutoMaiorPreco() {
        Produto produto = null;

        double maiorPreco = Double.MIN_VALUE;

        if (!this.estoque.isEmpty()) {
            for (Produto p : this.estoque.values()) {
                if (p.getValue() > maiorPreco) {
                    produto = p;
                }
            }
        }

        return produto;
    }

}
