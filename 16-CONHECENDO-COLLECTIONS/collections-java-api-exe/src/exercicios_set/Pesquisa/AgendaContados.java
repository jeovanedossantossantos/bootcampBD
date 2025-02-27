package exercicios_set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContados {
    private Set<Contato> contatos;

    public AgendaContados() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        Contato contato = new Contato(nome, telefone);
        this.contatos.add(contato);
    }

    public void exibirContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public Set<Contato> pesquisarContatoPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contato atualizarNumero(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setTelefone(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

}
