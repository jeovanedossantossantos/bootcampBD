package exercicios_map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone) {
        this.agenda.put(nome, telefone);

    }

    public void removeContado(String nome) {
        if (!this.agenda.isEmpty()) {
            this.agenda.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(this.agenda);
    }

    public Integer pesquisarPorNome(String nome) {

        if (!this.agenda.isEmpty()) {
            return this.agenda.get(nome);
        }

        return null;
    }

}
