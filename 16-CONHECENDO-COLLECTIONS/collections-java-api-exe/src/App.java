import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Set;

import javax.xml.catalog.Catalog;

import exercicios_list.OperacoesBasica.ListaTarefa;
import exercicios_list.Ordenacao.OrdenaraPessoas;
import exercicios_list.Ordenacao.Pessoa;
import exercicios_list.Pesquisa.CatalogoLivros;
import exercicios_list.Pesquisa.Livro;
import exercicios_map.OperacoesBasicas.AgendaContatos;
import exercicios_map.Ordenacao.AgendaEventos;
import exercicios_map.Pesquisa.EstoqueProdutos;
import exercicios_set.OperacaoBasicas.ConjuntoConvidado;
import exercicios_set.Ordenacao.CadastroProduto;
import exercicios_set.Ordenacao.Produto;
import exercicios_set.Pesquisa.*;

public class App {
    public static void main(String[] args) throws Exception {

        ListaTarefa listaTarefa = new ListaTarefa();
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        OrdenaraPessoas ordenaraPessoas = new OrdenaraPessoas();
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        AgendaContados agendaContados = new AgendaContados();
        CadastroProduto cadastroProduto = new CadastroProduto();
        AgendaContatos agendaContatos = new AgendaContatos();
        EstoqueProdutos estouqueProditos = new EstoqueProdutos();

        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.addEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia",
                "Palestrante renomado");
        agendaEventos.addEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação",
                "Aula prática de desenvolvimento");
        agendaEventos.addEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software",
                "Demonstração da nova versão");
        agendaEventos.addEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação",
                "Competição de soluções criativas");
        agendaEventos.addEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial",
                "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibir();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();

        // System.out.println(listaTarefa.obterNumeroTarefa());
        // listaTarefa.adicionarTarefa("Estudar Java 1");
        // listaTarefa.adicionarTarefa("Estudar Java 2");
        // System.out.println(listaTarefa.obterNumeroTarefa());
        // listaTarefa.adicionarTarefa("Estudar Java");
        // System.out.println(listaTarefa.obterNumeroTarefa());

        // listaTarefa.exibirTarefas();

        // listaTarefa.removerTarefa("Estudar Java");
        // System.out.println(listaTarefa.obterNumeroTarefa());
        // listaTarefa.exibirTarefas();

        // catalogoLivros.adicionarLivro("Java 1", "Autor 1", 2021);
        // catalogoLivros.adicionarLivro("Java 2", "Autor 2", 2022);
        // catalogoLivros.adicionarLivro("Java 3", "Autor 3", 2023);
        // catalogoLivros.adicionarLivro("Java 4", "Autor 4", 2024);

        // List<Livro> livros = catalogoLivros.pesquisarPorAutor("Autor 1");
        // for (Livro livro : livros) {
        // System.out.println(livro);
        // }

        // Livro livro = catalogoLivros.pesquisarPorTitulo("Java 2");
        // System.out.println(livro);

        // List<Livro> livrosIntervalo = catalogoLivros.pesquisarPorInervalorDeAno(2020,
        // 2022);
        // for (Livro livroIntervalo : livrosIntervalo) {
        // System.out.println(livroIntervalo);
        // }

        // ordenaraPessoas.adicionarPessoa("Pessoa 1", 20, 1.70);
        // ordenaraPessoas.adicionarPessoa("Pessoa 2", 25, 1.80);
        // ordenaraPessoas.adicionarPessoa("Pessoa 3", 30, 1.90);
        // ordenaraPessoas.adicionarPessoa("Pessoa 4", 35, 1.60);
        // ordenaraPessoas.adicionarPessoa("Pessoa 5", 40, 1.75);

        // List<Pessoa> pessoasOrdenadasPorIdade = ordenaraPessoas.ordenarPorIdade();
        // for (Pessoa pessoa : pessoasOrdenadasPorIdade) {
        // System.out.println(pessoa);
        // }

        // List<Pessoa> pessoasOrdenadasPorAltura = ordenaraPessoas.ordenarPorAltura();
        // for (Pessoa pessoa : pessoasOrdenadasPorAltura) {
        // System.out.println(pessoa);
        // }

        // conjuntoConvidado.adicionarConvidado("Convidado 1", "1");
        // conjuntoConvidado.adicionarConvidado("Convidado 2", "2");
        // conjuntoConvidado.adicionarConvidado("Convidado 3", "3");
        // conjuntoConvidado.adicionarConvidado("Convidado 4", "4");
        // conjuntoConvidado.adicionarConvidado("Convidado 4", "4");
        // conjuntoConvidado.adicionarConvidado("Convidado 5", "5");

        // conjuntoConvidado.exibirConvidados();

        // conjuntoConvidado.removerConvidado("3");

        // conjuntoConvidado.exibirConvidados();

        // agendaContados.adicionarContato("Contato 1", 1234);
        // agendaContados.adicionarContato("Contato 2", 5678);
        // agendaContados.adicionarContato("Contato 3", 91011);
        // agendaContados.adicionarContato("Contato 4", 121314);
        // agendaContados.adicionarContato("Contato 5", 151617);
        // agendaContados.exibirContatos();

        // System.out.println(agendaContados.pesquisarContatoPorNome("Contato"));

        // Object contatoAtualizado = agendaContados.atualizarNumero("Contato 1", 9999);
        // System.out.println(contatoAtualizado);

        // cadastroProduto.adicionarProduto(1, "Produto 1", 100.0, 1);
        // cadastroProduto.adicionarProduto(2, "Produto 2", 20.0, 2);
        // cadastroProduto.adicionarProduto(3, "Produto 3", 3.0, 3);
        // cadastroProduto.adicionarProduto(4, "Produto 4", 40.0, 4);
        // cadastroProduto.adicionarProduto(5, "Produto 5", 50.0, 5);
        // Set<Produto> produtosOrdenadosPorNome =
        // cadastroProduto.exibirProdutoPorNome();
        // for (Produto produto : produtosOrdenadosPorNome) {
        // System.out.println(produto);
        // }

        // Set<Produto> produtosOrdenadosPorPreco =
        // cadastroProduto.exibirProdutoPorPreco();
        // for (Produto produto : produtosOrdenadosPorPreco) {
        // System.out.println(produto);
        // }

        // Adicionar contatos
        // agendaContatos.addContato("Camila", 123456);
        // agendaContatos.addContato("João", 5665);
        // agendaContatos.addContato("Carlos", 1111111);
        // agendaContatos.addContato("Ana", 654987);
        // agendaContatos.addContato("Maria", 1111111);
        // agendaContatos.addContato("Camila", 44444);

        // agendaContatos.exibirContatos();

        // // Remover um contato
        // agendaContatos.removeContado("Maria");
        // agendaContatos.exibirContatos();

        // // Pesquisar número por nome
        // String nomePesquisa = "João";
        // Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        // System.out.println("Número de telefone de " + nomePesquisa + ": " +
        // numeroPesquisa);

        // String nomePesquisaNaoExistente = "Paula";
        // Integer numeroPesquisaNaoExistente =
        // agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);

        // System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": "
        // + numeroPesquisaNaoExistente);

        // estouqueProditos.exibir();

        // // Adiciona produtos ao estouqueProditos
        // estouqueProditos.addProduto(1L, "Notebook", 1, 1500.0);
        // estouqueProditos.addProduto(2L, "Mouse", 5, 25.0);
        // estouqueProditos.addProduto(3L, "Monitor", 10, 400.0);
        // estouqueProditos.addProduto(4L, "Teclado", 2, 40.0);

        // // Exibe os produtos no estouqueProditos
        // estouqueProditos.exibir();

        // // Calcula e exibe o valor total do estouqueProditos
        // System.out
        // .println("Valor total do estouqueProditos: R$" +
        // estouqueProditos.calculateEstoque());

        // // Obtém e exibe o produto mais caro
        // exercicios_map.Pesquisa.Produto produtoMaisCaro =
        // estouqueProditos.obterProdutoMaiorPreco();
        // System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        // Produto produtoMaisBarato = estouqueProditos.obterProdutoMaisBarato();
        // System.out.println("Produto mais barato: " + produtoMaisBarato);

        // // Obtém e exibe o produto com a maior quantidade em valor no
        // estouqueProditos
        // Produto produtoMaiorQuantidadeValorTotal =
        // estouqueProditos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        // System.out.println("Produto com maior quantidade em valor no estoque: " +
        // produtoMaiorQuantidadeValorTotal);
    }
}
