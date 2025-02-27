package exercicios_list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaraPessoas {
    private List<Pessoa> pessoas;

    public OrdenaraPessoas() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenadas = new ArrayList<Pessoa>(this.pessoas);

        Collections.sort(pessoasOrdenadas);

        return pessoasOrdenadas;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasOrdenadas = new ArrayList<Pessoa>(this.pessoas);

        Collections.sort(pessoasOrdenadas, new CompararPorAltura());

        return pessoasOrdenadas;
    }
}
